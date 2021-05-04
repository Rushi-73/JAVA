import java.util.*;
//port java.lang.*;
class Group
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array element");
		String s=sc.nextLine();
		System.out.println("Enter divide number");
		int n=sc.nextInt();

		String []str=s.split(",");
		int a[]=new int[str.length];
		int b[]=new int[n];
		int i;
		for(i=0;i<str.length;i++)
			a[i]=Integer.parseInt(str[i]);
		for(i=0;i<n;i++)
		{
			b[i]=a[i];
		}

		System.out.println(Arrays.toString(b));
	}
}