import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        System.out.println("Введите размер массива:");
        int length = scanner.nextInt();
        MyArray array = new MyArray(length);

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++)
            if (scanner.hasNextInt()) array.add(scanner.nextInt());

        array.printInfo();
    }
}