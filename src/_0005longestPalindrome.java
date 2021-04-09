/**
 * @author: lzx@4229303
 * @create: 04-09
 */


public class _0005longestPalindrome {


//    /**
//     * 验证是否为回文字符串
//     * @param s
//     * @return
//     */
//    public boolean isPalindromic(String a) {
//        StringBuffer q = new StringBuffer(a);
//        q = q.reverse();
//        if (a.equals(q.toString())) {
//            return true;
//        }
//
//        return false;
//    }


    public String longestPalindrome(String s) {

/**
 * 写了一个小时的垃圾，还没写出来
 * 去看题解！！！！！！！
 */
//        if (s == null) {
//            return "";
//        } else if (s.length() == 1) {
//            return s;
//        } else if (s.length() == 2) {
//            if (isPalindrome(s)) {
//                return s.substring(0, 2);
//            } else {
//                return s.substring(0, 1);
//            }
//        } else if (s.length() == 3) {
//            if (isPalindrome(s)) {
//                return s.substring(0, 3);
//            } else if (isPalindrome(s.substring(0, 2))) {
//                return s.substring(0, 2);
//            } else if (isPalindrome(s.substring(1, 3))) {
//                return s.substring(1, 3);
//            } else return s.substring(0, 1);
//        }
//        int i = 0;
//        int j = 2;
//        int count = 0;
//        String so = "";
//        String a = "";
//        while (j != s.length() && i != j) {
//            a = s.substring(i, j + 1);
//            StringBuffer b = new StringBuffer(a);
//            b = b.reverse();
//            if (a.equals(b.toString())) {
//                if (count < (j - i)) {
//                    so = a;
//                }
//                j++;
//            } else {
//                i++;
//            }
//        }
//        return so;
//    }


        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;

        char[] charArray = s.toCharArray();


        /**
         * 将所有的字符数大于1的子串全部验证一遍
         */
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {

                /**
                 * 如果这个串的长度大于maxLen 且是一个回文串  就更新
                 */
                if (j - i + 1 > maxLen && validPalindromic(charArray, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                    System.out.println(s.substring(begin, begin + maxLen));
                }
            }
        }

        return s.substring(begin, begin + maxLen);

    }

    public boolean validPalindromic(char[] chars, int left, int right) {
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
