import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        System.out.println(removeElement(nums,1));
    }
    public static int removeElement(int[] nums, int val) {
        //[1,1,3,5] 1
        int pre = 0;
        int cur = 0;

        while (cur < nums.length) {
            if (nums[cur] != val) {
                if (cur - pre > 0) {
                    nums[pre] = nums[cur];
                }
                pre ++;
            }
            cur ++;
        }
//        for (int i = 0;i < nums.length;i++) {
//            if (nums[i] != val) {
//                if (i - pre > 0) {
//                    nums[pre] = nums[i];
//                }
//                pre ++;
//            }
//            cur++;
//        }
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
        return pre;
    }
}
