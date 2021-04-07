/**
 * @author: lzx@4229303
 * @create: 04-07
 * 回文数
 */


public class _0009isPalindrome {

    /**
     * 使用字符串反转判断回文数
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        StringBuffer buffer = new StringBuffer(x + "").reverse();
        return buffer.toString().equals(x + "");
    }


    /**
     * 将数字拆分
     * 偶数 直接比较
     * 奇数 先除10再比较 12321   x=12 res=123  res/10  x=res
     *
     * @param x
     * @return
     */
    public boolean isPalindrome_2(int x) {
        /**
         * 1.如果x<10 不可能是回文数
         * 2.如果x的末位为0  不可能是回文数
         * 3.0是回文数
         */
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int res = 0;
        while (x > res) {

            res = res * 10 + x % 10;

            x = x / 10;
        }
        return res == x || x == res / 10;
    }

}
