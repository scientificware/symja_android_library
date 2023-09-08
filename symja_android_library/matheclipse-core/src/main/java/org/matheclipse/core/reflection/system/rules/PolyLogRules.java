package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class PolyLogRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 9, 1 };

  final public static IAST RULES = List(
    IInit(PolyLog, SIZES),
    // PolyLog(2,-1)=-Pi^2/12
    ISet(PolyLog(C2,CN1),
      Times(QQ(-1L,12L),Sqr(Pi))),
    // PolyLog(2,1)=Pi^2/6
    ISet(PolyLog(C2,C1),
      Times(QQ(1L,6L),Sqr(Pi))),
    // PolyLog(2,1/2)=Pi^2/12-Log(2)^2/2
    ISet(PolyLog(C2,C1D2),
      Plus(Times(QQ(1L,12L),Sqr(Pi)),Times(CN1D2,Sqr(Log(C2))))),
    // PolyLog(2,2)=Pi^2/4+(-1)*I*Pi*Log(2)
    ISet(PolyLog(C2,C2),
      Plus(Times(C1D4,Sqr(Pi)),Times(CNI,Pi,Log(C2)))),
    // PolyLog(2,I)=I*Catalan-Pi^2/48
    ISet(PolyLog(C2,CI),
      Plus(Times(CI,Catalan),Times(QQ(-1L,48L),Sqr(Pi)))),
    // PolyLog(2,-I)=-I*Catalan-Pi^2/48
    ISet(PolyLog(C2,CNI),
      Plus(Times(CNI,Catalan),Times(QQ(-1L,48L),Sqr(Pi)))),
    // PolyLog(2,1-I)=-I*Catalan+Pi^2/16-I*Pi*Log(2)/4
    ISet(PolyLog(C2,CC(1L,1L,-1L,1L)),
      Plus(Times(CNI,Catalan),Times(QQ(1L,16L),Sqr(Pi)),Times(CC(0L,1L,-1L,4L),Pi,Log(C2)))),
    // PolyLog(2,1+I)=Pi^2/16+I*Catalan+I*Pi*Log(2)/4
    ISet(PolyLog(C2,CC(1L,1L,1L,1L)),
      Plus(Times(CI,Catalan),Times(QQ(1L,16L),Sqr(Pi)),Times(CC(0L,1L,1L,4L),Pi,Log(C2)))),
    // PolyLog(3,1/2)=1/24*(-2*Pi^2*Log(2)+4*Log(2)^3+21*Zeta(3))
    ISet(PolyLog(C3,C1D2),
      Times(QQ(1L,24L),Plus(Times(CN2,Sqr(Pi),Log(C2)),Times(C4,Power(Log(C2),C3)),Times(ZZ(21L),Zeta(C3))))),
    // PolyLog(i_Integer,z_):=Module({n=-i},Sum(Sum((-1)^(k+1)*Binomial(n+1,-1+k)*(-k+m+1)^n,{k,1,m})*z^m,{m,1,n})/(1-z)^(n+1)/;i<0)
    ISetDelayed(PolyLog($p(i, Integer),z_),
      Module(list(Set(n,Negate(i))),Condition(Times(Power(Power(Subtract(C1,z),Plus(n,C1)),CN1),Sum(Times(Sum(Times(Power(CN1,Plus(k,C1)),Binomial(Plus(n,C1),Plus(CN1,k)),Power(Plus(Negate(k),m,C1),n)),list(k,C1,m)),Power(z,m)),list(m,C1,n))),Less(i,C0)))),
    // PolyLog(Undefined,y_):=Undefined
    ISetDelayed(PolyLog(Undefined,y_),
      Undefined),
    // PolyLog(x_,Undefined):=Undefined
    ISetDelayed(PolyLog(x_,Undefined),
      Undefined)
  );
}
