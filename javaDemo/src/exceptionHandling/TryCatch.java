package exceptionHandling;

import org.testng.annotations.Test;

public class TryCatch {

	public static String hello = "Hi";

	@Test
	public static void running() {
		TryCatch obj = new TryCatch();
		/*
		 * / ** obj.sum(); obj.minus(); obj.multiply(); obj.division();
		 **/
		division();
		obj.sum();
		minus();
		multiply();

	}

	public void sum() {
		try {
			int z = 3 + 5;
			System.out.println(z);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void minus() {
		try {
			int z = 3 - 5;
			System.out.println(z);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void multiply() {
		try {
			int z = 3 * 5;
			System.out.println(z);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void division() {

		try {
			int z = 7 / 0;
			System.out.println(z);
		} catch (Exception e) {
			e.printStackTrace();
			try {
				int z1 = 3 / 0;
				System.out.println(z1);
			} catch (ArithmeticException e1) {
				e1.printStackTrace();
			}
		}

	}

}
