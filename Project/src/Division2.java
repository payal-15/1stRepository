import java.util.Scanner;

public class Division2 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner s= new Scanner(System.in);
		int no=s.nextInt();
		if(no%5 == 0)
		{	
			if(no%9 == 0)
				System.out.println("fizz and buzz");
			else
				System.out.println("fizz");
		}else if(no%9 == 0)
			System.out.println("buzz");
		
	}

}
