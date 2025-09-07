public class LC33_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 3;
        int searchElement = search(nums, target);
        System.out.println(searchElement);
    }

    public static int search(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length - 1;
        int mid, minIndex = 0, index;

        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] >= nums[0]) low = mid + 1;
            else {
                minIndex = mid;
                high = mid - 1;
            }
        }

        index = binarySearch(nums, 0, minIndex - 1, target);

        if(index == -1)
            index = binarySearch(nums, minIndex, nums.length - 1, target);
        return index;
    }

    public static int binarySearch(int[] nums, int startIndex, int endIndex, int target)
    {
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] <= target) startIndex = mid + 1;
            else endIndex = mid - 1;
        }
        return -1;
    }
}
