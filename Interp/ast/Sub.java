package ast;
import compiler.Failure;

/** Abstract syntax for the subtraction operator, -.
 */
public class Sub extends ArithBinExpr {

    /** Default constructor.
     */
    public Sub(Expr left, Expr right) {
        super(left, right);
    }

    /** Return a string that provides a simple description of this
     *  particular type of operator node.
     */
    String label() { return "Sub"; }

    /** Evaluate this expression, returning the result as an integer.
     *  Booleans are encoded as false=0, true=nonzero.  Two arrays are
     *  passed in as arguments to supply the values for global and local
     *  variables, respectively.
     */
    public int eval(int[] globals, int[] locals) {
      return left.eval(globals, locals) - right.eval(globals, locals);

    }
}
