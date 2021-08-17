//Write a java program to swap two integer numbers. (Using Command Line Arguments).

import java.util.Scanner;

class swap
{
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);

		a=a*b;
		b=a/b;
		a=a/b;

		System.out.println("Swap numbers are "+a+" "+b);
	}
}
