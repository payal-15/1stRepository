
public class ArraySubString {

	//check if substring is present in mainstring
	boolean checkStr(String ms, String ss)
	{
		char ch[]=ms.toCharArray();
		char c[]=ss.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int j=0,k=i;
			while(k<ch.length && j<c.length && ch[k]==c[j])
			{
				k++;
				j++;
			}
			if(j==c.length)
			{
				return true;
			}
		}
		return false;
	}


	//check how many time substring is present
	int noOfOccurance(String ms, String ss)
	{
		char ch[]=ms.toCharArray();
		char c[]=ss.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			int j=0,k=i;
			while(k<ch.length && j<c.length && ch[k]==c[j])
			{
				k++;
				j++;
			}
			if(j==c.length)
			{
				count++;
			}
		}
		return count;
	}

	//return index from which the substring is present
	int searchIndex(String ms,String ss)
	{
		char ch[]=ms.toCharArray();
		char c[]=ss.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int j=0,k=i;
			while(k<ch.length && j<c.length && ch[k]==c[j])
			{
				k++;
				j++;
			}
			if(j==c.length)
			{
				return i;
			}
		}
		return -1;
	}

	//return Last index Occurance from which the substring is present
	int lastIndex(String ms,String ss)
	{
		char ch[]=ms.toCharArray();
		char c[]=ss.toCharArray();
		int in=-1;
		for(int i=0;i<ch.length;i++)
		{
			int j=0,k=i;
			while(k<ch.length && j<c.length && ch[k]==c[j])
			{
				k++;
				j++;
			}
			if(j==c.length)
			{
				in=i;
			}
		}
		return in;
	}


	//return particular index Occurance from which the substring is present
	int particularIndex(String ms,String ss,int oc)
	{
		char ch[]=ms.toCharArray();
		char c[]=ss.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			int j=0,k=i;
			while(k<ch.length && j<c.length && ch[k]==c[j])
			{
				k++;
				j++;
			}
			if(j==c.length)
			{
				count++;
				if(count==oc)
				{
					return i;
				}
			}
		}
		return -1;
	}	

	//check if substring is a word or not.
	boolean checkWord(String ms,String ss)
	{
		char ch[]=ms.toCharArray();
		char c[]=ss.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int j=0,k=i;
			while(k<ch.length && j<c.length && ch[k]==c[j])
			{
				k++;
				j++;
			}
			if(j==c.length)
			{
				if((i==0||ch[i-1]==' ')&&(k==ch.length || ch[k]==' '))
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String ms="Chitradurga is a fort city";
		ArraySubString as = new ArraySubString();
		//check if substring is present in mainstring		
		boolean res=as.checkStr(ms, "Fort");
		if(res)
		{
			System.out.println("yes");
		}else
			System.out.println("no");

		//check how many time substring is presentk
		int res2=as.noOfOccurance(ms, "a");
		System.out.println(res2);

		//return index from which the substring is present
		int res3=as.searchIndex(ms, "fort");
		System.out.println(res3);

		//return Last index Occurance from which the substring is present
		int res4=as.lastIndex(ms, "a");
		System.out.println(res4);

		int res5=as.particularIndex(ms, "a", 3);
		System.out.println(res5);

		boolean res6=as.checkWord(ms, "fort");
		if(res6)
		{
			System.out.println("yes");
		}
		else
			System.out.println("false");
	}
}
