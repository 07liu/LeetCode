/**
 * @author: lzx@4229303
 * @create: 04-09
 * 实现strStr()
 */


public class _0028strStr {

    /**
     * 滑动窗口，暴力破解
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack,String needle){
        int n=haystack.length();
        int L=needle.length();
        int start=0;
        for(int a=start+L;a<=n;a++){
            if(needle.equals(haystack.substring(start,n))){
                return start;
            }
            start++;
        }


        return -1;
    }
}
