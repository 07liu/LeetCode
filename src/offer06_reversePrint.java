/**
 * @author: lzx@4229303
 * @create: 04-09
 */


public class offer06_reversePrint {
    public int[] reversePrint(ListNode head) {

        ListNode cur=head;

        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }

        int[] array = new int[count];
        for (; count - 1 >= 0; count--) {
            array[count - 1] = cur.val;
            cur = cur.next;
        }


        return array;
    }
}
