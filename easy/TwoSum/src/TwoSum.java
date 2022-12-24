import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum_1(nums,target);
        System.out.println(result[0]+","+result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> numValid = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                int number = nums[i] + nums[j];
                if (number == target) {
                    // numValid[]
                    numValid.add(i);
                    numValid.add(j);

                }
            }
        }
        System.out.print(numValid);
        int length = numValid.size();
        int[] result = new int[length];
        for(int i = 0;i < numValid.size(); i++){
            result[i] = numValid.get(i);
        }

        return result;
    }
    public static int[] twoSum_1(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0;i < nums.length;i ++){
            if (map.isEmpty()) {
                map.put(nums[i],i);
            }else {
                int tmp = target - nums[i];
                if (map.containsKey(tmp)) {
                    result[0] = map.get(tmp);
                    result[1] = i;
                    break;
                }else {
                    map.put(nums[i],i);
                }
            }
        }

        return result;
    }

}
