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
public class IntRules110 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn)),x)),Times(CN1,pd,Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegersQ(m,pn,Times(C2,p))),Less(p,CN1)),Greater(m,C1)),Unequal(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn)),x)),Times(CN1,pd,Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegersQ(m,pn,Times(C2,p))),Less(p,CN1)),Greater(m,C1)),Unequal(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pd,CN1),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn)),x)),Times(CN1,pe,Power(pd,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegersQ(m,pn,Times(C2,p))),Less(p,CN1)),Less(m,C0)),Unequal(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pd,CN1),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn)),x)),Times(CN1,pe,Power(pd,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegersQ(m,pn,Times(C2,p))),Less(p,CN1)),Less(m,C0)),Unequal(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1)),CN1)),Times(CN1,m,Power(Times(b,c,Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pn,C1))),x)),Times(CN1,c,Plus(m,Times(C2,p),C2),Power(Times(b,Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(m,pn,p)),Less(p,CN1)),Less(pn,CN1)),NonzeroQ(Plus(m,Times(C2,p),C2))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1)),CN1)),Times(m,Power(Times(b,c,Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pn,C1))),x)),Times(c,Plus(m,Times(C2,p),C2),Power(Times(b,Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(m,pn,p)),Less(p,CN1)),Less(pn,CN1)),NonzeroQ(Plus(m,Times(C2,p),C2))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,p),Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Sin(x),m),Power(Power(Cos(x),Plus(m,Times(C2,Plus(p,C1)))),CN1)),x),x,ArcTan(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveIntegerQ(m)),NegativeIntegerQ(Plus(m,Times(C2,p),C1))),Or(IntegerQ(p),PositiveQ(pd))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,Plus(p,C1D2)),Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn)),x)),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveIntegerQ(m)),NegativeIntegerQ(Plus(m,Times(C2,p),C1))),Not(Or(IntegerQ(p),PositiveQ(pd)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(pd,p),Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Cos(x),m),Power(Power(Sin(x),Plus(m,Times(C2,Plus(p,C1)))),CN1)),x),x,ArcCot(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveIntegerQ(m)),NegativeIntegerQ(Plus(m,Times(C2,p),C1))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(pd,Plus(p,C1D2)),x,Sqrt(Times(Plus(C1,Times(Sqr(c),Sqr(x))),Power(Times(Sqr(c),Sqr(x)),CN1))),Power(Times(Power(c,m),Sqrt(Plus(pd,Times(pe,Sqr(x))))),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Cos(x),m),Power(Power(Sin(x),Plus(m,Times(C2,Plus(p,C1)))),CN1)),x),x,ArcCot(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveIntegerQ(m)),NegativeIntegerQ(Plus(m,Times(C2,p),C1))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT),x_),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(CN1,b,c,Power(Times(C2,pe,Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,pd,pe,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT),x_),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(b,c,Power(Times(C2,pe,Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,pd,pe,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcTan(Times(c,x)))),u,x),Times(CN1,b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)))),And(FreeQ(List(a,b,c,pd,pe,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))))))))),
ISetDelayed(Int(Times(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcCot(Times(c,x)))),u,x),Times(b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)))),And(FreeQ(List(a,b,c,pd,pe,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))))))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn),Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p)),x),x),And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),IntegerQ(p)),PositiveIntegerQ(pn)),Or(Greater(p,C0),And(And(Less(p,CN1),IntegerQ(m)),Unequal(m,C1)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn),Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p)),x),x),And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),IntegerQ(p)),PositiveIntegerQ(pn)),Or(Greater(p,C0),And(And(Less(p,CN1),IntegerQ(m)),Unequal(m,C1)))))),
ISetDelayed(Int(Times(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(a,Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p)),x)),Times(b,Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p),ArcTan(Times(c,x))),x))),FreeQ(List(a,b,c,pd,pe,m,p),x))),
ISetDelayed(Int(Times(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(a,Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p)),x)),Times(b,Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p),ArcCot(Times(c,x))),x))),FreeQ(List(a,b,c,pd,pe,m,p),x))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,m,pn,p),x))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,m,pn,p),x))),
ISetDelayed(Int(Times(ArcTanh(u_),Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(Plus(C1,u)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x)),Times(CN1,C1D2,Int(Times(Log(Plus(C1,Times(CN1,u))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(ArcCoth(u_),Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(SimplifyIntegrand(Plus(C1,Power(u,CN1)),x)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x)),Times(CN1,C1D2,Int(Times(Log(SimplifyIntegrand(Plus(C1,Times(CN1,Power(u,CN1))),x)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(ArcTanh(u_),Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(Plus(C1,u)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x)),Times(CN1,C1D2,Int(Times(Log(Plus(C1,Times(CN1,u))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Times(ArcCoth(u_),Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(SimplifyIntegrand(Plus(C1,Power(u,CN1)),x)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x)),Times(CN1,C1D2,Int(Times(Log(SimplifyIntegrand(Plus(C1,Times(CN1,Power(u,CN1))),x)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Log(u_),Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Times(C2,c,pd),CN1)),Times(CN1,b,pn,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pn,Times(CN1,C1))),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(Plus(C1,Times(CN1,u))),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Log(u_),Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Times(C2,c,pd),CN1)),Times(b,pn,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pn,Times(CN1,C1))),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(Plus(C1,Times(CN1,u))),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Log(u_),Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Times(C2,c,pd),CN1)),Times(b,pn,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pn,Times(CN1,C1))),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(Plus(C1,Times(CN1,u))),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Log(u_),Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Times(C2,c,pd),CN1)),Times(CN1,b,pn,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pn,Times(CN1,C1))),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(Plus(C1,Times(CN1,u))),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Times(PolyLog(p_,u_),Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn),PolyLog(Plus(p,C1),u),Power(Times(C2,c,pd),CN1)),Times(b,pn,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pn,Times(CN1,C1))),PolyLog(Plus(p,C1),u),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,p),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(PolyLog(p_,u_),Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn),PolyLog(Plus(p,C1),u),Power(Times(C2,c,pd),CN1)),Times(CN1,b,pn,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pn,Times(CN1,C1))),PolyLog(Plus(p,C1),u),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,p),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(PolyLog(p_,u_),Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn),PolyLog(Plus(p,C1),u),Power(Times(C2,c,pd),CN1)),Times(CN1,b,pn,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pn,Times(CN1,C1))),PolyLog(Plus(p,C1),u),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,p),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Times(PolyLog(p_,u_),Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn),PolyLog(Plus(p,C1),u),Power(Times(C2,c,pd),CN1)),Times(b,pn,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pn,Times(CN1,C1))),PolyLog(Plus(p,C1),u),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,p),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),RationalQ(pn)),Greater(pn,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Power(Times(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),CN1),x_Symbol),
    Condition(Times(Plus(Times(CN1,Log(Plus(a,Times(b,ArcCot(Times(c,x)))))),Log(Plus(a,Times(b,ArcTan(Times(c,x)))))),Power(Times(b,c,pd,Plus(Times(C2,a),Times(b,ArcCot(Times(c,x))),Times(b,ArcTan(Times(c,x))))),CN1)),And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),m_DEFAULT),Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(m,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),pn),Power(Times(b,c,pd,Plus(m,C1)),CN1)),Times(pn,Power(Plus(m,C1),CN1),Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(m,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegersQ(m,pn)),And(Less(C0,pn),LessEqual(pn,m))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),m_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1)),x_Symbol),
    Condition(Plus(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(m,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),pn),Power(Times(b,c,pd,Plus(m,C1)),CN1)),Times(pn,Power(Plus(m,C1),CN1),Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(m,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegersQ(m,pn)),Less(Less(C0,pn),m)))),
