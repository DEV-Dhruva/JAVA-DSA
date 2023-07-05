public class kadanesAlgo {
    public static void kadanes(int numbers[]) {
            int cs = 0;
            int ms = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                cs = cs + numbers[i];
                ms = Math.max(ms, cs);
                if (cs < 0) {
                    cs = 0;
                }
            }
            System.out.println("Max Subarray Sum is : " + ms);
    }

    public static void main(String[] args) {
        // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int numbers[] = { -1, -4, -3, -6 };
        int numbers[] = {2, 7, 6, 1, 4, 5};
        kadanes(numbers);
    }
}
