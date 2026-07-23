public class Main {
    static int globalVar = 100; // Class-level (static) scope

    static int add(int a, int b) {
        int localVar = 10;
        return a + b + localVar - localVar;
    }

    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Add: " + add(5, 3));
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Global: " + globalVar);

        // Lambda expression (Java 8+), requires a functional interface
        java.util.function.Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square via lambda: " + square.apply(4));
    }
}