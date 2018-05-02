import java.util.Scanner;

public class ThreeDigit {

	public static void main(String[] args) {
		System.out.println("Enter no: ");
		Scanner s = new Scanner(System.in);
		int no=s.nextInt();
		if(no>=100 && no<=999 || no<= -100 && no>= -999)
			System.out.println("The no. is 3 digit");
		else
			System.out.println("the no is not 3 digit");
		
	}

}
