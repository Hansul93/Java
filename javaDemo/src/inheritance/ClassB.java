package inheritance;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		ClassA obj1 = new ClassB();
		ClassB obj2 = new ClassB();
		

	}
	
	public void B1() {
		System.out.println("Class B");
	}

	
	public void B2() {
		System.out.println("Class B");
	}
	
	public void B3() {
		System.out.println("Class B");
	}
}
