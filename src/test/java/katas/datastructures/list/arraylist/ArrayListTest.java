package katas.datastructures.list.arraylist;


import katas.datastructures.list.List;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ArrayListTest {

    @Test
    @Order(1)
    void add() {
        List<Integer> list = new YourNameArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);

            Assertions.assertEquals(Integer.valueOf(i), list.get(i));
            Assertions.assertEquals(i + 1, list.size());
        }
    }

    @Test
    @Order(2)
    void remove() {
        List<Integer> list = new YourNameArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.remove(2);
        list.remove(5);
        list.remove(7);

        Assertions.assertEquals(7, list.size());
        Assertions.assertEquals(Integer.valueOf(4), list.get(3));
        Assertions.assertEquals(Integer.valueOf(7), list.get(5));
        Assertions.assertEquals(Integer.valueOf(8), list.get(6));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(7));
    }

    @Test
    @Order(3)
    void contains() {
        List<Integer> list = new YourNameArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        Assertions.assertTrue(list.contains(2));
        Assertions.assertTrue(list.contains(4));
        Assertions.assertTrue(list.contains(6));
        Assertions.assertFalse(list.contains(3));
    }

    @Test
    @Order(4)
    void isEmpty() {
        List<Integer> list = new YourNameArrayList<>();
        Assertions.assertTrue(list.isEmpty());

        list.add(1);
        Assertions.assertFalse(list.isEmpty());
    }

}
