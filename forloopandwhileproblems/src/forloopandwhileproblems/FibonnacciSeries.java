package forloopandwhileproblems;

import java.util.Scanner;

public class FibonnacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		for(int i=0;i<=n/2;i++) {
		int	n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		
		}
			
		
		

	}

}
