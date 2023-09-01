public class Arguments {
    public static void main(String[] args) {
        int i = 0;
        for (String arg : args)
            System.out.println(String.format("Аргумент %s: ", i++) + arg);
    }
}
