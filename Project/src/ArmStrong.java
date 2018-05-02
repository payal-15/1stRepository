
public class ArmStrong {

	boolean isArmStrong(int no)
	{
		int sum=0,n=no;
		int c= noOfDigits(n);
		do {
			int r=n%10;
			sum=sum+pow(r,c);
			n=n/10;
		}while(n!=0);
		return sum==no;
	}
	
	int noOfDigits(int no)
	{
		int count=0;
		do {
			count++;
			no=no/10;
		}while(no!=0);
		
		return count;
	}
	
	int pow(int n, int p)
	{
		int pw=1;
		while(p!=0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
}
