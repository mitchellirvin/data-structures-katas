package katas.datastructures.arraylist;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayListTest {

    @Test
    void add() {
        ArrayList<Integer> arrayList = new SolvedArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);

            Assertions.assertEquals(Integer.valueOf(i), arrayList.get(i));
            Assertions.assertEquals(i + 1, arrayList.size());
        }
    }

    @Test
    void remove() {
        ArrayList<Integer> arrayList = new SolvedArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        arrayList.remove(2);
        arrayList.remove(5);
        arrayList.remove(7);

        Assertions.assertEquals(7, arrayList.size());
        Assertions.assertEquals(Integer.valueOf(4), arrayList.get(3));
        Assertions.assertEquals(Integer.valueOf(7), arrayList.get(5));
        Assertions.assertEquals(Integer.valueOf(8), arrayList.get(6));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> arrayList.get(7));
    }

    @Test
    void contains() {
        ArrayList<Integer> arrayList = new SolvedArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);

        Assertions.assertTrue(arrayList.contains(2));
        Assertions.assertTrue(arrayList.contains(4));
        Assertions.assertTrue(arrayList.contains(6));
        Assertions.assertFalse(arrayList.contains(3));
    }

    @Test
    void isEmpty() {
        ArrayList<Integer> arrayList = new SolvedArrayList<>();
        Assertions.assertTrue(arrayList.isEmpty());

        arrayList.add(1);
        Assertions.assertFalse(arrayList.isEmpty());
    }

}
