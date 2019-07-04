package stringOperations;

public class InBuiltMethods {

	public static void main(String[] args) {
		InBuiltMethods l = new InBuiltMethods();
		l.stringLength();
		l.stringConcat();
	}

	public void stringLength() {

		String s = "shiva";
		System.out.println(s.length());

	}

	public void stringConcat() {

		String a = "suji";
		String b = "HANSUL";
		b.toCharArray();
		b.isEmpty();
		b.compareTo(a);
		
		System.out.println(a + " " + b);
		System.out.println(a.concat(b));// concat means "joining things together"
	}
}
