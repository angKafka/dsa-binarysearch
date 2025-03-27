public class NumberOfOccurrence {
    public static int count(int[] arr, int n, int x) {
        int firstIndex = findFirstIndex(arr, n, x);
        int lastIndex = findLastIndex(arr, n, x);
        if(firstIndex == -1 || lastIndex == -1) return 0;
        return lastIndex - firstIndex + 1;
    }

    private static int findFirstIndex(int[] arr, int n, int x){
        int low = 0, high = n - 1;
        int index = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                index = mid;
                high = mid - 1;
            }
            else if (arr[mid] <= x) low = mid + 1;
            else high = mid - 1;
        }
        return index;
    }

    private static int findLastIndex(int[] arr, int n, int x){
        int low = 0, high = n - 1;
        int index = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                index = mid;
                low = mid + 1;
            }
            else if (arr[mid] <= x) low = mid + 1;
            else high = mid - 1;
        }
        return index;
    }
}
