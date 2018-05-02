
public class Reverse {
	
	int reverseNo(int no)
	{
		int rv=0;
		while(no!=0)
		{
			int r=no%10;
			rv=rv*10+r;
			no=no/10;
		}
		return rv;
	}
}
