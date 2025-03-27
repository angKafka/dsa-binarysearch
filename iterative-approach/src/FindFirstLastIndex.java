public class FindFirstLastIndex {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        result[0] = findFirstIndex(nums, target);
        result[1] = findLastIndex(nums, target);
        return result;
    }

    private int findFirstIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                index = mid;
            }

            if(target <= nums[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return index;
    }

    private int findLastIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(target == nums[mid]) {
                index = mid;
            }

            if(target >= nums[mid]) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return index;
    }
}
