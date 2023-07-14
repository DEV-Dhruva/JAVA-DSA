public class searchInRotSortArr {

    public static int printTarget(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return printTarget(arr, tar, si, mid - 1);
            } else {
                return printTarget(arr, tar, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return printTarget(arr, tar, mid + 1, ei);
            } else {
                return printTarget(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(printTarget(arr, 0, 0, 6));
    }
}