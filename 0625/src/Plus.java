import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while(a != null && b != null) {
            cur.next = new ListNode(a.val+b.val);
            a = a.next;
            b = b.next;
            cur = cur.next;
        }
        if(a == null) {
            cur.next = b;
        }else {
            cur.next = a;
        }
        cur = newHead;
        while(cur != null){
            if(cur.val > 9) {
                cur.val = cur.val % 10;
                if(cur.next == null) {
                    cur.next = new ListNode(1);

                }
                cur.next.val = cur.next.val + 1;
            }
            cur = cur.next;
        }
        return newHead.next;
    }
}