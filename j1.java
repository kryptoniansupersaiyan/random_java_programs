import java.util.Scanner;
import java.io.*;
 class empdetail
{
	int empno,DA,Basic,HRA,IT;
	String Name,Dept ;
	float salary;
 public void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter employee no");
		empno=in.nextInt();
		System.out.println("enter employee name");
		Name=in.nextLine();
		System.out.println("enter employee department");
		Dept=in.nextLine();
		System.out.println("enter employee BAsIC");
		Basic=in.nextInt();
		System.out.println("enter employee hra");
		HRA=in.nextInt();
		System.out.println("enter employee it");
		IT=in.nextInt();
		System.out.println("enter employee DA");
		DA=in.nextInt();
	}
	public void display()
	{
		
		System.out.println("employee no"+empno);
		System.out.println("name"+Name);
	  System.out.println("dept"+Dept);
	  for ( int i=0;i<3;i++)
	  {
		  salary=(Basic+DA+HRA-IT);
	  }
	  System.out.println("SALARY"+salary);
	}
	public static void main(String[]args)
	{
		empdetail e[]= new empdetail[3];
		for ( int j=0;j<3;j++)
	  {
	  e[j].input();
	  }
	  System.out.println("data");
	  for ( int k=0;k<3;k++)
	  {
		  e[k].display();
	  }
	}
}