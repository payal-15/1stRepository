import java.util.Scanner;

public class Pallindrom {
		
		boolean isPallindrom(int no)
		{
			int p=0,n=no;
			while(n!=0)
			{
				int r=n%10;
				p=p*10+r;
				n=n/10;
			}
			return p==no;			
		}
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter a number to check pallindrom");
			int no=s.nextInt();
			Pallindrom p = new Pallindrom();
			boolean rs=p.isPallindrom(no);
			if(rs)
				System.out.println("the number is a pallindrom");
			else
				System.out.println("the number is not a pallindrom");
		}
	}


