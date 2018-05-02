import java.io.InputStreamReader;
import java.io.BufferedReader;
public class BufferReader {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a String");
			String name=br.readLine();
			System.out.println(name);
			System.out.println("Enter college name");
			String collName=br.readLine();
			System.out.println(name+" "+ collName);
			
		}catch (Exception e) {

		}
	}
}
