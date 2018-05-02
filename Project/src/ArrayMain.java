import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		int ar[]= {1,2,3};
		Array s = new Array();
		s.dispArr(ar);
		int a[]= {1,2,3};
		int b[]= {2,3,4};
		int rs[]=s.add(a, b);
		s.dispArr(a);
		s.dispArr(b);
		if(rs!=null)
		{
		s.dispArr(rs);
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no. of values");
		int n=sc.nextInt();
		int array[]= new int[n];
		System.out.println(" enter" + n + "values");
		for (int i = 0; i < n; i++) 
		{
			array[i]=sc.nextInt();
		}
		System.out.println("entered array");
		s.dispArr(array);
		System.out.println("sum is");
		int sum=s.sum(array);
		System.out.println(sum);
	}
}
