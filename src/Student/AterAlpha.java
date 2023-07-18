package Student;

import java.util.Scanner;

public class AterAlpha {
	public static void main(String[] args) {
		int n;
		int i=65;
		int j,g;
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter the length");
		n=scanner.nextInt();
		for(j=0;j<n;j++)
		{
			if((j%2)==0) {
				System.out.println((char)i++);
			}
			else
			{
				g=i+32;
				System.out.println((char)g);
				i++;
			}
		}

}
}
