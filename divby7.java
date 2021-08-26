//. Write a java program to accept one integer from user and check whether given number is divisible by 7 or not (using divisibility condition)
import java.util.Scanner;

class divby7
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int n=sc.nextInt();
		if(n%7==0)
		System.out.println("Number is divisible by 7");
		else
			System.out.println("Number is not divisible by 7");
	}
}
