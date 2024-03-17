public class evaluation {

  /*import java.util.Stack;

class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class ExpressionEvaluation {
    private Node head;

    public ExpressionEvaluation() {
        this.head = null;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        char data = head.data;
        head = head.next;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    public int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public String infixToPrefix(String infixExpression) {
        Stack<Character> operatorStack = new Stack<>();
        StringBuilder prefixExpression = new StringBuilder();

        for (int i = infixExpression.length() - 1; i >= 0; i--) {
            char c = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                prefixExpression.append(c);
            } else if (c == ')') {
                operatorStack.push(c);
            } else if (c == '(') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != ')') {
                    prefixExpression.append(operatorStack.pop());
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() != ')') {
                    throw new IllegalArgumentException("Invalid infix expression");
                } else {
                    operatorStack.pop();
                }
            } else if (isOperator(c)) {
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(c)) {
                    prefixExpression.append(operatorStack.pop());
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            prefixExpression.append(operatorStack.pop());
        }

        return prefixExpression.reverse().toString();
    }

    public int evaluatePrefix(String prefixExpression) {
        Stack<Integer> operandStack = new Stack<>();

        for (int i = prefixExpression.length() - 1; i >= 0; i--) {
            char c = prefixExpression.charAt(i);

            if (Character.isDigit(c)) {
                operandStack.push(Character.getNumericValue(c));
            } else if (isOperator(c)) {
                int
-----------------------------------
public int evaluatePrefix(String prefixExpression) {
        Stack<Integer> operandStack = new Stack<>();

        for (int i = prefixExpression.length() - 1; i >= 0; i--) {
            char c = prefixExpression.charAt(i);

            if (Character.isDigit(c)) {
                operandStack.push(Character.getNumericValue(c));
            } else if (isOperator(c)) {
                int operand1 = operandStack.pop();
                int operand2 = operandStack.pop();
                int result = performOperation(c, operand1, operand2);
                operandStack.push(result);
            }
        }

        if (operandStack.isEmpty()) {
            throw new IllegalArgumentException("Invalid prefix expression");
        }

        return operandStack.pop();
    }

    public int performOperation(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
        }
        throw new IllegalArgumentException("Invalid operator");
    }

    public static void main(String[] args) {
        ExpressionEvaluation expressionEvaluation = new ExpressionEvaluation();
        String infixExpression = "2+3*4";
        String prefixExpression = expressionEvaluation.infixToPrefix(infixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);  // Output: Prefix Expression: +2*34
        int result = expressionEvaluation.evaluatePrefix(prefixExpression);
        System.out.println("Result: " + result);  // Output: Result: 14
    }
}

   */


}
