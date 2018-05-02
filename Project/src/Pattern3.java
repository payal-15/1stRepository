import java.util.Scanner;

public class Pattern3 {

	void printPattern1(int no)
	{
		int sp=no/2,st=1;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<st;j++)
			{
				System.out.print("*");
			}
			if(i<no/2)
			{
				sp--;
				st=st+2;
			}else
			{sp++;
			st=st-2;}

			System.out.println();
		}
	}

	void printPattern2(int no)
	{
		int st=no,sp=0;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<st;j++)
			{
				System.out.print("*");
			}
			if(i<no/2)
			{
				st=st-2;
				sp++;
			}else
			{
				st=st+2;
				sp--;
			}
			System.out.println();
		}

	}

	void printPattern3(int no)
	{
		int st=1,sp=no/2;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<st;j++)
			{
				System.out.print(st/2+1);
			}
			if(i<no/2)
			{
				st=st+2;
				sp--;
			}else
			{
				st=st-2;
				sp++;
			}
			System.out.println();
		}

	}

	void printPattern4(int no)
	{
		int st=1,sp=no/2;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<st;j++)
			{
				System.out.print((i+1)%2);
			}
			if(i<no/2)
			{
				st=st+2;
				sp--;
			}else
			{
				st=st-2;
				sp++;
			}
			System.out.println();
		}

	}

	void printPattern5(int no)
	{
		int ele=1,sp=no/2;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			int k=1;
			for(int j=0;j<ele;j++)
			{
				System.out.print(k);
				if(j<ele/2)
					k++;
				else
					k--;
			}
			if(i<no/2)
			{
				ele=ele+2;
				sp--;
			}else
			{
				ele=ele-2;
				sp++;
			}
			System.out.println();
		}

	}

	void printPattern6(int no)
	{
		int st=1,sp=no/2;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<st;j++)
			{
				System.out.print((char)(65+i));
			}
			if(i<no/2)
			{
				st=st+2;
				sp--;
			}else
			{
				st=st-2;
				sp++;
			}
			System.out.println();
		}

	}
	
	void printPattern7(int no)
	{
		int st=1,sp=no/2,alpha=1;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<st;j++)
			{
				System.out.print((char)(64+alpha));
				alpha++;
			}
			if(i<no/2)
			{
				st=st+2;
				sp--;
			}else
			{
				st=st-2;
				sp++;
			}
			System.out.println();
		}

	}
	void printPattern8(int no)
	{
		int st=1,sp=no/2;
		int k=1,n=1;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<st;j++)
			{
				System.out.print(k);
				k++;
				if(i>no/2)
				n++;
			}
			if(i<no/2)
			{
				st=st+2;
				sp--;
			}else
			{
				st=st-2;
				sp++;
				k=n;
			}
			System.out.println();
		}

	}

	void printPattern9(int no)
	{
		int ele=1,sp=no/2;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			int k=ele/2+1;
			for(int j=0;j<ele;j++)
			{
				System.out.print(k);
				if(j<ele/2)
					k--;
				else
					k++;
			}
			if(i<no/2)
			{
				ele=ele+2;
				sp--;
			}else
			{
				ele=ele-2;
				sp++;
			}
			System.out.println();
		}

	}
	
	void printPattern10(int no)
	{	
		
		for(int i=1;i<=no;i++)
		{	
			int k=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k=k+no-j;
			}
			System.out.println();
		}
	}
	
	void printPattern11(int no)
	{
		int st=1,sp=no/2;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print(j%2);
			}
			if(i<no/2)
			{
				st=st+2;
				sp--;
			}else
			{
				st=st-2;
				sp++;
			}
			System.out.println();
		}

	}

	void printPattern12(int no)
	{
		int st=1,sp=no/2;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print(j);
			}
			if(i<no/2)
			{
				st=st+2;
				sp--;
			}else
			{
				st=st-2;
				sp++;
			}
			System.out.println();
		}

	}

	void printPattern13(int no)
	{
		int st=1,sp=no/2;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++) 
			{
				System.out.print(" ");
			}
			int k=1;
			for(int j=1;j<=st;j++)
			{
				System.out.print((char)(64+k));
				
				if(j>st/2)
					k--;
				else
					k++;
					
			}
			if(i<no/2)
			{
				st=st+2;
				sp--;
			}else
			{
				st=st-2;
				sp++;
			}
			System.out.println();
		}

	}
	
	void printPattern14(int no)
	{
		int st=no,sp=0;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			int k=st/2+1;
			for(int j=1;j<=st;j++)
			{
				System.out.print(k);
				if(j>st/2)
					k++;
				else
					k--;
			}
			if(i<no/2)
			{
				st=st-2;
				sp++;
			}else
			{
				st=st+2;
				sp--;
			}
			System.out.println();
		}

	}

	void printPattern15(int no)
	{
		int st=no,sp=0;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			int k=1;
			for(int j=1;j<=st;j++)
			{
				System.out.print((char)(64+k));
				if(j>st/2)
					k--;
				else
					k++;
			}
			if(i<no/2)
			{
				st=st-2;
				sp++;
			}else
			{
				st=st+2;
				sp--;
			}
			System.out.println();
		}

	}
	
	void printPattern16(int no)
	{
		int st=1,sp=no/2;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<sp;j++) 
			{
				System.out.print(" ");
			}
			int k=i;
			for(int j=1;j<=st;j++)
			{
				System.out.print((char)(64+k));
				
				if(j>st/2)
					k++;
				else
					k--;
					
			}
			if(i<no/2)
			{
				st=st+2;
				sp--;
			}else
			{
				st=st-2;
				sp++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no: ");
		int no=sc.nextInt();
		Pattern3 p = new Pattern3();
		p.printPattern1(no);
		p.printPattern2(no);
		p.printPattern3(no);
		
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
		p.printPattern15(no);
		p.printPattern16(no);
		p.printPattern4(no);
	}
}
