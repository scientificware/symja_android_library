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
public class IntRules46 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(Power(b,m),pd),CN1),Subst(Int(Times(Power(Plus(a,x),pn),Power(Plus(Sqr(b),Times(CN1,Sqr(x))),Times(C1D2,Plus(m,Times(CN1,C1))))),x),x,Times(b,Sin(Plus(c,Times(pd,x)))))),And(FreeQ(List(a,b,c,pd,pn),x),OddQ(m)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(Times(Power(b,m),pd),CN1),Subst(Int(Times(Power(Plus(a,x),pn),Power(Plus(Sqr(b),Times(CN1,Sqr(x))),Times(C1D2,Plus(m,Times(CN1,C1))))),x),x,Times(b,Cos(Plus(c,Times(pd,x)))))),And(FreeQ(List(a,b,c,pd,pn),x),OddQ(m)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Times(b,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),pn),Power(Times(a,pd,pe,pn),CN1)),And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),ZeroQ(Plus(m,pn,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_DEFAULT),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,b,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),pn),Power(Times(a,pd,pe,pn),CN1)),And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),ZeroQ(Plus(m,pn,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Times(b,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1))),Power(Times(pd,pe,Plus(pn,Times(CN1,C1))),CN1)),And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),ZeroQ(Plus(m,Times(C2,pn),Times(CN1,C1)))),NonzeroQ(Plus(pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Times(CN1,b,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1))),Power(Times(pd,pe,Plus(pn,Times(CN1,C1))),CN1)),And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),ZeroQ(Plus(m,Times(C2,pn),Times(CN1,C1)))),NonzeroQ(Plus(pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),Power($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),CN1)),x_Symbol),
    Condition(Times(CN1,b,Log(RemoveContent(Plus(a,Times(CN1,b,Sin(Plus(c,Times(pd,x))))),x)),Power(pd,CN1)),And(FreeQ(List(a,b,c,pd),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),Power($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),CN1)),x_Symbol),
    Condition(Times(b,Log(RemoveContent(Plus(a,Times(CN1,b,Cos(Plus(c,Times(pd,x))))),x)),Power(pd,CN1)),And(FreeQ(List(a,b,c,pd),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Times(pd,pe,Plus(m,C1)),CN1)),Times(a,Int(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),m),x))),And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(b,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Times(pd,pe,Plus(m,C1)),CN1)),Times(a,Int(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),m),x))),And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),pn),Power(Times(a,pd,pe,Plus(m,C1)),CN1)),Times(a,Plus(m,pn,C1),Power(Times(Sqr(pe),Plus(m,C1)),CN1),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(Less(C0,pn),C1)),Less(m,CN1)),NonzeroQ(Plus(m,pn,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(b,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),pn),Power(Times(a,pd,pe,Plus(m,C1)),CN1)),Times(a,Plus(m,pn,C1),Power(Times(Sqr(pe),Plus(m,C1)),CN1),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(Less(C0,pn),C1)),Less(m,CN1)),NonzeroQ(Plus(m,pn,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN2,b,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1))),Power(Times(pd,pe,Plus(m,C1)),CN1)),Times(Sqr(b),Plus(m,Times(C2,pn),Times(CN1,C1)),Power(Times(Sqr(pe),Plus(m,C1)),CN1),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Greater(pn,C1)),Less(m,CN1)),NonzeroQ(Plus(m,Times(C2,pn),Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(C2,b,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1))),Power(Times(pd,pe,Plus(m,C1)),CN1)),Times(Sqr(b),Plus(m,Times(C2,pn),Times(CN1,C1)),Power(Times(Sqr(pe),Plus(m,C1)),CN1),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Greater(pn,C1)),Less(m,CN1)),NonzeroQ(Plus(m,Times(C2,pn),Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_DEFAULT),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1))),Power(Times(pd,pe,Plus(m,pn)),CN1)),Times(a,Plus(m,Times(C2,pn),Times(CN1,C1)),Power(Plus(m,pn),CN1),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),Greater(pn,C0)),Not(And(RationalQ(m),Less(m,CN1)))),NonzeroQ(Plus(m,pn))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_DEFAULT),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(b,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1))),Power(Times(pd,pe,Plus(m,pn)),CN1)),Times(a,Plus(m,Times(C2,pn),Times(CN1,C1)),Power(Plus(m,pn),CN1),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),Greater(pn,C0)),Not(And(RationalQ(m),Less(m,CN1)))),NonzeroQ(Plus(m,pn))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),CN1),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(pe,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C1))),Power(Times(b,pd,Plus(m,Times(CN1,C1))),CN1)),Times(Sqr(pe),Power(a,CN1),Int(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C2))),x))),And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),NonzeroQ(Plus(m,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),CN1),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN1,pe,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C1))),Power(Times(b,pd,Plus(m,Times(CN1,C1))),CN1)),Times(Sqr(pe),Power(a,CN1),Int(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C2))),x))),And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),NonzeroQ(Plus(m,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),CN1D2),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN2,b,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Times(pd,pe,Plus(Times(C2,m),Times(CN1,C1)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),QQ(3L,2L))),CN1)),Times(C2,a,Plus(m,Times(CN1,C2)),Power(Plus(Times(C2,m),Times(CN1,C1)),CN1),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),QQ(-3L,2L))),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Greater(m,C2)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),CN1D2),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(C2,b,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Times(pd,pe,Plus(Times(C2,m),Times(CN1,C1)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),QQ(3L,2L))),CN1)),Times(C2,a,Plus(m,Times(CN1,C2)),Power(Plus(Times(C2,m),Times(CN1,C1)),CN1),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),QQ(-3L,2L))),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Greater(m,C2)))),
