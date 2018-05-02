import java.util.Scanner;

public class SumOfDigit {
	int sum=0;
	int addDigit(int no)
	{
		while (no!=0)
		{
			int i=no%10;
			sum=sum+i;
			no=no/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a digit: ");
		Scanner s= new Scanner(System.in);
		int no=s.nextInt();
		SumOfDigit d=new SumOfDigit();
		int count=d.addDigit(no);
		System.out.println(count);
	}
}
