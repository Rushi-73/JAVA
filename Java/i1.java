final class FINAL
{
	final int a,b,c;
	{
		a=10;
	}
	FINAL()
	{
		b=20;
	}

	final void test()
	{
		System.out.println("FINAL Class method");
	}

	public static void main(String args[])
	{
		FINAL i=new FINAL();
		System.out.println(i.a);//initialize by non static block
		System.out.println(i.b);//initialize by constructor
		System.out.println(i.c);//it will give error because value is not assigned
	}
}

class demo extends FINAL     //it wil give error because final class cannot be inherited
{
	void test()  			//it will give error because final method cannot be overrided
	{
		System.out.println("demo Class method");
	}
}