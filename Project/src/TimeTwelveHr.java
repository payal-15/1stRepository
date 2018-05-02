import java.util.Scanner;

public class TimeTwelveHr {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter hour");
		int hr=s.nextInt();
		System.out.println("Enter min");
		int mn=s.nextInt();
		System.out.println("Enter sec");
		int sc=s.nextInt();
		System.out.println(hr);
		if(hr > 12)
			System.out.println("the time: " +hr + ":" + mn + ":" +sc+" in 24 hour format");
		else
			System.out.println("the time: " +hr + ":" + mn + ":" +sc+" in 12 hour format");
		
	}
}
