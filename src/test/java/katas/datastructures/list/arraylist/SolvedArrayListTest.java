package katas.datastructures.list.arraylist;

import katas.datastructures.list.List;
import katas.datastructures.list.arraylist.SolvedArrayList;
import katas.datastructures.list.arraylist.YourArrayList;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SolvedArrayListTest {

    @Test
    @Order(1)
    void add() {
        List<Integer> list = new SolvedArrayList<>();
        for (int i = 0; i < 100; i++) {
            Assertions.assertTrue(list.add(i));

            Assertions.assertEquals(Integer.valueOf(i), list.get(i));
            Assertions.assertEquals(i + 1, list.size());
        }
    }

    @Test
    @Order(2)
    void remove() {
        List<Integer> list = new SolvedArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Assertions.assertTrue(list.remove(2));
        Assertions.assertTrue(list.remove(5));
        Assertions.assertTrue(list.remove(7));

        Assertions.assertEquals(7, list.size());
        Assertions.assertEquals(Integer.valueOf(4), list.get(3));
        Assertions.assertEquals(Integer.valueOf(7), list.get(5));
        Assertions.assertEquals(Integer.valueOf(8), list.get(6));
        Assertions.assertFalse(list.remove(7));
        Assertions.assertFalse(list.remove(-1));
    }

    @Test
    @Order(3)
    void get() {
        List<Integer> list = new SolvedArrayList<>();
        list.add(1);
        Assertions.assertEquals(Integer.valueOf(1), list.get(0));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    @Order(4)
    void contains() {
        List<Integer> list = new SolvedArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        Assertions.assertTrue(list.contains(2));
        Assertions.assertTrue(list.contains(4));
        Assertions.assertTrue(list.contains(6));
        Assertions.assertFalse(list.contains(3));
    }

    @Test
    @Order(5)
    void isEmpty() {
        List<Integer> list = new SolvedArrayList<>();
        Assertions.assertTrue(list.isEmpty());

        list.add(1);
        Assertions.assertFalse(list.isEmpty());
    }

}
