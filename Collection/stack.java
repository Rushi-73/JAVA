import java.util.*;

//this is class for Stack Collection 
class stack
{
	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);

			Stack<Integer> st=new Stack<Integer>();

			st.push(10);
			st.push(20);//public void push(Object o);

			System.out.println("After push operation Stack is"+st);

			System.out.println("For deleting element pop() is used it return element after deletion "+st.pop());//public object pop();

			System.out.println("For getting top element in stack "+st.peek());//public object peek();

			System.out.println("To search element in stack by search() "+st.search(10));//public int search(Object o);

		}	
}
