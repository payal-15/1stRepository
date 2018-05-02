
public class Array4 {

	int nthBiggest(int a[], int n)
	{
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
					count++;
			}
			if (count==n-1)
				return a[i];
		}
		System.out.println("not found");
		return 0;
	}

	int mostFrequent(int a[])
	{
		int ele=a[0],oC=1;
		for(int i=0;i<a.length;i++)
		{	
			int c=1;
			for( int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c>oC)
			{
				ele=a[i];
				oC=c;
			}
		}
		return ele;
	}

	int[] evenOdd(int a[])
	{
		int eo[]=new int[2];
		int e=0,o=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				e++;
			}else
				o++;
		}
		eo[0]=e;
		eo[1]=o;
		return eo;
	}

	void pair(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					System.out.println(a[i] +","+a[j] );
				}
			}
		}
	}

	void highest(int a[])
	{	
		int ht=a[0]+a[1];
		int f=a[0];
		int s=a[1];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==ht)
				{
					f=a[i];
					s=a[j];
					ht=a[i]+a[j];
				}
			}
		}
	}
	public static void main(String[] args) {

		Array4 a4 = new Array4();
		int a[]= {25,56,78,18,22,57};
		int b[]= {2,5,6,4,8,7,5,3,2,1};
		int c[]= {9,2,2,1,3,4,5,5,5,5,5};
		//nth biggest
		System.out.println("nth biggest");
		int res1=a4.nthBiggest(a, 3);
		System.out.println(res1);
		//most frequent
		System.out.println("most frequent");
		int res2=a4.mostFrequent(c);
		System.out.println(res2);
		//even odd
		System.out.println("even odd");
		int res3[]=a4.evenOdd(a);

		System.out.println(res2);
		ArrayCombine ac = new ArrayCombine();
		ac.dispArr(res3);
		System.out.println("pair is");
		a4.pair(b, 10);
	}
}
