public class subArrays {

    public static void printSubArrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int first = i;
            for (int j = i; j < numbers.length; j++) {
                int last = j;
                for (int k = first; k <= last; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays : " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8 };
        printSubArrays(numbers);
    }
}

// time complexity is O(n^3)