//Write a java program to illustrate final in java. (Final - field, method, outer class)
import java.util.Scanner;

final class Final  //cannot inherited
{
	final int a=10; //final field
	final int b;
	Final()
	{
		b=20;
	}

    final void gun() //cannot overrided
    {
    	System.out.println("This is final method");
    }
	public static void main(String[] args) {
		
		Final f=new Final();
		f.gun();
	}
}
