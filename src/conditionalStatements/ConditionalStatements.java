package conditionalStatements;

public class ConditionalStatements {
    private int x;

    public ConditionalStatements(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void ifStatement() {
        if (x < 20) {
            System.out.println("x<20");
        }
        if (x == 20) {
            System.out.println("x=20");
        }
        if (x > 20) {
            System.out.println("x>20");
        }
    }

    public void ifElseStatement() {
        if (x < 20) {
            System.out.println("x<20");
        } else if (x == 20) {
            System.out.println("x=20");
        } else {
            System.out.println("x>20");
        }
    }

    public void nestedIf(){
        if(x<30){
            System.out.println("x<30");
            if(x<25){
                System.out.println("x<25");
            }
        }
    }

    public void switchStatement(){
        char grade = 'F';

        switch(grade){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("YOU PASSED!");
            case 'F':
                System.out.println("Better try again");
                //break;
            default:
                System.out.println("Invalid grade");
        }
    }

    public void replaceIfElse(){
        int b;

        if(x==24){
            b = 30;
        } else{
            b = 40;
        }

        b = (x == 24) ? 30 : 40;
    }

    public void run(){
        ifStatement();
        ifElseStatement();
        nestedIf();
        switchStatement();
        replaceIfElse();
    }

    public static void main(String[] args) {
        ConditionalStatements decisionMaking = new ConditionalStatements(24);
        decisionMaking.run();
    }
}
