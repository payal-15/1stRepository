import java.util.Scanner;

public class practice3 {

	//Reverse a string
	String revString(String str) 
	{	
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		return rev;
	}
	//Reverse a number
	int revInt(int n)
	{	
		int rev=0;
		while(n!=0)
		{
			int no=n%10;
			rev=rev*10+no;
			n=n/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string you want to reverse");
		String str=sc.next();
		practice3 p = new practice3();
		String res=p.revString(str);
		System.out.println(res);
		
		System.out.println("Enter a number you want to reverse");
		int no=sc.nextInt();
		int res1=p.revInt(no);
		System.out.println(res1);
		
	}

}
