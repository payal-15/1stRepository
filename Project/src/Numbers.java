import java.util.Scanner;

public class Numbers {
	
	String decToBin(int no)
	{
		String bin ="";
		while(no!=0)
		{
			int r=no%2;
			bin=r+bin;
			no=no/2;
		}
		return bin;
	}
	String decToOct(int no)
	{
		String oct="";
		while(no!=0)
		{	
			int r=no%8;
			oct=r+oct;
			no=no/8;
		}
		return oct;
	}
	
	String decToHex(int no)
	{
		String hex="";
		while(no!=0)
		{
			int r=no%16;
			if(r<10)
			{
				hex=r+hex;
			}
			else
			{
				hex=(char)(r+55)+hex;
			}
			no=no/16;
		}
		return hex;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		Numbers n = new Numbers();
	//	String rs=n.decToBin(no);
		String rs=n.decToOct(no);
		System.out.println(rs);
	}

}
