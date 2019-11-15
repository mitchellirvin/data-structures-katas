# List


## What
Lists are a very common abstract data structure, and provide the behavior you'd pretty much expect of a list of things. 
Lists maintain order according to how an element is inserted, and they allow you to check what element exists at a given 
position. You can remove elements at a given position, and check if the list contains a given element. Per Wikipedia's 
definition of List, a List "represents a countable number of ordered values, where the same value may occur more than once". 

Basic operations of a list:
- add: appends element, or inserts it at specified position
- remove: removes the given element, or the element at the given position
- get: returns element at the given position
- contains: returns true if the list contains the given element, else false
- size: returns number of elements in the list

## Why
Lists are useful because they satisfy the need for a collection with these properties:
- order of elements is maintained
- allow for duplicates

## How
That's the _what_ and the _why_. The _how_ is interesting, because _how_ a list is implemented determines the runtime 
efficiency of its operations. For example, an array-based list will provide `O(1)` runtime efficiency for
getting an element from a specific position, while a linked list will average `O(n)` runtime for the same operation. 
Deciding which implementation to use is informed by how frequently you expect to perform each operation.

### Array List
An array list uses an internal array to store its elements. The efficiency of its operations are as follows:
- add: if appending, `O(1)`. if inserting at specific position, `O(n)`
- remove: `O(n)` (because of the need to shift elements left after "removing")
- get: `O(1)` (reading from the internal array at a specific index is constant time)
- contains: `O(n)` (iterate over each element in the array until you find a match)

**Problem Statement** 

Implement your own array based resizable list (generically typed), named YourNameArrayList. 
YourNameArrayList will use an array to contain the underlying elements in YourNameArrayList.

Start by renaming `YourNameArrayList` to include your actual name. Mine would be `MitchArrayList`. 
Be sure to use the refactoring tool in your IDE, so that it is renamed everywhere.
`YourNameArrayList` implements our own `List` interface. This interface defines the methods you'll need to 
implement in order to successfully pass the test cases in `ArrayListTest`. Implement `YourNameArrayList`
to pass each test in order.

### Linked List
A linked list uses linked nodes to store its elements. The efficiency of its operations are as follows:
- add: `O(1)` (because inserting between two nodes in a linked list is constant time)
- remove: `O(1)` (same reason as add)
- get: `O(n)` (iterate over nodes until you reach specified index)
- contains: `O(n)` (iterate over each node until you find a match)

**Problem Statement** 

Implement your own linked-list based resizable list (generically typed), named YourNameLinkedList. 
YourNameLinkedList will use linked nodes to contain the underlying elements.

Start by renaming `YourNameLinkedList` to include your actual name. Mine would be `MitchLinkedList`. 
Be sure to use the refactoring tool in your IDE, so that it is renamed everywhere.
`YourNameLinkedList` implements our own `List` interface. This interface defines the methods you'll need to 
implement in order to successfully pass the test cases in `ListTest`. Happy coding!