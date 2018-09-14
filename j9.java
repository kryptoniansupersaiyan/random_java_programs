import java.util.Scanner;
import java.io.*;
 class empdetails
{
	public int empno,DA,Basic,HRA,IT;
	String Name,Dept ;
	float salary;
	 public void input()
	{
		Scanner in=new Scanner(System.in);
		empno=in.nextInt();
		switch (empno)
		{
		case 1001:
		Name = "Ashish";
		Dept = "Engineer";
		DA = 20000;
		break;
		case 1002:
		Name= "Sushma";
		Dept= "consultant";
		DA= 32000;
		break;
		case 1003:
		Name= "Rahul";
		Dept= "acountant";
		DA= 12000;
		break;
		}
	
	System.out.println("enter employee BAsIC");
		Basic=in.nextInt();
		System.out.println("enter employee hra");
		HRA=in.nextInt();
		System.out.println("enter employee it");
		IT=in.nextInt();
}
 public void display()
{
	System.out.println("employee no"+empno);
		System.out.println("name"+Name);
	  System.out.println("dept"+Dept);
	  System.out.println("DA"+DA);
	  System.out.println("Basic"+Basic);
	  System.out.println("IT"+IT);
	  System.out.println("dept"+Dept);
	  System.out.println("HRA"+HRA);
	  salary = HRA+DA+Basic-IT;
	   System.out.println("salary"+salary);
}
public static void main(String[]args)
{
	empdetails obj = new empdetails();
      obj.input();
	  obj.display();
}
}


	
	