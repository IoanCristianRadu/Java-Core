package data.types;

import java.util.Arrays;

public class Vectors {
    public static void main(String[] args){
        char[] letters = {'a', 'b', 'c'};
        System.out.println(letters);

        for(int i=0 ; i< letters.length; i++){
            System.out.println(i + " -> " + letters[i]);
        }

        double[] numbers = new double[5];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = Math.random();
        }

        Arrays.fill(numbers,23.5);

        for(double number : numbers){
            System.out.println(number);
        }
    }
}

class Array{
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String[] args){
        printArray(new int[]{3, 1, 2, 6, 4, 2});
        reverse(new int[]{5,4,3,2,1});
    }
}
