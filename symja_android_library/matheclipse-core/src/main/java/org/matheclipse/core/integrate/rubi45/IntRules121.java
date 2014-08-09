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
public class IntRules121 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),CN1)),x_Symbol),
    Condition(Plus(Times(a,Int(Power(Plus(pd,Times(pe,Sqr(x))),CN1),x)),Times(b,Int(Times(ArcTanh(Times(c,x)),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),FreeQ(List(a,b,c,pd,pe),x))),
ISetDelayed(Int(Times(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),CN1)),x_Symbol),
    Condition(Plus(Times(a,Int(Power(Plus(pd,Times(pe,Sqr(x))),CN1),x)),Times(b,Int(Times(ArcCoth(Times(c,x)),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),FreeQ(List(a,b,c,pd,pe),x))),
ISetDelayed(Int(Times(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Power(Plus(pd,Times(pe,Sqr(x))),p),x)))),Plus(Dist(Plus(a,Times(b,ArcTanh(Times(c,x)))),u,x),Times(CN1,b,c,Int(ExpandIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1)),x),x)))),And(FreeQ(List(a,b,c,pd,pe),x),Or(IntegerQ(p),NegativeIntegerQ(Plus(p,C1D2)))))),
ISetDelayed(Int(Times(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Power(Plus(pd,Times(pe,Sqr(x))),p),x)))),Plus(Dist(Plus(a,Times(b,ArcCoth(Times(c,x)))),u,x),Times(CN1,b,c,Int(ExpandIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1)),x),x)))),And(FreeQ(List(a,b,c,pd,pe),x),Or(IntegerQ(p),NegativeIntegerQ(Plus(p,C1D2)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn)),x),x),And(And(FreeQ(List(a,b,c,pd,pe),x),IntegerQ(p)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn)),x),x),And(And(FreeQ(List(a,b,c,pd,pe),x),IntegerQ(p)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,pn,p),x))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,pn,p),x))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn)),x)),Times(CN1,pd,Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),RationalQ(m,pn)),Greater(pn,C0)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn)),x)),Times(CN1,pd,Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),RationalQ(m,pn)),Greater(pn,C0)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pd,CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn)),x)),Times(CN1,pe,Power(pd,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),RationalQ(m,pn)),Greater(pn,C0)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pd,CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn)),x)),Times(CN1,pe,Power(pd,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),RationalQ(m,pn)),Greater(pn,C0)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),x_),x_Symbol),
    Condition(Plus(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,pe,Plus(pn,C1)),CN1)),Times(Power(Times(c,pd),CN1),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Plus(C1,Times(CN1,c,x)),CN1)),x))),And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),x_),x_Symbol),
    Condition(Plus(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C1)),Power(Times(b,pe,Plus(pn,C1)),CN1)),Times(Power(Times(c,pd),CN1),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Plus(C1,Times(CN1,c,x)),CN1)),x))),And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),x_),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1)),CN1)),Times(CN1,Power(Times(b,c,pd,Plus(pn,C1)),CN1),Int(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),Not(PositiveIntegerQ(pn))),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),x_),x_Symbol),
    Condition(Plus(Times(CN1,x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1)),CN1)),Times(CN1,Power(Times(b,c,pd,Plus(pn,C1)),CN1),Int(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),Not(PositiveIntegerQ(pn))),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn)),x)),Times(CN1,pd,Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(m,pn)),Greater(pn,C0)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn)),x)),Times(CN1,pd,Power(pe,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(m,pn)),Greater(pn,C0)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Times(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),x_),CN1)),x_Symbol),
    Condition(Plus(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(Power(pd,CN1),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Times(x,Plus(C1,Times(c,x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Greater(pn,C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Times(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),x_),CN1)),x_Symbol),
    Condition(Plus(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(Power(pd,CN1),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Times(x,Plus(C1,Times(c,x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Greater(pn,C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pd,CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn)),x)),Times(CN1,pe,Power(pd,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(m,pn)),Greater(pn,C0)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(pd,CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn)),x)),Times(CN1,pe,Power(pd,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(m,pn)),Greater(pn,C0)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1)),CN1)),Times(CN1,m,Power(Times(b,c,pd,Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1)),CN1)),Times(CN1,m,Power(Times(b,c,pd,Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Plus(a,Times(b,ArcTanh(Times(c,x)))),Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x),x),And(And(FreeQ(List(a,b,c,pd,pe),x),IntegerQ(m)),Not(And(Equal(m,C1),NonzeroQ(a)))))),
