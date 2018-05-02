import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner s= new Scanner(System.in);
		int no=s.nextInt();
		if(no<0)
			System.out.println("the no is negative");
		else
			System.out.println("the no is positive");
	}

}
