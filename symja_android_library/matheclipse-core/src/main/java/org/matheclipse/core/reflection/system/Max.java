package org.matheclipse.core.reflection.system;

import org.matheclipse.core.builtin.BooleanFunctions;
import org.matheclipse.core.eval.EvalAttributes;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISignedNumber;
import org.matheclipse.core.interfaces.ISymbol;

public class Max extends AbstractFunctionEvaluator {
	public Max() {
		// default ctor
	}

	@Override
	public IExpr evaluate(final IAST ast, EvalEngine engine) {
		Validate.checkRange(ast, 1);

		if (ast.isAST0()) {
			return F.CNInfinity;
		}

		if (ast.arg1().isInterval1()) {
			IAST list = (IAST) ast.arg1().getAt(1);
			try {
				return (ISignedNumber) list.arg2();
			} catch (ClassCastException cca) {
				// do nothing
			}
		}

		IAST resultList = EvalAttributes.flatten(F.List, ast);
		if (resultList.isPresent()) {
			return maximum(resultList, true);
		}

		return maximum(ast, false);
	}

	private IExpr maximum(IAST list, boolean flattenedList) {
		boolean evaled = false;
		int j = 1;
		IAST f = F.NIL;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).isNegativeInfinity()) {
				evaled = true;
				if (f.isPresent()) {
					f.remove(j);
				} else {
					f = list.removeAtClone(j);
				}
				continue;
			}
			j++;
		}
		if (evaled) {
			if (f.isAST0()) {
				return F.CNInfinity;
			}
			list = f;
		}
		if (!evaled) {
			evaled = flattenedList;
		}
		IExpr max1;
		IExpr max2;
		max1 = list.arg1();

		IExpr.COMPARE_TERNARY comp;
		f = list.copyHead();
		for (int i = 2; i < list.size(); i++) {
			max2 = list.get(i);
			if (max1.equals(max2)) {
				continue;
			}
			comp = BooleanFunctions.CONST_LESS.prepareCompare(max1, max2);

			if (comp == IExpr.COMPARE_TERNARY.TRUE) {
				max1 = max2;
				evaled = true;
			} else if (comp == IExpr.COMPARE_TERNARY.FALSE) {
				evaled = true;
			} else {
				if (comp == IExpr.COMPARE_TERNARY.UNDEFINED) {
					// undetermined
					if (max1.isNumber()) {
						f.append(max2);
					} else {
						f.append(max1);
						max1 = max2;
					}
				}
			}
		}
		if (f.size() > 1) {
			f.append(max1);
			if (!evaled) {
				return F.NIL;
			}
			return f;
		} else {
			return max1;
		}
	}

	@Override
	public void setUp(final ISymbol newSymbol) {
		newSymbol.setAttributes(ISymbol.ORDERLESS | ISymbol.FLAT | ISymbol.NUMERICFUNCTION);
	}
}
