import java.util.Scanner;

public class ArrayStringPractice {

	//count no of lower upper case, digit, special char
	void countChar(String str)
	{
		int uc=0,lc=0,sc=0,dc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				uc++;
			}
			else if(ch>='a' && ch<='z')
			{
				lc++;
			}
			else if(ch>='0' && ch<='9')
			{
				dc++;
			}
			else 
				sc++;

		}
		System.out.println("Upper COunt:"+uc);
		System.out.println("Lower COunt:"+lc);
		System.out.println("Digit COunt:"+dc);
		System.out.println("special COunt:"+sc);
	}
	//count no of vowels and consonants present in a string
	void countVC(String str)
	{
		int v=0;
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
				{
					v++;
				}else
					c++;
			}
			if(ch>='a' && ch<='z')
			{
				if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
				{
					v++;
				}else
					c++;
			}
		}
		System.out.println("vowel"+v);
		System.out.println("consonants"+c);
	}

	//reverse a sentence
	String revSen(String str)
	{
		String rev="";
		for (int i = 0; i < str.length(); i++) {
			rev=str.charAt(i)+rev;
		}
		return rev;
	}
	//check if string is pallindrome w/o reversing it
	boolean ispallindrome(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			if(ch[i]!=ch[ch.length-1-i])
				return false;
		}
		return true;
	}
	//convert entire string to lower case
	String convertLower(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		String st=new String(ch);
		return st;
	}
	//convert entire string to upper case
	String convertUpper(String str)
	{
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		String st=new String(ch);
		return st;
	}
	//Reverse sentence
	String revSentence(String str)
	{
		char ch[]=str.toCharArray();
		String rev="";
		for (int i = ch.length-1; i >= 0 ; i--) {
			int k=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				rev=rev+ch[j];
				j++;
			}
			if(i>0)
			{
				rev=rev+ch[i];
			}
		}
		return rev;
	}
	//Reverse sentence with word
	/*String revWordSentence(String str)
	{
		char ch[]=str.toCharArray();
		String rev="";
		for (int i = ch.length-1; i >=0; i--) {
			int k=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				rev=ch[j]+rev;
				j++;
			}
			if(i>0)
			{
				rev=ch[i]+rev;
			}
		}
		return rev;
	}*/

	String revWordSentence(String str)
	{
		char ch[]=str.toCharArray();
		String rev="";
		for (int i =0; i <ch.length; i++) {
			int k=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				rev=rev+ch[j];
				j--;
			}
			if(i<ch.length)
			{
				rev=rev+ch[i];
			}
		}
		return rev;
	}

	//count no of words in a sentence
	int countWords(String str)
	{
		int count=1;
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ')
			{
				count++;
			}
		}
		return count;
	}

	//convert 1st char of word to capital and rest to samall
	String covertToCamelCase(String str)
	{
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}
			if(i>0) {
				if(ch[i]!=' ' && ch[i-1]!=' ')
				{
					if(ch[i]>='A' && ch[i]<='Z')
					{
						ch[i]=(char)(ch[i]+32);
					}
				}
			}
		}
		String res= new String(ch);
		return res;
	}

	//Count no of occurance of each char
	void countOccOfChar(String str)
	{
		int count[]=new int[128];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		for (int i = 0; i < count.length; i++) {
			if(count[i]!=0)
			{
				System.out.println((char)i+" occured "+ count[i]);
			}

		}
	}

	//count no. of alphabets irrespective of case
	void countalpha(String str)
	{
		int count[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=97 && ch<=122)
			{
				count[ch-97]++;
			}
			if(ch>=65 && ch<=90)
			{
				count[ch-65]++;
			}
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)+(i+65)+"    "+count[i]);
			}
		}
	}
	//anagram
	boolean isAnagram(String str1, String str2)
	{
		int count1[]=new int[26];
		int count2[]=new int[26];
		for (int i = 0; i < str1.length(); i++) {
			char ch=str1.charAt(i);
			if(ch>=65 && ch<=90)
			{
				count1[ch-65]++;
			}
			if(ch>=97 && ch<=122)
			{
				count1[ch-97]++;
			}
		}
		for (int i = 0; i < str2.length(); i++) {
			char ch=str2.charAt(i);
			if(ch>=65 && ch<=90)
			{
				count2[ch-65]++;
			}
			if(ch>=90 && ch<=122)
			{
				count2[ch-97]++;
			}
		}
		for (int i = 0; i < count2.length; i++) {
			if(count1[i]!=count2[i])
			{
				return false;
			}
		}
		return true;
	}
	//check panagram
	boolean isPanagram(String str)
	{
		int count[]=new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				count[ch-65]++;
			}
			if(ch>=97 && ch<=122)
			{
				count[ch-97]++;
			}

		}
		for (int i = 0; i < count.length; i++) {
			if(count[i]==0)
			{
				return false;
			}

		}
		return true;
	}
	//check substring is present in main string or not
	boolean subStrInMS(String str, String subStr)
	{
		char ms[]=str.toCharArray();
		char ss[]=subStr.toCharArray();
		for (int i = 0; i < ms.length; i++) {
			int k=i;
			int j=0;
			while(k<ms.length && j<ss.length && ss[j]==ms[k])
			{
				k++;
				j++;
			}
			if(j==ss.length)
			{
				return true;
			}
		}
		return false;
	}
	//how many times substring is present
	int countSS(String str, String subStr)
	{
		char ms[]=str.toCharArray();
		char ss[]=subStr.toCharArray();
		int count=0;
		for (int i = 0; i < ms.length; i++) {
			int k=i,j=0;

			while(k<ms.length && j<ss.length && ms[k]==ss[j])
			{
				k++;
				j++;
			}
			if(j==ss.length)
			{
				count++;
			}
		}
		return count;
	}

	//return 1st index of substring where it is present
	int indexOfSS(String str, String subStr)
	{
		char ms[]=str.toCharArray();
		char ss[]=subStr.toCharArray();
		for (int i = 0; i < ms.length; i++) {
			int k=i;
			int j=0;
			while(k<ms.length && j<ss.length && ms[k]==ss[j])
			{
				k++;
				j++;
			}
			if(j==ss.length)
			{
				return i;
			}
		}
		return -1;
	}
	//return last index of substring
	int lastIndexSS(String str, String subStr)
	{
		char ms[]=str.toCharArray();
		char ss[]=subStr.toCharArray();
		int in=-1;
		for (int i = 0; i < ms.length; i++) {
			int k=i,j=0;
			while(k<ms.length && j<ss.length && ms[k]==ss[j])
			{
				k++;
				j++;
			}
			if(j==ss.length)
			{
				in=i;
			}
		}
		return in;
	}

	//when occurance is given you have find the  index
	int occIndex(String str,String subStr, int oc)
	{
		char ms[]=str.toCharArray();
		char ss[]=subStr.toCharArray();
		int occurance=0;
		for (int i = 0; i < ms.length; i++) {
			int k=i,j=0;
			while(k<ms.length && j<ss.length && ms[k]==ss[j])
			{
				k++;
				j++;
			}
			if(j==ss.length)
			{
				occurance++;
				if(occurance==oc)
				{
					return i;
				}
			}
		}
		return -1;
	}
	//check substring is word or not
	boolean checkWord(String str, String subStr)
	{
		char ms[]=str.toCharArray();
		char ss[]=subStr.toCharArray();
		for (int i = 0; i < ms.length; i++) {
			int k=i,j=0;
			while(k<ms.length && j<ss.length && ms[k]==ss[j])
			{
				k++;
				j++;
			}
			if(j==ss.length)
			{
				if((i==0 || ms[i-1]==' ') && (ms[k]==' ' || k==ms.length))
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayStringPractice as = new ArrayStringPractice();

		/*		//count no of lower upper case, digit, special char
		System.out.println("enter the string");
		String str=sc.nextLine();
		as.countChar(str);

		//count no of vowels and consonants present in a string
		System.out.println("enter the string");
		String str1=sc.nextLine();
		as.countVC(str1);

		//reverse a sentence
		String str2=as.revSen(str1);
		System.out.println("reversed string is:"+str2);

		//check if string is pallindrome w/o reversing it
		boolean isPallindrome=as.ispallindrome(str2);
		if(isPallindrome)
		{
			System.out.println("is pallindrome");
		}else
			System.out.println("Not a pallindrome");

		//convert entire string to lower case
		String res=as.convertLower(str2);
		System.out.println("to lower case"+res);

		//convert entire string to upper case
		String res1=as.convertUpper(str2);
		System.out.println("to upper class"+res1);

		//Reverse sentence
		System.out.println("Enter a sentence");
		String str3=sc.nextLine();
		String res2=as.revSentence(str3);
		System.out.println(res2);

		//Reverse sentence with word
		System.out.println(str3);
		String res3=as.revWordSentence(str3);
		System.out.println(res3);

		//count no of words in a sentence
		int res4=as.countWords(str3);
		System.out.println("No of words in "+str3+" is:"+res4);

		//convert 1st char of word to capital and rest to samall
		String res5=as.covertToCamelCase(str3);
		System.out.println("String "+str3+" in camel case is: "+res5);

		//
		as.countOccOfChar(str3);

		//count alpha
		as.countalpha(str3);

		//anagram
		System.out.println("enter 1st string");
		String str11=sc.nextLine();
		System.out.println("enter 2st string");
		String str12=sc.nextLine();
		boolean rs=as.isAnagram(str11, str12);
		if(rs)
			System.out.println("is anagram");
		else
			System.out.println("not anagram");

		//panagram
		boolean pan=as.isPanagram(str12);
		if(pan)
		{
			System.out.println("panagram");
		}
		else
			System.out.println("not ");*/

		//check substring is present in main string or not
		System.out.println("enter main string");
		String ms=sc.nextLine();
		System.out.println("enter sub string");
		String ss=sc.nextLine();
		boolean res6=as.subStrInMS(ms, ss);
		if(res6)
			System.out.println("yes present");
		else
			System.out.println("not present");

		//how many times substring is present
		int res7=as.countSS(ms, ss);
		System.out.println(res7);

		//1st index of ss
		int res8=as.indexOfSS(ms, ss);
		System.out.println("1st index"+res8);
		//Last index of ss
		int res9=as.lastIndexSS(ms,ss);
		System.out.println("last index"+res9);
	}
}
