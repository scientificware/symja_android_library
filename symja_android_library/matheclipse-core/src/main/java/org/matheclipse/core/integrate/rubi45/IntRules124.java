package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules124 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(ArcTanh(Plus(Times(b_DEFAULT,x_),a_)),Power(Plus(Times(Power(x_,pn_DEFAULT),pd_DEFAULT),c_),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(Plus(C1,a,Times(b,x))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x)),Times(CN1,C1D2,Int(Times(Log(Plus(C1,Times(CN1,a),Times(CN1,b,x))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x))),And(FreeQ(List(a,b,c,pd),x),RationalQ(pn)))),
ISetDelayed(Int(Times(ArcCoth(Plus(Times(b_DEFAULT,x_),a_)),Power(Plus(Times(Power(x_,pn_DEFAULT),pd_DEFAULT),c_),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(Times(Plus(C1,a,Times(b,x)),Power(Plus(a,Times(b,x)),CN1))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x)),Times(CN1,C1D2,Int(Times(Log(Times(Plus(CN1,a,Times(b,x)),Power(Plus(a,Times(b,x)),CN1))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x))),And(FreeQ(List(a,b,c,pd),x),RationalQ(pn)))),
ISetDelayed(Int(Times(ArcTanh(Plus(Times(b_DEFAULT,x_),a_)),Power(Plus(Times(Power(x_,pn_),pd_DEFAULT),c_),CN1)),x_Symbol),
    Condition($(Defer($s("Int")),Times(ArcTanh(Plus(a,Times(b,x))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x),And(FreeQ(List(a,b,c,pd,pn),x),Not(RationalQ(pn))))),
ISetDelayed(Int(Times(ArcCoth(Plus(Times(b_DEFAULT,x_),a_)),Power(Plus(Times(Power(x_,pn_),pd_DEFAULT),c_),CN1)),x_Symbol),
    Condition($(Defer($s("Int")),Times(ArcCoth(Plus(a,Times(b,x))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x),And(FreeQ(List(a,b,c,pd,pn),x),Not(RationalQ(pn))))),
ISetDelayed(Int(ArcTanh(Plus(Times(Power(x_,pn_),b_DEFAULT),a_)),x_Symbol),
    Condition(Plus(Times(x,ArcTanh(Plus(a,Times(b,Power(x,pn))))),Times(CN1,b,pn,Int(Times(Power(x,pn),Power(Plus(C1,Times(CN1,Sqr(a)),Times(CN1,C2,a,b,Power(x,pn)),Times(CN1,Sqr(b),Power(x,Times(C2,pn)))),CN1)),x))),FreeQ(List(a,b,pn),x))),
ISetDelayed(Int(ArcCoth(Plus(Times(Power(x_,pn_),b_DEFAULT),a_)),x_Symbol),
    Condition(Plus(Times(x,ArcCoth(Plus(a,Times(b,Power(x,pn))))),Times(CN1,b,pn,Int(Times(Power(x,pn),Power(Plus(C1,Times(CN1,Sqr(a)),Times(CN1,C2,a,b,Power(x,pn)),Times(CN1,Sqr(b),Power(x,Times(C2,pn)))),CN1)),x))),FreeQ(List(a,b,pn),x))),
ISetDelayed(Int(Times(ArcTanh(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),a_DEFAULT)),Power(x_,CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(Plus(C1,a,Times(b,Power(x,pn)))),Power(x,CN1)),x)),Times(CN1,C1D2,Int(Times(Log(Plus(C1,Times(CN1,a),Times(CN1,b,Power(x,pn)))),Power(x,CN1)),x))),FreeQ(List(a,b,pn),x))),
ISetDelayed(Int(Times(ArcCoth(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),a_DEFAULT)),Power(x_,CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(Plus(C1,Power(Plus(a,Times(b,Power(x,pn))),CN1))),Power(x,CN1)),x)),Times(CN1,C1D2,Int(Times(Log(Plus(C1,Times(CN1,Power(Plus(a,Times(b,Power(x,pn))),CN1)))),Power(x,CN1)),x))),FreeQ(List(a,b,pn),x))),
ISetDelayed(Int(Times(ArcTanh(Plus(Times(Power(x_,pn_),b_DEFAULT),a_)),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTanh(Plus(a,Times(b,Power(x,pn)))),Power(Plus(m,C1),CN1)),Times(CN1,b,pn,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,pn)),Power(Plus(C1,Times(CN1,Sqr(a)),Times(CN1,C2,a,b,Power(x,pn)),Times(CN1,Sqr(b),Power(x,Times(C2,pn)))),CN1)),x))),And(And(And(FreeQ(List(a,b),x),RationalQ(m,pn)),Unequal(Plus(m,C1),C0)),Unequal(Plus(m,C1),pn)))),
ISetDelayed(Int(Times(ArcCoth(Plus(Times(Power(x_,pn_),b_DEFAULT),a_)),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCoth(Plus(a,Times(b,Power(x,pn)))),Power(Plus(m,C1),CN1)),Times(CN1,b,pn,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,pn)),Power(Plus(C1,Times(CN1,Sqr(a)),Times(CN1,C2,a,b,Power(x,pn)),Times(CN1,Sqr(b),Power(x,Times(C2,pn)))),CN1)),x))),And(And(And(FreeQ(List(a,b),x),RationalQ(m,pn)),Unequal(Plus(m,C1),C0)),Unequal(Plus(m,C1),pn)))),
ISetDelayed(Int(ArcTanh(Plus(Times(Power(f_,Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_DEFAULT)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Log(Plus(C1,a,Times(b,Power(f,Plus(c,Times(pd,x)))))),x)),Times(CN1,C1D2,Int(Log(Plus(C1,Times(CN1,a),Times(CN1,b,Power(f,Plus(c,Times(pd,x)))))),x))),FreeQ(List(a,b,c,pd,f),x))),
ISetDelayed(Int(ArcCoth(Plus(Times(Power(f_,Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_DEFAULT)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Log(Plus(C1,Power(Plus(a,Times(b,Power(f,Plus(c,Times(pd,x))))),CN1))),x)),Times(CN1,C1D2,Int(Log(Plus(C1,Times(CN1,Power(Plus(a,Times(b,Power(f,Plus(c,Times(pd,x))))),CN1)))),x))),FreeQ(List(a,b,c,pd,f),x))),
ISetDelayed(Int(Times(ArcTanh(Plus(Times(Power(f_,Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_DEFAULT)),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Power(x,m),Log(Plus(C1,a,Times(b,Power(f,Plus(c,Times(pd,x))))))),x)),Times(CN1,C1D2,Int(Times(Power(x,m),Log(Plus(C1,Times(CN1,a),Times(CN1,b,Power(f,Plus(c,Times(pd,x))))))),x))),And(And(FreeQ(List(a,b,c,pd,f),x),IntegerQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(ArcCoth(Plus(Times(Power(f_,Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_DEFAULT)),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Power(x,m),Log(Plus(C1,Power(Plus(a,Times(b,Power(f,Plus(c,Times(pd,x))))),CN1)))),x)),Times(CN1,C1D2,Int(Times(Power(x,m),Log(Plus(C1,Times(CN1,Power(Plus(a,Times(b,Power(f,Plus(c,Times(pd,x))))),CN1))))),x))),And(And(FreeQ(List(a,b,c,pd,f),x),IntegerQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(Power(ArcTanh(Times(Power(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),a_DEFAULT),CN1),c_DEFAULT)),m_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Power(ArcCoth(Plus(Times(a,Power(c,CN1)),Times(b,Power(x,pn),Power(c,CN1)))),m)),x),FreeQ(List(a,b,c,pn,m),x))),
ISetDelayed(Int(Times(Power(ArcCoth(Times(Power(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),a_DEFAULT),CN1),c_DEFAULT)),m_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Power(ArcTanh(Plus(Times(a,Power(c,CN1)),Times(b,Power(x,pn),Power(c,CN1)))),m)),x),FreeQ(List(a,b,c,pn,m),x))),
ISetDelayed(Int(Power(Times(ArcTanh(Times(Power(Plus(Times(Sqr(x_),b_DEFAULT),a_DEFAULT),CN1D2),c_DEFAULT,x_)),Sqrt(Plus(Times(Sqr(x_),b_DEFAULT),a_DEFAULT))),CN1),x_Symbol),
    Condition(Times(Power(c,CN1),Log(ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))))),And(FreeQ(List(a,b,c),x),ZeroQ(Plus(b,Times(CN1,Sqr(c))))))),
