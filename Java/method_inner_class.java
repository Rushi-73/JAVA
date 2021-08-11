class method_class
{
	
	void fun()
	{
		int a=10;  //when we define variable in method it is accessible in whole block of method
		class inner
		{
			void gun()
			{
				System.out.println("Method inner class"+a);   /*but if you use local variable in method inner class you can't
															    change their value it will act like final class read only data*/
			}
		}
		//a++;   it will give error because we already used in method inner class
		System.out.println("Method");
		inner i=new inner();
		i.gun();
	}

	public static void main(String[] args) {
		method_class mc=new method_class();
		mc.fun();
		
	}
}
