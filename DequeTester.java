import java.util.NoSuchElementException;
import java.util.ArrayList;

public class DequeTester {

    public static void main(String[] args) {

	DLLDeque test = new DLLDeque();

	//print empty Deque
	System.out.println(test);
	
	// should throw NoSuchElementException
	try { 
	    System.out.println(test.removeFirst());
	}
	catch (NoSuchElementException e) {
	    System.out.println("NoSuchElementException caught");
	}

	// should throw NoSuchElementException
	try { 
	    System.out.println(test.removeLast());
	}
	catch (NoSuchElementException e) {
	    System.out.println("NoSuchElementException caught");
	}

	//true
	System.out.println(test.isEmpty());

	//add various data of different type
	try{
	    test.addFirst(null); // should return NullPointerException
	}
	catch (NullPointerException e){
	    System.out.println("NullPointerException caught");
	}
	try{
	    test.addLast(null); // should return NullPointerException
	}
	catch (NullPointerException e){
	    System.out.println("NullPointerException caught");
	}
	test.addFirst(8);
	test.addFirst("hi");
	test.addLast(new String[5]);
	test.addLast(8.0f);

	//should be... 8.0, memoryLocation, 8, hi, null,
	System.out.println(test);

	//false
	System.out.println(test.isEmpty());

	//8.0
	System.out.println(test.removeLast());

	//hi
	System.out.println(test.removeFirst());

	//memory location
	System.out.println(test.removeLast());

	//8
	System.out.println(test.removeFirst());

    }

}
