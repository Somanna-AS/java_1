package Student;

public interface innerinter {
	interface innein{
		 void bike();
	}

}
  class Caller implements innerinter.innein{
	 public void bike(){
		 System.out.print("Surya");
	 }
	 public static void main(String[] args) {
		 innerinter.innein ob;
		 Caller c=new Caller();
		 ob=c;
		 ob.bike();
	 }
 }