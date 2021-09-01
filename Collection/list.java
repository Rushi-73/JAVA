import java.util.*;

class list
{
	/*
	 public ArrayList();
	 public ArrayList(Collection c);
	*/
	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();

		al.add(0,10);//public void add(int index,Object o);
		System.out.println("After add method on al "+al);

		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(0,20);
		al1.add(1,30);
		al1.add(2,40);

		System.out.println("After add method on al1 "+al1);
		al.addAll(1,al1);
		System.out.println("After addAll method "+al);

		al.remove(1);//public void remove(int index);
		System.out.println("After remove method on al for 20"+al);

		/*al.removeAll(al1);
		System.out.println("After removeAll method on al for object al1"+al);*/

		System.out.println("Index of 30 in list is "+al.indexOf(30));//public int indexOf(Object o);

		al.set(1,22);
		System.out.println("After set method "+al);
		System.out.println("Get method gives object store at index 1 "+al.get(1));


		al.add(3,10);

		System.out.println("LastindexOf method gives last index of repeated number "+al.lastIndexOf(10));

	}
}
