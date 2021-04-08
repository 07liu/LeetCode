import java.util.HashMap;

/**
 * @author: lzx@4229303
 * @create: 04-08
 * 删除有序数组的重复项
 */


public class _0026removeDuplicates {
    public int removeDuplicates(int nums[]){

        if(nums==null){
            return 0;
        }
        int i=0;
        for (int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
