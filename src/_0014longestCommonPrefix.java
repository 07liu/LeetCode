/**
 * @author: lzx@4229303
 * @create: 04-09
 * 最长公共前缀
 */


/**
 * 纵向比较
 * <p>
 * f-l-o-w-e-r      |||
 * | |              |||
 * f-l-o-w          |||
 * | |              |||
 * f-l-i-g-h-t      |||
 * | |            \\|||//
 * f-l-a-g         \\ //
 */
public class _0014longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int len = strs[0].length();
        int count = strs.length;

        for (int n = 0; n < len; n++) {
            char c = strs[0].charAt(n);
            for (int j = 1; j < count; j++) {
                if (n == strs[j].length() || c != strs[j].charAt(n)) {
                    return strs[0].substring(0, n);

                }
            }
        }


        return strs[0];
    }



}
