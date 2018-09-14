import java.util.Scanner;
 
class Largest
{
   public static void main(String args[])
   {
      int x, y, z,j,d;
      System.out.println("Enter 5 integers ");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
	  j = in.nextInt();
	  d = in.nextInt();
 
      if ( x > y && x > z && x > j && x > d )
         System.out.println("First number is largest.");
      else if ( y > x && y > z && y > j && y > d )
         System.out.println("Second number is largest.");
      else if ( z > y && z > x && z > j && z > d )
         System.out.println("Third number is largest.");
		 else if ( j > y && j > x && j > z && j > d )
         System.out.println("fourth number is largest.");
		 else if ( d > y && d > x && d > j && d > z )
         System.out.println("fifth number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
	 
	  if ( x < y && x < z && x < j && x < d )
         System.out.println("First number is smallest.");
      else if ( y < x && y < z && y < j && y < d )
         System.out.println("Second number is smallest.");
      else if ( z < y && z < x && z < j && z < d )
         System.out.println("Third number is smallest.");
		 else if ( j < y && j < x && j < z && j < d )
         System.out.println("fourth number is smallest.");
		 else if ( d < y && d < x && d < j && d < z )
         System.out.println("fifth number is smallest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}
