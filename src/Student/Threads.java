package Student;
class Good extends Thread{
	public  void run() {
		for(int i=0;i<10000;i++) {
			/*try {
			Thread.sleep(500);
		}
			catch(InterruptedException e) {
				System.out.println();
			}*/
			System.out.println("good");
		}
		
	}
}
class Bad extends Thread{
	public  void run() {
		for(int i=0;i<10000;i++) {
			/*try {
			Thread.sleep(500);
		}
			catch(InterruptedException e) {
				System.out.println();
			}*/
			System.out.println("Bad");
		}
		
	}
}

public class Threads {

	public static void main(String[] args) {
		Good h=new Good();
		Bad b=new Bad();
		h.start();
		try {
			h.join(5);
		}
		catch(InterruptedException e) {
			System.out.println();
		}
		b.start();
	}

}
