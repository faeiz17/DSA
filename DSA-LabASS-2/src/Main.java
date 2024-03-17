public class Main {
  public static void main(String[] args) {

    LinkedQueue bought = new LinkedQueue();
    LinkedQueue sold = new LinkedQueue();
    bought.add(new Transactions(100, 25));
    bought.add(new Transactions(200, 20));
    sold.add(new Transactions(60, 30));
    sold.add(new Transactions(240, 50));
    repeat(bought,sold);
  }
    public static int repeat(LinkedQueue bought, LinkedQueue sold){
      int gains=0;
      Transactions buy,sell;

      while (bought.front !=null && sold.front != null){
       buy = bought.first();
       sell = sold.first();
        if(buy.count< sell.count){
          gains+= buy.count*(sell.price- buy.price);
          bought.remove();
          sell.count=sold.first().count - buy.count;
        }else {
          gains+= sell.count*(sell.price- buy.price);
          sold.remove();
          if(buy.count==sell.count){
            bought.remove();
          }else {
            buy.count= buy.count-sell.count;
          }
        }
      }
      System.out.println("GAINS ARE "+gains);
      return gains;
    }



  }
