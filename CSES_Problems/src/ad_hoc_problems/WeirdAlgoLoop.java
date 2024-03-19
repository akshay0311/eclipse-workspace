package ad_hoc_problems;

import java.io.IOException;
import java.util.Scanner;

public class WeirdAlgoLoop {
	public static void execute(long n) {
		while (n > 1) {
			System.out.print(n+" ");
			if (n%2 == 0) n = n/2;
			else n = (n*3)+1;
		}
		if (n == 1)
			System.out.println(n);
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		// System.out.print(n+" ");
		execute(n);
	}
}