ISetDelayed(Int(Power(Times(ArcCoth(Times(Power(Plus(Times(Sqr(x_),b_DEFAULT),a_DEFAULT),CN1D2),c_DEFAULT,x_)),Sqrt(Plus(Times(Sqr(x_),b_DEFAULT),a_DEFAULT))),CN1),x_Symbol),
    Condition(Times(CN1,Power(c,CN1),Log(ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))))),And(FreeQ(List(a,b,c),x),ZeroQ(Plus(b,Times(CN1,Sqr(c))))))),
ISetDelayed(Int(Times(Power(ArcTanh(Times(Power(Plus(Times(Sqr(x_),b_DEFAULT),a_DEFAULT),CN1D2),c_DEFAULT,x_)),m_DEFAULT),Power(Plus(Times(Sqr(x_),b_DEFAULT),a_DEFAULT),CN1D2)),x_Symbol),
    Condition(Times(Power(ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Plus(m,C1)),Power(Times(c,Plus(m,C1)),CN1)),And(And(FreeQ(List(a,b,c,m),x),ZeroQ(Plus(b,Times(CN1,Sqr(c))))),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(ArcCoth(Times(Power(Plus(Times(Sqr(x_),b_DEFAULT),a_DEFAULT),CN1D2),c_DEFAULT,x_)),m_DEFAULT),Power(Plus(Times(Sqr(x_),b_DEFAULT),a_DEFAULT),CN1D2)),x_Symbol),
    Condition(Times(CN1,Power(ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Plus(m,C1)),Power(Times(c,Plus(m,C1)),CN1)),And(And(FreeQ(List(a,b,c,m),x),ZeroQ(Plus(b,Times(CN1,Sqr(c))))),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(ArcTanh(Times(Power(Plus(Times(Sqr(x_),b_DEFAULT),a_DEFAULT),CN1D2),c_DEFAULT,x_)),m_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2),Int(Times(Power(ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),m),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x)),And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(b,Times(CN1,Sqr(c))))),ZeroQ(Plus(Times(b,pd),Times(CN1,a,pe)))))),
