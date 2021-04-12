import java.util.HashMap;
import java.util.Map;

/**
 * @author: lzx@4229303
 * @create: 04-06
 * 两数之和
 */


public class _0001twoSum {

    /**
     * 哈希表法
     * 遍历一次 高效
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }

        return new int[0];
    }

    /**
     * 暴力破解
     * 循环了！num.length次 效率不高 速度快
     */
    public int[] twoSum_2(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
