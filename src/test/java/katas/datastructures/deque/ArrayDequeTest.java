package katas.datastructures.deque;

import katas.datastructures.deque.arraydeque.SolvedArrayDeque;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ArrayDequeTest {

    @Test
    @Order(1)
    void addFirst() {
        Deque<String> deque = new SolvedArrayDeque<>();

        for (int i = 0; i < 50; i++) {
            deque.addFirst(String.valueOf(i));

            Assertions.assertEquals(i + 1, deque.size());
            Assertions.assertEquals(String.valueOf(i), deque.peekFirst());
        }
    }

    @Test
    @Order(2)
    void addLast() {
        Deque<String> deque = new SolvedArrayDeque<>();

        for (int i = 0; i < 50; i++) {
            deque.addLast(String.valueOf(i));

            Assertions.assertEquals(i + 1, deque.size());
            Assertions.assertEquals(String.valueOf(i), deque.peekLast());
        }
    }

}
