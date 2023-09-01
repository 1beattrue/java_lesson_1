public class MyArray {
    private final int[] array;
    private int length = 0;

    public MyArray(int length) {
        if (length <= 0) throw new RuntimeException(String.format("Array length cannot be equal to %s", length));
        array = new int[length];
    }

    private boolean isEmpty() {
        return length == 0;
    }

    public void add(int element) {
        if (length < array.length) {
            array[length] = element;
            length++;
        } else {
            throw new RuntimeException("Index out of range");
        }
    }

    public int sum() {
        int i = 0;
        int result = 0;
        while (i < length)
            result += array[i++];
        return result;
    }

    public int sum2() {
        int i = 0;
        int result = 0;
        do {
            result += array[i++];
        } while (i < length);
        return result;
    }

    public double averageSum() {
        return (double) sum() / length;
    }

    public int min() {
        int result = array[0];
        for (int i = 0; i < length; i++) {
            if (array[i] < result)
                result = array[i];
        }
        return result;
    }

    public int max() {
        int result = array[0];
        for (int i = 0; i < length; i++) {
            if (array[i] > result)
                result = array[i];
        }
        return result;
    }

    public void printInfo() {
        System.out.printf("Сумма элементов массива с помощью while: %1s\n", sum());
        System.out.printf("Сумма элементов массива с помощью do while: %1s\n", sum2());
        System.out.printf("Среднее арифметическое элементов массива: %1s\n", averageSum());
        System.out.printf("Минимальный элемент массива: %1s\n", min());
        System.out.printf("Максимальный элемент массива: %1s\n", max());
    }
}
