import java.util.Scanner;
class JavaExample {

    public static void main(String[] args) {

        int count , num1 = 0, num2 = 1;
		Scanner d=new Scanner(System.in);
		count=d.nextInt();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}