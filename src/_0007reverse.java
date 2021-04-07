/**
 * @author: lzx@4229303
 * @create: 04-06
 * 整数反转
 *
 */


public class _0007reverse {
    public int reverse(int x) {

        int res = 0;

        while (x != 0) {

            int temp = x % 10;

            /**
             * 判断res是否超过int型的最大值或者最小值
             * 超过最值就置为0
             */
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && temp > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && temp > 8)) {
                return 0;
            }

            res = res * 10 + temp;
            x=x/10;


        }
        return res;

    }


}
