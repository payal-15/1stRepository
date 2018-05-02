import java.util.Scanner;

public class DisplayStar {
	
	void printStar(int no)
	{
		for(int j=0;j<no;j++)
		{
			for(int i=0;i<no;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void printAlpha(int no)
	{
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=no;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}
	
	void printNo(int no)
	{	
		int count=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=no;j++)
			{
				if(count==10)
					count=1;
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
	void printno2(int no)
	{	
		
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=no;j++)
			{
				System.out.print(i%2 + " ");
				
			}
			System.out.println();
		}
	}
	void printno3(int no)
	{	
		
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=no;j++)
			{
				System.out.print(j%2 + " ");
				
			}
			System.out.println();
		}
	}
	void printno4(int no)
	{	
		int count=1;
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=no;j++)
			{
				System.out.print(count%2 + " ");
				count++;
				
			}
			System.out.println();
		}
	}
	
	void printPattern(int no)
	{	
		int c=1;
		for(int j=0;j<no;j++)
		{
			for(int i=0;i<=j;i++)
			{	if(c==10)
				c=1;
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
	
	void printPattern1(int no)
	{	
		//int c=1;
		for(int j=1;j<no;j++)
		{	int k=1;
			for(int i=1;i<=2*j-1;i++)
			{	if(i%2==0)
				System.out.print("*");
				else
					System.out.print(k++);
			}
			System.out.println();
		}
	}
	
	void printPattern2(int no)
	{	
		int c=1;
		for(int i=1;i<no;i++)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				if(c==1)
				c=c-1;   
				else c=c+1;  
			}
			System.out.println();
		}
	}
	
	void printPattern3(int no)
	{	
		int c=1;
		for(int i=1;i<no;i++)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(96+j));
				  
			}
			System.out.println();
		}
	}
	
	void printPattern4(int no)
	{	
		int c=1;
		for(int i=1;i<no;i++)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+i));
				  
			}
			System.out.println();
		}
	}
	
	void printPattern5(int no)
	{	
		int c=1;
		for(int i=1;i<no;i++)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print(i%2);
				  
			}
			System.out.println();
		}
	}
	
	void printPattern6(int no)
	{	
		int c=1;
		for(int i=1;i<no;i++)
		{	//int c=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+c));
				c++;
				  
			}
			System.out.println();
		}
	}
	void printPattern7(int no)
	{	
		int c=1;
		for(int i=1;i<no;i++)
		{	//int c=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j));
				if(j!=i)
				{
					System.out.print("*");
				}
				  
			}
			System.out.println();
		}
	}
	void printPattern8(int no)
	{	
		int c=1;
		for(int i=1;i<no;i++)
		{	//int c=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
	void printPattern9(int no)
	{	
		for(int i=1;i<=no;i++)
		{	
			for(int j=1;j<=no;j++)
			{
				System.out.print(i);
				if(j==no)
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
	
	void printPattern10(int no)
	{	
		for(int i=no;i>=0;i--)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
	
	void printPattern11(int no)
	{	
		for(int i=no;i>=0;i--)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
	
	void printPattern12(int no)
	{	
		for(int i=no;i>=1;i--)  
		{	
			for(int j=i;j>0;j--) 
			{
				System.out.print(j);  
			}
			System.out.println();
		}
	}
	
	void printPattern13(int no)
	{	
		for(int i=no;i>=1;i--) 
		{	
			for(int j=no;j>no-i;j--) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	void printPattern14(int no)
	{	
		for(int i=no;i>=1;i--) 
		{	
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	void printPattern15(int no) 
	{	
		for(int i=no;i>=1;i--) 
		{	
			for(int j=no-i+1;j<=no;j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	void printPattern16(int no)
	{	
		for(int i=no;i>=0;i--)
		{	
			for(int j=i;j>0;j--)
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
	
	void printPattern17(int no)
	{	
		for(int i=no;i>=0;i--)
		{	
			for(int j=no;j>no-i;j--) 
			{
				System.out.print((char)(96+j));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		System.out.println("enter a no: ");
		Scanner sc= new Scanner(System.in); 
		int no=sc.nextInt();
		DisplayStar ds = new DisplayStar();
		ds.printStar(no);
		ds.printAlpha(no);
		ds.printNo(no);
		ds.printno2(no);
		ds.printno3(no);
		ds.printPattern(no);
		ds.printPattern1(no);
		ds.printPattern2(no);
		ds.printPattern3(no);
		ds.printPattern4(no);
		ds.printPattern5(no);
		ds.printPattern6(no);
		ds.printPattern7(no);
		ds.printPattern8(no);
		ds.printPattern9(no);
		ds.printPattern10(no);
		ds.printPattern11(no);
		ds.printPattern12(no);
		ds.printPattern13(no);
		ds.printPattern14(no);
		ds.printPattern15(no);
		ds.printPattern16(no);
		ds.printPattern17(no);
	}
}
