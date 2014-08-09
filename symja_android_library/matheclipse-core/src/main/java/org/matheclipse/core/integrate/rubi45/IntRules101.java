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
public class IntRules101 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT)),Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Sinh(Plus(pd,Times(pe,x))),Power(Plus(Sqr(pe),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(pe,Power(pf,Times(c,Plus(a,Times(b,x)))),Cosh(Plus(pd,Times(pe,x))),Power(Plus(Sqr(pe),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1))),And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Sqr(pe),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))))),
ISetDelayed(Int(Times(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Cosh(Plus(pd,Times(pe,x))),Power(Plus(Sqr(pe),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(pe,Power(pf,Times(c,Plus(a,Times(b,x)))),Sinh(Plus(pd,Times(pe,x))),Power(Plus(Sqr(pe),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1))),And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Sqr(pe),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))))),
ISetDelayed(Int(Times(Power(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sinh(Plus(pd,Times(pe,x))),pn),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(pe,pn,Power(pf,Times(c,Plus(a,Times(b,x)))),Cosh(Plus(pd,Times(pe,x))),Power(Sinh(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(CN1,pn,Plus(pn,Times(CN1,C1)),Sqr(pe),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sinh(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cosh(Plus(pd,Times(pe,x))),pn),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(pe,pn,Power(pf,Times(c,Plus(a,Times(b,x)))),Sinh(Plus(pd,Times(pe,x))),Power(Cosh(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(pn,Plus(pn,Times(CN1,C1)),Sqr(pe),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cosh(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sinh(Plus(pd,Times(pe,x))),Plus(pn,C2)),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1)),Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Cosh(Plus(pd,Times(pe,x))),Power(Sinh(Plus(pd,Times(pe,x))),Plus(pn,C1)),Power(Times(pe,Plus(pn,C1)),CN1))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))),NonzeroQ(Plus(pn,C1))),NonzeroQ(Plus(pn,C2))))),
ISetDelayed(Int(Times(Power(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cosh(Plus(pd,Times(pe,x))),Plus(pn,C2)),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1)),Times(CN1,Power(pf,Times(c,Plus(a,Times(b,x)))),Sinh(Plus(pd,Times(pe,x))),Power(Cosh(Plus(pd,Times(pe,x))),Plus(pn,C1)),Power(Times(pe,Plus(pn,C1)),CN1))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))),NonzeroQ(Plus(pn,C1))),NonzeroQ(Plus(pn,C2))))),
ISetDelayed(Int(Times(Power(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sinh(Plus(pd,Times(pe,x))),Plus(pn,C2)),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1)),Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Cosh(Plus(pd,Times(pe,x))),Power(Sinh(Plus(pd,Times(pe,x))),Plus(pn,C1)),Power(Times(pe,Plus(pn,C1)),CN1)),Times(CN1,Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sinh(Plus(pd,Times(pe,x))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Less(pn,CN1)),Unequal(pn,CN2)))),
ISetDelayed(Int(Times(Power(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cosh(Plus(pd,Times(pe,x))),Plus(pn,C2)),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1)),Times(CN1,Power(pf,Times(c,Plus(a,Times(b,x)))),Sinh(Plus(pd,Times(pe,x))),Power(Cosh(Plus(pd,Times(pe,x))),Plus(pn,C1)),Power(Times(pe,Plus(pn,C1)),CN1)),Times(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),Power(Times(Sqr(pe),Plus(pn,C1),Plus(pn,C2)),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cosh(Plus(pd,Times(pe,x))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,C2))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Less(pn,CN1)),Unequal(pn,CN2)))),
ISetDelayed(Int(Times(Power(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(E,Times(pn,Plus(pd,Times(pe,x)))),Power(Sinh(Plus(pd,Times(pe,x))),pn),Power(Power(Plus(CN1,Power(E,Times(C2,Plus(pd,Times(pe,x))))),pn),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(CN1,Power(E,Times(C2,Plus(pd,Times(pe,x))))),pn),Power(Power(E,Times(pn,Plus(pd,Times(pe,x)))),CN1)),x)),And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(E,Times(pn,Plus(pd,Times(pe,x)))),Power(Cosh(Plus(pd,Times(pe,x))),pn),Power(Power(Plus(C1,Power(E,Times(C2,Plus(pd,Times(pe,x))))),pn),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Power(E,Times(C2,Plus(pd,Times(pe,x))))),pn),Power(Power(E,Times(pn,Plus(pd,Times(pe,x)))),CN1)),x)),And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Tanh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(CN1,Power(E,Times(C2,Plus(pd,Times(pe,x))))),pn),Power(Power(Plus(C1,Power(E,Times(C2,Plus(pd,Times(pe,x))))),pn),CN1)),x),x),And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Coth(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Power(E,Times(C2,Plus(pd,Times(pe,x))))),pn),Power(Power(Plus(CN1,Power(E,Times(C2,Plus(pd,Times(pe,x))))),pn),CN1)),x),x),And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Sech(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sech(Plus(pd,Times(pe,x))),pn),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(CN1,pe,pn,Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sech(Plus(pd,Times(pe,x))),Plus(pn,C1)),Sinh(Plus(pd,Times(pe,x))),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(Sqr(pe),pn,Plus(pn,C1),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sech(Plus(pd,Times(pe,x))),Plus(pn,C2))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Csch(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csch(Plus(pd,Times(pe,x))),pn),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(CN1,pe,pn,Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csch(Plus(pd,Times(pe,x))),Plus(pn,C1)),Cosh(Plus(pd,Times(pe,x))),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1)),Times(CN1,Sqr(pe),pn,Plus(pn,C1),Power(Plus(Times(Sqr(pe),Sqr(pn)),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csch(Plus(pd,Times(pe,x))),Plus(pn,C2))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(pn)),Times(Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Sech(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sech(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1)),Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sech(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Sinh(Plus(pd,Times(pe,x))),Power(Times(pe,Plus(pn,Times(CN1,C1))),CN1))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2)))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))),NonzeroQ(Plus(pn,Times(CN1,C1)))),NonzeroQ(Plus(pn,Times(CN1,C2)))))),
ISetDelayed(Int(Times(Power(Csch(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csch(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1)),Times(CN1,Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csch(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Cosh(Plus(pd,Times(pe,x))),Power(Times(pe,Plus(pn,Times(CN1,C1))),CN1))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,pn),x),ZeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2)))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))),NonzeroQ(Plus(pn,Times(CN1,C1)))),NonzeroQ(Plus(pn,Times(CN1,C2)))))),
ISetDelayed(Int(Times(Power(Sech(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sech(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1)),Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sech(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Sinh(Plus(pd,Times(pe,x))),Power(Times(pe,Plus(pn,Times(CN1,C1))),CN1)),Times(Plus(Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2)))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sech(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2)))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Greater(pn,C1)),Unequal(pn,C2)))),
ISetDelayed(Int(Times(Power(Csch(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log(pf),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csch(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1)),Times(CN1,Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csch(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C1))),Cosh(Plus(pd,Times(pe,x))),Power(Times(pe,Plus(pn,Times(CN1,C1))),CN1)),Times(CN1,Plus(Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2)))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))),Power(Times(Sqr(pe),Plus(pn,Times(CN1,C1)),Plus(pn,Times(CN1,C2))),CN1),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Csch(Plus(pd,Times(pe,x))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(Sqr(pe),Sqr(Plus(pn,Times(CN1,C2)))),Times(CN1,Sqr(b),Sqr(c),Sqr(Log(pf)))))),RationalQ(pn)),Greater(pn,C1)),Unequal(pn,C2)))),
ISetDelayed(Int(Times(Power(Sech(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(C2,pn),Power(E,Times(pn,Plus(pd,Times(pe,x)))),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(Times(pe,pn),Times(b,c,Log(pf))),CN1),Hypergeometric2F1(pn,Plus(Times(C1D2,pn),Times(b,c,Log(pf),Power(Times(C2,pe),CN1))),Plus(C1,Times(C1D2,pn),Times(b,c,Log(pf),Power(Times(C2,pe),CN1))),Times(CN1,Power(E,Times(C2,Plus(pd,Times(pe,x))))))),And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Csch(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(CN2,pn),Power(E,Times(pn,Plus(pd,Times(pe,x)))),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Plus(Times(pe,pn),Times(b,c,Log(pf))),CN1),Hypergeometric2F1(pn,Plus(Times(C1D2,pn),Times(b,c,Log(pf),Power(Times(C2,pe),CN1))),Plus(C1,Times(C1D2,pn),Times(b,c,Log(pf),Power(Times(C2,pe),CN1))),Power(E,Times(C2,Plus(pd,Times(pe,x)))))),And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Sech(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(Plus(C1,Power(E,Times(C2,Plus(pd,Times(pe,x))))),pn),Power(Sech(Plus(pd,Times(pe,x))),pn),Power(Power(E,Times(pn,Plus(pd,Times(pe,x)))),CN1),Int(SimplifyIntegrand(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(E,Times(pn,Plus(pd,Times(pe,x)))),Power(Power(Plus(C1,Power(E,Times(C2,Plus(pd,Times(pe,x))))),pn),CN1)),x),x)),And(FreeQ(List(pf,a,b,c,pd,pe),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Csch(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(Plus(C1,Times(CN1,Power(E,Times(CN2,Plus(pd,Times(pe,x)))))),pn),Power(Csch(Plus(pd,Times(pe,x))),pn),Power(Power(E,Times(CN1,pn,Plus(pd,Times(pe,x)))),CN1),Int(SimplifyIntegrand(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(E,Times(CN1,pn,Plus(pd,Times(pe,x)))),Power(Power(Plus(C1,Times(CN1,Power(E,Times(CN2,Plus(pd,Times(pe,x)))))),pn),CN1)),x),x)),And(FreeQ(List(pf,a,b,c,pd,pe),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(C2,pn),Power(f,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cosh(Plus(Times(C1D2,pd),Times(pe,C1D2,x),Times(CN1,f,Pi,Power(Times(C4,g),CN1)))),Times(C2,pn))),x)),And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(Sqr(f),Sqr(g)))),NegativeIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(C2,pn),Power(g,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cosh(Plus(Times(C1D2,pd),Times(pe,C1D2,x))),Times(C2,pn))),x)),And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(f,Times(CN1,g)))),NegativeIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(C2,pn),Power(g,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sinh(Plus(Times(C1D2,pd),Times(pe,C1D2,x))),Times(C2,pn))),x)),And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(f,g))),NegativeIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power(Plus(Times(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(g,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Tanh(Plus(Times(C1D2,pd),Times(pe,C1D2,x),Times(CN1,f,Pi,Power(Times(C4,g),CN1)))),m)),x)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(Sqr(f),Sqr(g)))),IntegersQ(m,pn)),Equal(Plus(m,pn),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(g,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Tanh(Plus(Times(C1D2,pd),Times(pe,C1D2,x))),m)),x)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(f,Times(CN1,g)))),IntegersQ(m,pn)),Equal(Plus(m,pn),C0)))),
ISetDelayed(Int(Times(Power(Plus(Times(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),pn_DEFAULT),Power(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Power(g,pn),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Coth(Plus(Times(C1D2,pd),Times(pe,C1D2,x))),m)),x)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),ZeroQ(Plus(f,g))),IntegersQ(m,pn)),Equal(Plus(m,pn),C0)))),
ISetDelayed(Int(Times(Plus(Times(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pi_DEFAULT),h_),Power(Plus(Times(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),CN1),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(C2,pi,Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Cosh(Plus(pd,Times(pe,x))),Power(Plus(f,Times(g,Sinh(Plus(pd,Times(pe,x))))),CN1)),x)),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Plus(h,Times(CN1,pi,Cosh(Plus(pd,Times(pe,x))))),Power(Plus(f,Times(g,Sinh(Plus(pd,Times(pe,x))))),CN1)),x)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h,pi),x),ZeroQ(Plus(Sqr(f),Sqr(g)))),ZeroQ(Plus(Sqr(h),Times(CN1,Sqr(pi))))),ZeroQ(Plus(Times(g,h),Times(CN1,f,pi)))))),
ISetDelayed(Int(Times(Plus(Times(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pi_DEFAULT),h_),Power(Plus(Times(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),g_DEFAULT),f_),CN1),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Plus(Times(C2,pi,Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Sinh(Plus(pd,Times(pe,x))),Power(Plus(f,Times(g,Cosh(Plus(pd,Times(pe,x))))),CN1)),x)),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Plus(h,Times(CN1,pi,Sinh(Plus(pd,Times(pe,x))))),Power(Plus(f,Times(g,Cosh(Plus(pd,Times(pe,x))))),CN1)),x)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h,pi),x),ZeroQ(Plus(Sqr(f),Times(CN1,Sqr(g))))),ZeroQ(Plus(Sqr(h),Sqr(pi)))),ZeroQ(Plus(Times(g,h),Times(f,pi)))))),
ISetDelayed(Int(Times(Power($(pg_,v_),pn_DEFAULT),Power(pf_,Times(c_DEFAULT,u_))),x_Symbol),
    Condition(Int(Times(Power(pf,Times(c,ExpandToSum(u,x))),Power($(pg,ExpandToSum(v,x)),pn)),x),And(And(And(FreeQ(List(pf,c,pn),x),HyperbolicQ(pg)),LinearQ(List(u,v),x)),Not(LinearMatchQ(List(u,v),x))))),
