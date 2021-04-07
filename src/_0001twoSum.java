import java.util.HashMap;
import java.util.Map;

/**
 * @author: lzx@4229303
 * @create: 04-06
 * 两数之和
 */


public class _0001twoSum {
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }

        return new int[0];
    }
}
