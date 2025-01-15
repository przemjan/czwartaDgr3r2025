public class StringiDemo {
    public static void main(String[] args) {
        String name = "Marcel";

        int dlugosc = name.length();

        char inicjal = name.charAt(3);

        String duze, male;

        name = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name);
    }
}
