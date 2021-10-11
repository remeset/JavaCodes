import java.util.Scanner;

public class AlteringCases {

	public static void main(String[] args) {
		System.out.println("How many letters will be entered?");
		int N = new Scanner(System.in).nextInt();
		char[] letters = new char[N];
		int i = 0;
		do {
			System.out.println("Enter a letter:");
			letters[i] = new Scanner(System.in).next().charAt(0);
			if (letters[i] >= 'A' && letters[i] <= 'Z' || letters[i] >= 'a' && letters[i] <= 'z') {
				i = i + 1;
			}
		} while (i < N);

		for (int j = 0; j < letters.length; j = j + 1) {
			if ((j % 2 == 0) && (int) letters[j] >= 97) {
				letters[j] = (char) (((int) letters[j]) - 32);
			} else if (j % 2 != 0 && (int) letters[j] <= 90) {
				letters[j] = (char) (((int) letters[j]) + 32);
			}
		}

		for (int k = 0; k < letters.length; k = k + 1) {
			System.out.print(letters[k] + " ");
		}
	}
}
