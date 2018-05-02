
public class practice2 {
	void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
		}
	}
	void printPat1Space(int n)
	{
		int no=2*(n-1);
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			no--;
		}

	}
}
