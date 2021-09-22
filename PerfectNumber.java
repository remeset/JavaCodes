
public class PerfectNumber {
	public boolean perfectNumber(int N) {
		boolean isPerfect = false;
		int DIV = 1;
		int SUM = 0;
		while (DIV != N) {
			if (N % DIV == 0) {
				SUM = SUM + DIV;
			}
			DIV = DIV + 1;
		}
		if (SUM == N) {
			isPerfect = true;
		}
		return isPerfect;
	}

}
