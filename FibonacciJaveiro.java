public class FibonacciJaveiro {
    public static void main(String[] args) {

        int limit = 9000;

        System.out.println("Do fibonacci until: " + limit);
        fibonacci(limit, 0, 1);

    }

    public static void fibonacci(int limit, int startA, int startB) {

        int result = startA + startB;

        if (result > limit) {

            System.out.println("Final fibonacci value before " + limit + ": " + startB);

        } else {

            fibonacci(limit, startB, result);

        }

    }
}