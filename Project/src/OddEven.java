import java.util.Scanner;

public class OddEven {
	//no. of odd and even
	int[] OddAndEven(int no)
	{
		int odd=0,even=0,i=1;
		while(no!=0) 
		{	
				if(i%2==0) 
					even=even+1; 
				else 
					{odd=odd+1; } 
				no--; 
				i++;    
			}
			
		
		int number[]= {odd-1,even};
		return number;
	}
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		OddEven oe = new OddEven();
		int rs[]=oe.OddAndEven(no);
		System.out.println("No of odd: "+rs[0]);
		System.out.println("No of even: "+rs[1]);
	}
}
