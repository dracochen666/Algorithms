import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
    //[1,2,2,3,4]
        int[] nums = {0,1,1,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int pre = 0;
        int current = 1;
        while (current < nums.length) {
            if (nums[pre] == nums[current]) {
                current ++;
            }else {
                nums[pre + 1] = nums[current];
                pre ++;
            }
        }

        return pre + 1;
    }
    public static int removeDuplicates1(int[] nums) {
        //[1,2,2,3]
        int pre = 0;
        int cur = 1;
        while (cur < nums.length) {
            if (nums[pre] == nums[cur]) {
                cur ++;
            }else {
                if ((cur - pre) > 1) {
                    nums[pre + 1] = nums[cur];
                    pre ++;
                }else {
                    pre ++;
                }
            }
        }
        return pre + 1;
    }
}
