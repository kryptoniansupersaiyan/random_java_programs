import java.util.Scanner;
import java.util.*;
	class Video{
	String title;
	boolean[]  flag=new boolean[10];
	
	int[] user_rating=new int[10];
	void being_checkedout(int i)
	{
		if(flag[i]==true)
			flag[i]=false;
	}
	void being_returned(int j)
	{
		if(flag[j]==false)
		  flag[j]=true;
	}
	void receive_a_rating(int n,int no)
	{
		user_rating[n]=no;
	}
}
class VideoStore extends Video
{
Video obj=new Video();
	String[] videos=new String[10];
	int[] rate=new int[10];
	int i=0;
	
	void addVideo(String title)
	{
	
	videos[i++]=title;	
	}
	void checkOut(String nm)
	{
	
		int j,index=0;
		for(j=0;j<3;j++)
		{
			if(videos[j].equals(nm))
			{
				index=j;
			}
		}
		being_checkedout(index);
	}
	void returnVideo(String nm)
	{
		int j,index=0;
		for(j=0;j<3;j++)
		{
			if(videos[j].equals(nm))
			{
				index=j;
			}
		}
		being_returned(index);
	}
	void receiveRating(int n, int no )
	{
		rate[n]=no;
		receive_a_rating(n,no);
	}
	void listInventory()
	{
		int i;
		
		for(i=0;i<3;i++)
		{
			
		    if(flag[i]==true)
			System.out.println(videos[i]+" " +flag[i]);
		}
		
	}
}
class store extends VideoStore
{
	public static void main(String args[])
	{
		VideoStore o=new VideoStore();
		Arrays.fill(o.flag, true);
		Scanner inter=new Scanner(System.in);
		Scanner rate=new Scanner(System.in);
		System.out.println("enter movie name");
		
		String mov1= inter.nextLine();
		String mov2 =inter.nextLine();
		String mov3 =inter.nextLine();
		System.out.println("enter rating");
		int r1=rate.nextInt();
		int r2=rate.nextInt();
		int r3=rate.nextInt();
		o.addVideo(mov1);
		o.addVideo(mov2);
		o.addVideo(mov3);
		o.receiveRating(0, r1);
		o.receiveRating(1, r2);
		o.receiveRating(2, r3);
	    o.checkOut(mov1);
		o.checkOut(mov2);
		o.checkOut(mov3);
		o.returnVideo(mov1);
		o.returnVideo(mov2);
		o.returnVideo(mov3);
		o.listInventory();
		
	}
}

