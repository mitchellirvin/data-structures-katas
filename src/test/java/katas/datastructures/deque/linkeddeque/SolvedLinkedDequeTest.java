package katas.datastructures.deque.linkeddeque;

import katas.datastructures.deque.Deque;
import org.junit.jupiter.api.*;

import java.util.NoSuchElementException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SolvedLinkedDequeTest {

    @Test
    @Order(1)
    void addFirst() {
        Deque<String> deque = new SolvedLinkedDeque<>();

        for (int i = 0; i < 50; i++) {
            deque.addFirst(String.valueOf(i));

            Assertions.assertEquals(i + 1, deque.size());
            Assertions.assertEquals(String.valueOf(i), deque.peekFirst());
        }
    }

    @Test
    @Order(2)
    void addLast() {
        Deque<String> deque = new SolvedLinkedDeque<>();

        for (int i = 0; i < 50; i++) {
            deque.addLast(String.valueOf(i));

            Assertions.assertEquals(i + 1, deque.size());
            Assertions.assertEquals(String.valueOf(i), deque.peekLast());
        }
    }

    @Test
    @Order(3)
    void removeFirst() {
        Deque<String> deque = new SolvedLinkedDeque<>();

        for (int i = 0; i < 50; i++) {
            deque.addFirst(String.valueOf(i));
            Assertions.assertEquals(i + 1, deque.size());
        }

        for (int i = 50; i > 0; i--) {
            Assertions.assertEquals(String.valueOf(i - 1), deque.removeFirst());
            Assertions.assertEquals(i - 1, deque.size());
        }

        Assertions.assertThrows(NoSuchElementException.class, deque::removeFirst);
        Assertions.assertThrows(NoSuchElementException.class, deque::peekFirst);
    }

    @Test
    @Order(4)
    void removeLast() {
        Deque<String> deque = new SolvedLinkedDeque<>();

        for (int i = 0; i < 50; i++) {
            deque.addLast(String.valueOf(i));
            Assertions.assertEquals(i + 1, deque.size());
        }

        for (int i = 50; i > 0; i--) {
            Assertions.assertEquals(String.valueOf(i - 1), deque.removeLast());
            Assertions.assertEquals(i - 1, deque.size());
        }

        Assertions.assertThrows(NoSuchElementException.class, deque::removeLast);
        Assertions.assertThrows(NoSuchElementException.class, deque::peekLast);
    }

    @Test
    @Order(5)
    void isEmpty() {
        Deque<String> deque = new SolvedLinkedDeque<>();

        Assertions.assertTrue(deque.isEmpty());

        deque.addFirst("foo");
        Assertions.assertFalse(deque.isEmpty());

        deque.removeFirst();
        Assertions.assertTrue(deque.isEmpty());
    }

}
