public class ex1 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(somatorio(5));
        System.out.println(fibonacci(6));
        System.out.println(somatorioEntre(6, 8));
        System.out.println(isPal("arara"));
        System.out.println(isPal(""));
        System.out.println(isPal("sandro"));
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

    public static int somatorioEntre(int k, int j) {
        if (k == j) {
            return k;
        }

        if (k > j) {
            return k + somatorioEntre((k - 1), j);
        } else {
            return j + somatorioEntre(k, (j - 1));
        }
    }

    public static boolean isPal(String s) {
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length()-1)){
            return true && isPal(s.substring(1, s.length()-1));
        } else {
            return false;
        }
    }
}
