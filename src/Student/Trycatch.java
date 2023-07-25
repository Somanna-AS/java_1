package Student;

public class Trycatch {


	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			int b=78/0;
			a[5]=30;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
