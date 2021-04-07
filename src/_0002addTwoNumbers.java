/**
 * @author: lzx@4229303
 * @create: 04-06
 * 两数相加
 */


public class _0002addTwoNumbers {
    public ListNode addTowNumbers(ListNode l1, ListNode l2) {

        ListNode head=new ListNode(0);   //操作时的链表   第一个节点设置为0
        ListNode tail=head;                  //实际返回的链表  返回时返回.next
        int carry = 0;

        while (l1 != null || l2 != null) {


            int n1=l1!=null?l1.val:0;
            int n2=l2!=null?l2.val:0;

            int sum=n1+n2+carry;


            carry=sum/10;
            head.next=new ListNode(sum%10);
            head=head.next;


            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            if(carry==1){
                head.next=new ListNode(carry);
            }
        }
        return tail.next;
    }
}
