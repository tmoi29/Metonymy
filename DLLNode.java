public class DLLNode<T> 
{

    private T _cargo;    //cargo may only be of type String
    private DLLNode<T> _nextNode; //pointer to next LLNode
    private DLLNode<T> _previousNode; //pointer to last LLNode

    // constructor -- initializes instance vars
    public DLLNode( T value, DLLNode<T> next ) 
    {
	_cargo = value;
	_nextNode = next;
	if (_cargo != null && _nextNode != null){
	    _nextNode.setPrevious(this);
	}
    }


    //--------------v  ACCESSORS  v--------------
    public T getCargo() { return _cargo; }

    public DLLNode<T> getNext() { return _nextNode; }
    
    public DLLNode<T> getPrevious() {return _previousNode;}
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo ) 
    {
	T old = _cargo;
	_cargo = newCargo;
	return old;
    }

    public DLLNode<T> setNext( DLLNode<T> newNext ) 
    {
	DLLNode<T> old = _nextNode;
	_nextNode = newNext;
	return old;
    }
    
    public DLLNode<T> setPrevious( DLLNode<T> newPrev ) 
    {
	DLLNode<T> old = _previousNode;
	_previousNode = newPrev;
	return old;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args ) 
    {


	//Below is an exercise in creating a linked list...

	//Create a node
	DLLNode<String> first = new DLLNode<String>( "cat", null );

	//Create a new node after the first
	first.setNext( new DLLNode<String>( "dog", null ) );

	//Create a third node after the second
	first.getNext().setNext( new DLLNode<String>( "cow", null ) );

	/* A naive list traversal:*/
	while( first != null ) {
	    System.out.println( first );
	    first = first.getNext();
	}

	//Q: When head ptr moves to next node in list,
	//   what happens to the node it just left?
	// It forgets about the node that it just left and it continues
	// to the next node.
	

    }//end main

}//end class LLNode
