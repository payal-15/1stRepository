import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter mark of sub1");
		int sub1=s.nextInt();
		System.out.println("Enter mark of sub2");
		int sub2=s.nextInt();
		System.out.println("Enter mark of sub3");
		int sub3=s.nextInt();
		System.out.println("Enter mark of sub4");
		int sub4=s.nextInt();
		
		if(sub1 >35 && sub2>35 && sub3>35 && sub4>35)
		{
			int total=sub1+sub2+sub3+sub4;
			double avg=total/4;
			double per=avg*100;
			if(per>=85)
				System.out.println("PASS: With percentage: "+per+" and grade is A");
			else if(per>=60 && per<85)
				System.out.println("PASS: With percentage: "+per+" and grade is B");
			else if(per>=50 && per<60)
				System.out.println("PASS: With percentage: "+per+" and grade is C");
			else
				System.out.println("PASS: With percentage: "+per+" and grade is D");
		}else
			System.out.println("Fail");
	}

}
