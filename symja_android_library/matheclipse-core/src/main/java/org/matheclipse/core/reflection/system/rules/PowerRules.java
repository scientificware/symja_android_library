package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class PowerRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 5, 5 };

  final public static IAST RULES = List(
    IInit(Power, SIZES),
    // E^(I*1/2*Pi)=I
    ISet(Exp(Times(CC(0L,1L,1L,2L),Pi)),
      CI),
    // E^(I*3/2*Pi)=-I
    ISet(Exp(Times(CC(0L,1L,3L,2L),Pi)),
      CNI),
    // E^(I*Pi*n_):=(-1)^n/;n∈Integers
    ISetDelayed(Exp(Times(CI,Pi,n_)),
      Condition(Power(CN1,n),Element(n,Integers))),
    // E^(Pi*c_Complex):=Module({r=Re(c),j=Im(c)},If(EvenQ(j),1,-1)/;r==0&&IntegerQ(j))
    ISetDelayed(Exp(Times(Pi,$p(c,Complex))),
      Module(list(Set(r,Re(c)),Set(j,Im(c))),Condition(If(EvenQ(j),C1,CN1),And(Equal(r,C0),IntegerQ(j))))),
    // E^(Pi*c_Complex+x_):=Module({r=Re(c),j=Im(c)},If(EvenQ(j),E^x,-E^x)/;r==0&&IntegerQ(j))
    ISetDelayed(Exp(Plus(Times(Pi,$p(c,Complex)),x_)),
      Module(list(Set(r,Re(c)),Set(j,Im(c))),Condition(If(EvenQ(j),Exp(x),Negate(Exp(x))),And(Equal(r,C0),IntegerQ(j))))),
    // E^I*Infinity=Indeterminate
    ISet(Exp(DirectedInfinity(CI)),
      Indeterminate),
    // E^-I*Infinity=Indeterminate
    ISet(Exp(DirectedInfinity(CNI)),
      Indeterminate),
    // E^ComplexInfinity=Indeterminate
    ISet(Exp(CComplexInfinity),
      Indeterminate),
    // 1/Overflow():=Underflow()
    ISetDelayed(Power(Overflow(),CN1),
      Underflow()),
    // 1/Underflow():=Overflow()
    ISetDelayed(Power(Underflow(),CN1),
      Overflow())
  );
}
