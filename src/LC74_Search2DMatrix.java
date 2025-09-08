public class LC74_Search2DMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}};
        int target = 34;
        boolean isFound;
        isFound = searchMatrix(nums, target);
        System.out.println(isFound);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low, high, mid;
        for (int i = 0; i < rows; i++)
        {
            if(target > matrix[i][cols - 1])
                continue;
            else
            {
                low = 0;
                high = matrix[0].length;
                while (low <= high)
                {
                    mid = (low + high) / 2;
                    if(matrix[i][mid] == target) return true;
                    else if (matrix[i][mid] >= target) high = mid -1;
                    else low = mid + 1;
                }
            }
        }
        return false;
    }
}
