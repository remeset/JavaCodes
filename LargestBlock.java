import java.util.Scanner;

public class LargestBlock {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//
//		System.out.print("Enter the number of rows in the square matrix: ");
//		int size = input.nextInt();
//
//		int[][] MATRIX = new int[size][size];
//
//		System.out.print("Enter the matrix row by row: ");
//
//		for (int i = 0; i < MATRIX.length; i++)
//			for (int j = 0; j < MATRIX[i].length; j++)
//				MATRIX[i][j] = input.nextInt();

		int[][] MATRIX = { { 1, 0, 1, 0, 1 }, { 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 0, 1, 1, 1 },
				{ 1, 0, 1, 1, 1 } };

		int[][] COUNT = new int[MATRIX.length][MATRIX.length];

		for (int i = MATRIX.length - 1; i >= 0; i--) {
			for (int j = MATRIX[i].length - 1; j >= 0; j--) {
				if (MATRIX[i][j] == 1) {
					COUNT[i][j] = 1;
					if (i < MATRIX.length - 1 && j < MATRIX[i].length - 1 && MATRIX[i + 1][j + 1] == 1) {
						// Check to expand the block with (i, j) at its upper right corner
						for (int k = 1; k <= COUNT[i + 1][j + 1]; k++) {
							if (MATRIX[i][j + k] == 1 && MATRIX[i + k][j] == 1) {
								COUNT[i][j] = COUNT[i][j] + 1;
							}
						}
					}
				}
			}
		}

		int max = COUNT[0][0];
		int maxOfx = 0;
		int maxOfy = 0;
		for (int i = 0; i < MATRIX.length; i++) {
			for (int j = 0; j < MATRIX[i].length; j++) {
				if (COUNT[i][j] > max) {
					max = COUNT[i][j];
					maxOfx = i;
					maxOfy = j;
				}
			}
		}

		int[] result = new int[3];
		result[0] = maxOfx;
		result[1] = maxOfy;
		result[2] = max;

		System.out.println(
				"The maximum square submatrix is at (" + result[0] + ", " + result[1] + ") with size " + result[2]);
	}
}
