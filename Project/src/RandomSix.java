import java.util.Random;

public class RandomSix {
	
	public static void main(String[] args) {
		Random r=new Random();
		int x= r.nextInt();
		if(x<0)
		{
			x=x*-1;
			System.out.println(x);
		}
		else
		{
			System.out.println(x);
		}
	}
}
