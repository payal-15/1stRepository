import java.util.Scanner;

public class TwoDArrayPractice {
	//print matrix
	void print2D(int[][] a)
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	//reading matrix
	int[][] read2D()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter no of rows you want");
		int row=sc.nextInt();
		System.out.println("ENter no of col you want");
		int col=sc.nextInt();
		System.out.println("enter "+row*col+" element");
		int a[][]=new int[row][col];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	//adding two matrix
	int[][] sum(int a[][],int b[][])
	{
		int sum[][]=new int[a.length][a[0].length];
		if(a.length == b.length && a[0].length==b[0].length)
		{
			for (int i = 0; i < sum.length; i++) {
				for (int j = 0; j < sum[i].length; j++) {
					sum[i][j]=a[i][j]+b[i][j];
				}
			}
		}else
		{
			return null;
		}
		return sum;
	}

	//biggest element in matrix
	int bigElement(int a[][])
	{
		int big=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]>big)
				{
					big=a[i][j];
				}
			}
		}
		return big;
	}

	//smallest element in matrix
	int smallElement(int a[][])
	{
		int small=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]<small)
				{
					small=a[i][j];
				}
			}
		}
		return small;
	}

	//transpose square matrix
	int[][] transpose(int a[][])
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a[i].length; j++) {
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
		return a;
	}

	//transpose non square matrix
	int[][] transposeNonSq(int a[][])
	{
		int ns[][]=new int[a[0].length][a.length];
		for (int i = 0; i < ns.length; i++) {
			for (int j = 0; j < ns[i].length; j++) {
				ns[j][i]=a[i][j];
			}
		}
		return ns;
	}

	//reverse row in matrix
	int[][] revRow(int a[][])
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length/2; j++) {
				int t=a[i][j];
				a[i][j]=a[i][a[i].length-1-j];
				a[i][a[i].length-1-j]=t;
			}
		}
		return a;
	}
	//reverse col
	int[][] revCol(int a[][])
	{
		for (int i = 0; i < a.length/2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int t=a[i][j];
				a[i][j]=a[a.length-1-i][j];
				a[a.length-1-i][j]=t;
			}
		}
		return a;
	}

	//display rowwise biggest element
	int[][] rowWiseBig(int a[][])
	{	
		int big[][]=new int[a.length][1];
		
		for (int i = 0; i < a.length; i++) {
			int bigE=a[i][0];
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]>bigE)
				{
					bigE=a[i][j];
				}
			}
			big[i][0]=bigE;
		}
		return big;
	}
	//display colwise biggest element
	int[][] colWiseBig(int a[][])
	{	
		int big[][]=new int[1][a[0].length];
		
		for (int i = 0; i < a[0].length; i++) {
			int bigE=a[i][0];
			for (int j = 0; j < a.length; j++) {
				if(a[j][i]>bigE)
				{
					bigE=a[j][i];
				}
			}
			big[0][i]=bigE;
		}
		return big;
	}

	//row wise sum
	int[][] rowsum(int a[][])
	{
		int sumA[][]=new int[a.length][1];
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			for (int j = 0; j < a[i].length; j++) {
				sum=sum+a[i][j];
			}
			sumA[i][0]=sum;
		}
		return sumA;
	}
	//90 degree left transpose,colwise reverse
	int [][] left90(int a[][])
	{
		//transpose
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a[i].length; j++) {
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
		//coloumn wise reverse
		for (int i = 0; i < a.length/2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int t=a[i][j];
				a[i][j]=a[a.length-1-i][j];
				a[a.length-1-i][j]=t;
			}
		}
		return a;
	}

	//90 right
	int[][] right90(int a[][])
	{
		//transpose
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
		TwoDArrayPractice td1 = new TwoDArrayPractice();
		td1.print2D(a);
		//row reverse
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length/2; j++) {
				int t=a[i][j];
				a[i][j]=a[i][a[i].length-1-j];
				a[i][a[i].length-1-j]=t;
			}
		}
		return a;
	}

	//spiral order 1
	void spiralOrder(int a[][])
	{
		int n=a[0].length;
		for (int i = 0,j=n-1; i < j; i++,j--) {
			for (int k = i; k<j; k++) {System.out.print(a[i][k]+" ");}
			for (int k = i; k <j; k++) {System.out.print(a[k][j]+" ");}
			for (int k = j; k >i; k--) {System.out.print(a[j][k]+" ");}
			for (int k = j;k > i; k--)	{System.out.print(a[k][i]+" ");}
		}	
		if(n%2==1)
		{
			System.out.println(a[n/2][n/2]);
		}
	}
	
	//spiral order 2
	void spiralOrder2(int a[][])
	{
		int n=a[0].length;
		for (int i = 0,j=n-1; i < j; i++,j--) {
			for (int k = i; k <j; k++) {System.out.print(a[k][i]+" ");}
			for (int k = i; k <j; k++) {System.out.print(a[j][k]+" ");}
			for (int k = j; k >i; k--) {System.out.print(a[k][j]+" ");}
			for (int k = j; k >i; k--) {System.out.print(a[i][k]+" ");}
		}
		if(n%2==1)
		{
			System.out.println(a[n/2][n/2]);
		}
	}
	
	//reverse diagonal
	int[][] reverseDiagonal(int[][] a)
	{
		for (int i = 0; i < a.length/2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j)
				{
					int t=a[i][j];
					a[i][j]=a[a.length-i][a.length-j];
					a[a.length-i][a.length-j]=t;
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
	public static void main(String[] args) {

		TwoDArrayPractice td = new TwoDArrayPractice();
		System.out.println("enter 1st matrix details");
		int mat1[][]=td.read2D();
		/*System.out.println("enter 2nd matrix details");
		int mat2[][]=td.read2D();
		System.out.println("enter 3rd matrix details");
		int mat3[][]=td.read2D();
		System.out.println("sum of 2 matrix");
		int sum[][]=td.sum(mat1, mat2);
		td.print2D(sum);
		System.out.println("sum of 3 matrixes");
		int sum3[][]=td.sum(td.sum(mat1, mat2),mat3);
		td.print2D(sum3);
		int big=td.bigElement(mat1);
		System.out.println("big element is:"+big);
		int small=td.smallElement(mat1);
		System.out.println("big element is:"+small);
		int revrow[][]=td.revRow(mat1);
		System.out.println("rev row");
		td.print2D(revrow);
		td.print2D(mat1);
		int revcol[][]=td.revCol(mat1);
		System.out.println("rev col");
		td.print2D(revcol);

		int rowBig[][]=td.rowWiseBig(mat1);
		td.print2D(rowBig);

		int colBig[][]=td.colWiseBig(mat1);
		td.print2D(colBig);

		int sum[][]=td.rowsum(mat1);
		td.print2D(sum);

		int left90[][]=td.left90(mat1);
		td.print2D(left90);*/

		/*int right90[][]=td.right90(mat1);
		td.print2D(right90);*/

		td.spiralOrder(mat1);
	}
}
