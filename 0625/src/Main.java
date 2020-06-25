import sun.font.FontRunIterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListNode q = new ListNode(1);
        q.next = new ListNode(2);
        q.next.next = new ListNode(3);
        ListNode w = new ListNode(3);
        w.next = new ListNode(2);
        w.next.next = new ListNode(1);
        Plus plus = new Plus();
        ListNode listNode = plus.plusAB(q, w);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String s1 = in.nextLine();
//            String s2 = in.nextLine();
//            Map<Character,Integer> map = new HashMap<>();
//            for (int i = 0; i < s1.length(); i++) {
//                char ch = s1.charAt(i);
//                if (!map.containsKey(ch)) {
//                    map.put(ch,1);
//                }else {
//                    int val = map.get(ch);
//                    map.put(ch,val+1);
//                }
//            }
//            int count = 0;
//            for (int i = 0; i < s2.length(); i++) {
//                char ch = s2.charAt(i);
//                if (map.containsKey(ch)) {
//                    int val = map.get(ch);
//                    if (ch > 0) {
//                        map.put(ch,val-1);
//                    }else {
//                        count++;
//                    }
//                }else {
//                    count++;
//                }
//            }
//            if (count == 0) System.out.println("Yes " + (s1.length()-s2.length()));
//            else System.out.println("No " + count);
//        }
    }
}
