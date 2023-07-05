public class friendsPairing {

    public static int pairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = pairs(n - 1);
        int fnm2 = pairs(n - 2);
        int pairWays = (n - 1) * fnm2;
        int totalWays = fnm1 + pairWays;
        return totalWays;
        // or
        // return pairs(n - 1) + (n - 1) * pairs(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(pairs(3));
    }
}
