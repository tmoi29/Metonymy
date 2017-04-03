import java.util.NoSuchElementException;

public class Driver<T> implements Deque<T> {
    
    private int _size;
    private DLLNode<T> _front;
    private DLLNode<T> _end;
    
    public Driver() {
	_front = null;
	_end = null;
	_size = 0;
    }
    
    public void addFirst( T foo ){
	DLLNode<T> add = new DLLNode( foo, null, null );
	if ( isEmpty() ) {
	    _end = add;
	} else {
	    add.setNext( _front );
	    _front.setPrev( add );
	}
	_front = add;
	_size++;
    }
    
    public void addLast( T foo ) {
	DLLNode<T> add = new DLLNode( foo, null, null );
	if ( isEmpty() ) {
	    _front = add;
	} else {
	    add.setPrev( _end );
	    _end.setNext( add );
	}
	_end = add;
	_size++;
    }

    public T removeFirst() {
	if ( isEmpty() ) {
	    throw new NoSuchElementException( "Deque is empty, element cannot be removed" );
	}
	
	T foo = _front.getCargo();
	
	if ( size() == 1 ) {
	    _front = null;
	    _end = null;
	} else {
	    _front = _front.getNext();
	    _front.setPrev( null );
	}

	_size--;
	return foo;
    }

    public T removeLast() {
	if ( isEmpty() ) {
	    throw new NoSuchElementException( "Deque is empty, element cannot be removed" );
	}
	
	T foo = _end.getCargo();

	if ( size() == 1 ) {
	    _front = null;
	    _end = null;
	} else {
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
