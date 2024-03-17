public class Stack {
  public int size = 10;
public int stack[]= new int[size];
public int top , bottom = -1;
  public void push(int data){

    if (bottom==-1) bottom++;
    if(top== size-1){
      System.out.println("the stack is full");
    } else{
          top++;

           stack[top]=data;
    }
  }
  public void display(){
    int temp = top;
    while(temp!=bottom){
      System.out.println(" Data in stack using lifo/filo"+stack[temp]);
      temp--;
    }
  }
  public int pop(){
    if (top == -1){
      System.out.println("cannot del what dont exist");
        return -1;
    }else {
    stack[top]=0;
    top--;
      return stack[top]; }
  }
  public int peek(){
    return stack[top];
  }
}
