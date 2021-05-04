import java.util.*;
import java.lang.*;

class ARRAY
{
 void fun(int[] a1,int []b1)
	{
		int s1=Arrays.stream(a1).sum();
		int s2=Arrays.stream(b1).sum();

		System.out.println(s1);
		System.out.println(s2);
		String even="",odd="";
		int i,j;
		for(i=0;i<a1.length;i++)
		{
			for(j=0;j<b1.length;j++)
			{
				if(s1-a1[i]+b1[j]==s2+a1[i]-b1[j])
				{
					if((b1[j]*a1[i])%2==0)
					{
						even=even+Integer.toString(a1[i])+" ,"+Integer.toString(b1[j]);
						
					}
					else
					{	odd=odd+" ,"+Integer.toString(a1[i])+" ,"+Integer.toString(b1[j]);
					
					}	
				}
			}
		}

		System.out.println(even+odd);
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ARRAY obj=new ARRAY();
		
		System.out.println("first");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("second");
		int m=sc.nextInt();
		int b[]=new int[m];

		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();

		System.out.println("Enter array elements");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();

		  obj.fun(a,b);
		
	}
}