import java.util.Scanner;

public class NmbOfDigit {

	int noOfDigit(int no)
	{
		int count=0;
		do {
			count++;
			no=no/10;
		}while(no!=0);
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a digit: ");
		Scanner s= new Scanner(System.in);
		int no=s.nextInt();
		NmbOfDigit d=new NmbOfDigit();
		int count=d.noOfDigit(no);
		System.out.println(count);
	}

}

