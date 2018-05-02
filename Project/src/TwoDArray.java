import java.util.Scanner;

public class TwoDArray {

	void printTwoD(int ar[][])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

	//Read element from user
	int[][] read2D()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows you want in 2-d");
		int row=sc.nextInt();
		System.out.println("Enter no of cols you want in 2-d");
		int col=sc.nextInt();
		int mat[][]=new int[row][col];

		System.out.println("Enter the "+row*col+ " elements");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}


	//addition of matrix
	int[][] addMatrix(int mat1[][], int mat2[][])
	{
		if(mat1.length !=mat2.length || mat1[0].length!=mat2[0].length)
		{
			return null;
		}
		int add[][]=new int[mat1.length][mat1[0].length];
		for (int i = 0; i < add.length; i++) {
			for (int j = 0; j < add[i].length; j++) {
				add[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		return add;
	}

	//return biggest element from matrix
	int getbig(int mat[][])
	{
		int big=mat[0][0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(big<mat[i][j])
				{
					big=mat[i][j];
				}

			}
		}
		return big;	
	}
	//return smallest element from matrix
	int getsmall(int mat[][])
	{
		int small=mat[0][0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(small>mat[i][j])
				{
					small=mat[i][j];
				}

			}
		}
		return small;	
	}
	//return no of positive  element from matrix
	int getnoOfPositive(int mat[][])
	{
		int p=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]>0)
				{
					p++;
				}

			}
		}
		return p;	
	}

	//TRANSPOSE
	void transpose(int a[][])
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a[i].length; j++) {
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
	}
	//transpose the non square matrix
	int[][] transposenonsq(int a[][])
	{
		int na[][]=new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				na[j][i]=a[i][j];
			}
		}
		return na;
	}

	//reverse the row
	void reverseRow(int a[][])
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length/2; j++) {
				
				int t=a[i][j];
				a[i][j]=a[i][a[i].length-1-j];
				a[i][a[i].length-1-j]=t;
			}
		}
	}
	
	//reverse the column
	void reverseCol(int a[][])
	{
		for (int i = 0; i < a.length/2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				int t=a[i][j];
				a[i][j]=a[a.length-1-i][j];
				a[a.length-1-i][j]=t;
			}
		}
	}
	
	//
	void goLeft(int a[][])
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int t=a[i][j];
				a[i][j]=a[i][a[i].length-1];
				a[i][a[i].length-1]=t;
				
			}
		}
	}
	public static void main(String[] args) {

		int ar[][]= {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
		TwoDArray td = new TwoDArray();
		td.printTwoD(ar);

		//READ THE MATRIX ELEMENTs.
		System.out.println("Enter first matrix ements: ");
		int mat1[][]=td.read2D();
		/*	System.out.println("Enter SECOND matrix ements: ");
		int mat2[][]=td.read2D();
		System.out.println("Enter Third matrix ements: ");
		int mat3[][]=td.read2D();
		System.out.println("FIrst matrix Element");
		td.printTwoD(mat1);
		System.out.println("second matrix Element");
		td.printTwoD(mat2);

		// Addition of 2 matrix
		int sum[][]=td.addMatrix(mat1, mat2);
		if(sum==null)
		{
			System.out.println("Addition not possible");
		}else
		{
			System.out.println("Added matrix ");
			td.printTwoD(sum);
		}

		//addition of 3 matrix
		int sum1[][]=td.addMatrix(td.addMatrix(mat1, mat2),mat3);
		if(sum1==null)
		{
			System.out.println("Addition not possible");
		}else
		{
			System.out.println("Added matrix: ");
			td.printTwoD(sum1);
		}
		int big=td.getbig(mat1);
		int small=td.getsmall(mat1);
		int positive=td.getnoOfPositive(mat1);
		System.out.println(big+" "+small+" "+ positive);

		//transpose
		td.transpose(mat1);
		td.printTwoD(mat1);

		//transpose non square
		int resT[][]=td.transposenonsq(mat1);
		td.printTwoD(resT);
		
		//reverse row
		td.reverseRow(mat1);
		td.printTwoD(mat1);
		//reverse col
		td.reverseCol(mat1);
		td.printTwoD(mat1);*/
		
		td.goLeft(mat1);
		td.printTwoD(mat1);
	}

}
