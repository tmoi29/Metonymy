import java.util.NoSuchElementException;

/*****************************************************
 * class DLLQueue
 * uses a doubly-linked nodes to implement a QUEUE
 * (a collection with FIFO property)
 *
 *         -------------------------------
 *   front |  <-->   Q U E U E   <-->    | end
 *         -------------------------------
 *
 ******************************************************/

public class Driver<T> implements Deque<T> {
    //declaring instance variables
    private int _size;
    private DLLNode<T> _front;
    private DLLNode<T> _end;
    
    /*=============================
      Driver() -- default constuctor
      Initialing instance variables
      =============================*/
    public Driver() {
	_front = null;
	_end = null;
	_size = 0;
    }
    /*=============================
      addFirst() -- adds the element to the front of the DLList
      precond: an object is given
      postcond: adds element to the front of the list
      =============================*/
    public void addFirst( T foo ){
	DLLNode<T> add = new DLLNode( foo, null, null );
	//is it the first element??
	if ( isEmpty() ) {
	    _end = add;
	} 
	else {
	    add.setNext( _front );
	    _front.setPrev( add );
	}
	_front = add;
	_size++;
    }
    
    /*=============================
      addLast() -- adds the element to the end of the DLList
      precond: an object is given
      postcond: adds element to the end of the list
      =============================*/
    public void addLast( T foo ) {
	DLLNode<T> add = new DLLNode( foo, null, null );
	//is it the first element??
	if ( isEmpty() ) {
	    _front = add;
	} else {
	    add.setPrev( _end );
	    _end.setNext( add );
	}
	_end = add;
	_size++;
    }
    /*=============================
      removeFirst() -- removes the element at the front of the DLList
      postcond: removes the first element and reassigns the pointers
      =============================*/
    public T removeFirst() {
	//checks if the list is empty
	if ( isEmpty() ) {
	    throw new NoSuchElementException( "Deque is empty, element cannot be removed" );
	}
	//removing value
	T foo = _front.getCargo();
	
	//removing the last value in the list
	if ( size() == 1 ) {
	    _front = null;
	    _end = null;
	} 
	//removing the first value and replacing the pointer to it with null
	else {
	    _front = _front.getNext();
	    _front.setPrev( null );
	}

	_size--;
	return foo;
    }
    /*=============================
      removeLast() -- removes the element at the end of the list
      postcond: removes the element at the end of the list and reassigns the end pointer
      =============================*/
    public T removeLast() {
	//checks if the list is already empty
	if ( isEmpty() ) {
	    throw new NoSuchElementException( "Deque is empty, element cannot be removed" );
	}
	
	//removing value
	T foo = _end.getCargo();

	//removing the last value
	if ( size() == 1 ) {
	    _front = null;
	    _end = null;
	}
	//removes value and reassigns the last pointer
	else {
	    _end = _end.getPrev();
	    _end.setNext( null );
	}

	_size--;
	return foo;
    }
    
    public T getFirst() {
	return null;
    }

    public T getLast() {
	return null;
    }

    public int size() {
	return _size;
    }

    public boolean isEmpty(){
	return _size == 0;
    }

    public String toString() {
	DLLNode<T> foo = _front;
	String retStr = "";
	for ( int i = 0; i < size(); i++ ) {
	    retStr += foo.getCargo() + " ";
	    foo = foo.getNext();
	}
	return retStr;
    }

    public static void main( String[] args ) {
	Driver d = new Driver();
	d.addLast( "e" );
	d.addFirst( "hi" );
	d.addFirst( "Hello" );
	d.addFirst( "Bye" );
	d.addLast( "a" );
	d.addLast( "b" );
	d.addLast( "c" );
	System.out.println( d );
	d.removeFirst();
	d.removeLast();
	d.removeFirst();
	d.removeLast();
	d.removeLast();
	d.removeFirst();
	System.out.println( d );
	d.removeFirst();
	System.out.println( d );
	d.removeFirst(); // error
    }
}
