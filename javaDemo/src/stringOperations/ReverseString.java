package stringOperations;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to be reversed:");
		String str = input.nextLine();
		char[] ch = str.toCharArray();//--Hansul ---  H A N S U L  - Conversion of String to Char Array
		int length = ch.length;
		System.out.println(ch.length);
		reverseStringWithoutInbuiltFunction(ch, length);
	}

	public static void reverseStringWithoutInbuiltFunction(char[] ch, int length) {
		if (length > 0) {
			System.out.println(ch[length - 1]);
			length--;
			reverseStringWithoutInbuiltFunction(ch, length); // recursive call made here
		}
	}

}
