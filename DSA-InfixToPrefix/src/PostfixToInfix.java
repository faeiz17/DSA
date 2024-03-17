import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {
  public static String postfixToInfix(String postfix) {
    Stack<String> stack = new Stack<>();

    for (char ch : postfix.toCharArray()) {
      if (Character.isLetterOrDigit(ch)) {
        stack.push(String.valueOf(ch));
      } else {
        String operand2 = stack.pop();
        String operand1 = stack.pop();
        String infix = "(" + operand1 + ch + operand2 + ")";
        stack.push(infix);
      }
    }

    if (stack.size() != 1) {
      return "Invalid postfix expression";
    }

    return stack.pop();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the postfix expression: ");
    String postfix = scanner.nextLine();
    String infix = postfixToInfix(postfix);
    System.out.println("Infix expression: " + infix);
  }
}
