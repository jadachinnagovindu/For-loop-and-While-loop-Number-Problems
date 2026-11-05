package forloopandwhileproblems;

import java.util.Scanner;

public class Armstrong {
	static boolean isArmstrong(int n)
	{ 
		boolean status=false;
		int r=0;
		int temp=n;
		int sum=0;
		String str=Integer.toString(n);
		int digit=str.length();
		while(n>0){
			r=n%10;//153%=3 
			n=n/10;//153/10=15
			sum=(int) (sum+Math.pow(r, digit));
		}
		if(sum==temp)
		{
			status=true;
		}
		
		
		return status;
	}

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	boolean flag=isArmstrong(n);
	
	if(flag)
	{
		System.out.println("Given Number is Armstrong ");
	}
	else {
		System.out.println("Given Number is Not Armstrong ");
	}
	

	}

}
