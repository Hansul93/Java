package stringOperations;

public class Duplicate {

	public static void main(String[] args) {
		String s="sivas";
		char[] inp = s.toCharArray();
		System.out.println("Duplicate Characters are:");
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(inp[i] == inp[j]) {
				System.out.println(inp[j]);
				
				}
			}
		}
	}

}
