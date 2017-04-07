# Metonymy

Lab #02<br>
Ryan Siu, Tiffany Moi, Mohamed Tamara

## Instructions

Deque.java contains the Deque interface that DLLDeque.java implements. Driver files should test the methods in class DLLDeque.

## Data Type Choice

Team Metonymy chose to implement doubly-linked nodes as the undelying data structure for our deque. We chose doubly-linked nodes because the all of the add and remove methods using nodes have a runtime of O(1), while either the add or remove method for both arrays and ArrayLists will have a runtime of O(n), unless variables are introduced to shift the data in the array or ArrayList. This efficiency and relative simplicty for linked nodes is what caused us to choose them as the underlying data container for DLLDeque.

## Method Selection

For our implementation of a deque class, we chose:
* ```void addFirst( T foo )``` - adds foo to the front of the deque
* ```void addLast( T foo )``` - adds foo to the end of the deque
* ```T removeFirst()``` - removes an element from the front of the deque
* ```T removeLast()``` - removes an element from the end of the deque
* ```T getFirst()``` - gets the element at the front of the deque
* ```T getLast()``` - gets the element at the end of the deque
* ```int size()``` - gets the size of the deque
* ```boolean isEmpty()``` - checks if the deque is empty
* ```String toString()``` - returns the deque as a String

The primary methods that the Deque interface requires to work as a deque are methods to insert, remove, and examine from either end of the deque, from the [Java Deque API][1]. From these methods, we decided to write the ones that threw exceptions when the deque was empty, rather than the ones that returned ```null```. This allows anyone using our DLLDeque class to catch exceptions and handle them in a way that is useful to them, rather than us handling the error for them by returning ```null```.
<br><br>
We implemented ```size()``` and ```isEmpty()``` because we thought those methods would be useful, and ```toString()``` is necessary to represent the Deque in a useful way when printing it.

[1]: https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html

## Changes

The following are changes we have made to our code in response to code review feedback:
* Added ClassCastException to ```addFirst( T foo )``` and ```addLast( T foo )``` methods in class DLLQueue, thrown if ```foo``` is of type DLLQueue (thanks Team 4294967296)
