import java.util.*;
import java.util.Scanner;

class ScannerDemo {
   public static void main(String[] args) {
String D;
   String s = "Hello World! 3 + 3.0 = 6 ";

      // create a new scanner with the specified String Object
      Scanner scanner = new Scanner(s);

      // find the next token and print it
       D=scanner.next();

      // find the next token and print it
      System.out.println("" + scanner.next());
	  System.out.println(D);

      // close the scanner
      scanner.close();
   }
}