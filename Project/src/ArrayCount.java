import java.util.Scanner;


public class ArrayCount {

	//no. of occurance of char in a sentence
	void arrCount(String st)
	{
		int count[]=new int[128];
		for(int i=0;i<st.length();i++)
		{
			count[st.charAt(i)]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)i + " Occurred "+count[i]+ " times.");
			}
		}
	}


	//no. of occurance of alphabets irrespective of case
	void arrCountAlpha(String st)
	{
		int count[]=new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=65 && ch<=90)
			{
				count[ch-65]++;
			}
			if(ch>=97 && ch<=122)
			{
				count[ch-97]++;
			}
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)(i+65) + " Occurred "+count[i]+ " times.");
			}
		}
	}


	//Anagram Logic
	private   int[] countNoOfAlpha(String st)
	{
		int count[]=new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=65 && ch<=90)
			{
				count[ch-65]++;
			}
			if(ch>=97 && ch<=122)
			{
				count[ch-97]++;
			}
		}
		return count;
	}
	boolean isAnagram(String st1,String st2)
	{
		int count1[]=countNoOfAlpha(st1);
		int count2[]=countNoOfAlpha(st2);

		for (int i = 0; i < count2.length; i++) {
			if (count1[i]!=count2[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a word");
		String st =sc.nextLine();
		ArrayCount ac = new ArrayCount();
		/*System.out.println("<<==============Count character in given sentence===============>>");
		ac.arrCount(st);
		System.out.println("<<==============Count alphabet irrespective of case==============>>");
		ac.arrCountAlpha(st);*/
		
		//Anagram Logic
		System.out.println("enter 2nd string");
		String st2=sc.nextLine();
		boolean res=	ac.isAnagram(st, st2);
		if(res)
		{
			System.out.println("is anagram");
		}
		else
			System.out.println("not anagram");
	}

}
