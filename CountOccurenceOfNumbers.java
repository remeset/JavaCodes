import java.util.Scanner;

public class CountOccurenceOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] COUNTS = new int[50];

		System.out.print("Enter the integers between 1 and 50: ");

		// Read all numbers
		int NUMBER = input.nextInt();
		while (NUMBER != 0) {
			if (NUMBER <= 50 && NUMBER > 0) {
				COUNTS[NUMBER - 1] = COUNTS[NUMBER - 1] + 1;
			}
			NUMBER = input.nextInt();
		}

		// Display result
		for (int i = 0; i < COUNTS.length; i++) {
			if (COUNTS[i] > 0) {
				if (COUNTS[i] == 1) {
					System.out.println((i + 1) + " occurs " + COUNTS[i] + " time");
				} else {
					System.out.println((i + 1) + " occurs " + COUNTS[i] + " times");
				}

			}
		}

	}

}
