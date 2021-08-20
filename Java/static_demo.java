//Write a java program to illustrate static in java. (Static - block, field, method,inner class, import)

class static_demo
{
	static int a=10;

	static int b=fun();

	static int fun()
	{
		System.out.println("Static Function");
		return 20;
	}

	static{
		System.out.println("Static block 1");
	}
	static{
		System.out.println("Static block 2");
	}

	int c=gun();

static int gun()
	{
		System.out.println("Static Function1");
		return 30;
	}

	 public static void main(String[] args) {

	 	System.out.println(a);
	 	System.out.println(b);
		
	}

}
