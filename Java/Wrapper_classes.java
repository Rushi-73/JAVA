import java.lang.Number;//all number related wrapper classes come under Number class 
class Wrapper_classes
{
	public static void main(String[] args) {
			
			int a=10;
			Integer i=new Integer(a);
			System.out.println(i);
			System.out.println(i.toString());//it will print same because toString method is override in Integer class
		}	
}
