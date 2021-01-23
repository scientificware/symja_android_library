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
class IntRules246 { 
  public static IAST RULES = List( 
IIntegrate(4921,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,e,Plus(p,C1)),CN1)),x),Dist(Power(Times(c,d),CN1),Integrate(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Subtract(CI,Times(c,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0)))),
IIntegrate(4922,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x),Dist(Power(Times(b,c,d,Plus(p,C1)),CN1),Integrate(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),Not(IGtQ(p,C0)),NeQ(p,CN1)))),
IIntegrate(4923,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x)),Dist(Power(Times(b,c,d,Plus(p,C1)),CN1),Integrate(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),Not(IGtQ(p,C0)),NeQ(p,CN1)))),
IIntegrate(4924,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,CN1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,d,Plus(p,C1)),CN1)),x)),Dist(Times(CI,Power(d,CN1)),Integrate(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(x,Plus(CI,Times(c,x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
IIntegrate(4925,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,CN1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,d,Plus(p,C1)),CN1)),x),Dist(Times(CI,Power(d,CN1)),Integrate(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(x,Plus(CI,Times(c,x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
IIntegrate(4926,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x),Dist(Times(f,m,Power(Times(b,c,d,Plus(p,C1)),CN1)),Integrate(Times(Power(Times(f,x),Subtract(m,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),LtQ(p,CN1)))),
IIntegrate(4927,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x)),Dist(Times(f,m,Power(Times(b,c,d,Plus(p,C1)),CN1)),Integrate(Times(Power(Times(f,x),Subtract(m,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),LtQ(p,CN1)))),
IIntegrate(4928,Integrate(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Plus(a,Times(b,ArcTan(Times(c,x)))),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(m),Not(And(EqQ(m,C1),NeQ(a,C0)))))),
IIntegrate(4929,Integrate(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Plus(a,Times(b,ArcCot(Times(c,x)))),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(m),Not(And(EqQ(m,C1),NeQ(a,C0)))))),
IIntegrate(4930,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(C2,e,Plus(q,C1)),CN1)),x),Dist(Times(b,p,Power(Times(C2,c,Plus(q,C1)),CN1)),Integrate(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Subtract(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0),NeQ(q,CN1)))),
IIntegrate(4931,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(C2,e,Plus(q,C1)),CN1)),x),Dist(Times(b,p,Power(Times(C2,c,Plus(q,C1)),CN1)),Integrate(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Subtract(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0),NeQ(q,CN1)))),
IIntegrate(4932,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN2)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1),Plus(d,Times(e,Sqr(x)))),CN1)),x),Negate(Dist(Times(C4,Power(Times(Sqr(b),Plus(p,C1),Plus(p,C2)),CN1)),Integrate(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C2)),Power(Plus(d,Times(e,Sqr(x))),CN2)),x),x)),Negate(Simp(Times(Subtract(C1,Times(Sqr(c),Sqr(x))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C2)),Power(Times(Sqr(b),e,Plus(p,C1),Plus(p,C2),Plus(d,Times(e,Sqr(x)))),CN1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(p,CN1),NeQ(p,CN2)))),
IIntegrate(4933,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1),Plus(d,Times(e,Sqr(x)))),CN1)),x)),Negate(Dist(Times(C4,Power(Times(Sqr(b),Plus(p,C1),Plus(p,C2)),CN1)),Integrate(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C2)),Power(Plus(d,Times(e,Sqr(x))),CN2)),x),x)),Negate(Simp(Times(Subtract(C1,Times(Sqr(c),Sqr(x))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C2)),Power(Times(Sqr(b),e,Plus(p,C1),Plus(p,C2),Plus(d,Times(e,Sqr(x)))),CN1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(p,CN1),NeQ(p,CN2)))),
IIntegrate(4934,Integrate(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C4,Power(c,C3),d,Sqr(Plus(q,C1))),CN1)),x)),Negate(Dist(Power(Times(C2,Sqr(c),d,Plus(q,C1)),CN1),Integrate(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x))))),x),x)),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(C2,Sqr(c),d,Plus(q,C1)),CN1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(q,CN1),NeQ(q,QQ(-5L,2L))))),
IIntegrate(4935,Integrate(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C4,Power(c,C3),d,Sqr(Plus(q,C1))),CN1)),x),Negate(Dist(Power(Times(C2,Sqr(c),d,Plus(q,C1)),CN1),Integrate(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x))))),x),x)),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(C2,Sqr(c),d,Plus(q,C1)),CN1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(q,CN1),NeQ(q,QQ(-5L,2L))))),
IIntegrate(4936,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,Power(c,C3),Sqr(d),Plus(p,C1)),CN1)),x),Dist(Times(b,p,Power(Times(C2,c),CN1)),Integrate(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Subtract(p,C1)),Power(Plus(d,Times(e,Sqr(x))),CN2)),x),x),Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(C2,Sqr(c),d,Plus(d,Times(e,Sqr(x)))),CN1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
IIntegrate(4937,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,Power(c,C3),Sqr(d),Plus(p,C1)),CN1)),x)),Negate(Dist(Times(b,p,Power(Times(C2,c),CN1)),Integrate(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Subtract(p,C1)),Power(Plus(d,Times(e,Sqr(x))),CN2)),x),x)),Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(C2,Sqr(c),d,Plus(d,Times(e,Sqr(x)))),CN1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
IIntegrate(4938,Integrate(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(c,d,Sqr(m)),CN1)),x),Dist(Times(Sqr(f),Subtract(m,C1),Power(Times(Sqr(c),d,m),CN1)),Integrate(Times(Power(Times(f,x),Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x))))),x),x),Negate(Simp(Times(f,Power(Times(f,x),Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(Sqr(c),d,m),CN1)),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1)))),
IIntegrate(4939,Integrate(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(c,d,Sqr(m)),CN1)),x)),Dist(Times(Sqr(f),Subtract(m,C1),Power(Times(Sqr(c),d,m),CN1)),Integrate(Times(Power(Times(f,x),Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x))))),x),x),Negate(Simp(Times(f,Power(Times(f,x),Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(Sqr(c),d,m),CN1)),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1)))),
IIntegrate(4940,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(b,p,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Subtract(p,C1)),Power(Times(c,d,Sqr(m)),CN1)),x),Dist(Times(Sqr(f),Subtract(m,C1),Power(Times(Sqr(c),d,m),CN1)),Integrate(Times(Power(Times(f,x),Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(b),p,Subtract(p,C1),Power(m,CN2)),Integrate(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Subtract(p,C2))),x),x)),Negate(Simp(Times(f,Power(Times(f,x),Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(Sqr(c),d,m),CN1)),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1),GtQ(p,C1))))
  );
}
