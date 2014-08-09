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
public class IntRules106 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(Sqrt(pd),Times(CN1,Sqrt(Times(CN1,pe)),x)),p),Power(Plus(Sqrt(pd),Times(Sqrt(Times(CN1,pe)),x)),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x),x),And(And(FreeQ(List(a,b,c,pd,pe,pn),x),NegativeIntegerQ(p)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(Sqrt(pd),Times(CN1,Sqrt(Times(CN1,pe)),x)),p),Power(Plus(Sqrt(pd),Times(Sqrt(Times(CN1,pe)),x)),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x),x),And(And(FreeQ(List(a,b,c,pd,pe,pn),x),NegativeIntegerQ(p)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,pn,p),x))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,pn,p),x))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(g_DEFAULT,x_),f_),p_DEFAULT),Power(Plus(Times(x_,pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x),And(And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(g_DEFAULT,x_),f_),p_DEFAULT),Power(Plus(Times(x_,pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x),And(And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(g_DEFAULT,x_),f_),p_),Power(Plus(Times(x_,pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Sqrt(Plus(pd,Times(pe,x))),Sqrt(Plus(f,Times(g,x))),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x)),And(And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(g_DEFAULT,x_),f_),p_),Power(Plus(Times(x_,pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Sqrt(Plus(pd,Times(pe,x))),Sqrt(Plus(f,Times(g,x))),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x)),And(And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(g_DEFAULT,x_),f_),p_),Power(Plus(Times(x_,pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Sqrt(Plus(Times(pd,f),Times(pe,g,Sqr(x)))),Power(Times(Sqrt(Plus(pd,Times(pe,x))),Sqrt(Plus(f,Times(g,x)))),CN1),Int(Times(Power(x,m),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x)),And(And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(g_DEFAULT,x_),f_),p_),Power(Plus(Times(x_,pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Sqrt(Plus(Times(pd,f),Times(pe,g,Sqr(x)))),Power(Times(Sqrt(Plus(pd,Times(pe,x))),Sqrt(Plus(f,Times(g,x)))),CN1),Int(Times(Power(x,m),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x)),And(And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(g_DEFAULT,x_),f_),p_DEFAULT),Power(Plus(Times(x_,pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(pd,Times(pe,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x),x),And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(g_DEFAULT,x_),f_),p_DEFAULT),Power(Plus(Times(x_,pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(pd,Times(pe,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x),x),And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(g_DEFAULT,x_),f_),p_DEFAULT),Power(Plus(Times(x_,pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(pd,Times(pe,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,f,g,m,pn,p),x))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(g_DEFAULT,x_),f_),p_DEFAULT),Power(Plus(Times(x_,pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(pd,Times(pe,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,f,g,m,pn,p),x))),
ISetDelayed(Int(Times(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT),x_),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcSin(Times(c,x)))),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(CN1,b,c,Power(Times(C2,pe,Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x))),And(FreeQ(List(a,b,c,pd,pe,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT),x_),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCos(Times(c,x)))),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(b,c,Power(Times(C2,pe,Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x))),And(FreeQ(List(a,b,c,pd,pe,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcSin(Times(c,x)))),u,x),Times(CN1,b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x)))),And(FreeQ(List(a,b,c,pd,pe,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))))))))),
ISetDelayed(Int(Times(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcCos(Times(c,x)))),u,x),Times(b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x)))),And(FreeQ(List(a,b,c,pd,pe,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))))))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),x_),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(b,pn,Power(Times(C2,c,Sqrt(pd),Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(pn)),Greater(pn,C0)),Unequal(p,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),x_),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(CN1,b,pn,Power(Times(C2,c,Sqrt(pd),Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(pn)),Greater(pn,C0)),Unequal(p,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn),Power(Plus(m,C1),CN1)),Times(CN1,b,c,Sqrt(pd),pn,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(CN1,C2,pe,p,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Greater(p,C0)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn),Power(Plus(m,C1),CN1)),Times(b,c,Sqrt(pd),pn,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(CN1,C2,pe,p,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Greater(p,C0)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn),Power(Plus(m,Times(C2,p),C1),CN1)),Times(CN1,b,c,pn,Sqrt(pd),Power(Plus(m,Times(C2,p),C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(C2,pd,p,Power(Plus(m,Times(C2,p),C1),CN1),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Greater(p,C0)),Unequal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn),Power(Plus(m,Times(C2,p),C1),CN1)),Times(b,c,pn,Sqrt(pd),Power(Plus(m,Times(C2,p),C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(C2,pd,p,Power(Plus(m,Times(C2,p),C1),CN1),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Greater(p,C0)),Unequal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn),Power(Times(pd,Plus(m,C1)),CN1)),Times(CN1,b,c,pn,Power(Times(Sqrt(pd),Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Less(p,C0)),Unequal(m,CN1)),Equal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn),Power(Times(pd,Plus(m,C1)),CN1)),Times(b,c,pn,Power(Times(Sqrt(pd),Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Less(p,C0)),Unequal(m,CN1)),Equal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1D2),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcSin(Times(c,x)))),Hypergeometric2F1(C1D2,Times(C1D2,Plus(C1,m)),Times(C1D2,Plus(C3,m)),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(pd),Plus(m,C1)),CN1)),Times(CN1,b,c,Power(x,Plus(m,C2)),HypergeometricPFQ(List(C1,Plus(C1,Times(C1D2,m)),Plus(C1,Times(C1D2,m))),List(Plus(QQ(3L,2L),Times(C1D2,m)),Plus(C2,Times(C1D2,m))),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(pd),Plus(m,C1),Plus(m,C2)),CN1))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1D2),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcCos(Times(c,x)))),Hypergeometric2F1(C1D2,Times(C1D2,Plus(C1,m)),Times(C1D2,Plus(C3,m)),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(pd),Plus(m,C1)),CN1)),Times(b,c,Power(x,Plus(m,C2)),HypergeometricPFQ(List(C1,Plus(C1,Times(C1D2,m)),Plus(C1,Times(C1D2,m))),List(Plus(QQ(3L,2L),Times(C1D2,m)),Plus(C2,Times(C1D2,m))),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(pd),Plus(m,C1),Plus(m,C2)),CN1))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(Power(c,Plus(m,C1)),pd),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Sin(x),m),Sec(x)),x),x,ArcSin(Times(c,x)))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)),PositiveIntegerQ(pn)),IntegerQ(m)),Equal(Sqr(m),C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(Times(Power(c,Plus(m,C1)),pd),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Cos(x),m),Csc(x)),x),x,ArcCos(Times(c,x)))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)),PositiveIntegerQ(pn)),IntegerQ(m)),Equal(Sqr(m),C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn),Power(Times(pe,Plus(m,Times(C2,p),C1)),CN1)),Times(CN1,b,c,Sqrt(pd),pn,Power(Times(pe,Plus(m,Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),Plus(m,Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),And(LessEqual(CN1,p),Less(p,C0))),Greater(m,C1)),NonzeroQ(Plus(m,Times(C2,p),C1))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn),Power(Times(pe,Plus(m,Times(C2,p),C1)),CN1)),Times(b,c,Sqrt(pd),pn,Power(Times(pe,Plus(m,Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),Plus(m,Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),And(LessEqual(CN1,p),Less(p,C0))),Greater(m,C1)),NonzeroQ(Plus(m,Times(C2,p),C1))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(b,pn,Power(Times(C2,c,Sqrt(pd),Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(CN1,Plus(m,Times(CN1,C1)),Power(Times(C2,pe,Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Less(p,CN1)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(CN1,b,pn,Power(Times(C2,c,Sqrt(pd),Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(CN1,Plus(m,Times(CN1,C1)),Power(Times(C2,pe,Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Less(p,CN1)),Greater(m,C1)))),
ISetDelayed(Int(Times(ArcSin(Times(c_DEFAULT,x_)),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),x_),CN1)),x_Symbol),
    Condition(Plus(Times(CN2,CI,ArcSin(Times(c,x)),ArcTan(Plus(Times(c,x),Times(CN1,CI,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))))),Power(pd,CN1D2)),Times(CI,PolyLog(C2,Plus(Times(CN1,CI,c,x),Times(CN1,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))))),Power(pd,CN1D2)),Times(CN1,CI,PolyLog(C2,Plus(Times(CI,c,x),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))))),Power(pd,CN1D2))),And(And(FreeQ(List(c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)))),
ISetDelayed(Int(Times(ArcCos(Times(c_DEFAULT,x_)),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),x_),CN1)),x_Symbol),
    Condition(Plus(Times(C2,CI,ArcCos(Times(c,x)),ArcTan(Plus(Times(c,x),Times(CI,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))))),Power(pd,CN1D2)),Times(CN1,CI,PolyLog(C2,Plus(Times(CN1,CI,c,x),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))))),Power(pd,CN1D2)),Times(CI,PolyLog(C2,Plus(Times(CI,c,x),Times(CN1,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))))),Power(pd,CN1D2))),And(And(FreeQ(List(c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)))),
