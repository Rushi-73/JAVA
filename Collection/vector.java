import java.util.*;

//this class is for vector in collection 
class vector{
	
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>(2,3);
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter values to check capacity");
		for(int i=0;i<6;i++)
		{
			a=sc.nextInt();
			v.addElement(a);
		}
		System.out.println("Capacity is "+v.capacity());//capacity is increased by incremental capacity that we pass in constructor

		Vector<Integer> v1=new Vector<Integer>();

		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);//public void addElement(Object o);
		System.out.println("After addElement method "+v1);
                                                                      
		System.out.println("For getting first element in vector by firstElement() is "+v1.firstElement());
																//public Object firstElement();

		System.out.println("For getting last element in vector by lastElement() is "+v1.lastElement());
																//public Object lastElement();

		 System.out.println("For getting element at 2nd index in vector by elementAt() is "+v1.elementAt(2));
																//public object elementAt(int index);

		 v1.removeElementAt(2);//public Object firstElement();
		 System.out.println("After removing element at 2nd index in vector "+v1);

		 v1.removeElement(20);//public boolean removeElement();
		System.out.println("After removing element 20 in vector "+v1);

		v1.removeAllElement();//for removing all elementAt in vector removeAllElement() is used it is act as clear
		//public void removeAllElement();													
	}
}
