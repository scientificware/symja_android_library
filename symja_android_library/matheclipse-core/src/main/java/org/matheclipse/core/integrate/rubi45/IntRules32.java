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
public class IntRules32 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),f_DEFAULT),Times(Sqrt(Plus(Times(b_DEFAULT,x_),a_DEFAULT)),pe_DEFAULT)),CN1),u_),x_Symbol),
    Condition(Plus(Times(c,Power(Times(pe,Plus(Times(b,c),Times(CN1,a,pd))),CN1),Int(Times(u,Sqrt(Plus(a,Times(b,x))),Power(x,CN1)),x)),Times(CN1,a,Power(Times(f,Plus(Times(b,c),Times(CN1,a,pd))),CN1),Int(Times(u,Sqrt(Plus(c,Times(pd,x))),Power(x,CN1)),x))),And(And(FreeQ(List(a,b,c,pd,pe,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),ZeroQ(Plus(Times(a,Sqr(pe)),Times(CN1,c,Sqr(f))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),f_DEFAULT),Times(Sqrt(Plus(Times(b_DEFAULT,x_),a_DEFAULT)),pe_DEFAULT)),CN1),u_),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(pe,Plus(Times(b,c),Times(CN1,a,pd))),CN1),Int(Times(u,Sqrt(Plus(a,Times(b,x)))),x)),Times(b,Power(Times(f,Plus(Times(b,c),Times(CN1,a,pd))),CN1),Int(Times(u,Sqrt(Plus(c,Times(pd,x)))),x))),And(And(FreeQ(List(a,b,c,pd,pe,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),ZeroQ(Plus(Times(b,Sqr(pe)),Times(CN1,pd,Sqr(f))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(x_,pd_DEFAULT),c_DEFAULT)),f_DEFAULT),Times(Sqrt(Plus(Times(b_DEFAULT,x_),a_DEFAULT)),pe_DEFAULT)),CN1),u_),x_Symbol),
    Condition(Plus(Times(pe,Int(Times(u,Sqrt(Plus(a,Times(b,x))),Power(Plus(Times(a,Sqr(pe)),Times(CN1,c,Sqr(f)),Times(Plus(Times(b,Sqr(pe)),Times(CN1,pd,Sqr(f))),x)),CN1)),x)),Times(CN1,f,Int(Times(u,Sqrt(Plus(c,Times(pd,x))),Power(Plus(Times(a,Sqr(pe)),Times(CN1,c,Sqr(f)),Times(Plus(Times(b,Sqr(pe)),Times(CN1,pd,Sqr(f))),x)),CN1)),x))),And(And(FreeQ(List(a,b,c,pd,pe,f),x),NonzeroQ(Plus(Times(a,Sqr(pe)),Times(CN1,c,Sqr(f))))),NonzeroQ(Plus(Times(b,Sqr(pe)),Times(CN1,pd,Sqr(f))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Power(x_,p_DEFAULT),b_DEFAULT),a_DEFAULT)),c_DEFAULT),Times(Power(x_,pn_DEFAULT),pd_DEFAULT)),CN1),u_DEFAULT),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Times(a,pd),CN1),Int(Times(u,Power(x,pn)),x)),Times(Power(Times(a,c),CN1),Int(Times(u,Sqrt(Plus(a,Times(b,Power(x,Times(C2,pn)))))),x))),And(And(FreeQ(List(a,b,c,pd,pn),x),ZeroQ(Plus(p,Times(CN1,C2,pn)))),ZeroQ(Plus(Times(b,Sqr(c)),Times(CN1,Sqr(pd))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Power(x_,p_DEFAULT),b_DEFAULT),a_DEFAULT)),c_DEFAULT),Times(Power(x_,pn_DEFAULT),pd_DEFAULT)),CN1),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Int(Times(Power(x,Plus(m,pn)),Power(Plus(Times(a,Sqr(c)),Times(Plus(Times(b,Sqr(c)),Times(CN1,Sqr(pd))),Power(x,Times(C2,pn)))),CN1)),x)),Times(c,Int(Times(Power(x,m),Sqrt(Plus(a,Times(b,Power(x,Times(C2,pn))))),Power(Plus(Times(a,Sqr(c)),Times(Plus(Times(b,Sqr(c)),Times(CN1,Sqr(pd))),Power(x,Times(C2,pn)))),CN1)),x))),And(And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(p,Times(CN1,C2,pn)))),NonzeroQ(Plus(Times(b,Sqr(c)),Times(CN1,Sqr(pd))))))),
