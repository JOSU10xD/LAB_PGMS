import java.util.Scanner;

public class Stack {

  private int maxSize;
  private int[] stackArray;
  private int top;

  public Stack(int size) {
    this.maxSize = size;
    this.stackArray = new int[maxSize];
    this.top = -1;
  }

  public void push(int value) {
    if (top < maxSize - 1) {
      stackArray[++top] = value;
      System.out.println(value + " pushed to stack");
    } else {
      System.out.println("Stack overflow! Cannot push " + value);
    }
  }

  public int pop() {
    if (top >= 0) {
      int value = stackArray[top--];
      System.out.println(value + " popped from stack");
      return value;
    } else {
      System.out.println("Stack underflow! Cannot pop from an empty stack");
      return -1;
    }
  }

  public void display() {
    if (top == -1) {
      System.out.println("Stack is empty.");
    } else {
      System.out.println("Stack elements:");
      for (int i = top; i >= 0; i--) {
        System.out.println(stackArray[i]);
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the stack: ");
    int size = scanner.nextInt();
    Stack stack = new Stack(size);

    boolean exit = false;
    while (!exit) {
      System.out.println();
      System.out.println("Select operation:");
      System.out.println("1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Display stack");
      System.out.println("4. Exit");

      System.out.print("Enter choice: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Enter value to push: ");
          stack.push(scanner.nextInt());
          break;
        case 2:
          stack.pop();
          break;
        case 3:
          stack.display();
          break;
        case 4:
          exit = true;
          break;
        default:
          System.out.println("Invalid choice. Please select a valid option.");
      }
    }
  }
}
