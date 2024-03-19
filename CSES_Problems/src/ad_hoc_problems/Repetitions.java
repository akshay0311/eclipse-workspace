// package ad_hoc_problems;

import java.util.Scanner;

public class Repetitions {
	public static long execute(String str) {
		long max_count = 0;
		long c = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i-1)) {
				c=c+1;
			}
			else {
				if (c > max_count) max_count = c;
				c = 1;
			}
		}
		if (c > max_count) max_count = c;
		return max_count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		long n = execute(str);
		System.out.println(n);
	}
}
