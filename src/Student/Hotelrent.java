package Student;

import java.util.Scanner;

public class Hotelrent{
	float rnt;
	void calrent(int mnt,float dret,int ppl) {
		
		if(mnt<13){
			if(mnt==4||mnt==5||mnt==6||mnt==11||mnt==12) {
				rnt= ppl*dret;
				System.out.print(rnt);
			}
			else
			{
				rnt= ppl*(dret+(dret*0.2f));
				System.out.print(rnt);
			}
		}
		else {
			System.out.print("invalid input");
		}
	}
	public static void main() {
		int mnt,ppl;
		float dret;
		Hotelrent hr=new Hotelrent();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the month(1-12)");
		mnt=scanner.nextInt();
		System.out.print("Enter the rent per day");
		dret=scanner.nextFloat();
		System.out.print("Enter the number of people");
		ppl=scanner.nextInt();
		hr.calrent(mnt,dret,ppl);
	}

}
