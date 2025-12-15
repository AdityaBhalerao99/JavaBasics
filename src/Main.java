public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        byte x = 64;
        int i, y;
        i=x<<2;
        y = (byte) (x<<2);
        System.out.println(x);
        System.out.println(i + " " + y);
    }
}