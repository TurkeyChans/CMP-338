import java.util.Stack;

public class StackApplications {
    public static double evaluatePostFixExpression(String s) {
        Stack<Double> stack = new Stack<>();
        int ss = 0;
        int e = 0;
        int length = s.length();

        while (e < length) {
            while (e < length && s.charAt(e) != ' ') {
                e++;
            }

            if (ss != e) {
                String search = s.substring(ss, e);
                if (search.charAt(0) >= '0' && search.charAt(0) <= '9') {
                    stack.push(Double.parseDouble(search));
                } 
                else {
                    double num2 = stack.pop();
                    double num1 = stack.pop();
                    switch (search) {
                        case "+":
                            stack.push(num1 + num2);
                            break;
                        case "-":
                            stack.push(num1 - num2);
                            break;
                        case "*":
                            stack.push(num1 * num2);
                            break;
                        case "/":
                            stack.push(num1 / num2);
                            break;
                    }
                }
            }

            e++; 
            ss = e; 
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostFixExpression("3 4 +")); 
        System.out.println(evaluatePostFixExpression("3 4 * 2 / 5 +")); 
        System.out.println(evaluatePostFixExpression("5 2 * 8 +"));
    }
}