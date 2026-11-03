package forloopandwhileproblems;

import java.util.Scanner;

public class FactorOfRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		int f=factRecursion(n);
			System.out.println(f);	

	}
	static int  factRecursion(int n){
		if(n==0 ||n==1)
		{
			return 1;
		}
		return  n *(factRecursion(n-1));
		
	}

}
