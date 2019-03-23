package advanced.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// The methods return an int representing the index of the found search key within the array, or otherwise a negative value
// Make sure the array is already sorted into ascending order (Arrays.sort)
public class BinarySearch {
    public static void main(String[] args) {
        simpleBinarySearch();
        sorting();
        searchingLists();
        significanceOfReturnedNegativeValues();
    }

    private static void simpleBinarySearch() {
        System.out.println("\nsimpleBinarySearch()");
        int[] numbers = {2, 3, 5, 7};
        System.out.println("index of 5 is "
                + Arrays.binarySearch(numbers, 5));
    }

    private static void sorting() {
        System.out.println("\nsorting()");
        Integer[] numbers = {2, 3, 5, 7};
        // sort numbers into reverse natural order, i.e. {7, 5, 3, 2}
        Arrays.sort(numbers, Collections.reverseOrder());

        // search using a reverse natural order comparator
        System.out.println("index of 5 is " +
                Arrays.binarySearch(numbers, 5, Collections.reverseOrder()));
    }

    private static void searchingLists() {
        System.out.println("\nsearchingLists()");
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7);
        System.out.println("index of 5 is "
                + Collections.binarySearch(numbers, 5));
    }

    private static void significanceOfReturnedNegativeValues() {
        System.out.println("\nsignificanceOfReturnedNegativeValues()");
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

        System.out.println("index of 5 is "
                + Collections.binarySearch(numbers, 5));
        System.out.println("index of 23 is "
                + Collections.binarySearch(numbers, 23));
        System.out.println("index of 9 is "
                + Collections.binarySearch(numbers, 9));
        System.out.println("index of 31 is "
                + Collections.binarySearch(numbers, 31));

        System.out.println("9 would be inserted on the 5th position -> [4]");
        System.out.println("31 would be inserted on the 11th position -> [10]");

        System.out.println("\nFind 9 or insert it");
        int pos = Collections.binarySearch(numbers, 9);
        if (pos < 0) {
            numbers.add(Math.abs(pos)-1, 9);
        }
        System.out.println(numbers);
    }
}
