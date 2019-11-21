# Deque

## What
The word deque is short for double-ended queue, and it represents just that. A queue that allows you to add and remove 
from both the front and the rear. This behavior actually exposes the behavior of two other common data types together,
Queue (think standing in a "line", for us Americans) and Stack. You can use a deque like a queue if you only add to the 
rear and remove from the front (FIFO). You can also use a deque like a stack if you add and remove from the front only (LIFO).


Basic operations of a deque:
- addFirst - adds an element to the front of the queue
- addLast - adds an element to the rear of the queue
- removeFirst - removes the element at the front of the queue
- removeLast - removes the element at the rear of the queue
- isEmpty - returns true if the deque contains zero elements
- contains - returns true if the given element exists in the deque

## Why
Deques are useful because they flexibly satisfy the need for a collection with either or both of the following properties:
- LIFO (last in, first out)
- FIFO (first in, first out)

## How
That's the _what_ and the _why_. The _how_ is interesting, because _how_ a deque is implemented determines the runtime 
efficiency of its operations. For example, an array-based deque will provide `O(1)` runtime efficiency for
getting an element from a specific position, while a linked deque will average `O(n)` runtime for the same operation. 
Deciding which implementation to use is informed by how frequently you expect to perform each operation.

### Array Deque
An array deque uses an internal array to store its elements. The efficiency of its operations are as follows:
- add: if appending, `O(1)`. if inserting at specific position, `O(n)`
- remove: `O(n)` (because of the need to shift elements left after "removing")
- get: `O(1)` (reading from the internal array at a specific index is constant time)
- contains: `O(n)` (iterate over each element in the array until you find a match)

**Problem Statement** 

Implement your own array based deque (generically typed), named YourArrayDeque. 
YourArrayDeque will use an array to contain the underlying elements in YourArrayDeque.

Start by renaming `YourArrayDeque` to include your actual name. Mine would be `MitchArrayDeque`. 
Be sure to use the refactoring tool in your IDE, so that it is renamed everywhere.
`YourArrayDeque` implements our own `Deque` interface. This interface defines the methods you'll need to 
implement in order to successfully pass the test cases in `ArrayDequeTest`. Implement `YourArrayDeque`
to pass each test in order.

### Linked Deque
A linked deque uses linked nodes to store its elements. The efficiency of its operations are as follows:
- add: `O(1)` (because inserting between two nodes in a linked deque is constant time)
- remove: `O(1)` (same reason as add)
- get: `O(n)` (iterate over nodes until you reach specified index)
- contains: `O(n)` (iterate over each node until you find a match)

**Problem Statement** 

Implement your own linked-list based deque (generically typed), named YourLinkedDeque. 
YourLinkedDeque will use linked nodes to contain the underlying elements.

Start by renaming `YourLinkedDeque` to include your actual name. Mine would be `MitchLinkedList`. 
Be sure to use the refactoring tool in your IDE, so that it is renamed everywhere.
`YourLinkedDeque` implements our own `Deque` interface. This interface defines the methods you'll need to 
implement in order to successfully pass the test cases in `LinkedDequeTest`. Happy coding!