/**
 * @author: lzx@4229303
 * @create: 04-08
 * 合并两个有序链表
 */


public class _0024mergeTwoLists {


    /**
     * 迭代
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists_1(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode c = node;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        if (l1 == null) {
            node.next = l2;
        }
        if (l2 == null) {
            node.next = l1;
        }

        return c.next;
    }


    /**
     * 递归
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists_2(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists_2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists_2(l1, l2.next);
            return l2;
        }

    }
}
