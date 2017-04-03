/*****************************************************
 * Metonymy -- Ryan Siu, Tiffany Moi, Mohamed Tamara
 *
 * class Driver
 * used for testing methods
 ******************************************************/

public class Driver {
    
    public static void main( String[] args ) {
	
	DLLDeque d = new DLLDeque();
	d.addLast( "e" );
	d.addFirst( "hi" );
	d.addFirst( "Hello" );
	d.addFirst( "Bye" );
	d.addLast( "a" );
	d.addLast( "b" );
	d.addLast( "c" );
	System.out.println( d ); // Bye Hello hi e a b c
	d.removeFirst();
	d.removeLast();
	d.removeFirst();
	d.removeLast();
	d.removeLast();
	d.removeFirst();
	System.out.println( d ); // e
	d.removeFirst();
	System.out.println( d ); // empty deque
	//d.removeFirst(); // error
	//d.getFirst(); //error
	d.addFirst( "a" );
	System.out.println( d.getFirst() ); // a
	
    }
    
}
