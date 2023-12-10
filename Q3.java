public class Q3 {
    public static void main(String[] args) {
        long n = 24;
        long m = 6;
        boolean result = isMultiple(n, m);
        System.out.println(result);
    }

    public static boolean isMultiple(long n, long m) {
        if (m != 0 && n % m == 0) {
            return true;
        } else {
            return false;
        }
    }
}
