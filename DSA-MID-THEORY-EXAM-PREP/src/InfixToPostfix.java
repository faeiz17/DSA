import java.util.Stack;

public class InfixToPostfix {

  public void ItoP(String userstring){
    Stack<Character> stack = new Stack<>();
    String postfixEpression = "";
    String dataReader = "";
    int loop = 0;
    while (loop!= userstring.length()) {
      char ch = userstring.charAt(loop);
      if(check(ch)==true){
          if(ch == '('){stack.push(ch);}
          if(ch==')'){while (stack.peek()=='('){

            postfixEpression+=stack.peek();
            stack.pop();
          }
            if(ch=='+'|| ch =='-'|| ch =='*'|| ch =='/'){
              stack.push(ch);
            }

      }
        else {postfixEpression+=ch;}
    }
  }
    System.out.println(postfixEpression);
  }

  public Boolean check(char ch){
    if(ch=='+'|| ch =='-'|| ch =='*'|| ch =='/'|| ch =='('|| ch ==')'){
      return true;
    }else return false;
  }

  public static void main(String[] args) {
    String p = "(A+B)";
    InfixToPostfix infix = new InfixToPostfix();
    infix.ItoP(p);
  }

}
