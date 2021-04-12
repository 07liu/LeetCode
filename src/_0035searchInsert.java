/**
 * @author: lzx@4229303
 * @create: 04-12
 */


public class _0035searchInsert {


    /**
     * 暴力破解法
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums,int target){
        int len=nums.length;
        for (int i=0;i<len ;i++) {
            if(target<=nums[i]){
                return i;
            }
        }
        return len;
    }


    public int searchInsert_2(int[] nums,int target){

        
        return 0;
    }


}
