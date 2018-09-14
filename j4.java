import java.util.Scanner;
class JavaExample {

    public static void main(String[] args) {

        int num, number, temp, total = 0;
         Scanner d=new Scanner(System.in);
		 num= d.nextInt();
        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}