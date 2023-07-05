public class clearLastIthBits {
    public static int get(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(get(15, 2));
    }
}
