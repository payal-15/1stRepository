
public class Array5 {

	void pairSum(int a[], int b[], int n)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]+b[j]==n)
				{
					System.out.println(a[i] + " "+b[j]);
				}
			}
		}
	}

	boolean elementPresent(int a[], int b[])
	{	
		int count=0;
		int aLength=a.length;
		for(int i=0;i<a.length;i++)

		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count=count+1;
				}
			}
		}
		return count==aLength;
	}

	int[] addArray(int a[], int b[], int n)
	{	
		int res[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{	
			if(i<n)
			{
				res[k++]=a[i];
			}
			else if(i>n) 
			{
				for(int j=0;j<b.length;j++)
				{
					res[k++]=b[j];
				}
				if(b.length+n==k) {
					for(int j=i-1;j<a.length;j++)
					{

						res[k++]=a[j];
					}
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6};
		int b[]= {3,5,2,6,4,8,9};
		Array5 a5 = new Array5();
		a5.pairSum(a, b, 6);
		boolean res=a5.elementPresent(a, b);
		System.out.println(res);
		int rs[]=a5.addArray(a, b, 3);
		ArrayCombine ac = new ArrayCombine();
		ac.dispArr(rs);

	}

}
