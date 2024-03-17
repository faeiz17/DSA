import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
  public static String infixToPostfix(String infix) {
    StringBuilder postfix = new StringBuilder();
    Stack<Character> stack = new Stack<>();

    for (char ch : infix.toCharArray()) {
      if (Character.isLetterOrDigit(ch)) {
        postfix.append(ch);
      } else if (ch == '(') {
        stack.push(ch);
      } else if (ch == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') {
          postfix.append(stack.pop());
        }
        stack.pop(); // Pop the opening parenthesis
      } else {
        while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
          postfix.append(stack.pop());
        }
        stack.push(ch);
      }
    }

    while (!stack.isEmpty()) {
      if (stack.peek() == '(') {
        return "Invalid infix expression"; // Unmatched parentheses
      }
      postfix.append(stack.pop());
    }

    return postfix.toString();
  }

  public static int precedence(char ch) {
    if (ch == '+' || ch == '-') {
      return 1;
    } else if (ch == '*' || ch == '/') {
      return 2;
    } else if (ch == '^') {
      return 3;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the infix expression: ");
    String infix = scanner.nextLine();
    String postfix = infixToPostfix(infix);
    System.out.println("Postfix expression: " + postfix);
  }
}
