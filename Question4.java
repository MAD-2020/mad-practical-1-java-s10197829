import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
   
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    for (int i = num; i > 0; i --){
      for (int j = 0; j < i; j ++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
