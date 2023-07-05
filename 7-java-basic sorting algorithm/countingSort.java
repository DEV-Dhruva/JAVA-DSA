public class countingSort {

    public static void countSort(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            largest = Math.max(largest, num[i]); // select largest no from num array
        }

        // storing frequency of each element of num array in count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < num.length; i++) {
            count[num[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countSort(num);
        printArr(num);
    }
}
