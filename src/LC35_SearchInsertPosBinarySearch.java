public class LC35_SearchInsertPosBinarySearch {
    public static void main(String[] args) {
        int[] num = {2,3,5,6};
        int target = 8;
        int index = searchInsert(num, target);
        System.out.println(index);
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}
