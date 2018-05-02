import java.util.Scanner;

public class Factorial {
	
	static int getFact(int n)
	{
		int fact=1, i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a no: ");
		int no=s.nextInt();
		int factorial=getFact(no);
		System.out.println(factorial);
	}
}
