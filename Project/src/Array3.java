
public class Array3 {

	void printNoOfOccurance(int ar[])
	{	
		int n=ar.length;
		for(int i=0;i<n;i++)
		{
			int c=1;
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]==ar[j])
				{
					c++;
					ar[j]=ar[n-1];
					n--;
					j--;
				}
			}
			System.out.println(ar[i]+" occured " + c + " time.");
		}
	}

	int[] uniqueArr(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{	
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
		}
		int na[]= new int[n];
		for(int i=0;i<n;i++)
		{
			na[i]=a[i];
		}
		return na;
	}

	void commonArray(int a[], int b[])
	{
		int na=a.length;
		int nb=b.length;
		//for a
		for(int i=0;i<na;i++)
		{
			for(int j=0;j<na;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[na-1];
					j--;
					na--;
				}
			}
		}
		int aU[]=new int[na];
		for(int i=0;i<na;i++)
		{
			aU[i]=a[i];
		}

		//for b
		for(int i=0;i<nb;i++)
		{
			for(int j=0;j<nb;j++)
			{
				if(b[i]==b[j])
				{
					b[j]=b[nb-1];
					j--;
					nb--;
				}
			}
		}
		int bU[]=new int[nb];
		for(int i=0;i<nb;i++)
		{
			bU[i]=b[i];
		}
		
		//for comparing
		for(int i=0;i<aU.length;i++)
		{
			for(int j=0;j<bU.length;j++)
			{
				if(aU[i]==bU[j])
				{
					System.out.println(aU[i]);
				}
			}
		}
	}
	
	void unionArr(int a[],int b[])
	
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
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
				System.out.println(b[i]);
			}
		}
	}

	public static void main(String[] args) {

		int ar[]= {23,45,56,78,56,23,78,58,56,32,56,32,56,78,82,19,20};
		int m[]= {2,7,9,2};
		int n[]= {2,10,9,7,10};
		Array3 a = new Array3();
		a.printNoOfOccurance(ar);
		int res[]=a.uniqueArr(ar);
		ArrayCombine ac = new ArrayCombine();
		ac.dispArr(res);
		a.commonArray(m, n);
		
	}
}
