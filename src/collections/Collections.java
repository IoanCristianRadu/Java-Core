package collections;

import java.util.*;

public class Collections {
}

class ListExample {
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

class SetExample {
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

class QueueExample {
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

class DequeExample {
    public static void main(String[] args) {
        methodsWithExceptions();
        methodsWithoutExceptions();
        useDequeLikeStack();
    }

    private static void methodsWithExceptions() {
        System.out.println("Deque with methods that throw exceptions");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.addFirst(7);
        deque.addLast(1);
        System.out.println("print deque: " + deque);

        System.out.println("deque.element(): " + deque.element());

        System.out.println("deque.removeFirst(): " + deque.removeFirst());
        System.out.println("print deque: " + deque);

        System.out.println("deque.removeLast(): " + deque.removeLast());
        System.out.println("print deque: " + deque);
    }

    private static void methodsWithoutExceptions() {
        System.out.println("\nDeque with methods that return false/null");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(5);
        deque.offerFirst(8);
        deque.offerLast(2);
        System.out.println("print deque: " + deque);

        //Retrieves but does not remove head
        System.out.println("deque.peek(): " + deque.peek());
        System.out.println("deque.peekFirst(): " + deque.peekFirst());
        System.out.println("deque.peekLast(): " + deque.peekLast());

        //Retrieves and removes head
        System.out.println("deque.poll(): " + deque.poll());
        System.out.println("deque.pollLast(): " + deque.pollLast());
        System.out.println("deque.pollFirst(): " + deque.pollFirst());

        System.out.println("print deque: " + deque);
    }

    private static void useDequeLikeStack(){
        System.out.println("\nUse deque like a stack");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(5);
        deque.push(8);
        deque.push(2);
        System.out.println("print deque: " + deque);

        //Retrieves but does not remove head
        System.out.println("deque.pop(): " + deque.pop());
        System.out.println("deque.pop(): " + deque.pop());
        System.out.println("deque.pop(): " + deque.pop());
    }
}

class MapExamples{
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(3,"Third");
        map.put(1,"First");
        map.put(2,"Second");
        System.out.println("map.get(2): " + map.get(2));
        System.out.println("map.size(): " + map.size());
        System.out.println("map.remove(2): " + map.remove(2));

        System.out.println("map.values(): " + map.values());
        System.out.println("map: " + map);

        System.out.println("map.clear(): ");
        map.clear();
        System.out.println("map.isEmpty(): " + map.isEmpty());
    }
}