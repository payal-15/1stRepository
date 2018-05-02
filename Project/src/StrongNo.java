
public class StrongNo {
	boolean isStrong(int no)
	{
		int sum=0, n=no;
		do {
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}while(n!=0);
		
		if(sum==no)
			return true;
		else
			return false;
		
	}
	
	int fact(int r)
	{
		int fact=1;
		while(r!=0)
		{
			fact=fact*r;
			r--;
		}
		return fact;
	}
}
