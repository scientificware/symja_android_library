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
public class IntRules25 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Power(Plus(Times(Power(x_,q_DEFAULT),a_DEFAULT),Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,r_DEFAULT),c_DEFAULT)),p_),x_Symbol),
    Condition(Int(Power(Times(Plus(a,b,c),Power(x,pn)),p),x),And(And(FreeQ(List(a,b,c,pn,p),x),ZeroQ(Plus(pn,Times(CN1,q)))),ZeroQ(Plus(r,Times(CN1,pn)))))),
ISetDelayed(Int(Power(Plus(Times(Power(x_,q_DEFAULT),a_DEFAULT),Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,r_DEFAULT),c_DEFAULT)),p_),x_Symbol),
    Condition(Int(Times(Power(x,Times(p,q)),Power(Plus(a,Times(b,Power(x,Plus(pn,Times(CN1,q)))),Times(c,Power(x,Times(C2,Plus(pn,Times(CN1,q)))))),p)),x),And(And(And(FreeQ(List(a,b,c,pn,q),x),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,pn),Times(CN1,q)))))),PosQ(Plus(pn,Times(CN1,q)))),IntegerQ(p)))),
ISetDelayed(Int(Sqrt(Plus(Times(Power(x_,q_DEFAULT),a_DEFAULT),Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,r_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Times(Sqrt(Plus(Times(a,Power(x,q)),Times(b,Power(x,pn)),Times(c,Power(x,Plus(Times(C2,pn),Times(CN1,q)))))),Power(Times(Power(x,Times(C1D2,q)),Sqrt(Plus(a,Times(b,Power(x,Plus(pn,Times(CN1,q)))),Times(c,Power(x,Times(C2,Plus(pn,Times(CN1,q)))))))),CN1),Int(Times(Power(x,Times(C1D2,q)),Sqrt(Plus(a,Times(b,Power(x,Plus(pn,Times(CN1,q)))),Times(c,Power(x,Times(C2,Plus(pn,Times(CN1,q)))))))),x)),And(And(FreeQ(List(a,b,c,pn,q),x),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,pn),Times(CN1,q)))))),PosQ(Plus(pn,Times(CN1,q)))))),
ISetDelayed(Int(Power(Plus(Times(Power(x_,q_DEFAULT),a_DEFAULT),Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,r_DEFAULT),c_DEFAULT)),CN1D2),x_Symbol),
    Condition(Times(Power(x,Times(C1D2,q)),Sqrt(Plus(a,Times(b,Power(x,Plus(pn,Times(CN1,q)))),Times(c,Power(x,Times(C2,Plus(pn,Times(CN1,q))))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,pn)),Times(c,Power(x,Plus(Times(C2,pn),Times(CN1,q))))),CN1D2),Int(Power(Times(Power(x,Times(C1D2,q)),Sqrt(Plus(a,Times(b,Power(x,Plus(pn,Times(CN1,q)))),Times(c,Power(x,Times(C2,Plus(pn,Times(CN1,q)))))))),CN1),x)),And(And(FreeQ(List(a,b,c,pn,q),x),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,pn),Times(CN1,q)))))),PosQ(Plus(pn,Times(CN1,q)))))),
