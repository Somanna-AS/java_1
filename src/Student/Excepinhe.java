package Student;

import java.io.IOException;

class Ptr {
	static int pint(	) {
		int j=678/0;
		return j;
		}
}
public class Excepinhe extends Ptr{
	
	public static void main(String[] args) {
		try {
			throw new  IOException();
	}
		catch(IOException a) {
			System.out.println(a);
		}
		}

}
