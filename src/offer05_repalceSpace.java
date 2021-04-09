/**
 * @author: lzx@4229303
 * @create: 04-09
 * 替换空格
 */


public class offer05_repalceSpace {
    public String replaceSpace(String s) {

        StringBuffer stringBuffer = new StringBuffer();

        char[] chars = s.toCharArray();

        for (char c : chars) {

            if (c == ' ') {
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(c);
            }
        }


        return stringBuffer.toString();
    }
}
