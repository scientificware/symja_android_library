package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class IntRules54 { 
  public static IAST RULES = List( 
IIntegrate(1081,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr(x_))),Power(Plus(d_DEFAULT,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(CSymbol,Power(c,CN1)),Integrate(Power(Plus(d,Times(f,Sqr(x))),CN1D2),x),x),Dist(Power(c,CN1),Integrate(Times(Subtract(Subtract(Times(ASymbol,c),Times(a,CSymbol)),Times(b,CSymbol,x)),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(f,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,f,ASymbol,CSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0)))),
IIntegrate(1082,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,u_),Times(c_DEFAULT,Sqr(u_))),p_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,u_),Times(C_DEFAULT,Sqr(u_))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_),Times(f_DEFAULT,Sqr(u_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Integrate(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Plus(ASymbol,Times(BSymbol,x),Times(CSymbol,Sqr(x)))),x),x,u),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,p,q),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(1083,Integrate(Times(Plus(A_DEFAULT,Times(B_DEFAULT,u_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,u_),Times(c_DEFAULT,Sqr(u_))),p_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_),Times(f_DEFAULT,Sqr(u_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Integrate(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Plus(ASymbol,Times(BSymbol,x))),x),x,u),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,p,q),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(1084,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,u_),Times(c_DEFAULT,Sqr(u_))),p_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr(u_))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_),Times(f_DEFAULT,Sqr(u_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Integrate(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Plus(ASymbol,Times(CSymbol,Sqr(x)))),x),x,u),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol,p,q),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(1085,Integrate(Times(Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(u_))),p_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,u_),Times(C_DEFAULT,Sqr(u_))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_),Times(f_DEFAULT,Sqr(u_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Integrate(Times(Power(Plus(a,Times(c,Sqr(x))),p),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Plus(ASymbol,Times(BSymbol,x),Times(CSymbol,Sqr(x)))),x),x,u),x),And(FreeQ(List(a,c,d,e,f,ASymbol,BSymbol,CSymbol,p,q),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(1086,Integrate(Times(Plus(A_DEFAULT,Times(B_DEFAULT,u_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(u_))),p_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_),Times(f_DEFAULT,Sqr(u_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Integrate(Times(Power(Plus(a,Times(c,Sqr(x))),p),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Plus(ASymbol,Times(BSymbol,x))),x),x,u),x),And(FreeQ(List(a,c,d,e,f,ASymbol,BSymbol,CSymbol,p,q),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(1087,Integrate(Times(Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(u_))),p_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr(u_))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_),Times(f_DEFAULT,Sqr(u_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Integrate(Times(Power(Plus(a,Times(c,Sqr(x))),p),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),q),Plus(ASymbol,Times(CSymbol,Sqr(x)))),x),x,u),x),And(FreeQ(List(a,c,d,e,f,ASymbol,CSymbol,p,q),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(1088,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),p_),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),p),Power(Power(Plus(b,Times(C2,c,Sqr(x))),Times(C2,p)),CN1)),Integrate(Power(Plus(b,Times(C2,c,Sqr(x))),Times(C2,p)),x),x),And(FreeQ(List(a,b,c,p),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Subtract(p,C1D2))))),
IIntegrate(1089,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),p_),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(p)),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),FracPart(p)),Power(Power(Plus(C1,Times(C2,c,Sqr(x),Power(b,CN1))),Times(C2,FracPart(p))),CN1)),Integrate(Power(Plus(C1,Times(C2,c,Sqr(x),Power(b,CN1))),Times(C2,p)),x),x),And(FreeQ(List(a,b,c,p),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(Times(C2,p)))))),
IIntegrate(1090,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),p_),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),p),x),x),And(FreeQ(List(a,b,c),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(p,C0)))),
IIntegrate(1091,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),p_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),p),Power(Plus(Times(C4,p),C1),CN1)),x),Dist(Times(C2,p,Power(Plus(Times(C4,p),C1),CN1)),Integrate(Times(Plus(Times(C2,a),Times(b,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),Subtract(p,C1))),x),x)),And(FreeQ(List(a,b,c),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),GtQ(p,C0),IntegerQ(Times(C2,p))))),
IIntegrate(1092,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Plus(Sqr(b),Times(CN1,C2,a,c),Times(b,c,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),Plus(p,C1)),Power(Times(C2,a,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1)),x)),Dist(Power(Times(C2,a,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1),Integrate(Times(Plus(Sqr(b),Times(CN1,C2,a,c),Times(C2,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),Times(b,c,Plus(Times(C4,p),C7),Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),LtQ(p,CN1),IntegerQ(Times(C2,p))))),
IIntegrate(1093,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),CN1),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Times(c,Power(q,CN1)),Integrate(Power(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,Sqr(x))),CN1),x),x),Dist(Times(c,Power(q,CN1)),Integrate(Power(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,Sqr(x))),CN1),x),x))),And(FreeQ(List(a,b,c),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),PosQ(Subtract(Sqr(b),Times(C4,a,c)))))),
IIntegrate(1094,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),CN1),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(a,Power(c,CN1)),C2))),With(List(Set(r,Rt(Subtract(Times(C2,q),Times(b,Power(c,CN1))),C2))),Plus(Dist(Power(Times(C2,c,q,r),CN1),Integrate(Times(Subtract(r,x),Power(Plus(q,Times(CN1,r,x),Sqr(x)),CN1)),x),x),Dist(Power(Times(C2,c,q,r),CN1),Integrate(Times(Plus(r,x),Power(Plus(q,Times(r,x),Sqr(x)),CN1)),x),x)))),And(FreeQ(List(a,b,c),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NegQ(Subtract(Sqr(b),Times(C4,a,c)))))),
IIntegrate(1095,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),CN1D2),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Dist(Times(C2,Sqrt(Negate(c))),Integrate(Power(Times(Sqrt(Plus(b,q,Times(C2,c,Sqr(x)))),Sqrt(Subtract(Plus(Negate(b),q),Times(C2,c,Sqr(x))))),CN1),x),x)),And(FreeQ(List(a,b,c),x),GtQ(Subtract(Sqr(b),Times(C4,a,c)),C0),LtQ(c,C0)))),
IIntegrate(1096,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),CN1D2),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,CN1)),C4))),Simp(Times(Plus(C1,Times(Sqr(q),Sqr(x))),Sqrt(Times(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),Power(Times(a,Sqr(Plus(C1,Times(Sqr(q),Sqr(x))))),CN1))),EllipticF(Times(C2,ArcTan(Times(q,x))),Subtract(C1D2,Times(b,Sqr(q),Power(Times(C4,c),CN1)))),Power(Times(C2,q,Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))))),CN1)),x)),And(FreeQ(List(a,b,c),x),GtQ(Subtract(Sqr(b),Times(C4,a,c)),C0),GtQ(Times(c,Power(a,CN1)),C0),LtQ(Times(b,Power(a,CN1)),C0)))),
IIntegrate(1097,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),CN1D2),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Condition(Simp(Times(Sqrt(Subtract(Times(CN2,a),Times(Subtract(b,q),Sqr(x)))),Sqrt(Times(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),Power(q,CN1))),EllipticF(ArcSin(Times(x,Power(Times(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),Power(Times(C2,q),CN1)),CN1D2))),Times(Plus(b,q),Power(Times(C2,q),CN1))),Power(Times(C2,Sqrt(Negate(a)),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))))),CN1)),x),IntegerQ(q))),And(FreeQ(List(a,b,c),x),GtQ(Subtract(Sqr(b),Times(C4,a,c)),C0),LtQ(a,C0),GtQ(c,C0)))),
IIntegrate(1098,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),CN1D2),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Simp(Times(Sqrt(Times(Plus(Times(C2,a),Times(Subtract(b,q),Sqr(x))),Power(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),CN1))),Sqrt(Times(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),Power(q,CN1))),EllipticF(ArcSin(Times(x,Power(Times(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),Power(Times(C2,q),CN1)),CN1D2))),Times(Plus(b,q),Power(Times(C2,q),CN1))),Power(Times(C2,Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4)))),Sqrt(Times(a,Power(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),CN1)))),CN1)),x)),And(FreeQ(List(a,b,c),x),GtQ(Subtract(Sqr(b),Times(C4,a,c)),C0),LtQ(a,C0),GtQ(c,C0)))),
IIntegrate(1099,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),CN1D2),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Condition(Simp(Times(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),Sqrt(Times(Plus(Times(C2,a),Times(Subtract(b,q),Sqr(x))),Power(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),CN1))),EllipticF(ArcTan(Times(Rt(Times(Plus(b,q),Power(Times(C2,a),CN1)),C2),x)),Times(C2,q,Power(Plus(b,q),CN1))),Power(Times(C2,a,Rt(Times(Plus(b,q),Power(Times(C2,a),CN1)),C2),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))))),CN1)),x),And(PosQ(Times(Plus(b,q),Power(a,CN1))),Not(And(PosQ(Times(Subtract(b,q),Power(a,CN1))),SimplerSqrtQ(Times(Subtract(b,q),Power(Times(C2,a),CN1)),Times(Plus(b,q),Power(Times(C2,a),CN1)))))))),And(FreeQ(List(a,b,c),x),GtQ(Subtract(Sqr(b),Times(C4,a,c)),C0)))),
IIntegrate(1100,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,C4))),CN1D2),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Condition(Simp(Times(Plus(Times(C2,a),Times(Subtract(b,q),Sqr(x))),Sqrt(Times(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),Power(Plus(Times(C2,a),Times(Subtract(b,q),Sqr(x))),CN1))),EllipticF(ArcTan(Times(Rt(Times(Subtract(b,q),Power(Times(C2,a),CN1)),C2),x)),Times(CN2,q,Power(Subtract(b,q),CN1))),Power(Times(C2,a,Rt(Times(Subtract(b,q),Power(Times(C2,a),CN1)),C2),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))))),CN1)),x),PosQ(Times(Subtract(b,q),Power(a,CN1))))),And(FreeQ(List(a,b,c),x),GtQ(Subtract(Sqr(b),Times(C4,a,c)),C0))))
  );
}
