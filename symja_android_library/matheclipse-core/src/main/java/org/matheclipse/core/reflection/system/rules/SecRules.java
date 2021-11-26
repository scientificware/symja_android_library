package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface SecRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 44, 7 };

  final public static IAST RULES = List(
    IInit(Sec, SIZES),
    // Sec(Undefined)=Undefined
    ISet(Sec(Undefined),
      Undefined),
    // Sec(0)=1
    ISet(Sec(C0),
      C1),
    // Sec(Pi/12)=-Sqrt(2)+Sqrt(6)
    ISet(Sec(Times(QQ(1L,12L),Pi)),
      Plus(Negate(CSqrt2),CSqrt6)),
    // Sec(Pi/10)=Sqrt(2-2/Sqrt(5))
    ISet(Sec(Times(QQ(1L,10L),Pi)),
      Sqrt(Plus(C2,Times(CN2,C1DSqrt5)))),
    // Sec(Pi/8)=2/Sqrt(2+Sqrt(2))
    ISet(Sec(Times(QQ(1L,8L),Pi)),
      Times(C2,Power(Plus(C2,CSqrt2),CN1D2))),
    // Sec(Pi/6)=2/Sqrt(3)
    ISet(Sec(Times(QQ(1L,6L),Pi)),
      Times(C2,C1DSqrt3)),
    // Sec(Pi/5)=-1+Sqrt(5)
    ISet(Sec(Times(QQ(1L,5L),Pi)),
      Plus(CN1,CSqrt5)),
    // Sec(Pi/4)=Sqrt(2)
    ISet(Sec(Times(C1D4,Pi)),
      CSqrt2),
    // Sec(3/10*Pi)=Sqrt(2+2/Sqrt(5))
    ISet(Sec(Times(QQ(3L,10L),Pi)),
      Sqrt(Plus(C2,Times(C2,C1DSqrt5)))),
    // Sec(Pi/3)=2
    ISet(Sec(Times(C1D3,Pi)),
      C2),
    // Sec(2/5*Pi)=1+Sqrt(5)
    ISet(Sec(Times(QQ(2L,5L),Pi)),
      Plus(C1,CSqrt5)),
    // Sec(5/12*Pi)=Sqrt(6)+Sqrt(2)
    ISet(Sec(Times(QQ(5L,12L),Pi)),
      Plus(CSqrt2,CSqrt6)),
    // Sec(Pi/2)=ComplexInfinity
    ISet(Sec(CPiHalf),
      CComplexInfinity),
    // Sec(7/12*Pi)=-Sqrt(2)-Sqrt(6)
    ISet(Sec(Times(QQ(7L,12L),Pi)),
      Subtract(Negate(CSqrt2),CSqrt6)),
    // Sec(3/5*Pi)=-1-Sqrt(5)
    ISet(Sec(Times(QQ(3L,5L),Pi)),
      Subtract(CN1,CSqrt5)),
    // Sec(2/3*Pi)=-2
    ISet(Sec(Times(QQ(2L,3L),Pi)),
      CN2),
    // Sec(7/10*Pi)=-Sqrt(2+2/Sqrt(5))
    ISet(Sec(Times(QQ(7L,10L),Pi)),
      Negate(Sqrt(Plus(C2,Times(C2,C1DSqrt5))))),
    // Sec(3/4*Pi)=-Sqrt(2)
    ISet(Sec(Times(QQ(3L,4L),Pi)),
      Negate(CSqrt2)),
    // Sec(4/5*Pi)=1-Sqrt(5)
    ISet(Sec(Times(QQ(4L,5L),Pi)),
      Subtract(C1,CSqrt5)),
    // Sec(5/6*Pi)=-2/Sqrt(3)
    ISet(Sec(Times(QQ(5L,6L),Pi)),
      Times(CN2,C1DSqrt3)),
    // Sec(9/10*Pi)=-Sqrt(2-2/Sqrt(5))
    ISet(Sec(Times(QQ(9L,10L),Pi)),
      Negate(Sqrt(Plus(C2,Times(CN2,C1DSqrt5))))),
    // Sec(11/12*Pi)=Sqrt(2)-Sqrt(6)
    ISet(Sec(Times(QQ(11L,12L),Pi)),
      Subtract(CSqrt2,CSqrt6)),
    // Sec(Pi)=-1
    ISet(Sec(Pi),
      CN1),
    // Sec(13/12*Pi)=Sqrt(2)-Sqrt(6)
    ISet(Sec(Times(QQ(13L,12L),Pi)),
      Subtract(CSqrt2,CSqrt6)),
    // Sec(11/10*Pi)=-Sqrt(2-2/Sqrt(5))
    ISet(Sec(Times(QQ(11L,10L),Pi)),
      Negate(Sqrt(Plus(C2,Times(CN2,C1DSqrt5))))),
    // Sec(7/6*Pi)=-2/Sqrt(3)
    ISet(Sec(Times(QQ(7L,6L),Pi)),
      Times(CN2,C1DSqrt3)),
    // Sec(6/5*Pi)=1-Sqrt(5)
    ISet(Sec(Times(QQ(6L,5L),Pi)),
      Subtract(C1,CSqrt5)),
    // Sec(5/4*Pi)=-Sqrt(2)
    ISet(Sec(Times(QQ(5L,4L),Pi)),
      Negate(CSqrt2)),
    // Sec(4/3*Pi)=-2
    ISet(Sec(Times(QQ(4L,3L),Pi)),
      CN2),
    // Sec(7/5*Pi)=-1-Sqrt(5)
    ISet(Sec(Times(QQ(7L,5L),Pi)),
      Subtract(CN1,CSqrt5)),
    // Sec(3/2*Pi)=ComplexInfinity
    ISet(Sec(Times(QQ(3L,2L),Pi)),
      CComplexInfinity),
    // Sec(19/12*Pi)=Sqrt(6)+Sqrt(2)
    ISet(Sec(Times(QQ(19L,12L),Pi)),
      Plus(CSqrt2,CSqrt6)),
    // Sec(8/5*Pi)=1+Sqrt(5)
    ISet(Sec(Times(QQ(8L,5L),Pi)),
      Plus(C1,CSqrt5)),
    // Sec(5/3*Pi)=2
    ISet(Sec(Times(QQ(5L,3L),Pi)),
      C2),
    // Sec(17/10*Pi)=Sqrt(2+2/Sqrt(5))
    ISet(Sec(Times(QQ(17L,10L),Pi)),
      Sqrt(Plus(C2,Times(C2,C1DSqrt5)))),
    // Sec(7/4*Pi)=Sqrt(2)
    ISet(Sec(Times(QQ(7L,4L),Pi)),
      CSqrt2),
    // Sec(9/5*Pi)=-1+Sqrt(5)
    ISet(Sec(Times(QQ(9L,5L),Pi)),
      Plus(CN1,CSqrt5)),
    // Sec(11/6*Pi)=2/Sqrt(3)
    ISet(Sec(Times(QQ(11L,6L),Pi)),
      Times(C2,C1DSqrt3)),
    // Sec(19/10*Pi)=Sqrt(2-2/Sqrt(5))
    ISet(Sec(Times(QQ(19L,10L),Pi)),
      Sqrt(Plus(C2,Times(CN2,C1DSqrt5)))),
    // Sec(23/12*Pi)=-Sqrt(2)+Sqrt(6)
    ISet(Sec(Times(QQ(23L,12L),Pi)),
      Plus(Negate(CSqrt2),CSqrt6)),
    // Sec(2*Pi)=1
    ISet(Sec(C2Pi),
      C1),
    // Sec(ArcSin(x_)):=1/Sqrt(1-x^2)
    ISetDelayed(Sec(ArcSin(x_)),
      Power(Subtract(C1,Sqr(x)),CN1D2)),
    // Sec(ArcCos(x_)):=1/x
    ISetDelayed(Sec(ArcCos(x_)),
      Power(x,CN1)),
    // Sec(ArcTan(x_)):=Sqrt(1+x^2)
    ISetDelayed(Sec(ArcTan(x_)),
      Sqrt(Plus(C1,Sqr(x)))),
    // Sec(ArcCot(x_)):=Sqrt(1+x^2)/x
    ISetDelayed(Sec(ArcCot(x_)),
      Times(Power(x,CN1),Sqrt(Plus(C1,Sqr(x))))),
    // Sec(ArcSec(x_)):=x
    ISetDelayed(Sec(ArcSec(x_)),
      x),
    // Sec(ArcCsc(x_)):=1/Sqrt(1-1/x^2)
    ISetDelayed(Sec(ArcCsc(x_)),
      Power(Subtract(C1,Power(x,CN2)),CN1D2)),
    // Sec(I*Infinity)=0
    ISet(Sec(DirectedInfinity(CI)),
      C0),
    // Sec(-I*Infinity)=0
    ISet(Sec(DirectedInfinity(CNI)),
      C0),
    // Sec(ComplexInfinity)=Indeterminate
    ISet(Sec(CComplexInfinity),
      Indeterminate),
    // Sec(Sqrt(x_^2)):=Sec(x)
    ISetDelayed(Sec(Sqrt(Sqr(x_))),
      Sec(x))
  );
}
