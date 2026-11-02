package forloopandwhileproblems;

import java.util.Scanner;
//2.Write a Java program to print all even numbers from 1 to 50 using a for loop.
public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a nuber");
		int n=sc.nextInt();
		evenNumber(n);

	}
	static void evenNumber(int n)
	{
		for(int i=1;i<=n;i++) {
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
	}

}
