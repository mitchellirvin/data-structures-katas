package katas.datastructures.arraylist;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayListTest {

    @Test
    void add() {
        ArrayList<Integer> arrayList = new SolvedArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
            Assertions.assertEquals(Integer.valueOf(i), arrayList.get(i));
            Assertions.assertEquals(i + 1, arrayList.size());
        }
    }

    @Test
    void remove() {
        ArrayList<Integer> arrayList = new SolvedArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
            Assertions.assertEquals(Integer.valueOf(i), arrayList.get(i));
            Assertions.assertEquals(i + 1, arrayList.size());
        }

        arrayList.remove(5);
        arrayList.remove(342);
        arrayList.remove(718);
        Assertions.assertEquals(997, arrayList.size());
        Assertions.assertEquals(Integer.valueOf(6), arrayList.get(5));
        Assertions.assertEquals(Integer.valueOf(344), arrayList.get(342));
        Assertions.assertEquals(Integer.valueOf(721), arrayList.get(718));
    }

}
