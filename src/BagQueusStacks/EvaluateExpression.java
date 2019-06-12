package BagQueusStacks;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EvaluateExpression {
    public static void main(String[] args) {
        Stack<String> operators = new Stack<String>();
        Stack<Double> values = new Stack<Double>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("("));
            else if (
                    s.equals("+")
                    || s.equals("-")
                    || s.equals("*")
                    || s.equals("/")
                    || s.equals("sqrt")
            ) {
                operators.push(s);
            } else if (s.equals(")")) {
                String operator = operators.pop();
                double value = values.pop();

                if (operator.equals("+")) value = values.pop() + value;
                else if (operator.equals("-")) value = values.pop() - value;
                else if (operator.equals("*")) value = values.pop() * value;
                else if (operator.equals("/")) value = values.pop() / value;
                else if (operator.equals("sqrt")) value = Math.sqrt(value);
                values.push(value);
            } else values.push(Double.parseDouble(s));
        }
        StdOut.println(values.pop());
    }
}
