package forloopandwhileproblems;

import java.util.Scanner;

public class NthPrimeCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Numbers do you want");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; ; i++) {
			if (isPrime(i)) {
				count++;
				
			
			if(count==n)
			{
				System.out.println(i);
			}
			}
			
			

		}
	
	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;

		}
		for (int i = 2; i*i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

}
