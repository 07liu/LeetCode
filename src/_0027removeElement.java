/**
 * @author: lzx@4229303
 * @create: 04-09
 * 移除元素
 */


public class _0027removeElement {

    /**
     * 优雅的双指针
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int []nums,int val){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }


        return i;
    }
}
