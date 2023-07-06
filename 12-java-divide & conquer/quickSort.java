public class quickSort {

    public static void printSortedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for elem smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // pivot = arr[i]
        arr[i] = temp;

        return i;
    }

    public static void qS(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pivotIndex = partition(arr, si, ei); // last element
        qS(arr, si, pivotIndex - 1); // left
        qS(arr, pivotIndex + 1, ei); // right
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        qS(arr, 0, arr.length - 1);
        printSortedArray(arr);
    }
}