ISetDelayed(Int(Times(Power(ArcCoth(Times(Power(Plus(Times(Sqr(x_),b_DEFAULT),a_DEFAULT),CN1D2),c_DEFAULT,x_)),m_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2),Int(Times(Power(ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),m),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x)),And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(b,Times(CN1,Sqr(c))))),ZeroQ(Plus(Times(b,pd),Times(CN1,a,pe)))))),
ISetDelayed(Int(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(C1,Times(a,x)),Times(C1D2,Plus(pn,C1))),Power(Times(Power(Plus(C1,Times(CN1,a,x)),Times(C1D2,Plus(pn,Times(CN1,C1)))),Sqrt(Plus(C1,Times(CN1,Sqr(a),Sqr(x))))),CN1)),x),And(FreeQ(a,x),OddQ(pn)))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(C1,Times(a,x)),Times(C1D2,Plus(pn,C1))),Power(Times(Power(Plus(C1,Times(CN1,a,x)),Times(C1D2,Plus(pn,Times(CN1,C1)))),Sqrt(Plus(C1,Times(CN1,Sqr(a),Sqr(x))))),CN1)),x),And(FreeQ(List(a,m),x),OddQ(pn)))),
ISetDelayed(Int(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),x_Symbol),
    Condition(Int(Times(Power(Plus(C1,Times(a,x)),Times(C1D2,pn)),Power(Power(Plus(C1,Times(CN1,a,x)),Times(C1D2,pn)),CN1)),x),And(FreeQ(List(a,pn),x),Not(OddQ(pn))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(C1,Times(a,x)),Times(C1D2,pn)),Power(Power(Plus(C1,Times(CN1,a,x)),Times(C1D2,pn)),CN1)),x),And(FreeQ(List(a,m,pn),x),Not(OddQ(pn))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(x_,pd_DEFAULT),c_),p_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(u,Power(Plus(C1,Times(pd,x,Power(c,CN1))),p),Power(Plus(C1,Times(a,x)),Times(C1D2,pn)),Power(Power(Plus(C1,Times(CN1,a,x)),Times(C1D2,pn)),CN1)),x)),And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),Sqr(c)),Times(CN1,Sqr(pd))))),Or(IntegerQ(p),PositiveQ(c))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(x_,pd_DEFAULT),c_),p_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Power(Plus(c,Times(pd,x)),p),Power(Plus(C1,Times(a,x)),Times(C1D2,pn)),Power(Power(Plus(C1,Times(CN1,a,x)),Times(C1D2,pn)),CN1)),x),And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),Sqr(c)),Times(CN1,Sqr(pd))))),Not(Or(IntegerQ(p),PositiveQ(c)))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Power(x_,CN1),pd_DEFAULT),c_),p_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Times(Power(pd,p),Int(Times(u,Power(Plus(C1,Times(c,x,Power(pd,CN1))),p),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Power(x,p),CN1)),x)),And(And(FreeQ(List(a,c,pd,pn),x),ZeroQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(pd))))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),Power(Plus(Times(Power(x_,CN1),pd_DEFAULT),c_),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(CN1,Times(C1D2,pn)),Power(c,p),Int(Times(u,Power(Plus(C1,Times(pd,Power(Times(c,x),CN1))),p),Power(Plus(C1,Power(Times(a,x),CN1)),Times(C1D2,pn)),Power(Power(Plus(C1,Times(CN1,Power(Times(a,x),CN1))),Times(C1D2,pn)),CN1)),x)),And(And(And(And(FreeQ(List(a,c,pd,p),x),ZeroQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(pd))))),Not(IntegerQ(p))),IntegerQ(Times(C1D2,pn))),PositiveQ(c)))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),Power(Plus(Times(Power(x_,CN1),pd_DEFAULT),c_),p_),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Power(Plus(c,Times(pd,Power(x,CN1))),p),Power(Plus(C1,Times(a,x)),Times(C1D2,pn)),Power(Power(Plus(C1,Times(CN1,a,x)),Times(C1D2,pn)),CN1)),x),And(And(And(And(FreeQ(List(a,c,pd,p),x),ZeroQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(pd))))),Not(IntegerQ(p))),IntegerQ(Times(C1D2,pn))),Not(PositiveQ(c))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Power(x_,CN1),pd_DEFAULT),c_),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(x,p),Power(Plus(c,Times(pd,Power(x,CN1))),p),Power(Power(Plus(C1,Times(c,x,Power(pd,CN1))),p),CN1),Int(Times(u,Power(Plus(C1,Times(c,x,Power(pd,CN1))),p),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Power(x,p),CN1)),x)),And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(pd))))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),CN1)),x_Symbol),
    Condition(Times(Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Times(a,c,pn),CN1)),And(And(FreeQ(List(a,c,pd,pn),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Not(IntegerQ(Times(C1D2,pn)))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(C1,Times(Sqr(x_),pd_DEFAULT)),CN1D2)),x_Symbol),
    Condition(Int(Power(Plus(C1,Times(CN1,a,pn,x)),CN1),x),And(And(FreeQ(List(a,pd,pn),x),ZeroQ(Plus(pd,Sqr(a)))),ZeroQ(Plus(Sqr(pn),Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_DEFAULT),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(C1,Times(CN1,Sqr(a),Sqr(x)))),Power(Plus(c,Times(pd,Sqr(x))),CN1D2),Int(Times(Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),CN1D2)),x)),And(And(And(FreeQ(List(a,c,pd,pn),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),ZeroQ(Plus(Sqr(pn),Times(CN1,C1)))),NonzeroQ(Plus(c,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_DEFAULT)),x_Symbol),
    Condition(Times(Plus(pn,Times(C2,a,p,x)),Power(Plus(c,Times(pd,Sqr(x))),p),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Times(C2,a,p,Plus(Times(C2,p),C1)),CN1)),And(And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),ZeroQ(Plus(Sqr(pn),Times(CN1,C4,Sqr(p))))),NonzeroQ(Plus(p,C1D2))),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),QQ(-3L,2L))),x_Symbol),
    Condition(Times(Power(c,QQ(-3L,2L)),Int(Power(Times(Plus(C1,Times(a,pn,x)),Sqr(Plus(C1,Times(CN1,a,pn,x)))),CN1),x)),And(And(And(FreeQ(List(a,c,pd),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),ZeroQ(Plus(Sqr(pn),Times(CN1,C1)))),PositiveQ(c)))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),QQ(-3L,2L))),x_Symbol),
    Condition(Times(Sqrt(Plus(C1,Times(CN1,Sqr(a),Sqr(x)))),Power(Times(c,Sqrt(Plus(c,Times(pd,Sqr(x))))),CN1),Int(Times(Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),QQ(-3L,2L))),x)),And(And(And(FreeQ(List(a,c,pd),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),ZeroQ(Plus(Sqr(pn),Times(CN1,C1)))),Not(PositiveQ(c))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),QQ(-3L,2L))),x_Symbol),
    Condition(Times(Plus(pn,Times(CN1,a,x)),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Times(a,c,Plus(Sqr(pn),Times(CN1,C1)),Sqrt(Plus(c,Times(pd,Sqr(x))))),CN1)),And(And(And(FreeQ(List(a,c,pd,pn),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),NonzeroQ(Plus(Sqr(pn),Times(CN1,C9)))),NonzeroQ(Plus(Sqr(pn),Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_)),x_Symbol),
    Condition(Plus(Times(Plus(pn,Times(C2,a,Plus(p,C1),x)),Power(Plus(c,Times(pd,Sqr(x))),Plus(p,C1)),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Times(a,c,Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1))))),CN1)),Times(CN1,C2,Plus(p,C1),Plus(Times(C2,p),C3),Power(Times(c,Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1))))),CN1),Int(Times(Power(Plus(c,Times(pd,Sqr(x))),Plus(p,C1)),Power(E,Times(pn,ArcTanh(Times(a,x))))),x))),And(And(And(And(And(And(And(FreeQ(List(a,c,pd,pn),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),NonzeroQ(Plus(Sqr(pn),Times(CN1,C4,Sqr(p))))),RationalQ(p)),Less(p,CN1)),Unequal(p,QQ(-3L,2L))),NonzeroQ(Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1)))))),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),Plus(p,Times(CN1,C1D2,pn))),Power(Plus(C1,Times(a,x)),pn)),x)),And(And(And(FreeQ(List(a,c,pd,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Or(IntegerQ(p),PositiveQ(c))),OddQ(pn)))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(Power(Plus(C1,Times(CN1,a,x)),Plus(p,Times(CN1,C1D2,pn))),Power(Plus(C1,Times(a,x)),Plus(p,Times(C1D2,pn)))),x)),And(And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Or(IntegerQ(p),PositiveQ(c))),Not(OddQ(pn))),Or(Or(RationalQ(pn,p),PositiveIntegerQ(Plus(p,Times(CN1,C1D2,pn)))),PositiveIntegerQ(Plus(p,Times(C1D2,pn))))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_)),x_Symbol),
    Condition(Times(Power(c,Times(C1D2,pn)),Int(Times(Power(Plus(c,Times(pd,Sqr(x))),Plus(p,Times(CN1,C1D2,pn))),Power(Plus(C1,Times(a,x)),pn)),x)),And(And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Not(Or(IntegerQ(p),PositiveQ(c)))),EvenQ(pn)),RationalQ(p)))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_)),x_Symbol),
    Condition(Times(Power(c,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(c,Times(pd,Sqr(x)))),Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),CN1D2),Int(Times(Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),Power(E,Times(pn,ArcTanh(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Not(PositiveQ(c))),PositiveIntegerQ(Plus(p,C1D2))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_)),x_Symbol),
    Condition(Times(Power(c,Plus(p,C1D2)),Sqrt(Plus(C1,Times(CN1,Sqr(a),Sqr(x)))),Power(Plus(c,Times(pd,Sqr(x))),CN1D2),Int(Times(Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),Power(E,Times(pn,ArcTanh(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Not(PositiveQ(c))),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_)),x_Symbol),
    Condition(Times(Power(Plus(c,Times(pd,Sqr(x))),p),Power(Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),CN1),Int(Times(Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),Power(E,Times(pn,ArcTanh(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Not(Or(IntegerQ(p),PositiveQ(c)))),Not(IntegerQ(Plus(p,C1D2)))),Or(Or(RationalQ(pn,p),PositiveIntegerQ(Plus(p,Times(CN1,C1D2,pn)))),PositiveIntegerQ(Plus(p,Times(C1D2,pn))))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(c,Times(pd,Sqr(x))),Plus(p,C1)),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Times(C2,a,c,pn),CN1),Power(Plus(C1,Power(E,Times(pn,Power(Plus(p,C1),CN1),ArcTanh(Times(a,x))))),Times(C2,Plus(p,C1))),Hypergeometric2F1(Times(C2,Plus(p,C1)),Times(C2,Plus(p,C1)),Plus(Times(C2,p),C3),Times(CN1,Power(E,Times(pn,Power(Plus(p,C1),CN1),ArcTanh(Times(a,x))))))),And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),ZeroQ(Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1)))))),Not(IntegerQ(Times(C2,p)))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(C4,Plus(p,C1)),Power(Plus(c,Times(pd,Sqr(x))),Plus(p,C1)),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Times(a,c,Plus(pn,Times(CN1,C2,Plus(p,C1)))),CN1),Power(Power(Plus(C1,Times(a,x)),CN1),Times(C2,Plus(p,C1))),Hypergeometric2F1(Plus(p,Times(CN1,C1D2,pn),C1),Times(C2,Plus(p,C1)),Plus(p,Times(CN1,C1D2,pn),C2),Times(CN1,Power(E,Times(CN2,ArcTanh(Times(a,x))))))),And(And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),NonzeroQ(Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1)))))),Not(NegativeIntegerQ(Plus(Times(C2,p),C1)))),Not(IntegerQ(Plus(p,Times(CN1,C1D2,pn))))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),QQ(-3L,2L)),x_),x_Symbol),
    Condition(Times(CN1,Plus(C1,Times(CN1,a,pn,x)),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Times(Sqr(a),c,Plus(Sqr(pn),Times(CN1,C1)),Sqrt(Plus(c,Times(pd,Sqr(x))))),CN1)),And(And(FreeQ(List(a,c,pd,pn),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_),x_),x_Symbol),
    Condition(Plus(Times(Plus(Times(C2,Plus(p,C1)),Times(a,pn,x)),Power(Plus(c,Times(pd,Sqr(x))),Plus(p,C1)),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Times(Sqr(a),c,Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1))))),CN1)),Times(CN1,pn,Plus(Times(C2,p),C3),Power(Times(a,c,Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1))))),CN1),Int(Times(Power(Plus(c,Times(pd,Sqr(x))),Plus(p,C1)),Power(E,Times(pn,ArcTanh(Times(a,x))))),x))),And(And(And(And(And(And(FreeQ(List(a,c,pd,pn),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),RationalQ(p)),LessEqual(p,CN1)),Unequal(p,QQ(-3L,2L))),NonzeroQ(Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1)))))),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_DEFAULT),Sqr(x_)),x_Symbol),
    Condition(Times(CN1,Plus(pn,Times(C2,Plus(p,C1),a,x)),Power(Plus(c,Times(pd,Sqr(x))),Plus(p,C1)),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Times(Power(a,C3),c,Sqr(pn),Plus(Sqr(pn),Times(CN1,C1))),CN1)),And(And(And(FreeQ(List(a,c,pd,pn),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),ZeroQ(Plus(Sqr(pn),Times(C2,Plus(p,C1))))),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_),Sqr(x_)),x_Symbol),
    Condition(Plus(Times(Plus(pn,Times(C2,Plus(p,C1),a,x)),Power(Plus(c,Times(pd,Sqr(x))),Plus(p,C1)),Power(E,Times(pn,ArcTanh(Times(a,x)))),Power(Times(Power(a,C3),c,Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1))))),CN1)),Times(CN1,Plus(Sqr(pn),Times(C2,Plus(p,C1))),Power(Times(Sqr(a),c,Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1))))),CN1),Int(Times(Power(Plus(c,Times(pd,Sqr(x))),Plus(p,C1)),Power(E,Times(pn,ArcTanh(Times(a,x))))),x))),And(And(And(And(And(And(FreeQ(List(a,c,pd,pn),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),RationalQ(p)),LessEqual(p,CN1)),NonzeroQ(Plus(Sqr(pn),Times(C2,Plus(p,C1))))),NonzeroQ(Plus(Sqr(pn),Times(CN1,C4,Sqr(Plus(p,C1)))))),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(c,p),Power(Power(a,Plus(m,C1)),CN1),Subst(Int(Times(Power(E,Times(pn,x)),Power(Tanh(x),Plus(m,Times(C2,Plus(p,C1)))),Power(Power(Sinh(x),Times(C2,Plus(p,C1))),CN1)),x),x,ArcTanh(Times(a,x)))),And(And(And(And(And(And(FreeQ(List(a,c,pd,pn),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),IntegerQ(m)),RationalQ(p)),LessEqual(LessEqual(C3,m),Times(CN2,Plus(p,C1)))),IntegerQ(p)),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,a,x)),Plus(p,Times(CN1,C1D2,pn))),Power(Plus(C1,Times(a,x)),Plus(p,Times(C1D2,pn)))),x)),And(And(And(And(And(FreeQ(List(a,c,pd,m,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Or(IntegerQ(p),PositiveQ(c))),ZeroQ(Plus(Sqr(pn),Times(CN1,C1)))),Or(Not(RationalQ(m)),Not(RationalQ(p)))),Not(IntegerQ(Plus(p,Times(CN1,C1D2,pn))))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),Plus(p,Times(CN1,C1D2,pn))),Power(Plus(C1,Times(a,x)),pn)),x)),And(And(And(And(And(FreeQ(List(a,c,pd,m,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Or(IntegerQ(p),PositiveQ(c))),OddQ(pn)),Or(Or(Not(RationalQ(m)),Not(RationalQ(p))),And(ZeroQ(Plus(pn,Times(CN1,C1))),NonzeroQ(Plus(p,C1))))),Not(IntegerQ(Plus(p,Times(CN1,C1D2,pn))))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(c,Times(C1D2,pn)),Int(Times(Power(x,m),Power(Plus(c,Times(pd,Sqr(x))),Plus(p,Times(CN1,C1D2,pn))),Power(Plus(C1,Times(a,x)),pn)),x)),And(And(And(And(FreeQ(List(a,c,pd,m,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Not(Or(IntegerQ(p),PositiveQ(c)))),IntegerQ(Times(C1D2,pn))),Or(ZeroQ(Plus(m,Times(CN1,C1))),Not(IntegerQ(Plus(p,C1D2))))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_DEFAULT),u_),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(u,Power(Plus(C1,Times(CN1,a,x)),Plus(p,Times(CN1,C1D2,pn))),Power(Plus(C1,Times(a,x)),Plus(p,Times(C1D2,pn)))),x)),And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Or(IntegerQ(p),PositiveQ(c))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_),u_),x_Symbol),
    Condition(Times(Power(c,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(c,Times(pd,Sqr(x)))),Power(Times(Sqrt(Plus(C1,Times(CN1,a,x))),Sqrt(Plus(C1,Times(a,x)))),CN1),Int(Times(u,Power(Plus(C1,Times(CN1,a,x)),Plus(p,Times(CN1,C1D2,pn))),Power(Plus(C1,Times(a,x)),Plus(p,Times(C1D2,pn)))),x)),And(And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Not(PositiveQ(c))),IntegerQ(Times(C1D2,pn))),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_),u_),x_Symbol),
    Condition(Times(Power(c,Plus(p,C1D2)),Sqrt(Plus(C1,Times(CN1,a,x))),Sqrt(Plus(C1,Times(a,x))),Power(Plus(c,Times(pd,Sqr(x))),CN1D2),Int(Times(u,Power(Plus(C1,Times(CN1,a,x)),Plus(p,Times(CN1,C1D2,pn))),Power(Plus(C1,Times(a,x)),Plus(p,Times(C1D2,pn)))),x)),And(And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Not(PositiveQ(c))),IntegerQ(Times(C1D2,pn))),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Power(E,Times(ArcTanh(Times(a_DEFAULT,x_)),pn_DEFAULT)),Power(Plus(Times(Sqr(x_),pd_DEFAULT),c_),p_),u_),x_Symbol),
    Condition(Times(Power(c,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(c,Times(pd,Sqr(x)))),Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),CN1D2),Int(Times(u,Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),Power(E,Times(pn,ArcTanh(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,pd,pn,p),x),ZeroQ(Plus(Times(Sqr(a),c),pd))),Not(PositiveQ(c))),Not(IntegerQ(Times(C1D2,pn)))),PositiveIntegerQ(Plus(p,C1D2)))))
  );
}
