import java.util.Scanner;

class Node {
  public String value;
  public Node next;

  public Node(String value) {
    this.value = value;
    this.next = null;
  }
}

class LinkedList {
  private Node head;

  public LinkedList() {
    head = null;
    initializeList();
  }

  private void initializeList() {
    for (int i = 0; i < 9; i++) {
      insert(" ");
    }
  }

  public void insert(String value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public String get(int position) {
    Node current = head;
    int index = 0;
    while (current != null) {
      if (index == position) {
        return current.value;
      }
      current = current.next;
      index++;
    }
    return null;
  }

  public boolean set(int position, String value) {
    Node current = head;
    int index = 0;
    while (current != null) {
      if (index == position) {
        current.value = value;
        return true;
      }
      current = current.next;
      index++;
    }
    return false;
  }

  public int indexOf(String value) {
    Node current = head;
    int index = 0;
    while (current != null) {
      if (current.value.equals(value)) {
        return index;
      }
      current = current.next;
      index++;
    }
    return -1;
  }
}

public class TicTacToe {
  private LinkedList board;
  private String currentPlayer;

  public TicTacToe() {
    board = new LinkedList();
    currentPlayer = "X";
  }

  private void printBoard() {
    System.out.println("-------------");
    for (int i = 0; i < 9; i += 3) {
      System.out.println("| " + board.get(i) + " | " + board.get(i + 1) + " | " + board.get(i + 2) + " |");
      System.out.println("-------------");
    }
  }

  private boolean makeMove(int position) {
    if (position < 1 || position > 9 || !board.get(position - 1).equals(" ")) {
      return false;
    }

    board.set(position - 1, currentPlayer);
    return true;
  }

  private boolean checkWin() {
    // Check rows
    for (int i = 0; i < 9; i += 3) {
      if (!board.get(i).equals(" ") && board.get(i).equals(board.get(i + 1)) && board.get(i).equals(board.get(i + 2))) {
        return true;
      }
    }

    // Check columns
    for (int i = 0; i < 3; i++) {
      if (!board.get(i).equals(" ") && board.get(i).equals(board.get(i + 3)) && board.get(i).equals(board.get(i + 6))) {
        return true;
      }
    }

    // Check diagonals
    if (!board.get(0).equals(" ") && board.get(0).equals(board.get(4)) && board.get(0).equals(board.get(8))) {
      return true;
    }

    if (!board.get(2).equals(" ") && board.get(2).equals(board.get(4)) && board.get(2).equals(board.get(6))) {
      return true;
    }

    return false;
  }

  private void switchPlayer() {
    currentPlayer = (currentPlayer.equals("X")) ? "O" : "X";
  }

  public void play() {
    Scanner scanner = new Scanner(System.in);
    int position;

    System.out.println("Welcome to Tic-Tac-Toe!");

    while (true) {
      printBoard();
      System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");

      try {
        position = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a number from 1 to 9.");
        scanner.nextLine();
        continue;
      }

      if (!makeMove(position)) {
        System.out.println("Invalid move. Please select an empty position.");
        continue;
      }

      if (checkWin()) {
        printBoard();
        System.out.println("Player " + currentPlayer + " wins! Game over.");
        break;
      }

      if (board.indexOf(" ") == -1) {
        printBoard();
        System.out.println("It's a tie! Game over.");
        break;
      }

      switchPlayer();
    }

    scanner.close();
  }

  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.play();
  }
}
