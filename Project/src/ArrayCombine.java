import java.util.Scanner;

public class ArrayCombine {

	void dispArr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i<a.length-1)
				System.out.print(",");
		}
		System.out.println();
	}

	int[] readArr()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of values to be entered");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter"+ n +"values");
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();			
		}
		return ar;
	}

	int[] combine(int x[], int y[])
	{
		int z[]=new int[x.length + y.length];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			z[x.length+i]=y[i];
		}
		return z;
	}

	int[] zigZag(int x[], int y[])
	{
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length && j< y.length)
		{
			z[k++]=x[i++];
			z[k++]=y[j++];
		}
		while(i<x.length)
		{
			z[k++]=x[i++];
		}
		while(j<y.length)
		{
			z[k++]=y[j++];
		}
		return z;
	}

	int[] merge(int x[], int y[])
	{
		int z[]= new int[x.length+ y.length];
		int i=0,j=0,k=0;
		while(i<x.length && j<y.length)
		{
			if(x[i]<y[j])
			{
				z[k++]=x[i++];
			}else
				z[k++]=y[j++];
		}
		while(i<x.length)
		{
			z[k++]=x[i++];
		}
		while(j<y.length)
		{
			z[k++]=y[j++];
		}
		return z;
	}

	int[] insertArr(int x[], int in, int ele)
	{
		if(in<0 || in>x.length)
		{
			System.out.println("Not possible");
			return x;
		}
		int na[]= new int[x.length+1];
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
			{
				na[i]=x[i];

			}else
				na[i+1]=x[i];
		}
		na[in]=ele;
		return na;
	}

	int primeNumber(int arr[])
	{	
		int no,c=0;
		PrimeNo p= new PrimeNo();
		if(arr.length>0)
		{
			for(int i=0;i<arr.length;i++)
			{
				no =arr[i];
				if(p.isPrime(no))
					c++;
			}
		}
		return c;
	}

	int strongNumber(int arr[])
	{	
		int no,c=0;
		StrongNo p= new StrongNo();
		if(arr.length>0)
		{
			for(int i=0;i<arr.length;i++)
			{
				no =arr[i];
				if(p.isStrong(no))
					c++;
			}
		}
		return c;
	}

/*	int[] delArr(int x[], int in)
	{
		if(in<0 || in>x.length)
		{
			System.out.println("Not possible");
			return x;
		}
		int na[]= new int[x.length-1];
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
			{
				na[i]=x[i];
			}else {
				for(int j=i+1;j<x.length;j++)
				{
					na[i]=x[j];
				}
			}
		}
		return na;
	}*/

	int[] delArr(int x[], int in)
	{
		if(in<0 || in>x.length)
		{
			System.out.println("Not possible");
			return x;
		}
		int na[]= new int[x.length-1];
		for(int i=0;i<na.length;i++)
		{
			if(i<in)
			{
				na[i]=x[i];
			}else {
				na[i]=x[i+1];
			}
		}
		return na;
	}
	
}
