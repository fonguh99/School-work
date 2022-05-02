/** Compute the Factorial of n, where n=6.
  *    n! = 1*2*3*...*n
  */
public class fact {
   public static void main(String[] args) {
      int n = 6;          // To compute factorial of n
      int factorial = 1;   // Init the product to 1
 
      int i = 1;
      while (i <= n) {
         factorial = factorial * i;
         i++;
      }
      System.out.println("The Factorial of " + n + " is " + factorial);
   }
}
