import java.util.Scanner;

public class Menu {
  Update_Array UA = new Update_Array();
  Scanner scanner = new Scanner(System.in);
  public void DisplayMenu(){
    int reply =0;
    for (reply = 0 ; reply !=4;reply=0){
    System.out.print("MENU"+"\n"
                      + "1-Display Array \n"
                      + "2-Insert in Array \n"
                      + "3-Delete a Value From Array\n"
                      + "4-Exit\n");
    reply = scanner.nextInt();
              if(reply==1){
                UA.displayArray();
              }
        if(reply==2){
          System.out.println("1-Sorted Insertion\n"+"2-Unsorted Insertion");
          int reply2 = scanner.nextInt();
                    if (reply2==1){
                      System.out.println("Enter the Value\n");
                      int value = scanner.nextInt();
                      UA.SortedInsertion(value);
                    }
          if (reply2==2){
            System.out.println("Enter the value\n");
            int value = scanner.nextInt();
            UA.unsortedInsertion(value);
          }

        }
        if(reply==3){
          System.out.println("enter value \n");
          int value = scanner.nextInt();
          UA.deleteValue(value);
        }
        if(reply==4){
          break;
        }


        }

  }
}
