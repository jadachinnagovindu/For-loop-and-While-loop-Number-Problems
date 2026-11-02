package forloopandwhileproblems;

import java.util.Scanner;

public class FactorsOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		
		factorsOfNumber(n);

	}
 static void factorsOfNumber(int n){
	int  fact=1;
	 for(int i=n;i>=1;i--)
	 {
		 fact=fact*i;
	 }
		System.out.println(fact);
	}

}
