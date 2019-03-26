package advanced.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionAlgorithms {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Bananas", "Coconut", "Apple", "Orange"));
        System.out.println(fruits);

        Rotator rotator = new Rotator();
        rotator.rotate(fruits);

        Shuffler shuffler = new Shuffler();
        shuffler.shuffle(fruits);

        Sorter sorter = new Sorter();
        sorter.sort(fruits);
    }
}

class Rotator {
    public void rotate(List list) {
        Collections.rotate(list, 1);
        System.out.println(list);
    }
}

class Shuffler {
    public void shuffle(List list) {
        Collections.shuffle(list);
        System.out.println(list);
    }
}

class Sorter {
    public void sort(List<String> list) {
        //Collections.sort(list);
        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);
    }
}
