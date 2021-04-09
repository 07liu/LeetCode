/**
 * @author: lzx@4229303
 * @create: 04-09
 * ip地址无效化
 * 1.1.1.1->1[.]1[.]1[.]1
 */


public class _1108defangIPaddr {

    /**
     * 傻逼都不用的字符串替换
     *
     * @param address
     * @return
     */
    public String defangIPaddr(String address){

        StringBuffer s=new StringBuffer();
        int len=address.length();

        char[] chars=address.toCharArray();

        for(int i=0;i<len;i++){
            if(chars[i]!='.'){
                s.append(chars[i]);
            }else {
                s.append(".");
            }
        }

        return s.toString();

    }


    /**
     * 使用String .replace()函数直接替换
     * @param address
     * @return
     */
    public String defangIPaddr_1(String address) {
        return address.replace(".","[.]");
    }


}
