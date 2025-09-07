public class LC153_MinRotatedSortedArray
{
    public static void main(String[] args)
    {
        int[] nums = {50,60,70,10,20,30,40};
        int item = findMin(nums);
        System.out.println(item);
    }

    public static int findMin(int[] nums)
    {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        int answer = nums[0];
        while (low <= high)
        {
            mid = (low + high) / 2;
            if(nums[mid] >= nums[0]) low = mid + 1;
            else
            {
                answer = nums[mid];
                high = mid - 1;
            }
        }
        return answer;
    }
}
