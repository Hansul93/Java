package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.NotActiveException;

public class Throw_Throws {


	public static void norma4l() throws Exception {
		Throw_Throws obj = new Throw_Throws();
		/*
		 * / ** obj.sum(); obj.minus(); obj.multiply(); obj.division();
		 **/

		obj.sum(); minus(); multiply(); 
		 
		
		obj.normal();
		
		division(); 
	}

	public void sum() throws Exception {

		int z = 3 + 5;
		System.out.println(z);

	}

	public static void minus() throws Exception {

		int z = 3 - 5;
		System.out.println(z);

	}

	public static void multiply() throws Exception, FileNotFoundException {

	    FileReader fr=new FileReader("D:\\testout.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close(); 
		int z = 3 * 5;
		System.out.println(z);

	}

	public static void division() throws ArithmeticException, InterruptedException {

		int z = 7 / 0;
		System.out.println(z);
		Thread.sleep(3000);

	}

	public void normal() throws NotActiveException {
		boolean valueIsVisible = false;
		try {
			System.out.println("Verify the field for normal user credentials");
			if (valueIsVisible == false) {
				throw new NotActiveException();
			}
			else {
				int r = 3/0;
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