ISetDelayed(Int(Times(ArcTan(Times(a_DEFAULT,x_)),Power(Plus(Times(Power(x_,pn_DEFAULT),pd_DEFAULT),c_),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Log(Plus(C1,Times(CN1,CI,a,x))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x)),Times(CN1,C1D2,CI,Int(Times(Log(Plus(C1,Times(CI,a,x))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x))),And(And(FreeQ(List(a,c,pd),x),IntegerQ(pn)),Not(And(Equal(pn,C2),ZeroQ(Plus(pd,Times(CN1,Sqr(a),c)))))))),
ISetDelayed(Int(Times(ArcCot(Times(a_DEFAULT,x_)),Power(Plus(Times(Power(x_,pn_DEFAULT),pd_DEFAULT),c_),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Log(Plus(C1,Times(CN1,CI,Power(Times(a,x),CN1)))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x)),Times(CN1,C1D2,CI,Int(Times(Log(Plus(C1,Times(CI,Power(Times(a,x),CN1)))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x))),And(And(FreeQ(List(a,c,pd),x),IntegerQ(pn)),Not(And(Equal(pn,C2),ZeroQ(Plus(pd,Times(CN1,Sqr(a),c)))))))),
ISetDelayed(Int(Times(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Plus(Times(Log(Plus(Times(Sqr(x_),g_DEFAULT),f_DEFAULT)),pe_DEFAULT),pd_DEFAULT)),x_Symbol),
    Condition(Plus(Times(x,Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x))))))),Times(CN1,C2,pe,g,Int(Times(Sqr(x),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),CN1)),x)),Times(CN1,b,c,Int(Times(x,Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),FreeQ(List(a,b,c,pd,pe,f,g),x))),
