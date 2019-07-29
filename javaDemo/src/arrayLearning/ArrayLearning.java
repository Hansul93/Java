package arrayLearning;

public class ArrayLearning {

	public static void main(String[] args) {

		int arry[];
		char charArr[];
		String str[];

		int obj[] = new int[20];

		obj[0] = 10;
		obj[1] = 19;
		System.out.println("OBJ length: " + obj.length);
		for (int i = 0; i < obj.length; i++) {
			// System.out.println("Value stored at the index "+i+ " is " + obj[i]);
		}

		int twoD[][] = { { 23, 45, 56 }, { 34, 67, 12 }, { 76, 23, 56 } };

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(twoD[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int threeD[][][] = { { { 12, 45 }, { 34, 56 } }, { { 98, 45 }, { 76, 23 } } };
		for (int arrayIndex = 0; arrayIndex < 2; arrayIndex++) {
			for (int row = 0; row < 2; row++) {
				for (int col = 0; col < 2; col++) {
					System.out.print(threeD[arrayIndex][row][col] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
