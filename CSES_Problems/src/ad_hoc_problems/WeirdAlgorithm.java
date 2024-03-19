package ad_hoc_problems;

import java.io.IOException;
import java.util.Scanner;

public class WeirdAlgorithm {
	public static void execute(int n) {
		if (n == 1) {
			return;
		}
		else if (n%2 == 0) {
			System.out.print(n/2+" ");
			execute(n/2);
		}
		else {
			System.out.print((n*3+1)+" ");
			execute(n*3+1);
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n+" ");
		execute(n);
	}
}
