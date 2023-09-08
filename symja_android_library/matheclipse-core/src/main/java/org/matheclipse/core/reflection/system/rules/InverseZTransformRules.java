package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class InverseZTransformRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 1 };

  final public static IAST RULES = List(
    IInit(InverseZTransform, SIZES),
    // InverseZTransform(z_/(a_+z_),z_?NotListQ,n_?NotListQ):=(-a)^n/;FreeQ(a,n)&&FreeQ(a,z)
    ISetDelayed(InverseZTransform(Times(z_,Power(Plus(a_,z_),CN1)),PatternTest(z_,NotListQ),PatternTest(n_,NotListQ)),
      Condition(Power(Negate(a),n),And(FreeQ(a,n),FreeQ(a,z))))
  );
}
