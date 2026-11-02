package forloopandwhileproblems;

import java.util.Scanner;
//1.Write a Java program to print numbers from 1 to 20 using a for loop.
public class Oneto20numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		oneTo20number(n);
		
	}
	static void oneTo20number(int n)
	{
		for (int i=1;i<=n;i++)
		{
			System.err.println(i);
		}
	}

}
