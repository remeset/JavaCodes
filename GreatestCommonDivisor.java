import java.util.Scanner;
public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int N1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int N2 = input.nextInt();
		int GCD = 1;
		int P = 2;
		while (P <= N1 && P <= N2) {
		System.out.println("maradek1 = " + N1 % P);
		System.out.println("maradek2 = " + N2 % P);
			if (N1 % P == 0 && N2 % P == 0) {
				GCD = P;
				System.out.println("Actual common divisor: " + GCD);
			}
			P = P + 1;
		}
		System.out.println("The greatest common divisor for " + N1 + " and " + N2 + " is " + GCD);
	}

}


/*
input N1, N2
GCD = 1
P = 2
loop while P <= N1 AND P <= N2
	if N1 mod P = 0 AND N2 mod P = 0 then
		GCD = P
	end if
	P = P + 1
end loop
output "The greatest common divisor for " , N1, " and ", N2, " is ", GCD
*/