ISetDelayed(Int(Times(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Plus(Times(Log(Plus(Times(Sqr(x_),g_DEFAULT),f_DEFAULT)),pe_DEFAULT),pd_DEFAULT)),x_Symbol),
    Condition(Plus(Times(x,Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x))))))),Times(CN1,C2,pe,g,Int(Times(Sqr(x),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),CN1)),x)),Times(b,c,Int(Times(x,Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),FreeQ(List(a,b,c,pd,pe,f,g),x))),
ISetDelayed(Int(Times(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Plus(Times(Log(Plus(Times(Sqr(x_),g_DEFAULT),f_DEFAULT)),pe_DEFAULT),pd_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(m,C1),CN1)),Times(CN1,C2,pe,g,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),CN1)),x)),Times(CN1,b,c,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,pd,pe,f,g),x),NegativeIntegerQ(Times(C1D2,m))))),
ISetDelayed(Int(Times(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Plus(Times(Log(Plus(Times(Sqr(x_),g_DEFAULT),f_DEFAULT)),pe_DEFAULT),pd_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(m,C1),CN1)),Times(CN1,C2,pe,g,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),CN1)),x)),Times(b,c,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,pd,pe,f,g),x),NegativeIntegerQ(Times(C1D2,m))))),
ISetDelayed(Int(Times(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Plus(Times(Log(Plus(Times(Sqr(x_),g_DEFAULT),f_DEFAULT)),pe_DEFAULT),pd_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x))))))),x)))),Plus(Dist(Plus(a,Times(b,ArcTan(Times(c,x)))),u,x),Times(CN1,b,c,Int(ExpandIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)))),And(FreeQ(List(a,b,c,pd,pe,f,g),x),PositiveIntegerQ(Times(C1D2,Plus(m,C1)))))),
ISetDelayed(Int(Times(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Plus(Times(Log(Plus(Times(Sqr(x_),g_DEFAULT),f_DEFAULT)),pe_DEFAULT),pd_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x))))))),x)))),Plus(Dist(Plus(a,Times(b,ArcCot(Times(c,x)))),u,x),Times(b,c,Int(ExpandIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)))),And(FreeQ(List(a,b,c,pd,pe,f,g),x),PositiveIntegerQ(Times(C1D2,Plus(m,C1)))))),
ISetDelayed(Int(Times(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Plus(Times(Log(Plus(Times(Sqr(x_),g_DEFAULT),f_DEFAULT)),pe_DEFAULT),pd_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Plus(a,Times(b,ArcTan(Times(c,x))))),x)))),Plus(Dist(Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x)))))),u,x),Times(CN1,C2,pe,g,Int(ExpandIntegrand(Times(x,u,Power(Plus(f,Times(g,Sqr(x))),CN1)),x),x)))),And(And(FreeQ(List(a,b,c,pd,pe,f,g),x),IntegerQ(m)),Unequal(m,CN1)))),
ISetDelayed(Int(Times(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Plus(Times(Log(Plus(Times(Sqr(x_),g_DEFAULT),f_DEFAULT)),pe_DEFAULT),pd_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Plus(a,Times(b,ArcCot(Times(c,x))))),x)))),Plus(Dist(Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x)))))),u,x),Times(CN1,C2,pe,g,Int(ExpandIntegrand(Times(x,u,Power(Plus(f,Times(g,Sqr(x))),CN1)),x),x)))),And(And(FreeQ(List(a,b,c,pd,pe,f,g),x),IntegerQ(m)),Unequal(m,CN1)))),
ISetDelayed(Int(Times(Plus(Times(Log(Plus(Times(Sqr(x_),g_DEFAULT),f_)),pe_DEFAULT),pd_DEFAULT),Sqr(Plus(Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT)),x_),x_Symbol),
    Condition(Plus(Times(Plus(f,Times(g,Sqr(x))),Sqr(Plus(a,Times(b,ArcTan(Times(c,x))))),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x)))))),Power(Times(C2,g),CN1)),Times(CN1,pe,Sqr(x),C1D2,Sqr(Plus(a,Times(b,ArcTan(Times(c,x)))))),Times(CN1,b,Power(c,CN1),Int(Times(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x))))))),x)),Times(b,c,pe,Int(Times(Sqr(x),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,pd,pe,f,g),x),ZeroQ(Plus(g,Times(CN1,Sqr(c),f)))))),
