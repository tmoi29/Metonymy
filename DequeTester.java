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
	
	DLLDeque<String> stringDeque = new DLLDeque<String>();
	stringDeque.addLast( "b" );
	stringDeque.addFirst( "a" );
	stringDeque.addLast( "c" );
	System.out.println( stringDeque ); // a b c
	stringDeque.removeFirst();
	stringDeque.removeLast();
	System.out.println( stringDeque ); // b
	stringDeque.removeFirst();
	System.out.println( stringDeque ); // empty deque
	
	try {
	    stringDeque.removeFirst(); // error
	} catch (NoSuchElementException e) {
	    e.printStackTrace(); //prints error message
	}
	try {
	    stringDeque.getFirst(); //error
	} catch (NoSuchElementException e) {
	    e.printStackTrace(); //prints error message
	}
	
	stringDeque.addFirst( "a" );
	System.out.println( stringDeque.getFirst() ); // a

	DLLDeque mixDeque = new DLLDeque();
	mixDeque.addFirst( 1 );
	mixDeque.addLast( "a" );
	mixDeque.addFirst( new ArrayList<Integer>() );
	System.out.println( mixDeque );
	ArrayList a = (ArrayList)mixDeque.removeFirst();
	a.add( 64 );
	mixDeque.addFirst( a );
	System.out.println( mixDeque );
	
    }
    
}
