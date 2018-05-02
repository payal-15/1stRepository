import java.util.Scanner;

public class StringArray {


	//Reverse the Sentence
	String reverseSentence(String st)
	{
		String rev="";
		char ch[]=st.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{	
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


	//Reverse the word in a sentence
	String revWordInSen(String st)
	{
		String rev="";
		char ch[]=st.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{	
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
	}

	//number of words in a sentence
	int noOfWords(String st)
	{
		char ch[]=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{

			if(ch[i]!=' '&& i==0 || ch[i]!=' '&&ch[i-1]==' ')
			{
				count++;	
			}
		}
		return count;
	}

	//convert 1st char to captical and remainig to small
	int convertToCapital(String st)
	{
		char ch[]=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{

			if(ch[i]!=' '&& i==0 || ch[i]!=' '&&ch[i-1]==' ')
			{
				count++;	
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a sentence");
		String st=sc.nextLine();

		StringArray sa = new StringArray();

		//reverse the sentence
		String res=sa.reverseSentence(st);
		System.out.println("Reversed sentence is: "+res);

		//reverse the word in sentence
		String res1=sa.revWordInSen(st);
		System.out.println("Reversed word in a sentence is: "+res1);

		//no. of words
		int count=sa.noOfWords(st);
		System.out.println(count);
	}
}
