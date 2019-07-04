package stringOperations;

public class StringBuffer_Builder {

	public static void main(String[] args) {

		String a1 = "Nirmal";

		StringBuffer b1 = new StringBuffer(a1);
		b1.reverse(); 
		System.out.println(b1);

		StringBuilder obj = new StringBuilder(a1);
		obj.append("Automation");
		obj.append("Test");
		obj.append("Engineer");
		System.out.println(obj);

	}

}
