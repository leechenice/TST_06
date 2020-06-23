import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
     class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode b1 = null;
        ListNode e1 = null;
        ListNode b2 = null;
        ListNode e2 = null;
        while (pHead.next != null) {
            if (pHead.val < x) {
                if (b1 == null) {
                    b1 = pHead;
                    e1 = pHead;
                }else {
                    e1.next = pHead;
                    e1 = e1.next;
                }
            }else {
                if (b2 == null) {
                    b2 = pHead;
                    e2 = pHead;
                }else {
                    e2.next = pHead;
                    e2 = e2.next;
                }
            }
            pHead = pHead.next;
        }
        if (b1 != null) {
            e1.next = b2;
            if (b2 != null) {
                e2.next = null;
            }
            return b1;
        }else {
            return b2;
        }

    }
}