ISetDelayed(Int(Times(Plus(Times(Sqr(x_),pb_DEFAULT),pa_),Power(Times(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),Sqrt(Plus(Times(Sqr(x_),b_DEFAULT),Times(Power(x_,C4),c_DEFAULT),a_))),CN1)),x_Symbol),
    Condition(Times(pa,Subst(Int(Power(Plus(pd,Times(CN1,Plus(Times(b,pd),Times(CN1,C2,a,pe)),Sqr(x))),CN1),x),x,Times(x,Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),CN1D2)))),And(And(FreeQ(List(a,b,c,pd,pe,pa,pb),x),ZeroQ(Plus(Times(pb,pd),Times(pa,pe)))),ZeroQ(Plus(Times(c,Sqr(pd)),Times(CN1,a,Sqr(pe))))))),
ISetDelayed(Int(Times(Plus(Times(Sqr(x_),pb_DEFAULT),pa_),Power(Times(Plus(Times(Sqr(x_),pe_DEFAULT),pd_),Sqrt(Plus(Times(Power(x_,C4),c_DEFAULT),a_))),CN1)),x_Symbol),
    Condition(Times(pa,Subst(Int(Power(Plus(pd,Times(C2,a,pe,Sqr(x))),CN1),x),x,Times(x,Power(Plus(a,Times(c,Power(x,C4))),CN1D2)))),And(And(FreeQ(List(a,c,pd,pe,pa,pb),x),ZeroQ(Plus(Times(pb,pd),Times(pa,pe)))),ZeroQ(Plus(Times(c,Sqr(pd)),Times(CN1,a,Sqr(pe))))))),
ISetDelayed(Int(Times(Plus(Times(Power(x_,C4),pb_DEFAULT),pa_),Power(Times(Plus(Times(Power(x_,C4),f_DEFAULT),Times(Sqr(x_),pe_DEFAULT),pd_),Sqrt(Plus(Times(Sqr(x_),b_DEFAULT),Times(Power(x_,C4),c_DEFAULT),a_))),CN1)),x_Symbol),
    Condition(Times(pa,Subst(Int(Power(Plus(pd,Times(CN1,Plus(Times(b,pd),Times(CN1,a,pe)),Sqr(x))),CN1),x),x,Times(x,Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),CN1D2)))),And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb),x),ZeroQ(Plus(Times(c,pd),Times(CN1,a,f)))),ZeroQ(Plus(Times(a,pb),Times(pa,c)))))),
ISetDelayed(Int(Times(Plus(Times(Power(x_,C4),pb_DEFAULT),pa_),Power(Times(Plus(Times(Power(x_,C4),f_DEFAULT),Times(Sqr(x_),pe_DEFAULT),pd_),Sqrt(Plus(Times(Power(x_,C4),c_DEFAULT),a_))),CN1)),x_Symbol),
    Condition(Times(pa,Subst(Int(Power(Plus(pd,Times(a,pe,Sqr(x))),CN1),x),x,Times(x,Power(Plus(a,Times(c,Power(x,C4))),CN1D2)))),And(And(FreeQ(List(a,c,pd,pe,f,pa,pb),x),ZeroQ(Plus(Times(c,pd),Times(CN1,a,f)))),ZeroQ(Plus(Times(a,pb),Times(pa,c)))))),
ISetDelayed(Int(Times(Plus(Times(Power(x_,C4),pb_DEFAULT),pa_),Power(Times(Plus(Times(Power(x_,C4),f_DEFAULT),pd_),Sqrt(Plus(Times(Sqr(x_),b_DEFAULT),Times(Power(x_,C4),c_DEFAULT),a_))),CN1)),x_Symbol),
    Condition(Times(pa,Subst(Int(Power(Plus(pd,Times(CN1,b,pd,Sqr(x))),CN1),x),x,Times(x,Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,C4))),CN1D2)))),And(And(FreeQ(List(a,b,c,pd,f,pa,pb),x),ZeroQ(Plus(Times(c,pd),Times(CN1,a,f)))),ZeroQ(Plus(Times(a,pb),Times(pa,c)))))),
