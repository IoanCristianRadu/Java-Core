package basic.data.types;

public class Matrix {
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        double[][] numbers = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = Math.random();
            }
        }

        System.out.println("Normal for");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "   ");
            }
            System.out.print("\n");

        }

        System.out.println("Foreach");
        for (double[] array : numbers) {
            for (double number : array) {
                System.out.print(number + "   ");
            }
            System.out.print("\n");
        }

        double[][] raggedArray = {
                {99.0, 85.0},
                {98.0, 57.0, 79.0, 0.0},
                {5.23, 2.222, 3.44543556}
        };

        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
