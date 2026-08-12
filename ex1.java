public class ex1 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(somatorio(5));
        System.out.println(fibonacci(6));
    }

    public static int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n <= 1) {
            return 1;
        }

        int response = n * fatorial(n -1);
        return response;
    }

    public static int somatorio(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) { 
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int sum = n + somatorio(n - 1);
        return sum;
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n- 1) + fibonacci(n -2);
    }
}