ISetDelayed(Int(Power(Plus(Times(Power(Plus(Times(Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),Times(b_DEFAULT,x_),a_DEFAULT)),f_DEFAULT),Times(x_,pe_DEFAULT),pd_DEFAULT),pn_),h_DEFAULT),g_DEFAULT),p_DEFAULT),x_Symbol),
    Condition(Times(C2,Subst(Int(Times(Power(Plus(g,Times(h,Power(x,pn))),p),Plus(Times(Sqr(pd),pe),Times(CN1,Plus(Times(b,pd),Times(CN1,a,pe)),Sqr(f)),Times(CN1,Plus(Times(C2,pd,pe),Times(CN1,b,Sqr(f))),x),Times(pe,Sqr(x))),Power(Plus(Times(CN2,pd,pe),Times(b,Sqr(f)),Times(C2,pe,x)),CN2)),x),x,Plus(pd,Times(pe,x),Times(f,Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))))))),And(And(FreeQ(List(a,b,c,pd,pe,f,g,h,pn),x),ZeroQ(Plus(Sqr(pe),Times(CN1,c,Sqr(f))))),IntegerQ(p)))),
ISetDelayed(Int(Power(Plus(Times(Power(Plus(Times(Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),a_)),f_DEFAULT),Times(x_,pe_DEFAULT),pd_DEFAULT),pn_),h_DEFAULT),g_DEFAULT),p_DEFAULT),x_Symbol),
    Condition(Times(Power(Times(C2,pe),CN1),Subst(Int(Times(Power(Plus(g,Times(h,Power(x,pn))),p),Plus(Sqr(pd),Times(a,Sqr(f)),Times(CN1,C2,pd,x),Sqr(x)),Power(Plus(pd,Times(CN1,x)),CN2)),x),x,Plus(pd,Times(pe,x),Times(f,Sqrt(Plus(a,Times(c,Sqr(x)))))))),And(And(FreeQ(List(a,c,pd,pe,f,g,h,pn),x),ZeroQ(Plus(Sqr(pe),Times(CN1,c,Sqr(f))))),IntegerQ(p)))),
