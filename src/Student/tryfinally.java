package Student;

public class tryfinally {
	void meth1() {
		int a=50/0;
		System.out.println(a);
	}
	void meth2() {}
	void meth3() {}
	public static void main(String[] args) {
		tryfinally ex=new tryfinally();
		try {
		ex.meth1();
		}
		catch(ArithmeticException a) {
			System.out.println("invalid");
		}
		finally {
			System.out.println("woking");
		}
	}

}
