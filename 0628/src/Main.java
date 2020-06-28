import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int convention(int a ,int b) {
        return a % b == 0 ? b : convention(b,a%b);
    }
    public static int query(Map<Integer,Integer> map,int a, int b) {
        int[] arr = new int[b-a+1];
        int j = 0;
        for (int i = a; i <= b; i++) {
            arr[j++] = map.get(i);
        }
        Arrays.sort(arr);
        return arr[j-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                map.put(i,in.nextInt());
            }
            while (m-- > 0) {
                String s = in.next();
                if (s.equals("Q")) {
                    int a = in.nextInt();
                    int b = in.nextInt();
                    if (a > b) {
                        int tmp = a;
                        a = b;
                        b = tmp;
                    }
                    System.out.println(query(map,a,b));
                }else if (s.equals("U")) {
                    int a = in.nextInt();
                    int b = in.nextInt();
                    map.put(a,b);
                }
            }
        }
    }



    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int a = in.nextInt();
            while (n-- > 0) {
                int k = in.nextInt();
                a += a >= k ? k : convention(a,k);
            }
            System.out.println(a);
        }

    }

}
