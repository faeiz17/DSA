//Greetings in DSA style😁
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class EidGreetings {

  // A method to generate a random emoji from a list
  public static String randomEmoji() {
    String[] emojis = {"😊", "🌙", "🌟", "🎁", "🎈", "🎉", "🙏"};
    int index = (int) (Math.random() * emojis.length);
    return emojis[index];
  }

  // A method to print a greeting message with some emojis using a queue and a stack
  public static void printGreeting(String name) {
    // Create a queue of greetings
    Queue<String> greetings = new LinkedList<>();
    greetings.add("Eid Mubarak, " + name + "!");
    greetings.add("May this Eid bring you joy and peace");
    greetings.add("May Allah bless you and your family");
    greetings.add("Have a wonderful day");

    // Create a stack of emojis
    Stack<String> emojis = new Stack<>();
    for (int i = 0; i < 4; i++) {
      emojis.push(randomEmoji());
    }

    // Print the greetings and emojis in reverse order
    while (!greetings.isEmpty() && !emojis.isEmpty()) {
      System.out.println(greetings.remove() + emojis.pop());
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    sc.close();
    printGreeting(name);
  }
}