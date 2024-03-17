public class roman_to_number {
  public int change(String s){
    if(isValid(s)==true){
      System.out.println("it is a valid roman number hence the numberic conversion is \n");
    }else System.out.println("invalid inpur");
    return 0;
  }

  private boolean isValid(String s) {
    switch (s){
      case "I": return true;
      case "V": return true;
      case "X": return true;
      case "L": return true;
      case "C": return true;
      case "D": return true;
      case "M": return true;

    }return false;
  }

}
class hello{
  public static void main(String[] args) {


  roman_to_number k = new roman_to_number();
  k.change("III");
}}

