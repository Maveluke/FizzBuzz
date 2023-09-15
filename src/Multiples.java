public class Multiples {
    private static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        int n = 10, m1 = 3, m2 = 5;
        int d1 = (n - 1) / m1;
        int d2 = (n - 1) / m2;
        int d1x2 = (n - 1) / lcm(m1, m2);
        System.out.println(d1 + d2 - d1x2);
    }
}