ISetDelayed(Int(Times(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Plus(a,Times(b,ArcCoth(Times(c,x)))),Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x),x),And(And(FreeQ(List(a,b,c,pd,pe),x),IntegerQ(m)),Not(And(Equal(m,C1),NonzeroQ(a)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),x_),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(b,pn,Power(Times(C2,c,Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,p),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Greater(pn,C0)),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),x_),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(b,pn,Power(Times(C2,c,Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,p),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Greater(pn,C0)),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN2),x_),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1),Plus(pd,Times(pe,Sqr(x)))),CN1)),Times(Plus(C1,Times(Sqr(c),Sqr(x))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C2)),Power(Times(Sqr(b),pe,Plus(pn,C1),Plus(pn,C2),Plus(pd,Times(pe,Sqr(x)))),CN1)),Times(C4,Power(Times(Sqr(b),Plus(pn,C1),Plus(pn,C2)),CN1),Int(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C2)),Power(Plus(pd,Times(pe,Sqr(x))),CN2)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Less(pn,CN1)),Unequal(pn,CN2)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN2),x_),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1),Plus(pd,Times(pe,Sqr(x)))),CN1)),Times(Plus(C1,Times(Sqr(c),Sqr(x))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C2)),Power(Times(Sqr(b),pe,Plus(pn,C1),Plus(pn,C2),Plus(pd,Times(pe,Sqr(x)))),CN1)),Times(C4,Power(Times(Sqr(b),Plus(pn,C1),Plus(pn,C2)),CN1),Int(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C2)),Power(Plus(pd,Times(pe,Sqr(x))),CN2)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Less(pn,CN1)),Unequal(pn,CN2)))),
ISetDelayed(Int(Times(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Sqr(x_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Times(C4,Power(c,C3),pd,Sqr(Plus(p,C1))),CN1)),Times(CN1,x,Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(C2,Sqr(c),pd,Plus(p,C1)),CN1)),Times(Power(Times(C2,Sqr(c),pd,Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcTanh(Times(c,x))))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(p)),Less(p,CN1)),Unequal(p,QQ(-5L,2L))))),
ISetDelayed(Int(Times(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Sqr(x_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Times(C4,Power(c,C3),pd,Sqr(Plus(p,C1))),CN1)),Times(CN1,x,Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(C2,Sqr(c),pd,Plus(p,C1)),CN1)),Times(Power(Times(C2,Sqr(c),pd,Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCoth(Times(c,x))))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(p)),Less(p,CN1)),Unequal(p,QQ(-5L,2L))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN2),Sqr(x_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C1)),Power(Times(C2,b,Power(c,C3),Sqr(pd),Plus(pn,C1)),CN1)),Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Times(C2,Sqr(c),pd,Plus(pd,Times(pe,Sqr(x)))),CN1)),Times(CN1,b,pn,Power(Times(C2,c),CN1),Int(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),CN2)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Greater(pn,C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN2),Sqr(x_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C1)),Power(Times(C2,b,Power(c,C3),Sqr(pd),Plus(pn,C1)),CN1)),Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Times(C2,Sqr(c),pd,Plus(pd,Times(pe,Sqr(x)))),CN1)),Times(CN1,b,pn,Power(Times(C2,c),CN1),Int(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),CN2)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Greater(pn,C0)))),
ISetDelayed(Int(Times(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Times(c,pd,Sqr(m)),CN1)),Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(Sqr(c),pd,m),CN1)),Times(CN1,Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),pd,m),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcTanh(Times(c,x))))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),ZeroQ(Plus(m,Times(C2,p),C2))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Times(c,pd,Sqr(m)),CN1)),Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(Sqr(c),pd,m),CN1)),Times(CN1,Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),pd,m),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCoth(Times(c,x))))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),ZeroQ(Plus(m,Times(C2,p),C2))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(CN1,b,pn,Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Times(c,pd,Sqr(m)),CN1)),Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Times(Sqr(c),pd,m),CN1)),Times(Sqr(b),pn,Plus(pn,Times(CN1,C1)),Power(m,CN2),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,Times(CN1,C2)))),x)),Times(CN1,Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),pd,m),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),ZeroQ(Plus(m,Times(C2,p),C2))),RationalQ(pn,p)),Less(p,CN1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(CN1,b,pn,Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Times(c,pd,Sqr(m)),CN1)),Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Times(Sqr(c),pd,m),CN1)),Times(Sqr(b),pn,Plus(pn,Times(CN1,C1)),Power(m,CN2),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,Times(CN1,C2)))),x)),Times(CN1,Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),pd,m),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),ZeroQ(Plus(m,Times(C2,p),C2))),RationalQ(pn,p)),Less(p,CN1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1)),CN1)),Times(CN1,m,Power(Times(b,c,Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,m,p),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),ZeroQ(Plus(m,Times(C2,p),C2))),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1)),CN1)),Times(CN1,m,Power(Times(b,c,Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,m,p),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),ZeroQ(Plus(m,Times(C2,p),C2))),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Times(pd,Plus(m,C1)),CN1)),Times(CN1,b,c,pn,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,m,p),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),ZeroQ(Plus(m,Times(C2,p),C3))),RationalQ(pn)),Greater(pn,C0)),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Times(pd,Plus(m,C1)),CN1)),Times(CN1,b,c,pn,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,m,p),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),ZeroQ(Plus(m,Times(C2,p),C3))),RationalQ(pn)),Greater(pn,C0)),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Sqrt(Plus(pd,Times(pe,Sqr(x)))),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Plus(m,C2),CN1)),Times(CN1,b,c,pd,Power(Plus(m,C2),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x)),Times(pd,Power(Plus(m,C2),CN1),Int(Times(Power(x,m),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x))),And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),NonzeroQ(Plus(m,C2))))),
ISetDelayed(Int(Times(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Sqrt(Plus(pd,Times(pe,Sqr(x)))),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Plus(m,C2),CN1)),Times(CN1,b,c,pd,Power(Plus(m,C2),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x)),Times(pd,Power(Plus(m,C2),CN1),Int(Times(Power(x,m),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x))),And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),NonzeroQ(Plus(m,C2))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn)),x),x),And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(pn)),IntegerQ(p)),Greater(p,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_),Power(x_,m_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn)),x),x),And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(pn)),IntegerQ(p)),Greater(p,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(pd,Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn)),x)),Times(CN1,Sqr(c),pd,Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(p)),Greater(p,C0)),PositiveIntegerQ(pn)),Or(RationalQ(m),And(OneQ(pn),IntegerQ(p)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),p_DEFAULT),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(pd,Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn)),x)),Times(CN1,Sqr(c),pd,Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(p)),Greater(p,C0)),PositiveIntegerQ(pn)),Or(RationalQ(m),And(OneQ(pn),IntegerQ(p)))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1D2),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(m,Times(CN1,C1))),Sqrt(Plus(pd,Times(pe,Sqr(x)))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Times(Sqr(c),pd,m),CN1)),Times(b,pn,Power(Times(c,m),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x)),Times(Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),m),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(m,pn)),Greater(pn,C0)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1D2),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(m,Times(CN1,C1))),Sqrt(Plus(pd,Times(pe,Sqr(x)))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Times(Sqr(c),pd,m),CN1)),Times(b,pn,Power(Times(c,m),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x)),Times(Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),m),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(m,pn)),Greater(pn,C0)),Greater(m,C1)))),
ISetDelayed(Int(Times(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),x_),CN1)),x_Symbol),
    Condition(Plus(Times(CN2,Power(pd,CN1D2),Plus(a,Times(b,ArcTanh(Times(c,x)))),ArcTanh(Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2)))),Times(b,Power(pd,CN1D2),PolyLog(C2,Times(CN1,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2)))),Times(CN1,b,Power(pd,CN1D2),PolyLog(C2,Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))))),And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)))),
