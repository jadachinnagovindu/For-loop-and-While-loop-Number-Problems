package forloopandwhileproblems;

import java.util.Scanner;
//40. Find the digital root of a positive integer.
public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();//9875
		int sum=0;
	
	
		while(n>=10)
		{
			int digit=n%10;//9875%10
			sum=sum+digit;
			n=n/10;
		}

	}

}
