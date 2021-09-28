import java.util.Scanner;

public class OrderTwoCities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the fist city: ");
		String S1 = input.nextLine();
		System.out.println("Enter the second city: ");
		String S2 = input.nextLine();
		if (S1.compareTo(S2) > 0) {
			System.out.println("The cities in alphabetical order are: " + S2 + ", " + S1);
		} else {
			System.out.println("The cities in alphabetical order are: " + S1 + ", " + S2);
		}

	}
}
