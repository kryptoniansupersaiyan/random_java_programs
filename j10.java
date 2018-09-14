import java.util.Scanner;
class string
{
	public static void main(String[] args)
	{
int i;
int n;
System.out.println(" Enter the maximun number of strings");
Scanner a= new Scanner(System.in);
i=a.nextInt();
String[] arr = new String [i];	
for(int j=0;j<=i+1;i++)
{
	System.out.println("1. Insertion");
	System.out.println("2. deleate");
	System.out.println("3. display");
	System.out.println("choose");
	Scanner d= new Scanner(System.in);
           n=d.nextInt();
	switch (n)
	{
		case 1:
		System.out.println("insert");
		Scanner b= new Scanner(System.in);
		arr[j] = a.nextLine();
		break;
		
		case 2:
		System.out.println("insert the position");
		Scanner c= new Scanner(System.in);
		
		arr[c.nextInt()] = null;
		break;
		
		case 3:
		for(int k=0;k<=i+1;i++)
		{
			System.out.println( arr[k] );
		}
		break;
	}
}
	}
}
			
		
		
		
	


