import java.util.Scanner;
/**
 * This program divides two numbers and gives you the remainder
 * @author David Toma
 */
public class Main {
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask user for the two integers on seperate lines
    System.out.println("Please enter in two integers, on seperate lines, to divide:");

    int integer1 = input.nextInt();
    int integer2 = input.nextInt();

    int answer = integer1 / integer2;
    int remainder = integer1 % integer2;

    System.out.println("The answer is " + answer + "  remainder " + remainder + ".");

    
  }
}
