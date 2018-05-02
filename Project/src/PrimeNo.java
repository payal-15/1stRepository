import java.util.Scanner;

public class PrimeNo {
	
	int countPrime(int no)
	{
		int c=0;
		while(no>1)
		{
			boolean rs=isPrime(no);
			if(rs)
			{
				c++;
			}
			no--;
		}
		return c;
	}
	boolean isPrime(int no)
	{
		int n=no/2;
		int i=2;
		while(i<=n)
		{
			if(no%i==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int no=s.nextInt();
		PrimeNo pn = new PrimeNo();
		int count=pn.countPrime(no);
		System.out.println(count);
	}
}
