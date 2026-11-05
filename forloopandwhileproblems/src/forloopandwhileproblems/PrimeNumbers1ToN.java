package forloopandwhileproblems;

import java.util.Scanner;

public class PrimeNumbers1ToN {
	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;

		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				status=false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers Do you Want");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}

}
