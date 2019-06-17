package abstract_interface;

abstract class AbstractLearning {

	/*
	 * public abstract void employeeName();
	 * 
	 * abstract String employeeAdddress(String address);
	 */

	public abstract void calculateArea();

	public void normal() {

	}

}

class Square extends AbstractLearning {
	public static void main(String[] args) {
		Square n = new Square();
		n.calculateArea();
	}

	@Override
	public void calculateArea() {
		int z = 4 * 4; // a*a
		System.out.println(z);

	}




}