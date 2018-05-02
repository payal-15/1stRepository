
public class ArmStrong2 {
	
	void printArm()
	{
		for(int i=1;i<=10000;i++)
		{
			boolean rs=isArmstrong(i);
			if(rs)
			System.out.println(i);
		}
	}
	boolean isArmstrong(int no)
	{
		int sum=0, n=no;
		int c=noOfDigits(n);
		while(n!=0)
		{
			int m=n%10;
			sum=sum+pow(m,c);
			n=n/10;
		}
		return sum==no;
	}
	int noOfDigits(int no)
	{
		int count=0;
		do
		{
			count++;
			no=no/10;
		}while(no!=0);
		return count;
			
	}
	int pow(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
}