ISetDelayed(Int(Times(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),x_),CN1)),x_Symbol),
    Condition(Plus(Times(a,Int(Power(Times(x,Sqrt(Plus(pd,Times(pe,Sqr(x))))),CN1),x)),Times(b,Int(Times(ArcSin(Times(c,x)),Power(Times(x,Sqrt(Plus(pd,Times(pe,Sqr(x))))),CN1)),x))),And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)))),
ISetDelayed(Int(Times(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),x_),CN1)),x_Symbol),
    Condition(Plus(Times(a,Int(Power(Times(x,Sqrt(Plus(pd,Times(pe,Sqr(x))))),CN1),x)),Times(b,Int(Times(ArcCos(Times(c,x)),Power(Times(x,Sqrt(Plus(pd,Times(pe,Sqr(x))))),CN1)),x))),And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,CN1)),x_Symbol),
    Condition(Plus(Times(Sqr(c),Int(Times(x,Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x)),Times(Power(pd,CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn),Power(x,CN1)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(pn)),Greater(pn,C0)),Less(p,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,CN1)),x_Symbol),
    Condition(Plus(Times(Sqr(c),Int(Times(x,Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x)),Times(Power(pd,CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn),Power(x,CN1)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(pn)),Greater(pn,C0)),Less(p,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn),Power(Times(pd,Plus(m,C1)),CN1)),Times(CN1,b,c,pn,Power(Times(Sqrt(pd),Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(Sqr(c),Plus(m,Times(C2,p),C3),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Less(p,C0)),Less(m,CN1)),Unequal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn),Power(Times(pd,Plus(m,C1)),CN1)),Times(b,c,pn,Power(Times(Sqrt(pd),Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(Sqr(c),Plus(m,Times(C2,p),C3),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Less(p,C0)),Less(m,CN1)),Unequal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1D2),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1)),Times(CN1,m,Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1D2),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,m),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1)),Times(m,Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1)),Times(CN1,pd,m,Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Less(pn,CN1)),Equal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1)),Times(pd,m,Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Less(pn,CN1)),Equal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1)),Times(CN1,pd,m,Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,C1))),x)),Times(CN1,pe,Plus(m,Times(C2,p),C1),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1)),Times(pd,m,Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,C1))),x)),Times(pe,Plus(m,Times(C2,p),C1),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(pd,CN1),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x)),Times(CN1,pe,Power(pd,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),NegativeIntegerQ(Plus(p,C1D2))),PositiveQ(pd)),NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(pd,CN1),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x)),Times(CN1,pe,Power(pd,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),NegativeIntegerQ(Plus(p,C1D2))),PositiveQ(pd)),NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1D2),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(Power(c,Plus(m,C1)),Sqrt(pd)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Sin(x),m)),x),x,ArcSin(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)),IntegerQ(m)),Or(Greater(m,C0),PositiveIntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1D2),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(Times(Power(c,Plus(m,C1)),Sqrt(pd)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Cos(x),m)),x),x,ArcCos(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)),IntegerQ(m)),Or(Greater(m,C0),PositiveIntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,p),Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Sin(x),m),Power(Cos(x),Plus(Times(C2,p),C1))),x),x,ArcSin(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(Times(C2,p))),PositiveQ(pd)),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(pd,p),Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Cos(x),m),Power(Sin(x),Plus(Times(C2,p),C1))),x),x,ArcCos(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(Times(C2,p))),PositiveQ(pd)),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2))),x),x),And(And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(Plus(p,C1D2))),PositiveQ(pd)),Not(PositiveIntegerQ(Times(C1D2,Plus(m,C1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2))),x),x),And(And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(Plus(p,C1D2))),PositiveQ(pd)),Not(PositiveIntegerQ(Times(C1D2,Plus(m,C1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,p),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(p)),Not(PositiveQ(pd))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,p),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),IntegerQ(p)),Not(PositiveQ(pd))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(pd,Times(pe,Sqr(x)))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),pn)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(Plus(p,C1D2))),Not(PositiveQ(pd))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(pd,Times(pe,Sqr(x)))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),pn)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(Plus(p,C1D2))),Not(PositiveQ(pd)))))
  );
}
