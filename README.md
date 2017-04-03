# Metonymy

## Data Type Choice

Team Metonymy chose to implement linked nodes as the undelying data structure for our deque. We chose linked nodes because the add and remove methods for nodes have a runtime of O(1). The remove method for both arrays and ArrayLists has a runtime of 0(n), which is less efficient than the one for linked nodes

## Method Selection

For our implementation of a deque class, we chose:
* void addFirst() - adds an element to the front of the deque
* void addLast() - adds an element to the end of the deque
* T removeFirst() - removes an element from the front of the deque
* T removeLast() - removes an element from the end of the deque
* T getFirst() - gets the element at the front of the deque
* T getLast() - gets the element at the end of the deque
* int size() - gets the size of the deque
* boolean isEmpty() - checks if the deque has 
* String toString() - returns the deque as a String
