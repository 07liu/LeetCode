import java.util.List;

/**
 * @author: lzx@4229303
 * @create: 04-07
 * 删除链表的倒数第n个的节点
 */


public class _0019removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head,int n ){

        /**
         * 设置前置节点dum  方便慢指针的下一个节点删除
         * 当删除  1->null 链表的第一个节点时
         */
        ListNode dum=new ListNode(0,head);



        ListNode fast=head;
        ListNode slow=dum;

        /**
         * 快慢指针分隔n+1的节点
         */
        for(int i=0;i<n;i++) {
            fast=fast.next;
        }

        /**
         * dum head
         *  |  |
         *  0->1->2->3-4->null
         *  |
         *  slow
         *
         *  将fast只想最后一个节点的后一个节点null
         */
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }


        /**
         * 删除下一个节点
         */
        slow.next=slow.next.next;


        return  dum;
    }

}
