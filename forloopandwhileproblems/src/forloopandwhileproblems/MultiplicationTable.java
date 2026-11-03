package forloopandwhileproblems;

import java.util.Scanner;

//2)Write a Java program to print the multiplication table of a given number.
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("what table do you want ");
		int n=sc.nextInt();
		System.out.println("which number to do you stop");
		int n1=sc.nextInt();
		multiplicationTable(n,n1);

	}
static 	void multiplicationTable(int n,int n1){
		
	for(int i=1;i<=n1;i++)
	{
		System.out.println(n+" X "+i+" = "+(n*i));
	}
	}

}
