package MyProject;

import java.util.*; 

public class Linkedlist { 
	public static void main(String args[])  { 
		LinkedList<String>l_list=new LinkedList<>();


		l_list.add("B"); 
		l_list.add("C"); 
		l_list.addLast("G"); 
		l_list.addFirst("A"); 
		l_list.add(3, "D"); 
		l_list.add("E"); 
		l_list.add("F"); 
		System.out.println("Linked list : " + l_list);

		ArrayList<String> aList = new ArrayList<>();
		aList.add("H");
		aList.add("I");
		l_list.addAll(aList);
		System.out.println("Linked list after adding ArrayList contents: " + l_list);

		l_list.remove("B"); 
		l_list.remove(3); 
		l_list.removeFirst(); 
		l_list.removeLast(); 
		System.out.println("Linked list after deletion: " + l_list); 

		boolean ret_value = l_list.contains("G"); 
		if(ret_value) 
			System.out.println("List contains the element 'G' "); 
		else
			System.out.println("List doesn't contain the element 'G'"); 

		int size = l_list.size(); 
		System.out.println("Size of linked list = " + size); 

		Object element = l_list.get(3); 
		System.out.println("Element returned by get() : " + element); 
		l_list.set(3, "J"); 
		System.out.println("Linked list after change : " + l_list); 

		String [] list_array = l_list.toArray(new String[l_list.size()]);

		System.out.println("Array obtained from linked List:" +
				Arrays.toString(list_array));

	} 
}