ISetDelayed(Int(Power(Plus(Times(Power(Plus($($p(f,$s("Sqrt"),true),v_),u_),pn_),h_DEFAULT),g_DEFAULT),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(g,Times(h,Power(Plus(ExpandToSum(u,x),Times(f,Sqrt(ExpandToSum(v,x)))),pn))),p),x),And(And(And(And(And(FreeQ(List(f,g,h,pn),x),LinearQ(u,x)),QuadraticQ(v,x)),Not(And(LinearMatchQ(u,x),QuadraticMatchQ(v,x)))),ZeroQ(Plus(Sqr(Coefficient(u,x,C1)),Times(CN1,Coefficient(v,x,C2),Sqr(f))))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),a_DEFAULT)),f_DEFAULT),Times(x_,pe_DEFAULT)),pn_DEFAULT),Power(Plus(Times(h_DEFAULT,x_),g_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(Power(C2,Plus(m,C1)),Power(pe,Plus(m,C1))),CN1),Subst(Int(Times(Power(x,Plus(pn,Times(CN1,m),Times(CN1,C2))),Plus(Times(a,Sqr(f)),Sqr(x)),Power(Plus(Times(CN1,a,Sqr(f),h),Times(C2,pe,g,x),Times(h,Sqr(x))),m)),x),x,Plus(Times(pe,x),Times(f,Sqrt(Plus(a,Times(c,Sqr(x)))))))),And(And(FreeQ(List(a,c,pe,f,g,h,pn),x),ZeroQ(Plus(Sqr(pe),Times(CN1,c,Sqr(f))))),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),a_)),f_DEFAULT),Times(x_,pe_DEFAULT)),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pi_DEFAULT),g_),m_DEFAULT),Power(x_,p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(Power(C2,Plus(Times(C2,m),p,C1)),Power(pe,Plus(p,C1)),Power(f,Times(C2,m))),CN1),Power(Times(pi,Power(c,CN1)),m),Subst(Int(Times(Power(x,Plus(pn,Times(CN1,C2,m),Times(CN1,p),Times(CN1,C2))),Power(Plus(Times(CN1,a,Sqr(f)),Sqr(x)),p),Power(Plus(Times(a,Sqr(f)),Sqr(x)),Plus(Times(C2,m),C1))),x),x,Plus(Times(pe,x),Times(f,Sqrt(Plus(a,Times(c,Sqr(x)))))))),And(And(And(And(FreeQ(List(a,c,pe,f,g,pi,pn),x),ZeroQ(Plus(Sqr(pe),Times(CN1,c,Sqr(f))))),ZeroQ(Plus(Times(c,g),Times(CN1,a,pi)))),IntegersQ(p,Times(C2,m))),Or(IntegerQ(m),PositiveQ(Times(pi,Power(c,CN1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),Times(b_DEFAULT,x_),a_DEFAULT)),f_DEFAULT),Times(x_,pe_DEFAULT),pd_DEFAULT),pn_DEFAULT),Power(Plus(Times(h_DEFAULT,x_),Times(Sqr(x_),pi_DEFAULT),g_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Times(C2,Power(Power(f,Times(C2,m)),CN1),Power(Times(pi,Power(c,CN1)),m),Subst(Int(Times(Power(x,pn),Power(Plus(Times(Sqr(pd),pe),Times(CN1,Plus(Times(b,pd),Times(CN1,a,pe)),Sqr(f)),Times(CN1,Plus(Times(C2,pd,pe),Times(CN1,b,Sqr(f))),x),Times(pe,Sqr(x))),Plus(Times(C2,m),C1)),Power(Power(Plus(Times(CN2,pd,pe),Times(b,Sqr(f)),Times(C2,pe,x)),Times(C2,Plus(m,C1))),CN1)),x),x,Plus(pd,Times(pe,x),Times(f,Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))))))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,g,h,pi,pn),x),ZeroQ(Plus(Sqr(pe),Times(CN1,c,Sqr(f))))),ZeroQ(Plus(Times(c,g),Times(CN1,a,pi)))),ZeroQ(Plus(Times(c,h),Times(CN1,b,pi)))),IntegerQ(Times(C2,m))),Or(IntegerQ(m),PositiveQ(Times(pi,Power(c,CN1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),a_)),f_DEFAULT),Times(x_,pe_DEFAULT),pd_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pi_DEFAULT),g_),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(Power(C2,Plus(Times(C2,m),C1)),pe,Power(f,Times(C2,m))),CN1),Power(Times(pi,Power(c,CN1)),m),Subst(Int(Times(Power(x,pn),Power(Plus(Sqr(pd),Times(a,Sqr(f)),Times(CN1,C2,pd,x),Sqr(x)),Plus(Times(C2,m),C1)),Power(Power(Plus(Times(CN1,pd),x),Times(C2,Plus(m,C1))),CN1)),x),x,Plus(pd,Times(pe,x),Times(f,Sqrt(Plus(a,Times(c,Sqr(x)))))))),And(And(And(And(FreeQ(List(a,c,pd,pe,f,g,pi,pn),x),ZeroQ(Plus(Sqr(pe),Times(CN1,c,Sqr(f))))),ZeroQ(Plus(Times(c,g),Times(CN1,a,pi)))),IntegerQ(Times(C2,m))),Or(IntegerQ(m),PositiveQ(Times(pi,Power(c,CN1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),Times(b_DEFAULT,x_),a_DEFAULT)),f_DEFAULT),Times(x_,pe_DEFAULT),pd_DEFAULT),pn_DEFAULT),Power(Plus(Times(h_DEFAULT,x_),Times(Sqr(x_),pi_DEFAULT),g_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(pi,Power(c,CN1)),Plus(m,Times(CN1,C1D2))),Sqrt(Plus(g,Times(h,x),Times(pi,Sqr(x)))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2),Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(pd,Times(pe,x),Times(f,Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))))),pn)),x)),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,g,h,pi,pn),x),ZeroQ(Plus(Sqr(pe),Times(CN1,c,Sqr(f))))),ZeroQ(Plus(Times(c,g),Times(CN1,a,pi)))),ZeroQ(Plus(Times(c,h),Times(CN1,b,pi)))),PositiveIntegerQ(Plus(m,C1D2))),Not(PositiveQ(Times(pi,Power(c,CN1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),a_)),f_DEFAULT),Times(x_,pe_DEFAULT),pd_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pi_DEFAULT),g_),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(pi,Power(c,CN1)),Plus(m,Times(CN1,C1D2))),Sqrt(Plus(g,Times(pi,Sqr(x)))),Power(Plus(a,Times(c,Sqr(x))),CN1D2),Int(Times(Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(pd,Times(pe,x),Times(f,Sqrt(Plus(a,Times(c,Sqr(x)))))),pn)),x)),And(And(And(And(FreeQ(List(a,c,pd,pe,f,g,pi,pn),x),ZeroQ(Plus(Sqr(pe),Times(CN1,c,Sqr(f))))),ZeroQ(Plus(Times(c,g),Times(CN1,a,pi)))),PositiveIntegerQ(Plus(m,C1D2))),Not(PositiveQ(Times(pi,Power(c,CN1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),Times(b_DEFAULT,x_),a_DEFAULT)),f_DEFAULT),Times(x_,pe_DEFAULT),pd_DEFAULT),pn_DEFAULT),Power(Plus(Times(h_DEFAULT,x_),Times(Sqr(x_),pi_DEFAULT),g_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(pi,Power(c,CN1)),Plus(m,C1D2)),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Plus(g,Times(h,x),Times(pi,Sqr(x))),CN1D2),Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(pd,Times(pe,x),Times(f,Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))))),pn)),x)),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,g,h,pi,pn),x),ZeroQ(Plus(Sqr(pe),Times(CN1,c,Sqr(f))))),ZeroQ(Plus(Times(c,g),Times(CN1,a,pi)))),ZeroQ(Plus(Times(c,h),Times(CN1,b,pi)))),NegativeIntegerQ(Plus(m,Times(CN1,C1D2)))),Not(PositiveQ(Times(pi,Power(c,CN1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),a_)),f_DEFAULT),Times(x_,pe_DEFAULT),pd_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pi_DEFAULT),g_),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(pi,Power(c,CN1)),Plus(m,C1D2)),Sqrt(Plus(a,Times(c,Sqr(x)))),Power(Plus(g,Times(pi,Sqr(x))),CN1D2),Int(Times(Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(pd,Times(pe,x),Times(f,Sqrt(Plus(a,Times(c,Sqr(x)))))),pn)),x)),And(And(And(And(FreeQ(List(a,c,pd,pe,f,g,pi,pn),x),ZeroQ(Plus(Sqr(pe),Times(CN1,c,Sqr(f))))),ZeroQ(Plus(Times(c,g),Times(CN1,a,pi)))),NegativeIntegerQ(Plus(m,Times(CN1,C1D2)))),Not(PositiveQ(Times(pi,Power(c,CN1))))))),
ISetDelayed(Int(Times(Power(Plus($($p(f,$s("Sqrt"),true),v_),u_),pn_DEFAULT),Power(w_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(w,x),m),Power(Plus(ExpandToSum(u,x),Times(f,Sqrt(ExpandToSum(v,x)))),pn)),x),And(And(And(And(FreeQ(List(f,pn),x),LinearQ(u,x)),QuadraticQ(List(v,w),x)),Not(And(LinearMatchQ(u,x),QuadraticMatchQ(List(v,w),x)))),ZeroQ(Plus(Sqr(Coefficient(u,x,C1)),Times(CN1,Coefficient(v,x,C2),Sqr(f))))))),
ISetDelayed(Int(Power(Times(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),a_),Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),Times(Power(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),a_),p_DEFAULT),pd_DEFAULT)))),CN1),x_Symbol),
    Condition(Times(Power(a,CN1),Subst(Int(Power(Plus(C1,Times(CN1,c,Sqr(x))),CN1),x),x,Times(x,Power(Plus(Times(c,Sqr(x)),Times(pd,Power(Plus(a,Times(b,Power(x,pn))),Times(C2,Power(pn,CN1))))),CN1D2)))),And(FreeQ(List(a,b,c,pd,pn),x),ZeroQ(Plus(p,Times(CN1,C2,Power(pn,CN1))))))),
