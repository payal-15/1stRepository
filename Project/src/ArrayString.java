import java.util.Scanner;

public class ArrayString {

	void typeOfChar(String st)
	{
		int uc=0,lc=0,dc=0,sc=0;
		for(int i=0;i<st.length();i++)
		{	
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='a' && ch<='z')
				lc++;
			else if(ch>='0' && ch<='9')
				dc++;
			else
				sc++;
		}
		System.out.println("No. of uppercase letter is: "+uc);
		System.out.println("No. of lowercase letter is: "+lc);
		System.out.println("No. of digit letter is: "+dc);
		System.out.println("No. of special char letter is: "+sc);
	}

	void vowelConsonant(String st)
	{
		char ch[]=st.toCharArray();
		int vcount=0,ccount=0;
		for(int i=0;i<ch.length;i++)
		{	
			if(ch[i]>='A' && ch[i]<='Z')
			{
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				{
					vcount++;
				}else
					ccount++;
			}else if(ch[i]>='a' && ch[i]<='z')
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				{
					vcount++;
				}else
					ccount++;
			}
		}
		System.out.println("number of vowels "+vcount);
		System.out.println("number of consonant "+ccount);
	}

	boolean isPallindromw(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			if(ch[i] != ch[ch.length-1-i])
				return false;
		}
		return true;
	}
	
	String toLowerCase(String st)
	{
		char ch[]= st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		String ns="";
		for(int i=0;i<ch.length;i++)
		{
			ns=ns+ch[i];
		}
		return ns;
	}
	
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String st=sc.nextLine();
		ArrayString as = new ArrayString();
		//Type of char
		as.typeOfChar(st);
		//vowel or consonant
		as.vowelConsonant(st);
		//pallindrome
		boolean rs=as.isPallindromw(st);
		if(rs)
			System.out.println("String is pallindrome");
		else
			System.out.println("not a pallindrome");
		
		//to lower case
		String str=as.toLowerCase(st);
		System.out.println(str);
	}
}
