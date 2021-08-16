//Write a java program to check whether given number is Armstrong or not. (Using Scanner class).

import java.util.Scanner;

class Armstrong
{
	static int power(int rem,int n)
	{
		int pow=1;
		while(n>0)
		{
			pow=pow*rem;
			n--;
		}
		return pow;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int m=0,i,x=n,total=0,rem;
		while(x!=0)
		{
			x=x/10;
			m++;
		}
		x=n;
		while(x!=0)
		{
			rem=x%10;
			x=x/10;
			total=total+Armstrong.power(rem,m);
		}
		
		if(total==n)
			System.out.println("Given NUmber is Armstrong nnumber");
		else
			System.out.println("Given number is not Armstrong number");

		
	}
}
