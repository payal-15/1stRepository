import java.util.Scanner;

public class Fibonacci {
	// 1,1,2,3,5,8,13
	void printFibonacci(int no)
	{	
			int i=0,j=1,sum=0;
			while(no!=0)
			{
				sum=i+j;
				System.out.println(j);
				i=j;
				j=sum;
				no--;
			}
		
		}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int no=sc.nextInt();
		Fibonacci f = new Fibonacci();
		f.printFibonacci(no);
	}
}
