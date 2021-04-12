/**
 * @author: lzx@4229303
 * @create: 04-12
 * 加一
 */


public class _0066plusOne {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]%10!=0){
                return digits;
            }
        }

        /**
         * 999+1=====>10000
         * new的数组默认全0；
         */
        digits=new int [digits.length+1];
        digits[0]=1;
        return digits;
    }
}
