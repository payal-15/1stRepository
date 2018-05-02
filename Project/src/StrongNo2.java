
public class StrongNo2 {
	
	void printStrong()
	{
		for (int i=1; i<=100000; i++)
		{
			boolean rs=isStrong(i);
			if(rs)
				System.out.println(i);
		}
	}
	
	boolean isStrong(int no)
	{
		int n=no, sum=0;
		do {
			int r=n%10;
			sum=sum+fac(r);
			n=n/10;
		}while(n!=0);
		return sum == no;
	}
	int fac(int no)
	{
		int f=1;
		while(no!=0)
		{
			f=f*no;
			no--;
		}return f;
	}
}