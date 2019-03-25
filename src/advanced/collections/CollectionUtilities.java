package advanced.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUtilities {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,3,1,5,2,3);
        System.out.println(list);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
