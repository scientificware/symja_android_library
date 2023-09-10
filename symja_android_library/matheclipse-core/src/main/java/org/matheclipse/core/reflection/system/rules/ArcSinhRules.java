package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class ArcSinhRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 9, 0 };

  final public static IAST RULES = List(
    IInit(ArcSinh, SIZES),
    // ArcSinh(Undefined)=Undefined
    ISet(ArcSinh(Undefined),
      Undefined),
    // ArcSinh(0)=0
    ISet(ArcSinh(C0),
      C0),
    // ArcSinh(I*1/2)=Pi*I*1/6
    ISet(ArcSinh(CC(0L,1L,1L,2L)),
      Times(CC(0L,1L,1L,6L),Pi)),
    // ArcSinh(I/Sqrt(2))=Pi*I*1/4
    ISet(ArcSinh(Times(CI,C1DSqrt2)),
      Times(CC(0L,1L,1L,4L),Pi)),
    // ArcSinh(I*1/2*Sqrt(3))=Pi*I*1/3
    ISet(ArcSinh(Times(CC(0L,1L,1L,2L),CSqrt3)),
      Times(CC(0L,1L,1L,3L),Pi)),
    // ArcSinh(I)=Pi*I*1/2
    ISet(ArcSinh(CI),
      Times(CC(0L,1L,1L,2L),Pi)),
    // ArcSinh(Infinity)=Infinity
    ISet(ArcSinh(oo),
      oo),
    // ArcSinh(I*Infinity)=Infinity
    ISet(ArcSinh(DirectedInfinity(CI)),
      oo),
    // ArcSinh(ComplexInfinity)=ComplexInfinity
    ISet(ArcSinh(CComplexInfinity),
      CComplexInfinity)
  );
}