ISetDelayed(Int(Times(Plus(Times(Log(Plus(Times(Sqr(x_),g_DEFAULT),f_)),pe_DEFAULT),pd_DEFAULT),Sqr(Plus(Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT)),x_),x_Symbol),
    Condition(Plus(Times(Plus(f,Times(g,Sqr(x))),Sqr(Plus(a,Times(b,ArcCot(Times(c,x))))),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x)))))),Power(Times(C2,g),CN1)),Times(CN1,pe,Sqr(x),C1D2,Sqr(Plus(a,Times(b,ArcCot(Times(c,x)))))),Times(b,Power(c,CN1),Int(Times(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(pd,Times(pe,Log(Plus(f,Times(g,Sqr(x))))))),x)),Times(CN1,b,c,pe,Int(Times(Sqr(x),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,pd,pe,f,g),x),ZeroQ(Plus(g,Times(CN1,Sqr(c),f)))))),
ISetDelayed(Int(Power(Plus(Times(ArcTan(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),x_Symbol),
    Condition(Times(Power(pd,CN1),Subst(Int(Power(Plus(a,Times(b,ArcTan(x))),pn),x),x,Plus(c,Times(pd,x)))),And(FreeQ(List(a,b,c,pd),x),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Power(Plus(Times(ArcCot(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),x_Symbol),
    Condition(Times(Power(pd,CN1),Subst(Int(Power(Plus(a,Times(b,ArcCot(x))),pn),x),x,Plus(c,Times(pd,x)))),And(FreeQ(List(a,b,c,pd),x),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Power(Plus(Times(ArcTan(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_),x_Symbol),
    Condition($(Defer($s("Int")),Power(Plus(a,Times(b,ArcTan(Plus(c,Times(pd,x))))),pn),x),And(FreeQ(List(a,b,c,pd,pn),x),Not(PositiveIntegerQ(pn))))),
ISetDelayed(Int(Power(Plus(Times(ArcCot(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_),x_Symbol),
    Condition($(Defer($s("Int")),Power(Plus(a,Times(b,ArcCot(Plus(c,Times(pd,x))))),pn),x),And(FreeQ(List(a,b,c,pd,pn),x),Not(PositiveIntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(f_DEFAULT,x_),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,CN1),Subst(Int(Times(Power(Plus(Times(Plus(Times(pd,pe),Times(CN1,c,f)),Power(pd,CN1)),Times(f,x,Power(pd,CN1))),m),Power(Plus(a,Times(b,ArcTan(x))),pn)),x),x,Plus(c,Times(pd,x)))),And(FreeQ(List(a,b,c,pd,pe,f,m,pn),x),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(f_DEFAULT,x_),pe_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,CN1),Subst(Int(Times(Power(Plus(Times(Plus(Times(pd,pe),Times(CN1,c,f)),Power(pd,CN1)),Times(f,x,Power(pd,CN1))),m),Power(Plus(a,Times(b,ArcCot(x))),pn)),x),x,Plus(c,Times(pd,x)))),And(FreeQ(List(a,b,c,pd,pe,f,m,pn),x),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(f_DEFAULT,x_),pe_DEFAULT),m_)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(pe,Times(f,x)),m),Power(Plus(a,Times(b,ArcTan(Plus(c,Times(pd,x))))),pn)),x),And(FreeQ(List(a,b,c,pd,pe,f,m,pn),x),Not(PositiveIntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(f_DEFAULT,x_),pe_DEFAULT),m_)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(pe,Times(f,x)),m),Power(Plus(a,Times(b,ArcCot(Plus(c,Times(pd,x))))),pn)),x),And(FreeQ(List(a,b,c,pd,pe,f,m,pn),x),Not(PositiveIntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(x_,pb_DEFAULT),Times(Sqr(x_),pc_DEFAULT),pa_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,CN1),Subst(Int(Times(Power(Plus(Times(pc,Power(pd,CN2)),Times(pc,Power(pd,CN2),Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(x))),pn)),x),x,Plus(c,Times(pd,x)))),And(And(FreeQ(List(a,b,c,pd,pa,pb,pc,pn,p),x),ZeroQ(Plus(Times(pb,Plus(C1,Sqr(c))),Times(CN1,C2,pa,c,pd)))),ZeroQ(Plus(Times(C2,c,pc),Times(CN1,pb,pd)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(x_,pb_DEFAULT),Times(Sqr(x_),pc_DEFAULT),pa_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,CN1),Subst(Int(Times(Power(Plus(Times(pc,Power(pd,CN2)),Times(pc,Power(pd,CN2),Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(x))),pn)),x),x,Plus(c,Times(pd,x)))),And(And(FreeQ(List(a,b,c,pd,pa,pb,pc,pn,p),x),ZeroQ(Plus(Times(pb,Plus(C1,Sqr(c))),Times(CN1,C2,pa,c,pd)))),ZeroQ(Plus(Times(C2,c,pc),Times(CN1,pb,pd)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTan(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(f_DEFAULT,x_),pe_DEFAULT),m_DEFAULT),Power(Plus(Times(x_,pb_DEFAULT),Times(Sqr(x_),pc_DEFAULT),pa_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,CN1),Subst(Int(Times(Power(Plus(Times(Plus(Times(pd,pe),Times(CN1,c,f)),Power(pd,CN1)),Times(f,x,Power(pd,CN1))),m),Power(Plus(Times(pc,Power(pd,CN2)),Times(pc,Power(pd,CN2),Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(x))),pn)),x),x,Plus(c,Times(pd,x)))),And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb,pc,m,pn,p),x),ZeroQ(Plus(Times(pb,Plus(C1,Sqr(c))),Times(CN1,C2,pa,c,pd)))),ZeroQ(Plus(Times(C2,c,pc),Times(CN1,pb,pd)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCot(Plus(Times(x_,pd_DEFAULT),c_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(f_DEFAULT,x_),pe_DEFAULT),m_DEFAULT),Power(Plus(Times(x_,pb_DEFAULT),Times(Sqr(x_),pc_DEFAULT),pa_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,CN1),Subst(Int(Times(Power(Plus(Times(Plus(Times(pd,pe),Times(CN1,c,f)),Power(pd,CN1)),Times(f,x,Power(pd,CN1))),m),Power(Plus(Times(pc,Power(pd,CN2)),Times(pc,Power(pd,CN2),Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(x))),pn)),x),x,Plus(c,Times(pd,x)))),And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb,pc,m,pn,p),x),ZeroQ(Plus(Times(pb,Plus(C1,Sqr(c))),Times(CN1,C2,pa,c,pd)))),ZeroQ(Plus(Times(C2,c,pc),Times(CN1,pb,pd))))))
  );
}