ISetDelayed(Int(Times(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),x_),CN1)),x_Symbol),
    Condition(Plus(Times(CN2,Power(pd,CN1D2),Plus(a,Times(b,ArcCoth(Times(c,x)))),ArcTanh(Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2)))),Times(b,Power(pd,CN1D2),PolyLog(C2,Times(CN1,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2)))),Times(CN1,b,Power(pd,CN1D2),PolyLog(C2,Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))))),And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveQ(pd)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),x_),CN1)),x_Symbol),
    Condition(Times(Power(pd,CN1D2),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Csch(x)),x),x,ArcTanh(Times(c,x)))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(pn)),PositiveQ(pd)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),x_),CN1)),x_Symbol),
    Condition(Times(CN1,c,x,Sqrt(Plus(C1,Times(CN1,Power(Times(Sqr(c),Sqr(x)),CN1)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Sech(x)),x),x,ArcCoth(Times(c,x)))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(pn)),PositiveQ(pd)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),x_),CN1)),x_Symbol),
    Condition(Times(Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Times(x,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))),CN1)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(pn)),Not(PositiveQ(pd))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),x_),CN1)),x_Symbol),
    Condition(Times(Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Times(x,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))),CN1)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),PositiveIntegerQ(pn)),Not(PositiveQ(pd))))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),Sqr(x_)),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,Sqrt(Plus(pd,Times(pe,Sqr(x)))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Times(pd,x),CN1)),Times(b,c,pn,Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Times(x,Sqrt(Plus(pd,Times(pe,Sqr(x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Greater(pn,C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Times(Sqrt(Plus(Times(Sqr(x_),pe_DEFAULT),pd_)),Sqr(x_)),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,Sqrt(Plus(pd,Times(pe,Sqr(x)))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Times(pd,x),CN1)),Times(b,c,pn,Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Times(x,Sqrt(Plus(pd,Times(pe,Sqr(x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(pn)),Greater(pn,C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1D2),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Sqrt(Plus(pd,Times(pe,Sqr(x)))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Times(pd,Plus(m,C1)),CN1)),Times(CN1,b,c,pn,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x)),Times(Sqr(c),Plus(m,C2),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(m,pn)),Greater(pn,C0)),Less(m,CN1)),Unequal(m,CN2)))),
ISetDelayed(Int(Times(Power(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),CN1D2),Power(x_,m_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Sqrt(Plus(pd,Times(pe,Sqr(x)))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Times(pd,Plus(m,C1)),CN1)),Times(CN1,b,c,pn,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x)),Times(Sqr(c),Plus(m,C2),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Times(Sqr(c),pd),pe))),RationalQ(m,pn)),Greater(pn,C0)),Less(m,CN1)),Unequal(m,CN2))))
  );
}
