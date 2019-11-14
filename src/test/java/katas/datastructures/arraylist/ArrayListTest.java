package katas.datastructures.arraylist;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListTest {

    @Test
    public void add() {
        ArrayList<Integer> arrayList = new SolvedArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
            Assert.assertEquals(Integer.valueOf(i), arrayList.get(i));
            Assert.assertEquals(i + 1, arrayList.size());
        }
    }

    @Test
    public void remove() {
        ArrayList<Integer> arrayList = new SolvedArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
            Assert.assertEquals(Integer.valueOf(i), arrayList.get(i));
            Assert.assertEquals(i + 1, arrayList.size());
        }

        for (int i = 999; i > 0; i--) {
            arrayList.remove(i);
            Assert.assertEquals(i, arrayList.size());
        }

    }

}
