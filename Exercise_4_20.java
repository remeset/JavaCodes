import java.util.Scanner;

public class Exercise_4_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String s = input.nextLine();
	    
	    System.out.println("The length of the string is " + s.length());
	    System.out.println("The last character in the string is " + s.charAt(s.length()-1));

	}

}
