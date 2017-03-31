public class Driver<T> implements Deque<T>{
    private int _size;
    private DLLNode<T> _front;
    private DLLNode<T> _end;
    
    public driver(){
	_front = null;
	_end = null;
	_size = 0;
    }
    public void addFirst( T foo ){
	DLLNode<T> add = new DLLNode(foo, _front);
	    _front = add;
    }
    
    public void addLast( T foo );

    public T removeFirst();

    public T removeLast();

    public T getFirst();

    public T getLast();

    public int size();

    public boolean isEmpty(){
	return _size == 0;
    }
}
