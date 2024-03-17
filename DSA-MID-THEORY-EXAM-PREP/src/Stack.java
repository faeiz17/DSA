public class Stack {
  private int stack[]= new int[3];
  private int top=-1;

  public void Push(int data) {
    if (IsFull()){
      System.out.println("Stack is full");
      System.exit(-1);
    }else{
      stack[++top] = data;
    }
  }
  public Boolean IsFull(){
     if (top == stack.length){
       return true;
     }else return false;
  }
  public void Pop(){
    if (IsEmpty()){
      System.out.println("Stack is full i.e it is unable to delete anything");
    }else{
      System.out.println("the value that is at top and is going to be popped out is " + Peek());
      stack[top]=0;
      top--;
    }
  }
  public Boolean IsEmpty(){
    return top == -1;
  }
  public int Peek(){
    return stack[top];
  }
  public void Display(){
    if (IsFull()){
      System.out.println("Cannot display anything bcz stack is full");
    }else {
    int loopcounter=0;
    System.out.println("the values in the stack are");
    while (loopcounter<=top){
      System.out.print(stack[loopcounter]+" ");
      loopcounter++;
    }
  }
  }
}
