package polymorphism;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOperations {

	public static void main(String[] args) {

		String name = "Java is a prgramming language";

		String date = "28-12-2019";

		String result[] = name.split(" ");

		String dateResult[] = date.split("-");

		System.out.println(result[3]);

		System.out.println("Date is: " + dateResult[0]);
		System.out.println("Month is: " + dateResult[1]);
		System.out.println("Year is: " + dateResult[2]);

		String hello = name.replace(" ", " ");
		System.out.println("output of replace function: " + hello);

		String url = "https://hihello/disputeid?=887787/escalate/438767";

		int disputeid = 435435; // hardcode - you assigning some value forcefully --- Wrong Practice

		Pattern pattern = Pattern.compile("([0-9])\\w+");

		Matcher matcher = pattern.matcher(url);
		System.out.println(matcher.find(1));
		if (matcher.find()) {
			System.out.println("Match: "+matcher.group(0));
			System.out.println("Match: "+matcher.group(1));
			System.out.println("Match: "+matcher.groupCount());
		}
		else {
			System.out.println("did not match");
		}

		// System.out.println(""+disputeid);

	}

}
