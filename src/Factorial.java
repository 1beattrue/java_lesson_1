public class Factorial {
    public static int calculate(int number) {
        if (number == 0) return 1;
        if (number < 0) throw new RuntimeException("Unable to calculate factorial of a negative number");
        int result = 1;
        for (int i = 2; i <= number; i++)
            result *= i;
        return result;
    }
}
