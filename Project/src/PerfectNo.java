
public class PerfectNo {
	
	boolean perfectNo(int no)
	{
		int i=1,sum=0;
		int no2=no/2;
		while(i<=no2)
		{
			if(no%i==0)
			{
			sum=sum+i;
			}
			i++;
		}
		if(sum==no) //directly return sum==no
			
		return true;
		else
			return false;
	}
	public static void main(String[] args) {
		PerfectNo pn=new PerfectNo();
		boolean b=pn.perfectNo(28);
		System.out.println(b);
	}
}
