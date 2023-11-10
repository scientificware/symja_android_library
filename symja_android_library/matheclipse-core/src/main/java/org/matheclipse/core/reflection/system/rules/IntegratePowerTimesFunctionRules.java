package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class IntegratePowerTimesFunctionRules {
  final public static IAST RULES = List(
    // f2(ArcCos,x_,n_,m_):=(x^(1+n)*((2+n)*ArcCos(m*x)+m*x*Hypergeometric2F1(1/2,1+n/2,2+n/2,m^2*x^2)))/((1+n)*(2+n))
    SetDelayed($(f2,ArcCos,x_,n_,m_),
      Times(Power(Times(Plus(C1,n),Plus(C2,n)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C2,n),ArcCos(Times(m,x))),Times(m,x,Hypergeometric2F1(C1D2,Plus(C1,Times(C1D2,n)),Plus(C2,Times(C1D2,n)),Times(Sqr(m),Sqr(x))))))),
    // f3(ArcCos,x_,n_,m_,p_):=(x^(1+n)*((1+n+p)*ArcCos(m*x^p)+m*p*x^p*Hypergeometric2F1(1/2,(1+n+p)/(2*p),(1+n+3*p)/(2*p),m^2*x^(2*p))))/((1+n)*(1+n+p))
    SetDelayed($(f3,ArcCos,x_,n_,m_,p_),
      Times(Power(Times(Plus(C1,n),Plus(C1,n,p)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C1,n,p),ArcCos(Times(m,Power(x,p)))),Times(m,p,Power(x,p),Hypergeometric2F1(C1D2,Times(Plus(C1,n,p),Power(Times(C2,p),CN1)),Times(Plus(C1,n,Times(C3,p)),Power(Times(C2,p),CN1)),Times(Sqr(m),Power(x,Times(C2,p)))))))),
    // f2(ArcCosh,x_,n_,m_):=(x^(1+n)*(ArcCosh(m*x)+(-m*x*Sqrt(1-m^2*x^2)*Hypergeometric2F1(1/2,1+n/2,2+n/2,m^2*x^2))/((2+n)*Sqrt(-1+m*x)*Sqrt(1+m*x))))/(1+n)
    SetDelayed($(f2,ArcCosh,x_,n_,m_),
      Times(Power(Plus(C1,n),CN1),Power(x,Plus(C1,n)),Plus(ArcCosh(Times(m,x)),Times(CN1,m,x,Sqrt(Plus(C1,Times(CN1,Sqr(m),Sqr(x)))),Power(Times(Plus(C2,n),Sqrt(Plus(CN1,Times(m,x))),Sqrt(Plus(C1,Times(m,x)))),CN1),Hypergeometric2F1(C1D2,Plus(C1,Times(C1D2,n)),Plus(C2,Times(C1D2,n)),Times(Sqr(m),Sqr(x))))))),
    // f3(ArcCosh,x_,n_,m_,p_):=(x^(1+n)*(ArcCosh(m*x^p)+(-m*p*x^p*Sqrt(1-m^2*x^(2*p))*Hypergeometric2F1(1/2,(1+n+p)/(2*p),(1+n+3*p)/(2*p),m^2*x^(2*p)))/((1+n+p)*Sqrt(-1+m*x^p)*Sqrt(1+m*x^p))))/(1+n)
    SetDelayed($(f3,ArcCosh,x_,n_,m_,p_),
      Times(Power(Plus(C1,n),CN1),Power(x,Plus(C1,n)),Plus(ArcCosh(Times(m,Power(x,p))),Times(CN1,m,p,Power(x,p),Sqrt(Plus(C1,Times(CN1,Sqr(m),Power(x,Times(C2,p))))),Power(Times(Plus(C1,n,p),Sqrt(Plus(CN1,Times(m,Power(x,p)))),Sqrt(Plus(C1,Times(m,Power(x,p))))),CN1),Hypergeometric2F1(C1D2,Times(Plus(C1,n,p),Power(Times(C2,p),CN1)),Times(Plus(C1,n,Times(C3,p)),Power(Times(C2,p),CN1)),Times(Sqr(m),Power(x,Times(C2,p)))))))),
    // f2(ArcCot,x_,n_,m_):=(x^(1+n)*((2+n)*ArcCot(m*x)+m*x*Hypergeometric2F1(1,1+n/2,2+n/2,-m^2*x^2)))/((1+n)*(2+n))
    SetDelayed($(f2,ArcCot,x_,n_,m_),
      Times(Power(Times(Plus(C1,n),Plus(C2,n)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C2,n),ArcCot(Times(m,x))),Times(m,x,Hypergeometric2F1(C1,Plus(C1,Times(C1D2,n)),Plus(C2,Times(C1D2,n)),Times(CN1,Sqr(m),Sqr(x))))))),
    // f2(ArcCoth,x_,n_,m_):=(x^(1+n)*((2+n)*ArcCoth(m*x)-m*x*Hypergeometric2F1(1,1+n/2,2+n/2,m^2*x^2)))/((1+n)*(2+n))
    SetDelayed($(f2,ArcCoth,x_,n_,m_),
      Times(Power(Times(Plus(C1,n),Plus(C2,n)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C2,n),ArcCoth(Times(m,x))),Times(CN1,m,x,Hypergeometric2F1(C1,Plus(C1,Times(C1D2,n)),Plus(C2,Times(C1D2,n)),Times(Sqr(m),Sqr(x))))))),
    // f2(ArcSin,x_,n_,m_):=(x^(1+n)*((2+n)*ArcSin(m*x)-m*x*Hypergeometric2F1(1/2,1+n/2,2+n/2,m^2*x^2)))/((1+n)*(2+n))
    SetDelayed($(f2,ArcSin,x_,n_,m_),
      Times(Power(Times(Plus(C1,n),Plus(C2,n)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C2,n),ArcSin(Times(m,x))),Times(CN1,m,x,Hypergeometric2F1(C1D2,Plus(C1,Times(C1D2,n)),Plus(C2,Times(C1D2,n)),Times(Sqr(m),Sqr(x))))))),
    // f3(ArcSin,x_,n_,m_,p_):=(x^(1+n)*((1+n+p)*ArcSin(m*x^p)-m*p*x^p*Hypergeometric2F1(1/2,(1+n+p)/(2*p),(1+n+3*p)/(2*p),m^2*x^(2*p))))/((1+n)*(1+n+p))
    SetDelayed($(f3,ArcSin,x_,n_,m_,p_),
      Times(Power(Times(Plus(C1,n),Plus(C1,n,p)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C1,n,p),ArcSin(Times(m,Power(x,p)))),Times(CN1,m,p,Power(x,p),Hypergeometric2F1(C1D2,Times(Plus(C1,n,p),Power(Times(C2,p),CN1)),Times(Plus(C1,n,Times(C3,p)),Power(Times(C2,p),CN1)),Times(Sqr(m),Power(x,Times(C2,p)))))))),
    // f2(ArcSinh,x_,n_,m_):=(x^(1+n)*((2+n)*ArcSinh(m*x)-m*x*Hypergeometric2F1(1/2,1+n/2,2+n/2,-m^2*x^2)))/((1+n)*(2+n))
    SetDelayed($(f2,ArcSinh,x_,n_,m_),
      Times(Power(Times(Plus(C1,n),Plus(C2,n)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C2,n),ArcSinh(Times(m,x))),Times(CN1,m,x,Hypergeometric2F1(C1D2,Plus(C1,Times(C1D2,n)),Plus(C2,Times(C1D2,n)),Times(CN1,Sqr(m),Sqr(x))))))),
    // f3(ArcSinh,x_,n_,m_,p_):=(x^(1+n)*((1+n+p)*ArcSinh(m*x^p)-m*p*x^p*Hypergeometric2F1(1/2,(1+n+p)/(2*p),(1+n+3*p)/(2*p),-m^2*x^(2*p))))/((1+n)*(1+n+p))
    SetDelayed($(f3,ArcSinh,x_,n_,m_,p_),
      Times(Power(Times(Plus(C1,n),Plus(C1,n,p)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C1,n,p),ArcSinh(Times(m,Power(x,p)))),Times(CN1,m,p,Power(x,p),Hypergeometric2F1(C1D2,Times(Plus(C1,n,p),Power(Times(C2,p),CN1)),Times(Plus(C1,n,Times(C3,p)),Power(Times(C2,p),CN1)),Times(CN1,Sqr(m),Power(x,Times(C2,p)))))))),
    // f2(ArcTan,x_,n_,m_):=x^(1+n)/((1+n)*(2+n))*((2+n)*ArcTan(m*x)-m*x*Hypergeometric2F1(1,1+n/2,2+n/2,-m^2*x^2))
    SetDelayed($(f2,ArcTan,x_,n_,m_),
      Times(Power(Times(Plus(C1,n),Plus(C2,n)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C2,n),ArcTan(Times(m,x))),Times(CN1,m,x,Hypergeometric2F1(C1,Plus(C1,Times(C1D2,n)),Plus(C2,Times(C1D2,n)),Times(CN1,Sqr(m),Sqr(x))))))),
    // f2(ArcTanh,x_,n_,m_):=(x^(1+n)*((2+n)*ArcTanh(m*x)-m*x*Hypergeometric2F1(1,1+n/2,2+n/2,m^2*x^2)))/((1+n)*(2+n))
    SetDelayed($(f2,ArcTanh,x_,n_,m_),
      Times(Power(Times(Plus(C1,n),Plus(C2,n)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C2,n),ArcTanh(Times(m,x))),Times(CN1,m,x,Hypergeometric2F1(C1,Plus(C1,Times(C1D2,n)),Plus(C2,Times(C1D2,n)),Times(Sqr(m),Sqr(x))))))),
    // f2(CubeRoot,x_,n_,m_):=(x^(1+n)*Surd(m*x,3))/(4/3+n)
    SetDelayed($(f2,CubeRoot,x_,n_,m_),
      Times(Power(Plus(QQ(4L,3L),n),CN1),Power(x,Plus(C1,n)),Surd(Times(m,x),C3))),
    // f1(EllipticE,x_,m_):=(2*((1+m*x)*EllipticE(m*x)+(-1+m*x)*EllipticK(m*x)))/(3*m)
    SetDelayed($(f1,EllipticE,x_,m_),
      Times(C2,Power(Times(C3,m),CN1),Plus(Times(Plus(C1,Times(m,x)),EllipticE(Times(m,x))),Times(Plus(CN1,Times(m,x)),EllipticK(Times(m,x)))))),
    // f2(EllipticE,x_,n_,m_):=(Pi*x^(1+n)*HypergeometricPFQ({-1/2,1/2,1+n},{1,2+n},m*x))/(2+2*n)
    SetDelayed($(f2,EllipticE,x_,n_,m_),
      Times(Power(Plus(C2,Times(C2,n)),CN1),Pi,Power(x,Plus(C1,n)),HypergeometricPFQ(list(CN1D2,C1D2,Plus(C1,n)),list(C1,Plus(C2,n)),Times(m,x)))),
    // f3(EllipticE,x_,n_,m_,p_):=(Pi*x^(1+n)*Gamma((1+n)/p)*HypergeometricPFQRegularized({-1/2,1/2,(1+n)/p},{1,(1+n+p)/p},m*x^p))/(2*p)
    SetDelayed($(f3,EllipticE,x_,n_,m_,p_),
      Times(Power(Times(C2,p),CN1),Pi,Power(x,Plus(C1,n)),Gamma(Times(Plus(C1,n),Power(p,CN1))),HypergeometricPFQRegularized(list(CN1D2,C1D2,Times(Plus(C1,n),Power(p,CN1))),list(C1,Times(Power(p,CN1),Plus(C1,n,p))),Times(m,Power(x,p))))),
    // f1(EllipticK,x_,m_):=(2*(EllipticE(m*x)+(-1+m*x)*EllipticK(m*x)))/m
    SetDelayed($(f1,EllipticK,x_,m_),
      Times(C2,Power(m,CN1),Plus(EllipticE(Times(m,x)),Times(Plus(CN1,Times(m,x)),EllipticK(Times(m,x)))))),
    // f2(EllipticK,x_,n_,m_):=(Pi*x^(1+n)*HypergeometricPFQ({1/2,1/2,1+n},{1,2+n},m*x))/(2+2*n)
    SetDelayed($(f2,EllipticK,x_,n_,m_),
      Times(Power(Plus(C2,Times(C2,n)),CN1),Pi,Power(x,Plus(C1,n)),HypergeometricPFQ(list(C1D2,C1D2,Plus(C1,n)),list(C1,Plus(C2,n)),Times(m,x)))),
    // f3(EllipticK,x_,n_,m_,p_):=(Pi*x^(1+n)*Gamma((1+n)/p)*HypergeometricPFQRegularized({1/2,1/2,(1+n)/p},{1,(1+n+p)/p},m*x^p))/(2*p)
    SetDelayed($(f3,EllipticK,x_,n_,m_,p_),
      Times(Power(Times(C2,p),CN1),Pi,Power(x,Plus(C1,n)),Gamma(Times(Plus(C1,n),Power(p,CN1))),HypergeometricPFQRegularized(list(C1D2,C1D2,Times(Plus(C1,n),Power(p,CN1))),list(C1,Times(Power(p,CN1),Plus(C1,n,p))),Times(m,Power(x,p))))),
    // f1(Haversine,x_,m_):=x/2-Sin(m*x)/(2*m)
    SetDelayed($(f1,Haversine,x_,m_),
      Plus(Times(C1D2,x),Times(CN1,Power(Times(C2,m),CN1),Sin(Times(m,x))))),
    // f2(Haversine,x_,n_,m_):=1/4*x^n*((2*x)/(1+n)+(x*Gamma(1+n,-I*m*x))/(-I*m*x)^(1+n)+(x*Gamma(1+n,I*m*x))/(I*m*x)^(1+n))
    SetDelayed($(f2,Haversine,x_,n_,m_),
      Times(C1D4,Power(x,n),Plus(Times(C2,Power(Plus(C1,n),CN1),x),Times(x,Power(Power(Times(CNI,m,x),Plus(C1,n)),CN1),Gamma(Plus(C1,n),Times(CNI,m,x))),Times(x,Power(Power(Times(CI,m,x),Plus(C1,n)),CN1),Gamma(Plus(C1,n),Times(CI,m,x)))))),
    // f3(Haversine,x_,n_,m_,p_):=(x^(1+n)*(2*p*(m^2*x^(2*p))^((1+n)/p)+(1+n)*(I*m*x^p)^((1+n)/p)*Gamma((1+n)/p,-I*m*x^p)+(1+n)*(-I*m*x^p)^((1+n)/p)*Gamma((1+n)/p,I*m*x^p)))/((m^2*x^(2*p))^((1+n)/p)*4*(1+n)*p)
    SetDelayed($(f3,Haversine,x_,n_,m_,p_),
      Times(Power(Times(Power(Times(Sqr(m),Power(x,Times(C2,p))),Times(Plus(C1,n),Power(p,CN1))),C4,Plus(C1,n),p),CN1),Power(x,Plus(C1,n)),Plus(Times(C2,p,Power(Times(Sqr(m),Power(x,Times(C2,p))),Times(Plus(C1,n),Power(p,CN1)))),Times(Plus(C1,n),Power(Times(CI,m,Power(x,p)),Times(Plus(C1,n),Power(p,CN1))),Gamma(Times(Plus(C1,n),Power(p,CN1)),Times(CNI,m,Power(x,p)))),Times(Plus(C1,n),Power(Times(CNI,m,Power(x,p)),Times(Plus(C1,n),Power(p,CN1))),Gamma(Times(Plus(C1,n),Power(p,CN1)),Times(CI,m,Power(x,p))))))),
    // f1(InverseHaversine,x_,m_):=(Sqrt(-m*x*(-1+m*x))+(-1+2*m*x)*ArcSin(Sqrt(m*x)))/m
    SetDelayed($(f1,InverseHaversine,x_,m_),
      Times(Power(m,CN1),Plus(Sqrt(Times(CN1,m,x,Plus(CN1,Times(m,x)))),Times(Plus(CN1,Times(C2,m,x)),ArcSin(Sqrt(Times(m,x))))))),
    // f2(InverseHaversine,x_,n_,m_):=(2*x^(1+n)*((3+2*n)*ArcSin(Sqrt(m*x))-Sqrt(m*x)*Hypergeometric2F1(1/2,3/2+n,5/2+n,m*x)))/((1+n)*(3+2*n))
    SetDelayed($(f2,InverseHaversine,x_,n_,m_),
      Times(C2,Power(Times(Plus(C1,n),Plus(C3,Times(C2,n))),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C3,Times(C2,n)),ArcSin(Sqrt(Times(m,x)))),Times(CN1,Sqrt(Times(m,x)),Hypergeometric2F1(C1D2,Plus(QQ(3L,2L),n),Plus(QQ(5L,2L),n),Times(m,x)))))),
    // f3(InverseHaversine,x_,n_,m_,p_):=(2*x^(1+n)*((2+2*n+p)*ArcSin(Sqrt(m*x^p))-p*Sqrt(m*x^p)*Hypergeometric2F1(1/2,(2+2*n+p)/(2*p),3/2+(1+n)/p,m*x^p)))/((1+n)*(2+2*n+p))
    SetDelayed($(f3,InverseHaversine,x_,n_,m_,p_),
      Times(C2,Power(Times(Plus(C1,n),Plus(C2,Times(C2,n),p)),CN1),Power(x,Plus(C1,n)),Plus(Times(Plus(C2,Times(C2,n),p),ArcSin(Sqrt(Times(m,Power(x,p))))),Times(CN1,p,Sqrt(Times(m,Power(x,p))),Hypergeometric2F1(C1D2,Times(Plus(C2,Times(C2,n),p),Power(Times(C2,p),CN1)),Plus(QQ(3L,2L),Times(Plus(C1,n),Power(p,CN1))),Times(m,Power(x,p))))))),
    // f1(InverseErf,x_,m_):=-1/(E^InverseErf(m*x)^2*m*Sqrt(Pi))
    SetDelayed($(f1,InverseErf,x_,m_),
      Negate(Power(Times(Exp(Sqr(InverseErf(Times(m,x)))),m,CSqrtPi),CN1))),
    // f1(InverseErfc,x_,m_):=1/(E^InverseErfc(m*x)^2*m*Sqrt(Pi))
    SetDelayed($(f1,InverseErfc,x_,m_),
      Power(Times(Exp(Sqr(InverseErfc(Times(m,x)))),m,CSqrtPi),CN1)),
    // f1(LogisticSigmoid,x_,m_):=-Log(1-LogisticSigmoid(m*x))/m
    SetDelayed($(f1,LogisticSigmoid,x_,m_),
      Times(CN1,Power(m,CN1),Log(Subtract(C1,LogisticSigmoid(Times(m,x)))))),
    // f4(Surd,x_,n_,m_,p_Integer):=(x^(n+1)*Surd(m*x,p))/((p+1)/p+n)/;p>0
    SetDelayed($(f4,Surd,x_,n_,m_,$p(p, Integer)),
      Condition(Times(Power(Plus(Times(Plus(p,C1),Power(p,CN1)),n),CN1),Power(x,Plus(n,C1)),Surd(Times(m,x),p)),Greater(p,C0)))
  );
}