package loopControl;

public class LoopControl {
    public static void main(String[] args) {
        //while
        int x = 10;
        while (x < 12) {
            System.out.println(x);
            x++;
        }

        //for
        for (x = 10; x < 12; x++) {
            System.out.println(x);
        }

        //do...while
        //The loop executes once before the statement is tested
        x = 10;
        do {
            System.out.println(x++);
        } while (x < 10);

        //Statements:
        // break -> Terminates the loop or switch statement and transfers execution to the statement immediately following the loop or switch.
        // continue -> Causes the loop to skip the remainder of its body and immediately retest its condition prior to reiterating.;


        //As of Java 5 -> Enhanced for loop
        int [] numbers = {10, 20, 30, 40, 50};

        for(int numba : numbers ) {
            System.out.print( numba );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"Jamie" , "Leo" , "Cabral" , "Makaron" , "Charlie"};

        for(String name : names){
            System.out.print(name + ", ");
        }

    }
}

class BreakContinue {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Testing break");
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }

        System.out.println("Testing continue");
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}