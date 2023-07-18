package Student;

 interface Firstinter {
	
		final int x=123;
		void display();
	
}
 class Test implements Firstinter{
	 public void display() {
		 System.out.print(x);
	 }
	 public static void main(String[] args) {
		 Test t=new Test();
		 t.display();
		 System.out.print(x);
	 }
 }
