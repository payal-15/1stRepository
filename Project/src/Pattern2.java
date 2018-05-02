import java.util.Scanner;

public class Pattern2 {

	//p1
	void printPattern1(int no)
	{
		for (int i=1;i<=no;i++)
		{
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

	//p2
	void printPattern2(int no)
	{
		for (int i=1;i<=no;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=no-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}


	//p3
	void printPattern3(int no)
	{
		for (int i=1;i<=no;i++)
		{
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

	//p4

	void printPattern4(int no)
	{
		for (int i=1;i<=no;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=no-i;j++)
			{
				System.out.print((char)(65+j));
			}
			System.out.println();
		}

	}

	//p5
	void printPattern5(int no)
	{
		for (int i=1;i<=no;i++)
		{
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i%2);
			}
			System.out.println();
		}

	}

	//p6
	void printPattern6(int no)
	{
		for (int i=1;i<=no;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=no-i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}

	}

	//p13
	void printPattern13(int no)
	{
		for (int i=1;i<=no;i++)
		{
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}

	}

	//p17
	void printPattern17(int no)
	{	
		int c=1;
		for (int i=1;i<=no;i++)
		{
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c++;
				if(c>9)
					c=1;
			}
			System.out.println();
		}

	}

	//p7
	void printPattern7(int no)
	{
		int c=1;
		for (int i=1;i<=no;i++)
		{	
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=c;j++)
			{
				System.out.print("*");
			}
			c=c+2;
			System.out.println();
		}

	}

	//p8
	void printPattern8(int no)
	{
		int c=1;
		for (int i=1;i<=no;i++)
		{	
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=c;j++)
			{
				System.out.print(j%2);
			}
			c=c+2;
			System.out.println();
		}
	}

	//p9
	void printPattern9(int no)
	{
		//int c=1;
		for (int i=1;i<=no;i++)
		{	
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{	
				if(j!=i)
					System.out.print(j+"*");
				else
					System.out.print(j);
			}
			//c=c+2;
			System.out.println();
		}
	}

	//p10
	void printPattern10(int no)
	{
		int c=1;
		for (int i=1;i<=no;i++)
		{	
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=c;j++)
			{
				System.out.print(i%2);
			}
			c=c+2;
			System.out.println();
		}
	}

	//p14
	void printPattern14(int no)
	{
		int c=1;
		for (int i=1;i<=no;i++)
		{	
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=c;j++)
			{
				System.out.print((char)(64+j));
			}
			c=c+2;
			System.out.println();
		}
	}

	//p18
	void printPattern18(int no)
	{
		int c=1,m=1;
		for (int i=1;i<=no;i++)
		{	
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=c;j++)
			{
				System.out.print(m);
				m++;
				if(m>9)
					m=1;
			}
			c=c+2;
			System.out.println();
		}
	}

	//p11
	void printPattern11(int no)
	{

		for (int i=no;i>=1;i--)
		{	
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i+(i-1);j++)
			{
				System.out.print("*");

			}
			System.out.println();
		}
	}

	//p12
	void printPattern12(int no)
	{

		for (int i=no;i>=1;i--)
		{	
			for(int j=1;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i+(i-1);j++)
			{
				System.out.print((char)(64+j));

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt();

		Pattern2 p = new Pattern2();
		p.printPattern1(no);
		p.printPattern2(no);
		p.printPattern3(no);
		p.printPattern4(no);
		p.printPattern5(no);
		p.printPattern6(no);
		p.printPattern7(no);
		p.printPattern8(no);
		p.printPattern9(no);
		p.printPattern10(no);
		p.printPattern11(no);
		p.printPattern12(no);
		p.printPattern13(no);
		p.printPattern14(no);
		p.printPattern17(no);
		p.printPattern18(no);
		
	}
}
