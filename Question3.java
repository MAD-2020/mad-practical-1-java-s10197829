import java.util.Scanner;

public class Question3
{
  public static void main(String[] args) {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = input.nextInt();
    int result = num * num;
    System.out.println("The result is: " + result);
  }
}
