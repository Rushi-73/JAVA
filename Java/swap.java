//Write a java program to swap two integer numbers. (Using Command Line Arguments).

import java.util.Scanner;

class swap 
{
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]); //takinf input from command line and type cast into integer
		int b=Integer.parseInt(args[1]);

		a=a*b;      //swaping without third variable
		b=a/b;
		a=a/b;

		System.out.println("Swap numbers are "+a+" "+b);
	}
}
