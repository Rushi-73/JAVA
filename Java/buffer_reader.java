import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class buffer_reader
{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		Scanner sc=new Scanner(System.in);

		int a=Integer.parseInt(br.readLine());
		String name=br.readLine();
		System.out.println("Integer value  "+a);
		System.out.println("String value  "+name);

		a=sc.nextInt();
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Integer value  "+a);
		System.out.println("String value  "+name);
	}
}
