package dijkstra;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by User on 10/4/2015.
 * Evaluates (fully parenthesized) arithmetic expressions using
 * Dijkstra's two-stack algorithm.
 */
public class DijkstraTwoStack {

    public static Double evaluate(ArrayList<String> expression) {

        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        for (int i = 0; i < expression.size(); i++) {
            String s = expression.get(i);
            switch (s) {
                case ";":
                    return vals.pop();
                case "(":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "sqrt":
                    ops.push(s);
                    break;
                case ")":
                    String op = ops.pop();
                    double v = vals.pop();
                    switch (op) {
                        case "+":
                            v = vals.pop() + v;
                            break;
                        case "-":
                            v = vals.pop() - v;
                            break;
                        case "*":
                            v = vals.pop() * v;
                            break;
                        case "/":
                            v = vals.pop() / v;
                            break;
                        case "sqrt":
                            v = Math.sqrt(v);
                            break;
                    }
                    vals.push(v);
                    break;
                default:
                    vals.push(Double.parseDouble(s));
                    break;
            }
        }
        return vals.pop();
    }
}
