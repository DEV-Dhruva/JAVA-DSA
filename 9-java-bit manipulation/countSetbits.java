public class countSetbits {
    public static int get(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // check as lsb is 0 or 1
                count++; // if lsb is 1
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(get(15));
    }
}