ISetDelayed(Int(Power(Times(Sqrt(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_)),Sqr($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)))),CN1),x_Symbol),
    Condition(Plus(Times(Tan(Plus(c,Times(pd,x))),Power(Times(pd,Sqrt(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))))),CN1)),Times(C1D2,b,Int(Times(Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),QQ(-3L,2L))),x))),And(FreeQ(List(a,b,c,pd),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Power(Times(Sqrt(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_)),Sqr($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)))),CN1),x_Symbol),
    Condition(Plus(Times(CN1,Cot(Plus(c,Times(pd,x))),Power(Times(pd,Sqrt(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))))),CN1)),Times(C1D2,b,Int(Times(Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),QQ(-3L,2L))),x))),And(FreeQ(List(a,b,c,pd),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),CN1D2),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Times(a,pd,pe,Plus(m,C1),Sqrt(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))))),CN1)),Times(a,Plus(Times(C2,m),C1),Power(Times(C2,Sqr(pe),Plus(m,C1)),CN1),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),QQ(-3L,2L))),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN2)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),CN1D2),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(b,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Times(a,pd,pe,Plus(m,C1),Sqrt(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))))),CN1)),Times(a,Plus(Times(C2,m),C1),Power(Times(C2,Sqr(pe),Plus(m,C1)),CN1),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),QQ(-3L,2L))),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN2)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN1,pe,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(C2,Sqr(pe),Power(a,CN1),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(pn,CN1)),Equal(Plus(m,Times(C2,pn),C1),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(pe,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(C2,Sqr(pe),Power(a,CN1),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(pn,CN1)),Equal(Plus(m,Times(C2,pn),C1),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(C2,pe,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,Times(C2,pn),C1)),CN1)),Times(Sqr(pe),Plus(m,Times(CN1,C1)),Power(Times(Sqr(b),Plus(m,Times(C2,pn),C1)),CN1),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C2))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(pn,CN1)),Unequal(Plus(m,Times(C2,pn),C1),C0)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN2,pe,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,Times(C2,pn),C1)),CN1)),Times(Sqr(pe),Plus(m,Times(CN1,C1)),Power(Times(Sqr(b),Plus(m,Times(C2,pn),C1)),CN1),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C2))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(pn,CN1)),Unequal(Plus(m,Times(C2,pn),C1),C0)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(b,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),pn),Power(Times(a,pd,pe,Plus(m,Times(C2,pn),C1)),CN1)),Times(Plus(m,pn,C1),Power(Times(a,Plus(m,Times(C2,pn),C1)),CN1),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,Times(C2,pn),C1))),Not(And(RationalQ(m),Greater(m,C1)))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_DEFAULT),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),pn),Power(Times(a,pd,pe,Plus(m,Times(C2,pn),C1)),CN1)),Times(Plus(m,pn,C1),Power(Times(a,Plus(m,Times(C2,pn),C1)),CN1),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,Times(C2,pn),C1))),Not(And(RationalQ(m),Greater(m,C1)))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_DEFAULT),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),pn),x),x),And(And(FreeQ(List(a,b,c,pd,pe,m),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_DEFAULT),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),pn),x),x),And(And(FreeQ(List(a,b,c,pd,pe,m),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),C4)),x_Symbol),
    Condition(Plus(Times(Plus(Sqr(a),Times(CN1,Sqr(b))),Cos(Plus(c,Times(pd,x))),Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(a,Sqr(b),pd,Plus(pn,C1)),CN1)),Times(CN1,Cos(Plus(c,Times(pd,x))),Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C2)),Power(Times(Sqr(b),pd,Plus(pn,C4)),CN1)),Times(CN1,Power(Times(a,Sqr(b),Plus(pn,C1),Plus(pn,C4)),CN1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1)),Simp(Plus(Times(C3,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C2),Plus(pn,C4)),Times(a,b,Plus(pn,C1),Sin(Plus(c,Times(pd,x)))),Times(CN1,Plus(Times(C6,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C3),Plus(pn,C4))),Sqr(Sin(Plus(c,Times(pd,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),And(LessEqual(CN2,pn),Less(pn,CN1))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),C4)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Sqr(a),Times(CN1,Sqr(b))),Sin(Plus(c,Times(pd,x))),Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(a,Sqr(b),pd,Plus(pn,C1)),CN1)),Times(Sin(Plus(c,Times(pd,x))),Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C2)),Power(Times(Sqr(b),pd,Plus(pn,C4)),CN1)),Times(CN1,Power(Times(a,Sqr(b),Plus(pn,C1),Plus(pn,C4)),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1)),Simp(Plus(Times(C3,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C2),Plus(pn,C4)),Times(a,b,Plus(pn,C1),Cos(Plus(c,Times(pd,x)))),Times(CN1,Plus(Times(C6,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C3),Plus(pn,C4))),Sqr(Cos(Plus(c,Times(pd,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),And(LessEqual(CN2,pn),Less(pn,CN1))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),C4)),x_Symbol),
    Condition(Plus(Times(Plus(Sqr(a),Times(CN1,Sqr(b))),Cos(Plus(c,Times(pd,x))),Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(a,Sqr(b),pd,Plus(pn,C1)),CN1)),Times(CN1,Plus(Times(Sqr(a),Plus(pn,Times(CN1,C1))),Times(Sqr(b),Plus(pn,C2))),Cos(Plus(c,Times(pd,x))),Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C2)),Power(Times(Sqr(a),Sqr(b),pd,Plus(pn,C1),Plus(pn,C2)),CN1)),Times(CN1,Power(Times(Sqr(a),Sqr(b),Plus(pn,C1),Plus(pn,C2)),CN1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C2)),Simp(Plus(Times(C3,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C2),Plus(pn,C3)),Times(a,b,Plus(pn,C2),Sin(Plus(c,Times(pd,x)))),Times(CN1,Plus(Times(C6,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C2),Plus(pn,C4))),Sqr(Sin(Plus(c,Times(pd,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),Less(pn,CN2)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),C4)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Sqr(a),Times(CN1,Sqr(b))),Sin(Plus(c,Times(pd,x))),Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(a,Sqr(b),pd,Plus(pn,C1)),CN1)),Times(Plus(Times(Sqr(a),Plus(pn,Times(CN1,C1))),Times(Sqr(b),Plus(pn,C2))),Sin(Plus(c,Times(pd,x))),Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C2)),Power(Times(Sqr(a),Sqr(b),pd,Plus(pn,C1),Plus(pn,C2)),CN1)),Times(CN1,Power(Times(Sqr(a),Sqr(b),Plus(pn,C1),Plus(pn,C2)),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C2)),Simp(Plus(Times(C3,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C2),Plus(pn,C3)),Times(a,b,Plus(pn,C2),Cos(Plus(c,Times(pd,x)))),Times(CN1,Plus(Times(C6,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C2),Plus(pn,C4))),Sqr(Cos(Plus(c,Times(pd,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),Less(pn,CN2)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),C4)),x_Symbol),
    Condition(Plus(Times(C3,a,Cos(Plus(c,Times(pd,x))),Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(Sqr(b),pd,Plus(pn,C3),Plus(pn,C4)),CN1)),Times(CN1,Cos(Plus(c,Times(pd,x))),Sqr(Sin(Plus(c,Times(pd,x)))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C4)),CN1)),Times(CN1,Power(Times(Sqr(b),Plus(pn,C3),Plus(pn,C4)),CN1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),pn),Simp(Plus(Times(C3,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C3),Plus(pn,C4)),Times(a,b,pn,Sin(Plus(c,Times(pd,x)))),Times(CN1,Plus(Times(C6,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C3),Plus(pn,C5))),Sqr(Sin(Plus(c,Times(pd,x)))))),x)),x))),And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),Not(And(RationalQ(pn),Less(pn,CN1)))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),C4)),x_Symbol),
    Condition(Plus(Times(CN3,a,Sin(Plus(c,Times(pd,x))),Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(Sqr(b),pd,Plus(pn,C3),Plus(pn,C4)),CN1)),Times(Sin(Plus(c,Times(pd,x))),Sqr(Cos(Plus(c,Times(pd,x)))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C4)),CN1)),Times(CN1,Power(Times(Sqr(b),Plus(pn,C3),Plus(pn,C4)),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),pn),Simp(Plus(Times(C3,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C3),Plus(pn,C4)),Times(a,b,pn,Cos(Plus(c,Times(pd,x)))),Times(CN1,Plus(Times(C6,Sqr(a)),Times(CN1,Sqr(b),Plus(pn,C3),Plus(pn,C5))),Sqr(Cos(Plus(c,Times(pd,x)))))),x)),x))),And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),Not(And(RationalQ(pn),Less(pn,CN1)))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Cos(Plus(c,Times(pd,x))),Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(Plus(m,Times(CN1,C1)),Power(Times(b,Plus(pn,C1)),CN1),Int(Times(Power(Cos(Plus(c,Times(pd,x))),Plus(m,Times(CN1,C2))),Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),NonzeroQ(Plus(pn,C1))),PositiveIntegerQ(m)),LessEqual(m,C4)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Sin(Plus(c,Times(pd,x))),Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(Plus(m,Times(CN1,C1)),Power(Times(b,Plus(pn,C1)),CN1),Int(Times(Power(Sin(Plus(c,Times(pd,x))),Plus(m,Times(CN1,C2))),Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),NonzeroQ(Plus(pn,C1))),PositiveIntegerQ(m)),LessEqual(m,C4)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_DEFAULT),Power($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),m_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Plus(C1,Times(CN1,Sqr($($s("§sin"),Plus(c,Times(pd,x)))))),Times(C1D2,m)),Power(Plus(a,Times(b,$($s("§sin"),Plus(c,Times(pd,x))))),pn)),x),x),And(And(And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),EvenQ(m)),Greater(m,C2)),IntegerQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_DEFAULT),Power($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),m_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Plus(C1,Times(CN1,Sqr($($s("§cos"),Plus(c,Times(pd,x)))))),Times(C1D2,m)),Power(Plus(a,Times(b,$($s("§cos"),Plus(c,Times(pd,x))))),pn)),x),x),And(And(And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),EvenQ(m)),Greater(m,C2)),IntegerQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_DEFAULT),Power($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),CN2)),x_Symbol),
    Condition(Plus(Times(Tan(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),pn),Power(pd,CN1)),Times(CN1,b,pn,Int(Times(Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1)))),x))),And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_DEFAULT),Power($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),CN2)),x_Symbol),
    Condition(Plus(Times(CN1,Cot(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),pn),Power(pd,CN1)),Times(CN1,b,pn,Int(Times(Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1)))),x))),And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),m_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(C1,Times(CN1,Sqr(Sin(Plus(c,Times(pd,x)))))),Times(C1D2,m)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),pn)),x),x),And(And(And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),EvenQ(m)),Less(m,CN2)),IntegerQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),m_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(C1,Times(CN1,Sqr(Cos(Plus(c,Times(pd,x)))))),Times(C1D2,m)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),pn)),x),x),And(And(And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),EvenQ(m)),Less(m,CN2)),IntegerQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Sqr(a),Times(CN1,Sqr(b))),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C2)))),x)),Times(C2,a,Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1)))),x)),Times(CN1,Sqr(b),Power(pe,CN2),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),RationalQ(m,pn)),Greater(pn,C1)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),pn_),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Sqr(a),Times(CN1,Sqr(b))),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C2)))),x)),Times(C2,a,Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),m),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C1)))),x)),Times(CN1,Sqr(b),Power(pe,CN2),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),RationalQ(m,pn)),Greater(pn,C1)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),CN1),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(pe,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C1))),Power(Times(b,pd,Plus(m,Times(CN1,C1))),CN1)),Times(a,Sqr(pe),Power(b,CN2),Int(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C2))),x)),Times(CN1,Sqr(pe),Plus(Sqr(a),Times(CN1,Sqr(b))),Power(b,CN2),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),CN1),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN1,pe,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C1))),Power(Times(b,pd,Plus(m,Times(CN1,C1))),CN1)),Times(a,Sqr(pe),Power(b,CN2),Int(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C2))),x)),Times(CN1,Sqr(pe),Plus(Sqr(a),Times(CN1,Sqr(b))),Power(b,CN2),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),CN1),Power(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(b,Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Times(pd,pe,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(a,Power(Plus(Sqr(a),Times(CN1,Sqr(b))),CN1),Int(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),m),x)),Times(CN1,Sqr(b),Power(Times(Sqr(pe),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Times(pe,Cos(Plus(c,Times(pd,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times($($s("§cos"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),b_DEFAULT),a_),CN1),Power(Times($($s("§sin"),Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),pe_DEFAULT),m_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C1)),Power(Times(pd,pe,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(a,Power(Plus(Sqr(a),Times(CN1,Sqr(b))),CN1),Int(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),m),x)),Times(CN1,Sqr(b),Power(Times(Sqr(pe),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Times(pe,Sin(Plus(c,Times(pd,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN1))))
  );
}
