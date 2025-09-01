public class HelloWorld {
    /** Adds two numbers. Intentionally simple for debugging demo. */
    public static int add(int a, int b) {
        int sum = a + b;  // put a breakpoint here
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int x = 2;
        int y = 3;
        int result = add(x, y);
        System.out.println(x + " + " + y + " = " + result);
    }
}
