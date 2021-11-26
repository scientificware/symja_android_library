package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface DerivativeRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 107 };

  final public static IAST RULES = List(
    IInit(Derivative, SIZES),
    // Derivative(1)[AiryAi]:=AiryAiPrime(#1)&
    ISetDelayed($(Derivative(C1),AiryAi),
      Function(AiryAiPrime(Slot1))),
    // Derivative(1)[AiryAiPrime]:=AiryAi(#1)*#1&
    ISetDelayed($(Derivative(C1),AiryAiPrime),
      Function(Times(AiryAi(Slot1),Slot1))),
    // Derivative(1)[AiryBi]:=AiryBiPrime(#1)&
    ISetDelayed($(Derivative(C1),AiryBi),
      Function(AiryBiPrime(Slot1))),
    // Derivative(1)[AiryBiPrime]:=AiryBi(#1)*#1&
    ISetDelayed($(Derivative(C1),AiryBiPrime),
      Function(Times(AiryBi(Slot1),Slot1))),
    // Derivative(1)[ArcCos]:=-1/Sqrt(1-#1^2)&
    ISetDelayed($(Derivative(C1),ArcCos),
      Function(Negate(Power(Subtract(C1,Sqr(Slot1)),CN1D2)))),
    // Derivative(1)[ArcCosh]:=1/Sqrt(-1+#1^2)&
    ISetDelayed($(Derivative(C1),ArcCosh),
      Function(Power(Plus(CN1,Sqr(Slot1)),CN1D2))),
    // Derivative(1)[ArcCot]:=-1/(1+#1^2)&
    ISetDelayed($(Derivative(C1),ArcCot),
      Function(Negate(Power(Plus(C1,Sqr(Slot1)),CN1)))),
    // Derivative(1)[ArcCoth]:=1/(1-#1^2)&
    ISetDelayed($(Derivative(C1),ArcCoth),
      Function(Power(Subtract(C1,Sqr(Slot1)),CN1))),
    // Derivative(1)[ArcCsc]:=-1/(#1^2*Sqrt(1-1/#1^2))&
    ISetDelayed($(Derivative(C1),ArcCsc),
      Function(Times(CN1,Power(Slot1,CN2),Power(Subtract(C1,Power(Slot1,CN2)),CN1D2)))),
    // Derivative(1)[ArcCsch]:=-1/(Abs(#1)*Sqrt(1+#1^2))&
    ISetDelayed($(Derivative(C1),ArcCsch),
      Function(Times(CN1,Power(Abs(Slot1),CN1),Power(Plus(C1,Sqr(Slot1)),CN1D2)))),
    // Derivative(1)[ArcSin]:=1/Sqrt(1-#1^2)&
    ISetDelayed($(Derivative(C1),ArcSin),
      Function(Power(Subtract(C1,Sqr(Slot1)),CN1D2))),
    // Derivative(1)[ArcSinh]:=1/Sqrt(1+#1^2)&
    ISetDelayed($(Derivative(C1),ArcSinh),
      Function(Power(Plus(C1,Sqr(Slot1)),CN1D2))),
    // Derivative(1)[ArcTan]:=1/(1+#1^2)&
    ISetDelayed($(Derivative(C1),ArcTan),
      Function(Power(Plus(C1,Sqr(Slot1)),CN1))),
    // Derivative(1)[ArcTanh]:=1/(1-#1^2)&
    ISetDelayed($(Derivative(C1),ArcTanh),
      Function(Power(Subtract(C1,Sqr(Slot1)),CN1))),
    // Derivative(1)[ArcSec]:=1/(#1^2*Sqrt(1-1/#1^2))&
    ISetDelayed($(Derivative(C1),ArcSec),
      Function(Times(Power(Slot1,CN2),Power(Subtract(C1,Power(Slot1,CN2)),CN1D2)))),
    // Derivative(1)[ArcSech]:=-1/(#1*Sqrt(1-#1^2))&
    ISetDelayed($(Derivative(C1),ArcSech),
      Function(Times(CN1,Power(Slot1,CN1),Power(Subtract(C1,Sqr(Slot1)),CN1D2)))),
    // Derivative(1)[Ceiling]:=Piecewise({{0,#1<Ceiling(#1)}},Indeterminate)&
    ISetDelayed($(Derivative(C1),Ceiling),
      Function(Piecewise(List(List(C0,Less(Slot1,Ceiling(Slot1)))),Indeterminate))),
    // Derivative(1)[EllipticE]:=(EllipticE(#1)-EllipticK(#1))/(2*#1)&
    ISetDelayed($(Derivative(C1),EllipticE),
      Function(Times(Subtract(EllipticE(Slot1),EllipticK(Slot1)),Power(Times(C2,Slot1),CN1)))),
    // Derivative(1)[EllipticK]:=(EllipticE(#1)-EllipticK(#1)*(1-#1))/(2*(1-#1)*#1)&
    ISetDelayed($(Derivative(C1),EllipticK),
      Function(Times(Plus(EllipticE(Slot1),Times(CN1,EllipticK(Slot1),Subtract(C1,Slot1))),Power(Times(C2,Subtract(C1,Slot1),Slot1),CN1)))),
    // Derivative(1)[Erf]:=2*1/(E^#1^2*Sqrt(Pi))&
    ISetDelayed($(Derivative(C1),Erf),
      Function(Times(C2,Exp(Negate(Sqr(Slot1))),Power(Pi,CN1D2)))),
    // Derivative(1)[Erfc]:=-2*1/(E^#1^2*Sqrt(Pi))&
    ISetDelayed($(Derivative(C1),Erfc),
      Function(Times(CN2,Exp(Negate(Sqr(Slot1))),Power(Pi,CN1D2)))),
    // Derivative(1)[Erfi]:=2*E^#1^2/Sqrt(Pi)&
    ISetDelayed($(Derivative(C1),Erfi),
      Function(Times(C2,Exp(Sqr(Slot1)),Power(Pi,CN1D2)))),
    // Derivative(1)[ExpIntegralEi]:=E^#1/#1&
    ISetDelayed($(Derivative(C1),ExpIntegralEi),
      Function(Times(Exp(Slot1),Power(Slot1,CN1)))),
    // Derivative(1)[Factorial]:=Gamma(1+#1)*PolyGamma(0,1+#1)&
    ISetDelayed($(Derivative(C1),Factorial),
      Function(Times(Gamma(Plus(C1,Slot1)),PolyGamma(C0,Plus(C1,Slot1))))),
    // Derivative(1)[Floor]:=Piecewise({{0,#1>Floor(#1)}},Indeterminate)&
    ISetDelayed($(Derivative(C1),Floor),
      Function(Piecewise(List(List(C0,Greater(Slot1,Floor(Slot1)))),Indeterminate))),
    // Derivative(1)[FractionalPart]:=1&
    ISetDelayed($(Derivative(C1),FractionalPart),
      Function(C1)),
    // Derivative(1)[FresnelC]:=Cos(1/2*Pi*#1^2)&
    ISetDelayed($(Derivative(C1),FresnelC),
      Function(Cos(Times(C1D2,Pi,Sqr(Slot1))))),
    // Derivative(1)[FresnelS]:=Sin(1/2*Pi*#1^2)&
    ISetDelayed($(Derivative(C1),FresnelS),
      Function(Sin(Times(C1D2,Pi,Sqr(Slot1))))),
    // Derivative(1)[Gamma]:=Gamma(#1)*PolyGamma(#1)&
    ISetDelayed($(Derivative(C1),Gamma),
      Function(Times(Gamma(Slot1),PolyGamma(Slot1)))),
    // Derivative(1)[Gudermannian]:=Sech(#1)&
    ISetDelayed($(Derivative(C1),Gudermannian),
      Function(Sech(Slot1))),
    // Derivative(1)[HarmonicNumber]:=Pi^2/6-HarmonicNumber(#1,2)&
    ISetDelayed($(Derivative(C1),HarmonicNumber),
      Function(Subtract(Times(QQ(1L,6L),Sqr(Pi)),HarmonicNumber(Slot1,C2)))),
    // Derivative(1)[Haversine]:=Sin(#1)/2&
    ISetDelayed($(Derivative(C1),Haversine),
      Function(Times(C1D2,Sin(Slot1)))),
    // Derivative(1)[HeavisideTheta]:=DiracDelta(#1)&
    ISetDelayed($(Derivative(C1),HeavisideTheta),
      Function(DiracDelta(Slot1))),
    // Derivative(1)[Identity]:=1&
    ISetDelayed($(Derivative(C1),Identity),
      Function(C1)),
    // Derivative(1)[IntegerPart]:=0&
    ISetDelayed($(Derivative(C1),IntegerPart),
      Function(C0)),
    // Derivative(1)[InverseErf]:=1/2*Sqrt(Pi)*E^InverseErf(x)^2&
    ISetDelayed($(Derivative(C1),InverseErf),
      Function(Times(C1D2,Sqrt(Pi),Exp(Sqr(InverseErf(x)))))),
    // Derivative(1)[InverseErfc]:=-1/2*E^InverseErfc(#1)^2*Sqrt(Pi)&
    ISetDelayed($(Derivative(C1),InverseErfc),
      Function(Times(CN1D2,Exp(Sqr(InverseErfc(Slot1))),Sqrt(Pi)))),
    // Derivative(1)[InverseHaversine]:=1/Sqrt((1-#1)*#1)&
    ISetDelayed($(Derivative(C1),InverseHaversine),
      Function(Power(Times(Subtract(C1,Slot1),Slot1),CN1D2))),
    // Derivative(1)[InverseGudermannian]:=Sec(#1)&
    ISetDelayed($(Derivative(C1),InverseGudermannian),
      Function(Sec(Slot1))),
    // Derivative(1)[KelvinBei]:=(2*KelvinBei(1,#1)-2*KelvinBer(1,#1))/(2*Sqrt(2))&
    ISetDelayed($(Derivative(C1),KelvinBei),
      Function(Times(Power(Times(C2,CSqrt2),CN1),Plus(Times(C2,KelvinBei(C1,Slot1)),Times(CN2,KelvinBer(C1,Slot1)))))),
    // Derivative(1)[KelvinBer]:=(2*KelvinBei(1,#1)+2*KelvinBer(1,#1))/(2*Sqrt(2))&
    ISetDelayed($(Derivative(C1),KelvinBer),
      Function(Times(Power(Times(C2,CSqrt2),CN1),Plus(Times(C2,KelvinBei(C1,Slot1)),Times(C2,KelvinBer(C1,Slot1)))))),
    // Derivative(1)[Log]:=1/#1&
    ISetDelayed($(Derivative(C1),Log),
      Function(Power(Slot1,CN1))),
    // Derivative(1)[LogGamma]:=PolyGamma(0,#1)&
    ISetDelayed($(Derivative(C1),LogGamma),
      Function(PolyGamma(C0,Slot1))),
    // Derivative(1)[LogisticSigmoid]:=LogisticSigmoid(#1)*(1-LogisticSigmoid(#1))&
    ISetDelayed($(Derivative(C1),LogisticSigmoid),
      Function(Times(LogisticSigmoid(Slot1),Subtract(C1,LogisticSigmoid(Slot1))))),
    // Derivative(1)[PolyGamma]:=PolyGamma(1,#1)&
    ISetDelayed($(Derivative(C1),PolyGamma),
      Function(PolyGamma(C1,Slot1))),
    // Derivative(1)[ProductLog]:=ProductLog(#1)/((1+ProductLog(#1))*#1)&
    ISetDelayed($(Derivative(C1),ProductLog),
      Function(Times(ProductLog(Slot1),Power(Times(Plus(C1,ProductLog(Slot1)),Slot1),CN1)))),
    // Derivative(1)[Cot]:=-Csc(#1)^2&
    ISetDelayed($(Derivative(C1),Cot),
      Function(Negate(Sqr(Csc(Slot1))))),
    // Derivative(1)[Coth]:=-1/Sinh(#1)^2&
    ISetDelayed($(Derivative(C1),Coth),
      Function(Negate(Power(Sinh(Slot1),CN2)))),
    // Derivative(1)[Cos]:=-Sin(#1)&
    ISetDelayed($(Derivative(C1),Cos),
      Function(Negate(Sin(Slot1)))),
    // Derivative(1)[Cosh]:=Sinh(#1)&
    ISetDelayed($(Derivative(C1),Cosh),
      Function(Sinh(Slot1))),
    // Derivative(1)[Csc]:=-Cot(#1)*Csc(#1)&
    ISetDelayed($(Derivative(C1),Csc),
      Function(Times(CN1,Cot(Slot1),Csc(Slot1)))),
    // Derivative(1)[Csch]:=-Coth(#1)*Csch(#1)&
    ISetDelayed($(Derivative(C1),Csch),
      Function(Times(CN1,Coth(Slot1),Csch(Slot1)))),
    // Derivative(1)[RealAbs]:=#1/RealAbs(#1)&
    ISetDelayed($(Derivative(C1),RealAbs),
      Function(Times(Power(RealAbs(Slot1),CN1),Slot1))),
    // Derivative(1)[RealSign]:=Piecewise({{0,#1!=0}},Indeterminate)&
    ISetDelayed($(Derivative(C1),RealSign),
      Function(Piecewise(List(List(C0,Unequal(Slot1,C0))),Indeterminate))),
    // Derivative(1)[Round]:=Piecewise({{0,NotElement(-1/2+Re(#1),Integers)&&NotElement(-1/2+Im(#1),Integers)}},Indeterminate)&
    ISetDelayed($(Derivative(C1),Round),
      Function(Piecewise(List(List(C0,And(NotElement(Plus(CN1D2,Re(Slot1)),Integers),NotElement(Plus(CN1D2,Im(Slot1)),Integers)))),Indeterminate))),
    // Derivative(1)[Sin]:=Cos(#1)&
    ISetDelayed($(Derivative(C1),Sin),
      Function(Cos(Slot1))),
    // Derivative(1)[Sinc]:=-Sin(#1)/#1^2+Cos(#1)/#1&
    ISetDelayed($(Derivative(C1),Sinc),
      Function(Plus(Times(CN1,Sin(Slot1),Power(Slot1,CN2)),Times(Cos(Slot1),Power(Slot1,CN1))))),
    // Derivative(1)[Sinh]:=Cosh(#1)&
    ISetDelayed($(Derivative(C1),Sinh),
      Function(Cosh(Slot1))),
    // Derivative(1)[Tan]:=Sec(#1)^2&
    ISetDelayed($(Derivative(C1),Tan),
      Function(Sqr(Sec(Slot1)))),
    // Derivative(1)[Tanh]:=Sech(#1)^2&
    ISetDelayed($(Derivative(C1),Tanh),
      Function(Sqr(Sech(Slot1)))),
    // Derivative(1)[Sec]:=Sec(#1)*Tan(#1)&
    ISetDelayed($(Derivative(C1),Sec),
      Function(Times(Sec(Slot1),Tan(Slot1)))),
    // Derivative(1)[Sech]:=-Tanh(#1)*Sech(#1)&
    ISetDelayed($(Derivative(C1),Sech),
      Function(Times(CN1,Tanh(Slot1),Sech(Slot1)))),
    // Derivative(1)[SinIntegral]:=Sinc(#1)&
    ISetDelayed($(Derivative(C1),SinIntegral),
      Function(Sinc(Slot1))),
    // Derivative(1)[SinhIntegral]:=Sinh(#1)/#1&
    ISetDelayed($(Derivative(C1),SinhIntegral),
      Function(Times(Sinh(Slot1),Power(Slot1,CN1)))),
    // Derivative(1)[CosIntegral]:=Cos(#1)/#1&
    ISetDelayed($(Derivative(C1),CosIntegral),
      Function(Times(Cos(Slot1),Power(Slot1,CN1)))),
    // Derivative(1)[CoshIntegral]:=Cosh(#1)/#1&
    ISetDelayed($(Derivative(C1),CoshIntegral),
      Function(Times(Cosh(Slot1),Power(Slot1,CN1)))),
    // Derivative(n_Symbol)[Cos]:=Cos(1/2*n*Pi+#1)&
    ISetDelayed($(Derivative(n_Symbol),Cos),
      Function(Cos(Plus(Times(C1D2,n,Pi),Slot1)))),
    // Derivative(n_Symbol)[Sin]:=Sin(1/2*n*Pi+#1)&
    ISetDelayed($(Derivative(n_Symbol),Sin),
      Function(Sin(Plus(Times(C1D2,n,Pi),Slot1)))),
    // Derivative(n_Symbol)[Cosh]:=-I^n*Cos(1/2*n*Pi-I*#1)&
    ISetDelayed($(Derivative(n_Symbol),Cosh),
      Function(Times(Power(CNI,n),Cos(Plus(Times(C1D2,n,Pi),Times(CNI,Slot1)))))),
    // Derivative(n_Symbol)[Sinh]:=I*-I^n*Sin(1/2*n*Pi-I*#1)&
    ISetDelayed($(Derivative(n_Symbol),Sinh),
      Function(Times(CI,Power(CNI,n),Sin(Plus(Times(C1D2,n,Pi),Times(CNI,Slot1)))))),
    // Derivative(0,1)[BesselJ]:=1/2*(BesselJ(-1+#1,#2)-BesselJ(1+#1,#2))&
    ISetDelayed($(Derivative(C0,C1),BesselJ),
      Function(Times(C1D2,Subtract(BesselJ(Plus(CN1,Slot1),Slot2),BesselJ(Plus(C1,Slot1),Slot2))))),
    // Derivative(0,1)[BesselY]:=1/2*(BesselY(-1+#1,#2)-BesselY(1+#1,#2))&
    ISetDelayed($(Derivative(C0,C1),BesselY),
      Function(Times(C1D2,Subtract(BesselY(Plus(CN1,Slot1),Slot2),BesselY(Plus(C1,Slot1),Slot2))))),
    // Derivative(0,1)[BesselI]:=1/2*(BesselI(-1+#1,#2)+BesselI(1+#1,#2))&
    ISetDelayed($(Derivative(C0,C1),BesselI),
      Function(Times(C1D2,Plus(BesselI(Plus(CN1,Slot1),Slot2),BesselI(Plus(C1,Slot1),Slot2))))),
    // Derivative(0,1)[BesselK]:=1/2*(-BesselK(-1+#1,#2)-BesselK(1+#1,#2))&
    ISetDelayed($(Derivative(C0,C1),BesselK),
      Function(Times(C1D2,Subtract(Negate(BesselK(Plus(CN1,Slot1),Slot2)),BesselK(Plus(C1,Slot1),Slot2))))),
    // Derivative(1,0)[CarlsonRC]:=Piecewise({{(-CarlsonRC(#1,#2)+1/Sqrt(#1))/(2*(#1-#2)),#1!=#2},{-1/(6*#1^(3/2)),#1==#2&&(Im(#2)!=0||Re(#2)>0)}},ComplexInfinity)&
    ISetDelayed($(Derivative(C1,C0),CarlsonRC),
      Function(Piecewise(List(List(Times(Plus(Negate(CarlsonRC(Slot1,Slot2)),Power(Slot1,CN1D2)),Power(Times(C2,Subtract(Slot1,Slot2)),CN1)),Unequal(Slot1,Slot2)),List(Negate(Power(Times(C6,Power(Slot1,QQ(3L,2L))),CN1)),And(Equal(Slot1,Slot2),Or(Unequal(Im(Slot2),C0),Greater(Re(Slot2),C0))))),CComplexInfinity))),
    // Derivative(0,1)[CarlsonRC]:=Piecewise({{(CarlsonRC(#1,#2)-Sqrt(#1)/#2)/(2*(#1-#2)),#1!=#2},{-1/(3*#1^(3/2)),#1==#2&&(Im(#2)!=0||Re(#2)>0)}},ComplexInfinity)&
    ISetDelayed($(Derivative(C0,C1),CarlsonRC),
      Function(Piecewise(List(List(Times(Power(Times(C2,Subtract(Slot1,Slot2)),CN1),Plus(CarlsonRC(Slot1,Slot2),Times(CN1,Sqrt(Slot1),Power(Slot2,CN1)))),Unequal(Slot1,Slot2)),List(Negate(Power(Times(C3,Power(Slot1,QQ(3L,2L))),CN1)),And(Equal(Slot1,Slot2),Or(Unequal(Im(Slot2),C0),Greater(Re(Slot2),C0))))),CComplexInfinity))),
    // Derivative(1,0,0)[CarlsonRF]:=-CarlsonRD(#2,#3,#1)/6&
    ISetDelayed($(Derivative(C1,C0,C0),CarlsonRF),
      Function(Times(QQ(-1L,6L),CarlsonRD(Slot2,Slot(C3),Slot1)))),
    // Derivative(0,1,0)[CarlsonRF]:=-CarlsonRD(#1,#3,#2)/6&
    ISetDelayed($(Derivative(C0,C1,C0),CarlsonRF),
      Function(Times(QQ(-1L,6L),CarlsonRD(Slot1,Slot(C3),Slot2)))),
    // Derivative(0,0,1)[CarlsonRF]:=-CarlsonRD(#1,#2,#3)/6&
    ISetDelayed($(Derivative(C0,C0,C1),CarlsonRF),
      Function(Times(QQ(-1L,6L),CarlsonRD(Slot1,Slot2,Slot(C3))))),
    // Derivative(1,0,0)[CarlsonRG]:=CarlsonRF(#1,#2,#3)/4-1/12*CarlsonRD(#2,#3,#1)*#1&
    ISetDelayed($(Derivative(C1,C0,C0),CarlsonRG),
      Function(Plus(Times(C1D4,CarlsonRF(Slot1,Slot2,Slot(C3))),Times(QQ(-1L,12L),CarlsonRD(Slot2,Slot(C3),Slot1),Slot1)))),
    // Derivative(0,1,0)[CarlsonRG]:=CarlsonRF(#1,#2,#3)/4-1/12*CarlsonRD(#1,#3,#2)*#2&
    ISetDelayed($(Derivative(C0,C1,C0),CarlsonRG),
      Function(Plus(Times(C1D4,CarlsonRF(Slot1,Slot2,Slot(C3))),Times(QQ(-1L,12L),CarlsonRD(Slot1,Slot(C3),Slot2),Slot2)))),
    // Derivative(0,0,1)[CarlsonRG]:=CarlsonRF(#1,#2,#3)/4-1/12*CarlsonRD(#1,#2,#3)*#3&
    ISetDelayed($(Derivative(C0,C0,C1),CarlsonRG),
      Function(Plus(Times(C1D4,CarlsonRF(Slot1,Slot2,Slot(C3))),Times(QQ(-1L,12L),CarlsonRD(Slot1,Slot2,Slot(C3)),Slot(C3))))),
    // Derivative(0,1)[Gamma]:=-E^(-#2)/#2^(1-#1)&
    ISetDelayed($(Derivative(C0,C1),Gamma),
      Function(Times(CN1,Exp(Negate(Slot2)),Power(Slot2,Plus(CN1,Slot1))))),
    // Derivative(1,0)[Gamma]:=Gamma(#1,#2)*Log(#2)+MeijerG({{},{1,1}},{{0,0,#1},{}},#2)&
    ISetDelayed($(Derivative(C1,C0),Gamma),
      Function(Plus(Times(Gamma(Slot1,Slot2),Log(Slot2)),MeijerG(List(List(),List(C1,C1)),List(List(C0,C0,Slot1),List()),Slot2)))),
    // Derivative(0,1)[HankelH1]:=1/2*(HankelH1(-1+#1,#2)-HankelH1(1+#1,#2))&
    ISetDelayed($(Derivative(C0,C1),HankelH1),
      Function(Times(C1D2,Subtract(HankelH1(Plus(CN1,Slot1),Slot2),HankelH1(Plus(C1,Slot1),Slot2))))),
    // Derivative(0,1)[HankelH2]:=1/2*(HankelH2(-1+#1,#2)-HankelH2(1+#1,#2))&
    ISetDelayed($(Derivative(C0,C1),HankelH2),
      Function(Times(C1D2,Subtract(HankelH2(Plus(CN1,Slot1),Slot2),HankelH2(Plus(C1,Slot1),Slot2))))),
    // Derivative(1,0)[Pochhammer]:=Pochhammer(#1,#2)*(-PolyGamma(0,#1)+PolyGamma(0,#1+#2))&
    ISetDelayed($(Derivative(C1,C0),Pochhammer),
      Function(Times(Pochhammer(Slot1,Slot2),Plus(Negate(PolyGamma(C0,Slot1)),PolyGamma(C0,Plus(Slot1,Slot2)))))),
    // Derivative(0,1)[Pochhammer]:=Pochhammer(#1,#2)*PolyGamma(0,#1+#2)&
    ISetDelayed($(Derivative(C0,C1),Pochhammer),
      Function(Times(Pochhammer(Slot1,Slot2),PolyGamma(C0,Plus(Slot1,Slot2))))),
    // Derivative(1,0)[Power]:=#2/#1^(1-#2)&
    ISetDelayed($(Derivative(C1,C0),Power),
      Function(Times(Power(Slot1,Plus(CN1,Slot2)),Slot2))),
    // Derivative(0,1)[Power]:=Log(#1)*#1^#2&
    ISetDelayed($(Derivative(C0,C1),Power),
      Function(Times(Log(Slot1),Power(Slot1,Slot2)))),
    // Derivative(1,1)[Power]:=#1^(-1+#2)+(Log(#1)*#2)/#1^(1-#2)&
    ISetDelayed($(Derivative(C1,C1),Power),
      Function(Plus(Power(Slot1,Plus(CN1,Slot2)),Times(Log(Slot1),Power(Slot1,Plus(CN1,Slot2)),Slot2)))),
    // Derivative(0,1)[PolyLog]:=PolyLog(-1+#2,#1)/#1&
    ISetDelayed($(Derivative(C0,C1),PolyLog),
      Function(Times(PolyLog(Plus(CN1,Slot2),Slot1),Power(Slot1,CN1)))),
    // Derivative(0,1)[ProductLog]:=ProductLog(#1,#2)/#2*(1+ProductLog(#1,#2))&
    ISetDelayed($(Derivative(C0,C1),ProductLog),
      Function(Times(ProductLog(Slot1,Slot2),Power(Slot2,CN1),Plus(C1,ProductLog(Slot1,Slot2))))),
    // Derivative(0,1)[BernoulliB]:=BernoulliB(-1+#1,#2)*#1&
    ISetDelayed($(Derivative(C0,C1),BernoulliB),
      Function(Times(BernoulliB(Plus(CN1,Slot1),Slot2),Slot1))),
    // Derivative(1,0)[ChebyshevT]:=-ArcCos(#2)*ChebyshevU(-1+#1,#2)*Sqrt(1-#2^2)&
    ISetDelayed($(Derivative(C1,C0),ChebyshevT),
      Function(Times(CN1,ArcCos(Slot2),ChebyshevU(Plus(CN1,Slot1),Slot2),Sqrt(Subtract(C1,Sqr(Slot2)))))),
    // Derivative(0,1)[ChebyshevT]:=ChebyshevU(-1+#1,#2)*#1&
    ISetDelayed($(Derivative(C0,C1),ChebyshevT),
      Function(Times(ChebyshevU(Plus(CN1,Slot1),Slot2),Slot1))),
    // Derivative(1,0)[ChebyshevU]:=(ArcCos(#2)*ChebyshevT(1+#1,#2))/Sqrt(1-#2^2)&
    ISetDelayed($(Derivative(C1,C0),ChebyshevU),
      Function(Times(ArcCos(Slot2),ChebyshevT(Plus(C1,Slot1),Slot2),Power(Subtract(C1,Sqr(Slot2)),CN1D2)))),
    // Derivative(0,1)[ChebyshevU]:=(ChebyshevU(-1+#1,#2)*(-1-#1)+ChebyshevU(#1,#2)*#1*#2)/(-1+#2^2)&
    ISetDelayed($(Derivative(C0,C1),ChebyshevU),
      Function(Times(Plus(Times(ChebyshevU(Plus(CN1,Slot1),Slot2),Subtract(CN1,Slot1)),Times(ChebyshevU(Slot1,Slot2),Slot1,Slot2)),Power(Plus(CN1,Sqr(Slot2)),CN1)))),
    // Derivative(1,0)[GegenbauerC]:=((-1)*2*ChebyshevT(#1,#2))/#1^2+(-2*ArcCos(#2)*ChebyshevU(-1+#1,#2)*Sqrt(1-#2^2))/#1&
    ISetDelayed($(Derivative(C1,C0),GegenbauerC),
      Function(Plus(Times(CN1,C2,ChebyshevT(Slot1,Slot2),Power(Slot1,CN2)),Times(CN2,ArcCos(Slot2),ChebyshevU(Plus(CN1,Slot1),Slot2),Power(Slot1,CN1),Sqrt(Subtract(C1,Sqr(Slot2))))))),
    // Derivative(0,1)[GegenbauerC]:=2*ChebyshevU(-1+#1,#2)&
    ISetDelayed($(Derivative(C0,C1),GegenbauerC),
      Function(Times(C2,ChebyshevU(Plus(CN1,Slot1),Slot2)))),
    // Derivative(0,0,1)[GegenbauerC]:=2*GegenbauerC(-1+#1,1+#2,#3)*#2&
    ISetDelayed($(Derivative(C0,C0,C1),GegenbauerC),
      Function(Times(C2,GegenbauerC(Plus(CN1,Slot1),Plus(C1,Slot2),Slot(C3)),Slot2))),
    // Derivative(0,1)[LaguerreL]:=-LaguerreL(-1+#1,1,#2)&
    ISetDelayed($(Derivative(C0,C1),LaguerreL),
      Function(Negate(LaguerreL(Plus(CN1,Slot1),C1,Slot2)))),
    // Derivative(0,0,1)[LaguerreL]:=-LaguerreL(-1+#1,1+#2,#3)&
    ISetDelayed($(Derivative(C0,C0,C1),LaguerreL),
      Function(Negate(LaguerreL(Plus(CN1,Slot1),Plus(C1,Slot2),Slot(C3))))),
    // Derivative(0,1)[LegendreP]:=((-1-#1)*x*LegendreP(#1,#2)+(1+#1)*LegendreP(1+#1,#2))/(-1+#2^2)&
    ISetDelayed($(Derivative(C0,C1),LegendreP),
      Function(Times(Plus(Times(Subtract(CN1,Slot1),x,LegendreP(Slot1,Slot2)),Times(Plus(C1,Slot1),LegendreP(Plus(C1,Slot1),Slot2))),Power(Plus(CN1,Sqr(Slot2)),CN1)))),
    // Derivative(0,0,1)[LegendreP]:=(LegendreP(1+#1,#2,#3)*(1+#1-#2)+LegendreP(#1,#2,#3)*(-1-#1)*#3)/(-1+#3^2)&
    ISetDelayed($(Derivative(C0,C0,C1),LegendreP),
      Function(Times(Plus(Times(LegendreP(Plus(C1,Slot1),Slot2,Slot(C3)),Plus(C1,Slot1,Negate(Slot2))),Times(LegendreP(Slot1,Slot2,Slot(C3)),Subtract(CN1,Slot1),Slot(C3))),Power(Plus(CN1,Sqr(Slot(C3))),CN1)))),
    // Derivative(0,1)[LegendreQ]:=(LegendreQ(1+#1,#2)*(1+#1)+LegendreQ(#1,#2)*(-1-#1)*#2)/(-1+#2^2)&
    ISetDelayed($(Derivative(C0,C1),LegendreQ),
      Function(Times(Plus(Times(LegendreQ(Plus(C1,Slot1),Slot2),Plus(C1,Slot1)),Times(LegendreQ(Slot1,Slot2),Subtract(CN1,Slot1),Slot2)),Power(Plus(CN1,Sqr(Slot2)),CN1)))),
    // Derivative(0,0,1)[LegendreQ]:=(LegendreQ(1+#1,#2,#3)*(1+#1-#2)+LegendreQ(#1,#2,#3)*(-1-#1)*#3)/(-1+#3^2)&
    ISetDelayed($(Derivative(C0,C0,C1),LegendreQ),
      Function(Times(Plus(Times(LegendreQ(Plus(C1,Slot1),Slot2,Slot(C3)),Plus(C1,Slot1,Negate(Slot2))),Times(LegendreQ(Slot1,Slot2,Slot(C3)),Subtract(CN1,Slot1),Slot(C3))),Power(Plus(CN1,Sqr(Slot(C3))),CN1)))),
    // Derivative(0,0,1,0)[SphericalHarmonicY]:=Cot(#3)*#2*SphericalHarmonicY(#1,#2,#3,#4)+(Sqrt(Gamma(1+#1-#2))*Sqrt(Gamma(2+#1+#2))*SphericalHarmonicY(#1,1+#2,#3,#4))/(E^(I*#4)*Sqrt(Gamma(#1-#2))*Sqrt(Gamma(1+#1+#2)))&
    ISetDelayed($(Derivative(C0,C0,C1,C0),SphericalHarmonicY),
      Function(Plus(Times(Cot(Slot(C3)),Slot2,SphericalHarmonicY(Slot1,Slot2,Slot(C3),Slot(C4))),Times(Sqrt(Gamma(Plus(C1,Slot1,Negate(Slot2)))),Power(Times(Exp(Times(CI,Slot(C4))),Sqrt(Gamma(Subtract(Slot1,Slot2))),Sqrt(Gamma(Plus(C1,Slot1,Slot2)))),CN1),Sqrt(Gamma(Plus(C2,Slot1,Slot2))),SphericalHarmonicY(Slot1,Plus(C1,Slot2),Slot(C3),Slot(C4)))))),
    // Derivative(0,0,0,1)[SphericalHarmonicY]:=I*#2*SphericalHarmonicY(#1,#2,#3,#4)&
    ISetDelayed($(Derivative(C0,C0,C0,C1),SphericalHarmonicY),
      Function(Times(CI,Slot2,SphericalHarmonicY(Slot1,Slot2,Slot(C3),Slot(C4))))),
    // Derivative(0,1)[StruveH]:=1/2*(-StruveH(#1+1,#2)+StruveH(-1+#1,#2)+(#2/2)^#1/(Sqrt(Pi)*Gamma(#1+3/2)))&
    ISetDelayed($(Derivative(C0,C1),StruveH),
      Function(Times(C1D2,Plus(Negate(StruveH(Plus(Slot1,C1),Slot2)),StruveH(Plus(CN1,Slot1),Slot2),Times(Power(Times(Sqrt(Pi),Gamma(Plus(Slot1,QQ(3L,2L)))),CN1),Power(Times(C1D2,Slot2),Slot1)))))),
    // Derivative(0,1)[StruveL]:=1/2*(StruveL(-1+#1,#2)+StruveL(#1+1,#2)+(#2/2)^#1/(Sqrt(Pi)*Gamma(#1+3/2)))&
    ISetDelayed($(Derivative(C0,C1),StruveL),
      Function(Times(C1D2,Plus(StruveL(Plus(CN1,Slot1),Slot2),StruveL(Plus(Slot1,C1),Slot2),Times(Power(Times(Sqrt(Pi),Gamma(Plus(Slot1,QQ(3L,2L)))),CN1),Power(Times(C1D2,Slot2),Slot1))))))
  );
}
