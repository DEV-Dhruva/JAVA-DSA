public class pairsArray {

    public static void getPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.err.println("Total pairs : " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        getPairs(numbers);
    }
}

// total pairs = [n(n-1)] / 2
// time complexity is O(n^2)