ISetDelayed(Int(Sqrt(Plus(Times(Sqrt(Plus(Times(Sqr(x_),pd_DEFAULT),c_)),b_DEFAULT),a_)),x_Symbol),
    Condition(Plus(Times(C2,Sqr(b),pd,Power(x,C3),Power(Times(C3,Power(Plus(a,Times(b,Sqrt(Plus(c,Times(pd,Sqr(x)))))),QQ(3L,2L))),CN1)),Times(C2,a,x,Power(Plus(a,Times(b,Sqrt(Plus(c,Times(pd,Sqr(x)))))),CN1D2))),And(FreeQ(List(a,b,c,pd),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b),c)))))),
ISetDelayed(Int(Times(Sqrt(Plus(Times(Sqr(x_),a_DEFAULT),Times(Sqrt(Plus(Times(Sqr(x_),pd_DEFAULT),c_)),b_DEFAULT,x_))),Power(Times(Sqrt(Plus(Times(Sqr(x_),pd_DEFAULT),c_)),x_),CN1)),x_Symbol),
    Condition(Times(CSqrt2,b,Power(a,CN1),Subst(Int(Power(Plus(C1,Times(Sqr(x),Power(a,CN1))),CN1D2),x),x,Plus(Times(a,x),Times(b,Sqrt(Plus(c,Times(pd,Sqr(x)))))))),And(And(FreeQ(List(a,b,c,pd),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b),pd)))),ZeroQ(Plus(Times(Sqr(b),c),a))))),
