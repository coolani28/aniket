import java.util.Scanner;
 
class large
{
   public static void main(String args[])
   {
      int a, b, c;
      System.out.println("Enter 3 integers: ");
      Scanner in = new Scanner(System.in);
 
      a = in.nextInt();
      b = in.nextInt();
      b = in.nextInt();
 
      if ( a > b && a > c )
         System.out.println("First number is largest.");
      else if ( b > a && b > c )
         System.out.println("Second number is largest.");
      else if ( c > a && c > a )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}