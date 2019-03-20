package collections;

import java.util.*;

public class Collections {
}

class myList {
    //List => ordered, indexed elements, has duplicates
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World!");
        list.add("How");
        list.add("Are");
        list.add("You?");
        System.out.println(list);

        System.out.println(list.get(1).charAt(0));

        System.out.println(list.contains("World!"));

        list.remove(1);
        System.out.println(list);

        //Iterating with foreach
        for (String string : list) {
            System.out.println(string + " is here!");
        }

        //Iterating with iterator
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String string = listIterator.next();
            if (string.charAt(0) == 'H') {
                listIterator.remove();
            } else {
                System.out.println(string);
            }
        }
    }
}

class mySet {
    //Set => distinct elements, order is lost
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(7);
        set.add(3);
        set.add(12);
        set.add(4);
        set.add(9);
        System.out.println(set);
    }
}

class myQueue {
    public static void main(String[] args) {
        methodsWithExceptions();
        methodsWithoutExceptions();
    }

    private static void methodsWithExceptions() {
        System.out.println("Queue with methods that throw exceptions");
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(4);
        queue.add(6);
        System.out.println("print queue: " + queue);

        //Retrieve, but does not remove head
        System.out.println("queue.element(): " + queue.element());

        System.out.println("queue.remove(5): " + queue.remove(5));
        System.out.println("print queue: " + queue);

        System.out.println("queue.remove(): " + queue.remove());
        System.out.println("print queue: " + queue);
    }

    private static void methodsWithoutExceptions() {
        System.out.println("\nQueue with methods that return false/null");
        Queue<Integer> queue = new PriorityQueue<>();
        queue.clear();
        queue.offer(5);
        queue.offer(4);
        queue.offer(6);
        System.out.println("print queue: " + queue);

        //Retrieves and removes head
        System.out.println("queue.poll(): " + queue.poll());

        //Retrieves but does not remove head
        System.out.println("queue.peek(): " + queue.peek());

        System.out.println("print queue: " + queue);
    }
}
