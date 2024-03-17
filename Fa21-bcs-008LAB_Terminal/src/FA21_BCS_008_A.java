import java.util.Scanner;

public class FA21_BCS_008_A{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    BST bst = new BST();
    int reply = 0;
    for(reply=0;reply !=4;reply=0){
      System.out.println("SELECT ANY OPTION\n" +
          "1-insert\n" +
          "2-delete\n" +
          "3-print\n" +
          "4-search\n" +
          "5-exit\n");
      reply=input.nextInt();
      if(reply==1){
        System.out.println("enter data");
        int data = input.nextInt();
        bst.insert(data);
      }
      if (reply==2){
        System.out.println("delete data");
        int data = input.nextInt();
        bst.delete(data);
      }
      if (reply==3){
        bst.display();
      }
      if(reply==4){
        System.out.println("enter the value u want to search");
        int data = input.nextInt();
        bst.search(data);
      }
      if(reply==5){
        break;
      }

    }
  }
}