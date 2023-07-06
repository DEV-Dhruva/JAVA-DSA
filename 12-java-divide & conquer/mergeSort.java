public class mergeSort {

    public static void printSortedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // idx for left sorted part
        int j = mid + 1; // idx for right sorted part
        int k = 0; // idx for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) { // for leftover elements int 1st sorted part
            temp[k++] = arr[i++];
        }

        while (j <= ei) { // for leftover elements int 2nt sorted part
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) { // copy from temp to original array
            arr[i] = temp[k];
        }
    }

    public static void mS(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // mid
        mS(arr, si, mid); // left part
        mS(arr, mid + 1, ei); // right part

        merge(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mS(arr, 0, arr.length - 1);
        printSortedArray(arr);
    }
}
