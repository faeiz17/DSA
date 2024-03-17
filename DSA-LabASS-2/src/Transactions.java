import java.util.Date;

public class Transactions {
  public int count;
  public int price;


  @Override
  public String toString() {
    return "Transactions{" +
        "count=" + count +
        ", price=" + price +
        '}';
  }

  public Transactions(int count, int price) {
    this.count = count;
    this.price = price;


  }



}
