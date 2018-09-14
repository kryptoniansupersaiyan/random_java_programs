import java.util.Scanner;
class solve
{
	 public static void main(String args[]){
	int N;

	 Scanner in= new Scanner(System.in);
	 N = in.nextInt();
	String[] arr = new String[N];
	 for(int i=0;i<N;i++)
	 {
		 Scanner tt = new Scanner(System.in);
		 arr[i]= tt.nextLine();
		}
		Scanner zon= new Scanner(System.in);
		String D=zon.nextLine();
		for(int j=0;j<N;j++)
		{
			Scanner tem= new Scanner(arr[j]);
		 String F=tem.next();
		 String Z=tem.next();
			if(D.equals(Z)){
			 System.out.println (F);
			
			
			}
		}
			
		
	 
	 }
}