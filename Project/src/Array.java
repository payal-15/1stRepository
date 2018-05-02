import java.util.Scanner;

public class Array {
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

	int[] add(int a[], int b[])
	{
		if(a.length !=b.length)
		{
			System.out.println("Addition not possible");
			return null;
		}
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		return c;
	}
	
	int sum(int ar[])
	{
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			
			sum=sum+ar[i];
			
		}
		return sum;
	}

}
