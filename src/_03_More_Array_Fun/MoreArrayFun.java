package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	static String[] thing = new String[5];
	static Random order = new Random();

	public static void main(String[] args) {
		thing[0] = "thing0";
		thing[1] = "thing1";
		thing[2] = "thing2";
		thing[3] = "thing3";
		thing[4] = "thing4";
		// printString(thing);
		// reverseString(thing);
		randomString(thing);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	public static void printString(String[] bob) {
		for (int i = 0; i < thing.length; i++) {
			System.out.println(thing[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reverseString(String[] roob) {
		for (int i = thing.length - 1; i >= 0; i--) {
			for (int j = thing[i].length() - 1; j >= 0; j--) {
				System.out.print(thing[i].charAt(j));
			}
			System.out.println();
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void otherString(String[] noob) {
		for (int i = 0; i < noob.length; i += 2) {
			System.out.println(thing[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

	public static void randomString(String[] banana) {
		boolean[] tracker = new boolean[banana.length];
		// for (int i = 0; i < tracker.length; i++) {
		// tracker[i] = false;
		// }
		for (int i = 0; i < banana.length; i++) {
			int random = order.nextInt(banana.length);
			while (tracker[random]) {
				random = order.nextInt(banana.length);
				// System.out.println();
			}
			System.out.println(thing[random]);
			tracker[random] = true;
		}

	}
}
