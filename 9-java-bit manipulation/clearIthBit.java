public class clearIthBit {
    public static int get(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(get(10, 1));
    }
}
