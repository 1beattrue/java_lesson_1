import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задания 1-4
        System.out.println("Введите размер массива:");
        int length = scanner.nextInt();
        MyArray array = new MyArray(length);

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++)
            if (scanner.hasNextInt()) array.add(scanner.nextInt());

        array.printInfo();
        System.out.println();

        // Задание 6
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            Fraction nextFraction = new Fraction(1, i);
            System.out.println(nextFraction);
        }
        System.out.println();

        // Задание 7
        System.out.println(
                Factorial.calculate(-1)
                        + " " + Factorial.calculate(0)
                        + " " + Factorial.calculate(5)
        );
    }
}