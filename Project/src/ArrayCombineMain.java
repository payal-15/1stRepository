
public class ArrayCombineMain {

	public static void main(String[] args) {
		
		ArrayCombine ac = new ArrayCombine();
		System.out.println("Read array a[]");
		int a[]=ac.readArr();
		/*System.out.println("read array b[]");
		int b[]= ac.readArr();
		int c[]=ac.combine(a, b);
		System.out.println("Combined array");
		ac.dispArr(c);
		int d[]=ac.zigZag(a, b);
		ac.dispArr(d);
		int merge[]=ac.merge(a, b);
		ac.dispArr(merge);*/
		int d[]=ac.delArr(a, 3);
		ac.dispArr(d);
		
		
		//for prime number count in an array
		/*ArrayCombine ac = new ArrayCombine();
		System.out.println("Read array a[]");
		int a[]=ac.readArr();
		int c=ac.primeNumber(a);
		System.out.println(c);*/
		
		//for string no.
		/*ArrayCombine ac = new ArrayCombine();
		System.out.println("Read array a[]");
		int a[]=ac.readArr();
		int c=ac.strongNumber(a);
		System.out.println(c);*/
		
	}

}
