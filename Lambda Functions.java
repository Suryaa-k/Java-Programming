import java.util.function.Function;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        // Lambdas must conform to a functional interface (single abstract method)
        Function<Integer, Integer> square = x -> x * x;
        BinaryOperator<Integer> add = (a, b) -> a + b;

        System.out.println("Square: " + square.apply(5));
        System.out.println("Add: " + add.apply(3, 4));

        // Lambda capturing outer variable - must be "effectively final"
        final int factor = 10;
        Function<Integer, Integer> multiplyByFactor = x -> x * factor;
        System.out.println("Multiply: " + multiplyByFactor.apply(5));
    }
}