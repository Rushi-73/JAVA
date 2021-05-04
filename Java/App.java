import java.util.Scanner;

class App
{
	  public static void main(String args[])
	  {
           Scanner sc=new Scanner(System.in);

           int unit=sc.nextInt();
           	 int rate=100;

           	 if(unit>0 && unit<=100)
           	 {
           	   rate+=rate+(unit*3);  
           	 }
           	else if(unit>100&&unit<=200)
           	{
           		rate+=300+((unit-100)*5);
           	}
           	else if(unit>200&& unit<=300)
           	{
           		rate+=800+((unit-200)*7);
           	}
           	else if(unit>300)
           	{
           		rate+=1500+((unit-300)*10);
           	}
           	System.out.println("Total electricity bill is"+rate);


	  }
}