ISetDelayed(Int(Power(Plus(Times(Power(x_,q_DEFAULT),a_DEFAULT),Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,r_DEFAULT),c_DEFAULT)),p_),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,pn)),Times(c,Power(x,Plus(Times(C2,pn),Times(CN1,q))))),p),Power(Plus(Times(p,Plus(Times(C2,pn),Times(CN1,q))),C1),CN1)),Times(Plus(pn,Times(CN1,q)),p,Power(Plus(Times(p,Plus(Times(C2,pn),Times(CN1,q))),C1),CN1),Int(Times(Power(x,q),Plus(Times(C2,a),Times(b,Power(x,Plus(pn,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,pn)),Times(c,Power(x,Plus(Times(C2,pn),Times(CN1,q))))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pn,q),x),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,pn),Times(CN1,q)))))),PosQ(Plus(pn,Times(CN1,q)))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),RationalQ(p)),Greater(p,C0)),NonzeroQ(Plus(Times(p,Plus(Times(C2,pn),Times(CN1,q))),C1))))),
ISetDelayed(Int(Power(Plus(Times(Power(x_,q_DEFAULT),a_DEFAULT),Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,r_DEFAULT),c_DEFAULT)),p_),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(Times(CN1,q),C1)),Plus(Sqr(b),Times(CN1,C2,a,c),Times(b,c,Power(x,Plus(pn,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,pn)),Times(c,Power(x,Plus(Times(C2,pn),Times(CN1,q))))),Plus(p,C1)),Power(Times(a,Plus(pn,Times(CN1,q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),CN1)),Times(Power(Times(a,Plus(pn,Times(CN1,q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),CN1),Int(Times(Power(x,Times(CN1,q)),Plus(Times(Plus(Times(p,q),C1),Plus(Sqr(b),Times(CN1,C2,a,c))),Times(Plus(pn,Times(CN1,q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),Times(b,c,Plus(Times(p,q),Times(Plus(pn,Times(CN1,q)),Plus(Times(C2,p),C3)),C1),Power(x,Plus(pn,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,pn)),Times(c,Power(x,Plus(Times(C2,pn),Times(CN1,q))))),Plus(p,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pn,q),x),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,pn),Times(CN1,q)))))),PosQ(Plus(pn,Times(CN1,q)))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Power(Plus(Times(Power(x_,q_DEFAULT),a_DEFAULT),Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,r_DEFAULT),c_DEFAULT)),p_),x_Symbol),
    Condition(Times(Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,pn)),Times(c,Power(x,Plus(Times(C2,pn),Times(CN1,q))))),p),Power(Times(Power(x,Times(p,q)),Power(Plus(a,Times(b,Power(x,Plus(pn,Times(CN1,q)))),Times(c,Power(x,Times(C2,Plus(pn,Times(CN1,q)))))),p)),CN1),Int(Times(Power(x,Times(p,q)),Power(Plus(a,Times(b,Power(x,Plus(pn,Times(CN1,q)))),Times(c,Power(x,Times(C2,Plus(pn,Times(CN1,q)))))),p)),x)),And(And(And(FreeQ(List(a,b,c,pn,p,q),x),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,pn),Times(CN1,q)))))),PosQ(Plus(pn,Times(CN1,q)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Power(Plus(Times(Power(x_,q_DEFAULT),a_DEFAULT),Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,r_DEFAULT),c_DEFAULT)),p_),x_Symbol),
    Condition($(Defer($s("Int")),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,pn)),Times(c,Power(x,Plus(Times(C2,pn),Times(CN1,q))))),p),x),And(FreeQ(List(a,b,c,pn,p,q),x),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,pn),Times(CN1,q)))))))),
ISetDelayed(Int(Power(Plus(Times(Power(u_,q_DEFAULT),a_DEFAULT),Times(Power(v_,pn_DEFAULT),b_DEFAULT),Times(Power(w_,r_DEFAULT),c_DEFAULT)),p_),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),CN1),Subst(Int(Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,pn)),Times(c,Power(x,Plus(Times(C2,pn),Times(CN1,q))))),p),x),x,u)),And(And(And(And(And(FreeQ(List(a,b,c,pn,p,q),x),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,pn),Times(CN1,q)))))),ZeroQ(Plus(u,Times(CN1,v)))),ZeroQ(Plus(u,Times(CN1,w)))),LinearQ(u,x)),NonzeroQ(Plus(u,Times(CN1,x)))))),
ISetDelayed(Int(Power(u_,p_),x_Symbol),
    Condition(Int(Power(ExpandToSum(u,x),p),x),And(And(FreeQ(p,x),GeneralizedTrinomialQ(u,x)),Not(GeneralizedTrinomialMatchQ(u,x)))))
  );
}
