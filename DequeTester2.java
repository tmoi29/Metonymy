//Shivasuryan Vummidi
//APCS2 pd5
//HW29: Driver class for Deque
//2017-04-04

import java.util.ArrayList;

public class DequeTester2{
	public static void main(String[] args){
		DLLDeque a = new DLLDeque();
		//should add 2 as the first element.
		a.addFirst(2);
		//should display [2]
		System.out.println(a);
		//should add 3 as the first element.
		a.addFirst(3);
		//should display [3, 2]
		System.out.println(a);
		//should add 4 as the last element.
		a.addLast(4);
		System.out.println(a);
		//should remove 3 and create [2, 4]
		a.removeFirst();
		//should print out the first element without removing it.
		//System.out.println(a.peekFirst());
		System.out.println(a.getFirst());
		//should print out the last element and remove it.
		System.out.println(a.removeLast());
		System.out.println(a);
		//A robust Deque must handle different data types.
		a.addFirst("A");
		System.out.println(a);
		//should print out the first element and remove it.
		System.out.println(a.removeFirst());
		//add the list as its own first element.--- > FAILURE
		a.addFirst(a);
		System.out.println(a);
	}
}
