package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        if (number <= 5 && number >= 1) {
            System.out.println("number is between 1 and 5");
        } else if (number <= 10 && number >= 6) {
            System.out.println("number is between 6 and 10");
        } else {
            System.out.println("out of range");
        }
    }
}