ISetDelayed(Int(Times(Power(Times(Sqrt(Plus(Times(Sqr(x_),pd_DEFAULT),c_)),x_),CN1),Sqrt(Times(Plus(Times(Sqrt(Plus(Times(Sqr(x_),pd_DEFAULT),c_)),b_DEFAULT),Times(a_DEFAULT,x_)),x_,pe_DEFAULT))),x_Symbol),
    Condition(Int(Times(Sqrt(Plus(Times(a,pe,Sqr(x)),Times(b,pe,x,Sqrt(Plus(c,Times(pd,Sqr(x))))))),Power(Times(x,Sqrt(Plus(c,Times(pd,Sqr(x))))),CN1)),x),And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b),pd)))),ZeroQ(Plus(Times(Sqr(b),c,pe),a))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(x_,C4),b_DEFAULT),a_),CN1D2),Sqrt(Plus(Times(Sqr(x_),c_DEFAULT),Times(Sqrt(Plus(Times(Power(x_,C4),b_DEFAULT),a_)),pd_DEFAULT)))),x_Symbol),
    Condition(Times(pd,Subst(Int(Power(Plus(C1,Times(CN1,C2,c,Sqr(x))),CN1),x),x,Times(x,Power(Plus(Times(c,Sqr(x)),Times(pd,Sqrt(Plus(a,Times(b,Power(x,C4)))))),CN1D2)))),And(FreeQ(List(a,b,c,pd),x),ZeroQ(Plus(Sqr(c),Times(CN1,b,Sqr(pd))))))),
ISetDelayed(Int(Times(Sqrt(Plus(Sqrt(Plus(Times(Power(x_,C4),pe_DEFAULT),a_)),Times(Sqr(x_),b_DEFAULT))),Power(Plus(Times(x_,pd_DEFAULT),c_DEFAULT),m_DEFAULT),Power(Plus(Times(Power(x_,C4),pe_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Times(C1D2,Plus(C1,Times(CN1,CI)),Int(Times(Power(Plus(c,Times(pd,x)),m),Power(Plus(Sqrt(a),Times(CN1,CI,b,Sqr(x))),CN1D2)),x)),Times(C1D2,Plus(C1,CI),Int(Times(Power(Plus(c,Times(pd,x)),m),Power(Plus(Sqrt(a),Times(CI,b,Sqr(x))),CN1D2)),x))),And(And(FreeQ(List(a,b,c,pd,m),x),ZeroQ(Plus(pe,Times(CN1,Sqr(b))))),PositiveQ(a)))),
ISetDelayed(Int(Times(Plus(Times(Power(x_,pn_),pb_DEFAULT),pa_),Power(Plus(Times(Sqr(x_),b_DEFAULT),Times(Power(x_,pn_),c_DEFAULT),Times(Power(x_,j_),pd_DEFAULT),a_),CN1)),x_Symbol),
    Condition(Times(Sqr(pa),Plus(pn,Times(CN1,C1)),Subst(Int(Power(Plus(a,Times(Sqr(pa),b,Sqr(Plus(pn,Times(CN1,C1))),Sqr(x))),CN1),x),x,Times(x,Power(Plus(Times(pa,Plus(pn,Times(CN1,C1))),Times(CN1,pb,Power(x,pn))),CN1)))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,pn),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),NonzeroQ(Plus(pn,Times(CN1,C2)))),ZeroQ(Plus(Times(a,Sqr(pb)),Times(CN1,Sqr(pa),pd,Sqr(Plus(pn,Times(CN1,C1))))))),ZeroQ(Plus(Times(pb,c),Times(C2,pa,pd,Plus(pn,Times(CN1,C1)))))))),
