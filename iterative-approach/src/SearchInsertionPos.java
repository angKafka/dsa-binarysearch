public class SearchInsertionPos {
    //O(LogN)
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(target == nums[mid]) return mid;

            if(nums[mid] <= target) low = mid+1;
            else high = mid - 1;
        }
        return low;
    }


    //O(N)
    public int searchInsert1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {  // Found target or insert position
                return i;
            }
        }
        return nums.length; // Insert at the end if target is greater than all elements
    }
}
