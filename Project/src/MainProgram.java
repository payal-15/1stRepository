import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		
		//Prime Number
		PrimeNumber pm = new PrimeNumber();
		boolean rs=pm.isPrime(no);
		if(rs)
			System.out.println("the number is a prime number");
		else
			System.out.println("the number is not a prime number");
		
		//Reverse no
		/*Reverse rv = new Reverse();
		int rs=rv.reverseNo(no);
		System.out.println("Reverse no : "+rs);*/
		
		//Strong no
		/*StrongNo sn = new StrongNo();
		boolean rs= sn.isStrong(no);
		if(rs)
			System.out.println("Number is strong no");
		else
			System.out.println("Number is not strong no");*/
		
		//Power
		/*System.out.println("enter power");
		int po= sc.nextInt();
		Power p = new Power();
		int rs=p.pow(no, po);
		System.out.println(rs);*/
		
		//ArmStrong
		/*ArmStrong as = new ArmStrong();
		boolean rs=as.isArmStrong(no);
		if(rs)
			System.out.println("the number is armstrong no");
		else
			System.out.println("the no is not armstrong no");*/
		
		//Seq of strong no.
		
		/*StrongNo2 sn = new StrongNo2();
		sn.printStrong();*/
		
		/*//seq of armstrong
		ArmStrong2 as = new ArmStrong2();
		as.printArm();*/
	}

}
