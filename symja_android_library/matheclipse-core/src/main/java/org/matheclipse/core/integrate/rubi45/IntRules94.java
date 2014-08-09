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
public class IntRules94 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT)),Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT))),x_Symbol),
    Condition(Plus(Times(b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Sin(Plus(pd,Times(pe,x))),Power(Plus(Sqr(pe),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(CN1,pe,Power(pf,Times(c,Plus(a,Times(b,x)))),Cos(Plus(pd,Times(pe,x))),Power(Plus(Sqr(pe),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1))),And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Sqr(pe),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))))),
ISetDelayed(Int(Times(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Cos(Plus(pd,Times(pe,x))),Power(Plus(Sqr(pe),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(pe,Power(pf,Times(c,Plus(a,Times(b,x)))),Sin(Plus(pd,Times(pe,x))),Power(Plus(Sqr(pe),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1))),And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Sqr(pe),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))))),
ISetDelayed(Int(Times(Power(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(pd,Times(pe,x))),pn),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(CN1,pe,pn,Power(pf,Times(c,Plus(a,Times(b,x)))),Cos(Plus(pd,Times(pe,x))),Power(Sin(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(pn,Plus(pn,Times(CN1,C1)),Sqr(pe),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(pd,Times(pe,x))),m),Power(Plus(Times(Sqr(pe),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(pe,m,Power(pf,Times(c,Plus(a,Times(b,x)))),Sin(Plus(pd,Times(pe,x))),Power(Cos(Plus(pd,Times(pe,x))),Plus(m,Times(CN1,C1))),Power(Plus(Times(Sqr(pe),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(m,Plus(m,Times(CN1,C1)),Sqr(pe),Power(Plus(Times(Sqr(pe),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(pd,Times(pe,x))),Plus(m,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(pd,Times(pe,x))),Plus(pn,C2)),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1)),Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Cos(Plus(pd,Times(pe,x))),Power(Sin(Plus(pd,Times(pe,x))),Plus(pn,C1)),Power(Times(pe,Plus(pn,C1)),CN1))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))),NonzeroQ(Plus(pn,C1))),NonzeroQ(Plus(pn,C2))))),
ISetDelayed(Int(Times(Power(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(pd,Times(pe,x))),Plus(pn,C2)),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1)),Times(CN1,Power(pf,Times(c,Plus(a,Times(b,x)))),Sin(Plus(pd,Times(pe,x))),Power(Cos(Plus(pd,Times(pe,x))),Plus(pn,C1)),Power(Times(pe,Plus(pn,C1)),CN1))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))),NonzeroQ(Plus(pn,C1))),NonzeroQ(Plus(pn,C2))))),
ISetDelayed(Int(Times(Power(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(pd,Times(pe,x))),Plus(pn,C2)),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1)),Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Cos(Plus(pd,Times(pe,x))),Power(Sin(Plus(pd,Times(pe,x))),Plus(pn,C1)),Power(Times(pe,Plus(pn,C1)),CN1)),Times(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(pd,Times(pe,x))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Less(pn,CN1)),Unequal(pn,CN2)))),
ISetDelayed(Int(Times(Power(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(pd,Times(pe,x))),Plus(pn,C2)),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1)),Times(CN1,Power(pf,Times(c,Plus(a,Times(b,x)))),Sin(Plus(pd,Times(pe,x))),Power(Cos(Plus(pd,Times(pe,x))),Plus(pn,C1)),Power(Times(pe,Plus(pn,C1)),CN1)),Times(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(pd,Times(pe,x))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Less(pn,CN1)),Unequal(pn,CN2)))),
ISetDelayed(Int(Times(Power(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(E,Times(CI,pn,Plus(pd,Times(pe,x)))),Power(Sin(Plus(pd,Times(pe,x))),pn),Power(Power(Plus(CN1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x))))),pn),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(CN1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x))))),pn),Power(Power(E,Times(CI,pn,Plus(pd,Times(pe,x)))),CN1)),x)),And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(E,Times(CI,pn,Plus(pd,Times(pe,x)))),Power(Cos(Plus(pd,Times(pe,x))),pn),Power(Power(Plus(C1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x))))),pn),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x))))),pn),Power(Power(E,Times(CI,pn,Plus(pd,Times(pe,x)))),CN1)),x)),And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Tan(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(CI,pn),Int(ExpandIntegrand(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Times(CN1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x)))))),pn),Power(Power(Plus(C1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x))))),pn),CN1)),x),x)),And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cot(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(Times(CN1,CI),pn),Int(ExpandIntegrand(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x))))),pn),Power(Power(Plus(C1,Times(CN1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x)))))),pn),CN1)),x),x)),And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Sec(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(pd,Times(pe,x))),pn),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(CN1,pe,pn,Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(pd,Times(pe,x))),Plus(pn,C1)),Sin(Plus(pd,Times(pe,x))),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(Sqr(pe),pn,Plus(pn,C1),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(pd,Times(pe,x))),Plus(pn,C2))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Csc(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(pd,Times(pe,x))),pn),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(pe,pn,Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(pd,Times(pe,x))),Plus(pn,C1)),Cos(Plus(pd,Times(pe,x))),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(Sqr(pe),pn,Plus(pn,C1),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(pd,Times(pe,x))),Plus(pn,C2))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Sec(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1)),Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Sin(Plus(pd,Times(pe,x))),Power(Times(pe,Plus(pn,Times(CN1,C1))),CN1))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log(pf))),Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2))))))),NonzeroQ(Plus(pn,Times(CN1,C1)))),NonzeroQ(Plus(pn,Times(CN1,C2)))))),
ISetDelayed(Int(Times(Power(Csc(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1)),Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Cos(Plus(pd,Times(pe,x))),Power(Times(pe,Plus(pn,Times(CN1,C1))),CN1))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log(pf))),Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2))))))),NonzeroQ(Plus(pn,Times(CN1,C1)))),NonzeroQ(Plus(pn,Times(CN1,C2)))))),
ISetDelayed(Int(Times(Power(Sec(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1)),Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Sin(Plus(pd,Times(pe,x))),Power(Times(pe,Plus(pn,Times(CN1,C1))),CN1)),Times(Plus(Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2)))),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log(pf))),Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2))))))),RationalQ(pn)),Greater(pn,C1)),Unequal(pn,C2)))),
ISetDelayed(Int(Times(Power(Csc(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1)),Times(CN1,Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Cos(Plus(pd,Times(pe,x))),Power(Times(pe,Plus(pn,Times(CN1,C1))),CN1)),Times(Plus(Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2)))),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log(pf))),Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2))))))),RationalQ(pn)),Greater(pn,C1)),Unequal(pn,C2)))),
ISetDelayed(Int(Times(Power(Sec(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(C2,pn),Power(E,Times(CI,pn,Plus(pd,Times(pe,x)))),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(Times(CI,pe,pn),Times(b,c,Log(pf))),CN1),Hypergeometric2F1(pn,Plus(Times(C1D2,pn),Times(CN1,CI,b,c,Log(pf),Power(Times(C2,pe),CN1))),Plus(C1,Times(C1D2,pn),Times(CN1,CI,b,c,Log(pf),Power(Times(C2,pe),CN1))),Times(CN1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x))))))),And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Csc(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(Times(CN2,CI),pn),Power(E,Times(CI,pn,Plus(pd,Times(pe,x)))),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(Times(CI,pe,pn),Times(b,c,Log(pf))),CN1),Hypergeometric2F1(pn,Plus(Times(C1D2,pn),Times(CN1,CI,b,c,Log(pf),Power(Times(C2,pe),CN1))),Plus(C1,Times(C1D2,pn),Times(CN1,CI,b,c,Log(pf),Power(Times(C2,pe),CN1))),Power(E,Times(C2,CI,Plus(pd,Times(pe,x)))))),And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Sec(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(Plus(C1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x))))),pn),Power(Sec(Plus(pd,Times(pe,x))),pn),Power(Power(E,Times(CI,pn,Plus(pd,Times(pe,x)))),CN1),Int(SimplifyIntegrand(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(E,Times(CI,pn,Plus(pd,Times(pe,x)))),Power(Power(Plus(C1,Power(E,Times(C2,CI,Plus(pd,Times(pe,x))))),pn),CN1)),x),x)),And(FreeQ(List(pf,a,b,c,pd,pe),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Csc(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(Plus(C1,Times(CN1,Power(E,Times(CN2,CI,Plus(pd,Times(pe,x)))))),pn),Power(Csc(Plus(pd,Times(pe,x))),pn),Power(Power(E,Times(CN1,CI,pn,Plus(pd,Times(pe,x)))),CN1),Int(SimplifyIntegrand(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(E,Times(CN1,CI,pn,Plus(pd,Times(pe,x)))),Power(Power(Plus(C1,Times(CN1,Power(E,Times(CN2,CI,Plus(pd,Times(pe,x)))))),pn),CN1)),x),x)),And(FreeQ(List(pf,a,b,c,pd,pe),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(C2,pn),Power(f,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(Times(C1D2,pd),Times(pe,C1D2,x),Times(CN1,f,Pi,Power(Times(C4,g),CN1)))),Times(C2,pn))),x)),And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(Sqr(f),Times(CN1,Sqr(g))))),NegativeIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(C2,pn),Power(f,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(Times(C1D2,pd),Times(pe,C1D2,x))),Times(C2,pn))),x)),And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(f,Times(CN1,g)))),NegativeIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(C2,pn),Power(f,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(Times(C1D2,pd),Times(pe,C1D2,x))),Times(C2,pn))),x)),And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(f,g))),NegativeIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power(Plus(Times(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(g,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Tan(Plus(Times(f,Pi,Power(Times(C4,g),CN1)),Times(CN1,C1D2,pd),Times(CN1,pe,C1D2,x))),m)),x)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(Sqr(f),Times(CN1,Sqr(g))))),IntegersQ(m,pn)),Equal(Plus(m,pn),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(f,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Tan(Plus(Times(C1D2,pd),Times(pe,C1D2,x))),m)),x)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(f,Times(CN1,g)))),IntegersQ(m,pn)),Equal(Plus(m,pn),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(f,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cot(Plus(Times(C1D2,pd),Times(pe,C1D2,x))),m)),x)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(f,g))),IntegersQ(m,pn)),Equal(Plus(m,pn),C0)))),
ISetDelayed(Int(Times(Plus(Times(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pi_DEFAULT),h_),Power(Plus(Times(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),CN1),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(C2,pi,Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Cos(Plus(pd,Times(pe,x))),Power(Plus(f,Times(g,Sin(Plus(pd,Times(pe,x))))),CN1)),x)),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Plus(h,Times(CN1,pi,Cos(Plus(pd,Times(pe,x))))),Power(Plus(f,Times(g,Sin(Plus(pd,Times(pe,x))))),CN1)),x)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h,pi),x),ZeroQ(Plus(Sqr(f),Times(CN1,Sqr(g))))),ZeroQ(Plus(Sqr(h),Times(CN1,Sqr(pi))))),ZeroQ(Plus(Times(g,h),Times(CN1,f,pi)))))),
ISetDelayed(Int(Times(Plus(Times(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pi_DEFAULT),h_),Power(Plus(Times(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),CN1),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(C2,pi,Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Sin(Plus(pd,Times(pe,x))),Power(Plus(f,Times(g,Cos(Plus(pd,Times(pe,x))))),CN1)),x)),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Plus(h,Times(CN1,pi,Sin(Plus(pd,Times(pe,x))))),Power(Plus(f,Times(g,Cos(Plus(pd,Times(pe,x))))),CN1)),x)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h,pi),x),ZeroQ(Plus(Sqr(f),Times(CN1,Sqr(g))))),ZeroQ(Plus(Sqr(h),Times(CN1,Sqr(pi))))),ZeroQ(Plus(Times(g,h),Times(f,pi)))))),
ISetDelayed(Int(Times(Power($(pg_,v_),pn_DEFAULT),Power(pf_,Times(c_DEFAULT,u_))),x_Symbol),
    Condition(Int(Times(Power(pf,Times(c,ExpandToSum(u,x))),Power($(pg,ExpandToSum(v,x)),pn)),x),And(And(And(FreeQ(List(pf,c,pn),x),TrigQ(pg)),LinearQ(List(u,v),x)),Not(LinearMatchQ(List(u,v),x))))),
