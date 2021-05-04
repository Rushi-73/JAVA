import java.util.Scanner;

interface banks 
{
	void price();
	
}
class hdfc implements banks
{
	public void price()
	{
		System.out.println("Rs 40 debited");
	}
	
}
class axis implements banks
{
	public void price()
	{
		System.out.println("Rs 40 debited");
	}
	
}
class user 
{
	public static void main(String[] args) {

		Amazon a= new Amazon();
		a.product(new axis());
		
	}
	
}
class Amazon
{
	 void product(banks b)
	{
			System.out.println("Hairbrush");
			b.price();

	}
      
}