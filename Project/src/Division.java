import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s= new Scanner(System.in);
		int i= s.nextInt();
		if(i%3 == 0)
		{
			if(i%5==0)
				System.out.println("Sanju weds Geeta");
			else
				System.out.println("Sanju");
			
		}
		else if(i%5 == 0)
			System.out.println("Geeta");
		
		else
			System.out.println("Sorry");
		
	}

}
