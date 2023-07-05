public class selectionSort {
    public static void selArr(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[minPos] > num[j]) { // check for smallest value in array
                    // > for increasing order , < for decreasing order ---- sort the array
                    minPos = j; // store the smallest value position
                }
            }
                // swap the smallest value and store on [i]th position
                int temp = num[minPos];
                num[minPos] = num[i];
                num[i] = temp;
        }
    }

    public static void printArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 1, 3, 2 };
        selArr(num);
        printArr(num);
    }
}
