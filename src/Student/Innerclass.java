package Student;

class Animal{
	void read() {
		System.out.println("eat");
		class Cat{
			void sleep() {
				System.out.println("sleep");
			}
		}
		Cat  c=new Cat();
		c.sleep();
		}
	  class Dog{
		void write() {
			System.out.println("bark");
			read();

		}
	}
	 
}

public class Innerclass {

	public static void main(String[] args) {
		Animal a=new Animal();
		Animal.Dog d=a.new Dog();
		a.read();
		d.write();
		
	}

}
