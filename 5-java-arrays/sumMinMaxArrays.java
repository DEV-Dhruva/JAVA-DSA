public class sumMinMaxArrays {

    public static void printSubArrays(int numbers[]) {
        int ts = 0, u = 0;
        int n = numbers.length;
        int calcts = (n * (n + 1)) / 2;
        int num[] = new int[calcts];
        for (int i = 0; i < numbers.length; i++) {
            int first = i;
            for (int j = i; j < numbers.length; j++) {
                int last = j;
                int sum = 0;
                for (int k = first; k <= last; k++) {
                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " "); // sub arrays prints
                }
                num[u] = sum; // all sub arrays sum stored in a array num
                u++;
                System.out.print("  Sum = " + sum); // sub arrays sum prints
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays : " + ts);

        // prints array of stored in num above
        for (int x = 0; x < num.length; x++) {
            System.out.print(num[x] + " ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        // prints max value
        for (int x = 0; x < num.length; x++) {
            if (num[x] > max) {
                max = num[x];
            }
        }
        System.out.println("Maximun Value : " + max);

        // prints min value
        for (int x = 0; x < num.length; x++) {
            if (num[x] < min) {
                min = num[x];
            }
        }
        System.out.println("Minimum Value : " + min);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }
}

// max sub-array brute force -> time complexity is O(n^3)