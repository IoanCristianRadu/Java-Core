package advanced.collections;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactories {
    public static void main(String[] args) {
        Set<Integer> set = Collections.emptySet();
        List<String> list = Collections.emptyList();
        Map<Integer, String> map = Collections.emptyMap();

        set = Collections.singleton(1);
        list = Collections.singletonList("one");
        map = Collections.singletonMap(1, "one");
    }
}
