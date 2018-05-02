import java.util.Scanner;

public class NaturalNo {
	
	int sumOfNatural(int no)
	{
		int sum=0, i=1;
		//one way
		/*while(i<=no)
		{
			sum=sum+i;
			i++;
		}*/
		//2nd way
		while(no>0)
		{
			sum=sum+no;
			no--;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int num=sc.nextInt();
		NaturalNo n=new NaturalNo();
		int s=n.sumOfNatural(num);
		System.out.println(s);
	}
}