ISetDelayed(Int(Times(Power(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(x_,m_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(pd,Times(pe,x))),pn)),x)))),Plus(Dist(Power(x,m),u,x),Times(CN1,m,Int(Times(Power(x,Plus(m,Times(CN1,C1))),u),x)))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),RationalQ(m)),Greater(m,C0)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cos(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(x_,m_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(pd,Times(pe,x))),pn)),x)))),Plus(Dist(Power(x,m),u,x),Times(CN1,m,Int(Times(Power(x,Plus(m,Times(CN1,C1))),u),x)))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),RationalQ(m)),Greater(m,C0)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cos(Plus(Times(g_DEFAULT,x_),f_DEFAULT)),pn_DEFAULT),Power(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(pf,Times(c,Plus(a,Times(b,x)))),Times(Power(Sin(Plus(pd,Times(pe,x))),m),Power(Cos(Plus(f,Times(g,x))),pn)),x),x),And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),PositiveIntegerQ(m,pn)))),
ISetDelayed(Int(Times(Power(Cos(Plus(Times(g_DEFAULT,x_),f_DEFAULT)),pn_DEFAULT),Power(Sin(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power(x_,p_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Int(ExpandTrigReduce(Times(Power(x,p),Power(pf,Times(c,Plus(a,Times(b,x))))),Times(Power(Sin(Plus(pd,Times(pe,x))),m),Power(Cos(Plus(f,Times(g,x))),pn)),x),x),And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),PositiveIntegerQ(m,pn,p)))),
ISetDelayed(Int(Times(Power($(pg_,Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power($(ph_,Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power(pf,Times(c,Plus(a,Times(b,x)))),Times(Power($(pg,Plus(pd,Times(pe,x))),m),Power($(ph,Plus(pd,Times(pe,x))),pn)),x),x),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),PositiveIntegerQ(m,pn)),TrigQ(pg)),TrigQ(ph)))),
ISetDelayed(Int(Times(Power(Sin(v_),pn_DEFAULT),Power(pf_,u_)),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power(pf,u),Power(Sin(v),pn),x),x),And(And(And(FreeQ(pf,x),Or(LinearQ(u,x),QuadraticQ(u,x))),Or(LinearQ(v,x),QuadraticQ(v,x))),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cos(v_),pn_DEFAULT),Power(pf_,u_)),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power(pf,u),Power(Cos(v),pn),x),x),And(And(And(FreeQ(pf,x),Or(LinearQ(u,x),QuadraticQ(u,x))),Or(LinearQ(v,x),QuadraticQ(v,x))),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cos(v_),pn_DEFAULT),Power(Sin(v_),m_DEFAULT),Power(pf_,u_)),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power(pf,u),Times(Power(Sin(v),m),Power(Cos(v),pn)),x),x),And(And(And(FreeQ(pf,x),Or(LinearQ(u,x),QuadraticQ(u,x))),Or(LinearQ(v,x),QuadraticQ(v,x))),PositiveIntegerQ(m,pn))))
  );
}
