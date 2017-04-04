/*****************************************************
 * Metonymy -- Ryan Siu, Tiffany Moi, Mohamed Tamara
 *
 * class DequeTester
 * used for testing methods
 ******************************************************/
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class DequeTester {
    
    public static void main( String[] args ) {

	// Test using deque of Strings
	System.out.println( "\nTesting deque of Strings" );
	DLLDeque<String> stringDeque = new DLLDeque<String>();
	System.out.println( stringDeque );
	System.out.println( "\nAdding elements..." );
	stringDeque.addLast( "b" );
	stringDeque.addFirst( "a" );
	stringDeque.addLast( "c" );
	System.out.println( stringDeque ); // a b c
	System.out.println( "\nRemoving elements..." );
	stringDeque.removeFirst();
	stringDeque.removeLast();
	System.out.println( stringDeque ); // b
	System.out.println( "\nRemoving last element..." );
	stringDeque.removeFirst();
	System.out.println( stringDeque ); // empty deque

	System.out.println( "\nRemvoing element..." );
	try {
	    stringDeque.removeFirst(); // error
	} catch (NoSuchElementException e) {
	    e.printStackTrace(); //prints error message
	}
	System.out.println( "\nGetting first element..." );
	try {
	    stringDeque.getFirst(); //error
	} catch (NoSuchElementException e) {
	    e.printStackTrace(); //prints error message
	}

	System.out.println( "\nAdding element..." );
	stringDeque.addFirst( "a" );
	System.out.println( "\nGetting first element..." );
	System.out.println( stringDeque.getFirst() + "\n" ); // a


	// Test using deque of Objects
	System.out.println( "\nTesting deque of Objects" );
	DLLDeque mixDeque = new DLLDeque();
	System.out.println( "\nAdding elements..." );
	mixDeque.addFirst( 1 );
	mixDeque.addLast( "a" );
	mixDeque.addFirst( new ArrayList<Integer>() );
	System.out.println( mixDeque );
	System.out.println( "\nAdding 64 to the ArrayList at front" );
	ArrayList a = (ArrayList)mixDeque.removeFirst(); //pop the ArrayList
	a.add( 64 ); //add element 64
	mixDeque.addFirst( a ); // put ArrayList back in with 64 element
	System.out.println( mixDeque ); // [64] 1 a
	
    }
    
}
