import java.util.Scanner;

public class HappyNumber {

	boolean isHappy(int no)
	{	
		while(no>9 || no<0)
		{
		int sum=0;
		while(no!=0)
		{
			int r=no%10;
			sum=sum+(r*r);
			no=no/10;
		}
		no=sum;
		}
		return no==1 || no==7;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		HappyNumber hn = new HappyNumber();
		boolean rs=hn.isHappy(no);
		if(rs)
			System.out.println("the number is a happy number");
		else
			System.out.println("the number is not a happy number");
	}

}
