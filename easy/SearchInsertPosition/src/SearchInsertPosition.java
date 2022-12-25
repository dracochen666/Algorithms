public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {3,5,6};
        System.out.println(searchInsert1(nums,1));
//        System.out.println( 5 + (8 - 5) >> 1);

    }

    public static int searchInsert(int[] nums, int target) {
        int cur = 0;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] > target) { //如果当前值大于目标值，代表没有找到与目标值相等的值，当前下标就是顺序插入的下标。
                cur = i;
                break;
            }
            if (nums[i] == target) {//如果当前值等于目标值，则返回当前下标。
                cur = i;
                break;
            }
            if (i == nums.length - 1) {//如果当前下标是末尾下标且前两个条件都不符合，代表目标值大于nums内所有值，返回末尾下标+1（数组长度）
                cur = nums.length;
                break;
            }
        }
        return cur;
    }

    public static int searchInsert1(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right)/2;
            if (nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] > target) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return left;
    }
}
