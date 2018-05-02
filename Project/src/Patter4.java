import java.util.Scanner;

public class Patter4 {
	
	void printSquare(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(i==0||i==no-1||j==0||j==no-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	void printSquareDigonal(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(i==0||i==no-1||j==0||j==no-1||i==j||i+j==no-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printSquarePlus(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(i==0||i==no-1||j==0||j==no-1||j==no/2||i==no/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printDiagonal(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(i==j||i+j==no-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	void printJ(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(i==0||j==no/2||i==no-1 && j<=no/2||j==0 && i>=no/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printM(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(j==0||j==no-1||i==j && i<=no/2 || i+j==no-1 && i<=no/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printY(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(j==no/2 && i>=no/2 || i==j && i<=no/2 || i+j==no-1 && i<=no/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printN(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(j==0 || j==no-1 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printA(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(j==0 || j==no-1 || i==0 || i==no/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printS(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(i==0 || i==no-1 || j==0 && i<=no/2 || j==no-1 && i>=no/2 || i==no/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	void printW(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(j==0 || j==no-1 || i==j && i>=no/2 || i+j==no-1 && i>=no/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printK(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=no/2;j<no;j++)
			{
				if(j==no/2 ||i==j ||i+j==no-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printR(int no)
	{
		for(int i=0;i<no;i++)
		{
			for(int j=no/2;j<no;j++)
			{
				if(j==no/2 ||i==0 ||i==no/2|| j==no-1 &&i<=no/2||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	void printZ(int no)
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(i==0 || i==no-1 || i+j==no-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printG(int no)
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(i==0 && j<=no/2 || j==0 || i==no-1 && j<=no/2 || j==no/2 && i>=no/2 || i==no/2&& j>=no/2 || j==no-1 && i>=no/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no: ");
		int no=sc.nextInt();
		Patter4 p = new Patter4();
		p.printSquare(no);
		p.printSquareDigonal(no);
		p.printSquarePlus(no);
		p.printDiagonal(no);
		p.printJ(no);
		p.printM(no);
		p.printY(no);
		p.printN(no);
		p.printA(no);
		p.printS(no);
		p.printW(no);
		p.printK(no);
		p.printR(no);
		p.printZ(no);
		p.printG(no);
	}
}
