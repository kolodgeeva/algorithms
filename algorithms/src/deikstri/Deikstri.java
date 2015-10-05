package deikstri;

import utils.StdOut;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by User on 10/4/2015.
 */
public class Deikstri {

    public static void evaluate() {
        Scanner scanner = new Scanner(System.in);

        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        while (scanner.hasNext()) {
            String s = scanner.next();
            switch (s) {
                case ";":
                    StdOut.println(vals.pop());
                    System.exit(0);
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
    }
}