ISetDelayed(Int(Times(Power(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(x_,m_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Sinh(Plus(pd,Times(pe,x))),pn)),x)))),Plus(Times(Power(x,m),u),Times(CN1,Dist(m,Int(Times(Power(x,Plus(m,Times(CN1,C1))),u),x))))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),RationalQ(m)),Greater(m,C0)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cosh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(x_,m_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Cosh(Plus(pd,Times(pe,x))),pn)),x)))),Plus(Times(Power(x,m),u),Times(CN1,Dist(m,Int(Times(Power(x,Plus(m,Times(CN1,C1))),u),x))))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),RationalQ(m)),Greater(m,C0)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cosh(Plus(Times(g_DEFAULT,x_),f_DEFAULT)),pn_DEFAULT),Power(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(pf,Times(c,Plus(a,Times(b,x)))),Times(Power(Sinh(Plus(pd,Times(pe,x))),m),Power(Cosh(Plus(f,Times(g,x))),pn)),x),x),And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),PositiveIntegerQ(m,pn)))),
ISetDelayed(Int(Times(Power(Cosh(Plus(Times(g_DEFAULT,x_),f_DEFAULT)),pn_DEFAULT),Power(Sinh(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power(x_,p_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Int(ExpandTrigReduce(Times(Power(x,p),Power(pf,Times(c,Plus(a,Times(b,x))))),Times(Power(Sinh(Plus(pd,Times(pe,x))),m),Power(Cosh(Plus(f,Times(g,x))),pn)),x),x),And(FreeQ(List(pf,a,b,c,pd,pe,f,g),x),PositiveIntegerQ(m,pn,p)))),
ISetDelayed(Int(Times(Power($(pg_,Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),m_DEFAULT),Power($(ph_,Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),pn_DEFAULT),Power(pf_,Times(Plus(Times(b_DEFAULT,x_),a_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power(pf,Times(c,Plus(a,Times(b,x)))),Times(Power($(pg,Plus(pd,Times(pe,x))),m),Power($(ph,Plus(pd,Times(pe,x))),pn)),x),x),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),PositiveIntegerQ(m,pn)),HyperbolicQ(pg)),HyperbolicQ(ph)))),
ISetDelayed(Int(Times(Power(Sinh(v_),pn_DEFAULT),Power(pf_,u_)),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power(pf,u),Power(Sinh(v),pn),x),x),And(And(And(FreeQ(pf,x),Or(LinearQ(u,x),QuadraticQ(u,x))),Or(LinearQ(v,x),QuadraticQ(v,x))),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cosh(v_),pn_DEFAULT),Power(pf_,u_)),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power(pf,u),Power(Cosh(v),pn),x),x),And(And(And(FreeQ(pf,x),Or(LinearQ(u,x),QuadraticQ(u,x))),Or(LinearQ(v,x),QuadraticQ(v,x))),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Cosh(v_),pn_DEFAULT),Power(Sinh(v_),m_DEFAULT),Power(pf_,u_)),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power(pf,u),Times(Power(Sinh(v),m),Power(Cosh(v),pn)),x),x),And(And(And(FreeQ(pf,x),Or(LinearQ(u,x),QuadraticQ(u,x))),Or(LinearQ(v,x),QuadraticQ(v,x))),PositiveIntegerQ(m,pn))))
  );
}
