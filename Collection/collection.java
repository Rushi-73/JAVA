import java.util.*;

//this class contain all methods of Collection interface

class collection
{
	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();

		hs.add(10);//public boolean add(Object obj);

		System.out.println("After add method "+hs);
		HashSet<Integer> hs1=new HashSet<Integer>();

		hs1.add(20);
		hs1.add(30);
		hs1.add(40);

		hs.addAll(hs1);//public boolean addAll(Collection c);
		System.out.println("After addAll method "+hs);

		hs.remove(40);//public boolean remove(Object o);
		System.out.println("After remove method "+hs);

		hs.removeAll(hs1);//public boolean removeAll(Collection c);
		System.out.println("After removeAll method "+hs);

		hs.addAll(hs1);//public boolean addAll(Collection c);
		System.out.println("Again After addAll method "+hs);

		System.out.println("Contains method for 20 "+hs.contains(20));//public boolean contains(Object o); 

 		System.out.println("Contains all method for object "+hs.containsAll(hs1));//public boolean containsAll(Collection c);

 		hs.add(11);
 		hs.add(12);

 		hs.retainAll(hs1);//public boolean retainAll(Collection c);
 		System.out.println("After retainAll method "+hs);

 		Object[] arr=hs.toArray();//public boolean toArray();
 		System.out.println("After toarray method "+hs);

 		System.out.println("To check hashset is empty or not isEmpty method returns "+hs.isEmpty());//public boolean isEmpty();

 		hs.clear();
 		hs1.clear();//public void clear();



	}
} 
