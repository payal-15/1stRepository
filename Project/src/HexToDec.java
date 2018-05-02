import java.util.Scanner;

public class HexToDec {
	
	int hexDec(String hx)
	{
		int dec=0, p=0;
		int i=hx.length()-1;
		while(i>=0)
		{
			char ch=hx.charAt(i);
			if(ch>=48 && ch<=57)
			{
				dec=dec+(ch-48)*pow(16,p);
			}
			else if(ch>=65 && ch<=90)
			{
				dec=dec+(ch-55)*pow(16,p);
			}else
			{
				dec=dec+(ch-87)*pow(16,p);
			}
			i--;
			p++;
		}return dec;
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
		System.out.println("Rnter a hexa decimal no: ");
		String hx=sc.nextLine();
		HexToDec hd = new HexToDec();
		int rs=hd.hexDec(hx);
		System.out.println(rs);
	}
}
