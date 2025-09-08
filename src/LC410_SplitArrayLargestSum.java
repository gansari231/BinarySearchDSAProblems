public class LC410_SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int sum = splitArray(nums, k);
        System.out.println(sum);
    }

    public static int splitArray(int[] nums, int k) {
        int low = 0, high = 0;

        for(int i : nums) {
            low = Math.min(low, i);
            high += i;
        }

        while (low < high)
        {
            int mid = (low + high) / 2;
            if(canSplit(nums, k, mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    public static boolean canSplit(int[] arr, int k, int mid) {
        int subarray = 1, currentSum = 0;
        for(int n : arr) {
            if(currentSum + n > mid) {
                subarray++;
                currentSum = n;
                if(subarray > k) return false;
            }
            else
                currentSum += n;
        }
        return true;
    }
}
