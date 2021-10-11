
import java.util.Scanner;

public class Symmetric {

	public static void main(String[] args) {
		System.out.print("Length of the array: ");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] ARRAY = new int[N];
		System.out.print("Enter " + ARRAY.length + " values");
		for (int i = 0; i < ARRAY.length; i++) {
			ARRAY[i] = input.nextInt();
		}
		if (ARRAY.length % 2 == 0) {
			System.out.println("The array size is even.");
		} else {
			int S = ARRAY.length / 2;
			boolean FLAG = true;
			for (int i = 0; i <= S; i++) {
				if (ARRAY[S - i] != ARRAY[S + i]) {
					FLAG = false;
				}
				// FLAG=(FLAG && ARRAY[S-i]==ARRAY[S+i]);
			}

			if (FLAG == true) {
				System.out.println("Array is symmetric.");
			} else {
				System.out.println("Array is not symmetric.");
			}
		}

	}

}
