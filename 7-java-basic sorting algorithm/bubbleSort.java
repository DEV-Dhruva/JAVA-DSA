public class bubbleSort {

    public static void sortArr(int num[]) {
        int swap = 0;
        for (int turn = 0; turn < num.length - 1; turn++) { // n-1 loop
            for (int j = 0; j < num.length - turn - 1; j++) { // n-1-turn loop
                if (num[j] > num[j + 1]) {
                    swap++;
                    int temp = num[j]; // swapping
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }

            if (swap == 0) { // optimize way if array is already sorted
                System.out.print("Already Sorted Array : ");
                break;
            }
        }
    }

    public static void printArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 5, 4 };
        sortArr(num);
        printArr(num);
    }
}
