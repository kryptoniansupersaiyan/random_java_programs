import java.io.*;

class ExcepTest {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         System.out.println("Access element three :" + a[4]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println(e);
      }
      System.out.println("Out of the block");
   }
}