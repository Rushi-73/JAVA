//Write a java program to check whether given number is prime or not. (Using Scanner class)

import java.util.Scanner;

class prime
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),f=0;
		for (int i=2;i<=n/2 ;i++ ) {
			
			if(n%i==0)
			{
				f=1;
				System.out.println("Number is not prime");
				break;
			}

		}
		if(f==0)
		{
			System.out.println("Number is prime");
		}
	}
}
