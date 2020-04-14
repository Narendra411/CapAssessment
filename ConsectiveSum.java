package apr10assessment;
import java.util.Scanner;
public class ConsectiveSum {
	public static int consecutiveSum(int N) {
		int rst = 0;
		// Make N = 2 * N
		N <<= 1;
		// Traverse the value of a
		for (int i = 1; i * i < N; i++) {
			// a * b = 2N and a + b is odd
			if (N % i == 0 && ((i + N / i) & 1) == 1) {
				rst++;
			}
		}
		return rst;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int rst = consecutiveSum(n);
		scan.close();
		System.out.println(rst - 1);

	}

}
