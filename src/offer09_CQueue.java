import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: lzx@4229303
 * @create: 04-13
 * 使用两个栈实现一个队列
 */


public class offer09_CQueue {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public offer09_CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);

    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            return stack2.pop();
        }


    }
}
