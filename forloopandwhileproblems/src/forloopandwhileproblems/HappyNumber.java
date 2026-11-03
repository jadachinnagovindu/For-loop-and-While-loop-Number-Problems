package forloopandwhileproblems;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int temp=n;
		int sum;
		while(temp!=1 && temp!=4) {
			sum=0;
		
		while(temp!=0)
		{
			int digit=temp%10;
			sum=sum+(digit*digit);
			temp=temp/10;
		}
		temp=sum;
		}
		if(temp ==1)
		{
			System.out.println("Happy number "+n);
		}
		else
		{
			System.out.println("Not Happy number "+n);
		}

	}

}
