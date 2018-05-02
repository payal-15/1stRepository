import java.util.Scanner;

public class PerfectNumber {
	
	void printPerfect(int x)
	{
		for(int i=1;i<=x;i++)
		{
			boolean rs=perfectNo(i);
			if(rs)
				System.out.println(i);
		}
			
	}
	boolean perfectNo(int no)
	{
		int m=1,n=no/2,sum=0;
		while(m<=n)
		{
			if(no%m==0)
			{
				sum=sum+m;
			}m++;
		}
		return sum==no;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number");
		int x= s.nextInt();
		PerfectNumber pn = new PerfectNumber();
		pn.printPerfect(x);
	}
}
