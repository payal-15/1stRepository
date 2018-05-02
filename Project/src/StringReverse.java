
public class StringReverse {

	String reverse(String st)
	{
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		return rev;
	}


	public static void main(String[] args) {
		
		String st="JSP";
		StringReverse sr = new StringReverse();
		String res=sr.reverse(st);
		System.out.println("Original String "+st);
		System.out.println("reveresed string is "+res);
	}

}
