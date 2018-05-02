import java.util.Scanner;

public class TwoDArray2 {

	void spiralOrder(int a[][])
	{
		int n=a[0].length;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++) System.out.print(a[i][k]+" ");
			for(int k=i;k<j;k++) System.out.print(a[k][j]+" ");
			for(int k=j;k>i;k--) System.out.print(a[j][k]+" ");
			for(int k=j;k>i;k--) System.out.print(a[k][i]+" ");
		}
		if(n%2==1)
			System.out.print(a[n/2][n/2]);
	}

	void spiralOrder2(int a[][])
	{
		int n=a[0].length;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++) System.out.print(a[k][i]+" ");
			for(int k=i;k<j;k++) System.out.print(a[j][k]+" ");
			for(int k=j;k>i;k--) System.out.print(a[k][j]+" ");
			for(int k=j;k>i;k--) System.out.print(a[i][k]+" ");
		}
		if(n%2==1)
			System.out.print(a[n/2][n/2]);
	}
	int [][] reverseDiagonal(int a[][])
	{
		for(int i=0;i<a.length/2;i++)
		{
			for (int j = 0; j < a[i].length; j++) {
				if(i==j)
				{
					int t=a[i][j];
					a[i][j]=a[a.length-1-i][a.length-1-j];
					a[a.length-1-i][a.length-1-j]=t;
				}
				if(i+j==a.length-1)
				{
					int t=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=t;
				}
			} 
		}
		return a;

	}

	int biggestPSDiagonal(int a[][])
	{
		int big=a[0][0];
		for (int i = 0;  i< a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j || i+j==a.length-1)
				{
					if(a[i][j]>big)
					{
						big=a[i][j];
					}
				}
			}
		}
		return big;
	}

	void sumPSDiagonal(int a[][])
	{
		int sumP=0,sumS=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j)
				{
					sumP=sumP+a[i][j];
				}
				if(i+j==a.length-1)
				{
					sumS=sumS+a[i][j];
				}
			}
		}
		System.out.println("sum of primary diagonal="+sumP);
		System.out.println("sum of secondary diagonal="+sumS);
	}
	//biggest element in upper triangle wrt PD
	int biggestOfUTPD(int a[][])
	{
		int big=a[0][1];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(j>i)
				{
					if(a[i][j]>big)
						big=a[i][j];
				}
 			}
		}return big;
	}
	//biggest element in lower triangle wrt SD
	int leastOfLTPD(int a[][])
	{
		int small=a[1][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(j<i)
				{
					if(a[i][j]<small)
						small=a[i][j];
				}
			}
		}return small;
	}
	//sum of lower traingular elements wrt PD
	int sumLTPD(int a[][])
	{
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(j<i)
				{
					sum=sum+a[i][j];
				}
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		TwoDArray td= new TwoDArray();
		int mat1[][]=td.read2D();
		TwoDArray2 td1 = new TwoDArray2();
		td1.spiralOrder(mat1);
		System.out.println();
		td1.spiralOrder2(mat1);
		System.out.println("reverse diagonal");
		int res[][]=td1.reverseDiagonal(mat1);
		td.printTwoD(res);
		System.out.println("biggest among diagonal");
		int big=td1.biggestPSDiagonal(mat1);
		System.out.println(big);
		td1.sumPSDiagonal(mat1);
		int bigUT=td1.biggestOfUTPD(mat1);
		System.out.println(bigUT);
		int smallLT=td1.leastOfLTPD(mat1);
		System.out.println(smallLT);
		int sumLT=td1.sumLTPD(mat1);
		System.out.println(sumLT);
	}
}
