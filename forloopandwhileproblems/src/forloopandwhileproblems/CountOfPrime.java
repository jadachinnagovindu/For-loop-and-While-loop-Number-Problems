package forloopandwhileproblems;

import java.util.Scanner;

public class CountOfPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you Want");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(i + " - " + count);
			}
		}

	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
			}
		}
		return status;
	}

}
