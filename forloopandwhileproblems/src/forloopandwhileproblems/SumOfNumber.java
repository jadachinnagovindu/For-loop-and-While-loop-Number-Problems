package forloopandwhileproblems;

import java.util.Scanner;
//3.Write a Java program to find the sum of all numbers from 1 to N that are 
//divisible by both 3 and 5 using a for loop.
public class SumOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sumOfAllNumbers(n);

	}
	static void sumOfAllNumbers(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				sum+=i;
			}
			
		}
		System.out.println(sum);
		
		
	}

}
