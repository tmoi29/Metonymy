public interface Deque<T> {

    public void addFirst( T foo );
    
    public void addLast( T foo );

    public T removeFirst();

    public T removeLast();

    public T getFirst();

    public T getLast();

    public int size();

    public boolean isEmpty();
    
}

