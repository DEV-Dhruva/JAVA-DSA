public class Power {

    public static int power(int x, int n) { // time - O(n)
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n) { // time - O(logn)
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) { // if n is odd
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 10));
    }
}
