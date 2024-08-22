import java.util.ArrayList;
import java.util.List;

public class ThirdProblem {
    public static void main(String[] args) {
        List<Integer> first100Fibonacci = first100Fibonacci(100);
        System.out.println(first100Fibonacci);
    }

    public static List<Integer> first100Fibonacci(int n) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            fibonacciNumbers.add(a);
            int next = a + b;
            a = b;
            b = next;
        }

        return fibonacciNumbers;
    }
}
