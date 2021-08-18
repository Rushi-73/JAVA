//Write a java program to accept one string from user and print all characters from string. (Using BufferedReader class). charAt(i)
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class str_char
{
	public static void main(String[] args)throws Exception {
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);

		System.out.println("Enter String");
		String str=br.readLine();

		for (int i=0;i<str.length() ;i++ ) {
	 System.out.println(str.charAt(i));
}
		
	}
}
