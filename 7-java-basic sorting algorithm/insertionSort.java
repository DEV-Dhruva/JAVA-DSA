public class insertionSort {

    public static void insSort(int num[]) {
        for (int i = 1; i < num.length; i++) {
            int curr = num[i];
            int prev = i - 1;
            while (prev >= 0 && num[prev] > curr) { // find out the correct pos to insert
                num[prev + 1] = num[prev];
                prev--;
            }

            num[prev + 1] = curr; // insertion
        }
    }

    public static void printArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 3, 4, 5, 2 };
        insSort(num);
        printArr(num);
    }
}
