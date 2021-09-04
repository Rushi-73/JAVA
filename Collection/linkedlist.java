import java.util.*;

class linkedlist
{
	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();

		ll.addFirst(10);//public void addFirst(Object o);
		ll.addFirst(20);
		System.out.println("After addfirst method linkedlist is "+ll);

		ll.addLast(40);//public void addLast(Object o);
		ll.addLast(30);
		System.out.println("After addLast method Linkedlist is "+ll);

		ll.removeFirst();//public void removeFirst();
		System.out.println("After removing first element linkedlist is "+ll);

		ll.removeLast();//public void removeLast();
		System.out.println("After removing last element linkedlist is "+ll);



	}
}