ISetDelayed(Int(Times(Plus(Times(Power(x_,pn_DEFAULT),pb_DEFAULT),pa_),Power(Plus(Times(Power(x_,k_DEFAULT),b_DEFAULT),Times(Power(x_,pn_DEFAULT),c_DEFAULT),Times(Power(x_,j_),pd_DEFAULT),a_),CN1),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Sqr(pa),Plus(m,Times(CN1,pn),C1),Power(Plus(m,C1),CN1),Subst(Int(Power(Plus(a,Times(Sqr(pa),b,Sqr(Plus(m,Times(CN1,pn),C1)),Sqr(x))),CN1),x),x,Times(Power(x,Plus(m,C1)),Power(Plus(Times(pa,Plus(m,Times(CN1,pn),C1)),Times(pb,Plus(m,C1),Power(x,pn))),CN1)))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,m,pn),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),ZeroQ(Plus(k,Times(CN1,C2,Plus(m,C1))))),ZeroQ(Plus(Times(a,Sqr(pb),Sqr(Plus(m,C1))),Times(CN1,Sqr(pa),pd,Sqr(Plus(m,Times(CN1,pn),C1)))))),ZeroQ(Plus(Times(pb,c,Plus(m,C1)),Times(CN1,C2,pa,pd,Plus(m,Times(CN1,pn),C1))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(x_,pn_),b_DEFAULT),Times(Power(x_,j_),c_DEFAULT),a_DEFAULT),p_DEFAULT),u_),x_Symbol),
    Condition(Int(Sum(Times(Power(x,pi),Plus(Coefficient(u,x,pi),Times(Coefficient(u,x,Plus(pn,pi)),Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn)),Times(c,Power(x,Times(C2,pn)))),p)),List(pi,C0,Plus(pn,Times(CN1,C1)))),x),And(And(And(And(And(And(And(FreeQ(List(a,b,c,p),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),PositiveIntegerQ(pn)),PolynomialQ(u,x)),Less(Less(C1,Exponent(u,x)),Times(C2,pn))),Not(BinomialQ(u,x))),Or(NonzeroQ(Plus(p,C1)),Not(NiceSqrtQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),Not(MatchQ(u,Condition(Power(x,m_),FreeQ(m,x))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(x_,pn_),b_DEFAULT),Times(Power(x_,j_),c_DEFAULT),a_DEFAULT),p_DEFAULT),Power(x_,m_DEFAULT),u_),x_Symbol),
    Condition(Int(Sum(Times(Power(x,Plus(m,pi)),Plus(Coefficient(u,x,pi),Times(Coefficient(u,x,Plus(pn,pi)),Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn)),Times(c,Power(x,Times(C2,pn)))),p)),List(pi,C0,Plus(pn,Times(CN1,C1)))),x),And(And(And(And(And(And(FreeQ(List(a,b,c,m,p),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),PositiveIntegerQ(pn)),PolynomialQ(u,x)),Less(Less(C1,Exponent(u,x)),Times(C2,pn))),Not(BinomialQ(u,x))),Or(NonzeroQ(Plus(p,C1)),Not(NiceSqrtQ(Plus(Sqr(b),Times(CN1,C4,a,c))))))))
  );
}
