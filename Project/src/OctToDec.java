import java.util.Scanner;

public class OctToDec {
	
	int octDec(int no)
	{
		int dec=0, p=0;
		while(no!=0)
		{
			int r= no%10;
			dec=dec+(pow(8,p)*r);
			no=no/10;
			p++;
		}
		return dec;
	}
	int pow(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a octal number");
		int no=sc.nextInt();
		OctToDec od = new OctToDec();
		int rs=od.octDec(no);
		System.out.println(rs);
	}
}
