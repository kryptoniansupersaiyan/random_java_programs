import java.util.Scanner;
 class BadSubscriptCaught 
{
	public static void main(String[] args)
	{
		String[] names = {"maneesh", "manee","man", "manish","mani", "manie", "anee", "mana", "Matt", "Ciel"};
		String integer;
		try
		{
			System.out.println("Please, enter an integer from 1 to 10 to display a name");
			Scanner input= new Scanner(System.in);
			integer = input.nextLine(); 
			int i = Integer.parseInt(integer);
			i = i-1;
			System.out.println(names[i]);
			input.close();
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Your number is out of range");
		}
		
	}	
}