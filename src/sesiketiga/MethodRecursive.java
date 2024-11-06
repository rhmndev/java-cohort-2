package sesiketiga;

public class MethodRecursive {
    public static void main(String[] args) {
        int input = 3;
        int output = calculateFactorial(input);

        System.out.println("Output : " + output);
    }

    public static int calculateFactorial(int input) {
        if (input == 0) {
            return 1;
        } else {
            return input * calculateFactorial(input - 1);
        }
    }

    public static int calculate(int input) {
        if (input == 0) {
            return 1;

        } else {
            return input * calculateFactorial(input - 1);
        }
    }
}
