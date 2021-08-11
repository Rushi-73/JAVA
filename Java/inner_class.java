class inner_class
{
	class inner
	{
		void fun()
		{
			System.out.println("Inner class");
		}
		
	}

	public static void main(String[] args) {
		inner_class ic=new inner_class();   //we can't access inner class without creating object of outer class
		inner i=ic.new inner();
		//inner_class.inner i=ic.new inner();
		i.fun();
	}
	
}
