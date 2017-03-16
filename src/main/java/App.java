import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter the length of your rectangle:");
    int intLength = Integer.parseInt(myConsole.readLine());
    System.out.println("Now enter the width of your rectangle:");
    int intWidth = Integer.parseInt(myConsole.readLine());

    Rectangle userRectangle = new Rectangle(intLength, intWidth);
    boolean squareResult = userRectangle.isSquare();
    System.out.println("\nIs your rectangle a square, too? " + squareResult + "!\n");
  }
}
