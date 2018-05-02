import java.util.Scanner;

public class Delete {

	void dispArr(int a[]) {
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i<a.length)
				System.out.print(",");
		}
		System.out.println();
	}

	int[] add(int a[], int b[])
	{	
		if(a.length!=b.length)
		{
			System.out.println("not possible");
			return null;
		}
		int c[]= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		return c;
	}

	int sumArr(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

	int[] combine(int a[],int b[])
	{
		int ar[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			ar[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			ar[a.length+i]=b[i];
		}
		return ar;
	}

	int[] zigzag(int a[], int b[])
	{
		int z[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			z[k++]=a[i++];
			z[k++]=b[j++];
		}
		if(i<a.length)
			z[k++]=a[i++];
		if(j<b.length)
			z[k++]=b[j++];

		return z;
	}

	int[] sort(int a[],int b[])
	{
		int c[]= new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k++]=a[j++];
			}else
			{
				c[k++]=b[i++];
			}
		}
		if(i<a.length)
		{
			c[k++]=a[i++];
		}
		if(j<b.length)
		{
			c[k++]=b[j++];
		}
		return c;
	}

	int[] insert(int a[], int in, int ele)
	{
		if(in<0 || in>a.length)
		{
			System.out.println("not possible");
			return a;
		}
		int res[]=new int[a.length+1];
		for(int i=0;i<a.length;i++)
		{
			if(i<in)
			{
				res[i]=a[i];
			}else 
			{
				res[i+1]=a[i];
			}
		}
		res[in]=ele;
		return res;
	}

	void noOfOccurance(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=a[n-1];
					j--;
					n--;
				}
			}
			System.out.println(a[i]+count);
		}
	}

	int[] unque(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					j--;
					n--;
				}
			}
		}
		int rs[]=new int[n];
		for(int i=0;i<n;i++)
		{
			rs[i]=a[i];
		}
		return rs;
	}
	void common(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
	void union(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{	
			int f=0;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.print(b[i]);
			}
		}
	}
	int nthBiggest(int a[],int n)
	{	
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					c++;
				}
			}
			if(c==n-1)
			{
				return a[i];
			}
		}
		System.out.println("not found");
		return 0;
	}
	int mostFrequent(int a[])
	{
		int mf=a[0];
		int oc=1;
		for(int i=0;i<a.length;i++)
		{	
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}

			}
			if(c>oc)
			{
				mf=a[i];
				oc=c;
			}
		}
		return mf;
	}
	int[] evenOdd(int a[])
	{
		int eo[]=new int[2];
		int e=0,o=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				e++;
			else
				o++;
		}
		eo[0]=e;
		eo[1]=o;
		return eo;
	}

	void pair(int a[], int n)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					System.out.println(a[i]+ a[j]);
				}
			}
		}
	}
	void pairSumHigh(int a[])
	{
		int hg=a[0]+a[1];
		int f=a[0];
		int s=a[1];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]>hg)
				{
					hg=a[i]+a[j];
					f=a[i];
					s=a[j];
				}
			}
		}
		System.out.println(f+s);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of element you want to insert in array");
		int no=sc.nextInt();
		System.out.println("enter "+no+"element");
		int ar[]=new int[no];
		for(int i=0;i<no;i++)
		{
			ar[i]= sc.nextInt();
		}

	}
}

