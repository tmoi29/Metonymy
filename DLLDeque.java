import java.util.NoSuchElementException;

/*****************************************************
 * Metonymy -- Ryan Siu, Tiffany Moi, Mohamed Tamara
 *
 * class DLLDeque
 * uses a doubly-linked nodes to implement a DEQUE
 * (a collection with both FIFO and LIFO properties depending on its usage)
 *
 *         -------------------------------
 *   front |  <-->   Q U E U E   <-->    | end
 *         -------------------------------
 *
 ******************************************************/

public class DLLDeque<T> implements Deque<T> {
    
    //declaring instance variables
    private int _size;
    private DLLNode<T> _front;
    private DLLNode<T> _end;
    
    /*=============================
      DLLDeque() -- default constuctor
      Initialing instance variables
      =============================*/
    public DLLDeque() {
	_front = null;
	_end = null;
	_size = 0;
    }

    
    /*=============================
      addFirst() -- adds the element to the front of the DLList
      precond: an object of type T is given
      postcond: adds element to the front of the deque, or exception thrown if
                input is null or of type DLLDeque to prevent infinite loop
      =============================*/
    public void addFirst( T foo ){
	//if input is null
	if (foo == null){
	    throw new NullPointerException( "Cannot add null elements" );
	}
	if (foo instanceof DLLDeque) {
	    throw new ClassCastException( "Cannot add elements of type DLLDeque" );
	}
	DLLNode<T> add = new DLLNode( foo, null, null );
	//is it the first element??
	if ( isEmpty() ) {
	    _end = add;
	} else {
	    add.setNext( _front );
	    _front.setPrev( add );
	}
	_front = add;
	_size++;
    }

    
    /*=============================
      addLast() -- adds the element to the end of the DLList
      precond: an object of type T is given
      postcond: adds element to the end of the deque, or exception thrown if
                input is null or of type DLLDeque to prevent infinite loop
      =============================*/
    public void addLast( T foo ) {
	//if input is null
	if (foo == null){
	    throw new NullPointerException( "Cannot add null elements" );
	}
	if (foo instanceof DLLDeque) {
	    throw new ClassCastException( "Cannot add elements of type DLLDeque" );
	}
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
      postcond: removes the first element and reassigns the pointers, or
                exception thrown if deque is empty
      =============================*/
    public T removeFirst() {
	//checks if the deque is empty
	if ( isEmpty() ) {
	    throw new NoSuchElementException( "Deque is empty" );
	}
	//removing value
	T foo = _front.getCargo();
	
	//removing the last value in the deque
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
      removeLast() -- removes the element at the end of the deque
      postcond: removes the element at the end of the deque and reassigns 
                the end pointer, or exception thrown if deque is empty
      =============================*/
    public T removeLast() {
	//checks if the deque is already empty
	if ( isEmpty() ) {
	    throw new NoSuchElementException( "Deque is empty" );
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

    
    /*=============================
      getFirst() -- returns the cargo held in the front node
      postcond: exception if deque is empty, or _front cargo returned
      =============================*/
    public T getFirst() {
	if ( isEmpty() ) {
	    throw new NoSuchElementException( "Deque is empty" );
	}
	
	return _front.getCargo();
    }


    /*=============================
      getFirst() -- returns the cargo held in the last node
      postcond: exception if deque is empty, or _end cargo returned
      =============================*/
    public T getLast() {
	if ( isEmpty() ) {
	    throw new NoSuchElementException( "Deque is empty" );
	}
	
	return _end.getCargo();
    }

    
    /*=============================
      size() -- returns the number of elements in the deque
      postcond: _size is returned
      =============================*/
    public int size() {
	return _size;
    }

    
    /*=============================
      isEmpty() -- returns true if deque is empty, false otherwise
      postcond: whether or not _size is 0 is returned
      =============================*/    
    public boolean isEmpty() {
	return _size == 0;
    }

    
    /*=============================
      toString() -- returns a String representation of the deque
      postcond: String is returned
      =============================*/
    public String toString() {
	DLLNode<T> foo = _front;
	String retStr = "_FRONT_ <-> ";
	for ( int i = 0; i < size(); i++ ) {
	    retStr += foo.getCargo() + " <-> ";
	    foo = foo.getNext();
	}
	return retStr + "_END_";
    }
    
}
