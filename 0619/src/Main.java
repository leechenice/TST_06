import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            if(n == 0) return;
            HashMap<Integer,Integer> map = new HashMap<>();
            while(n-- > 0) {
                int val = in.nextInt();
                if(!map.containsKey(val)){
                    map.put(val,1);
                }else {
                    int tmp = map.get(val);
                    map.put(val,tmp+1);
                }
            }
            int k = in.nextInt();
            if(map.containsKey(k)) {
                System.out.println(map.get(k));
            }else{
                System.out.println(0);
            }
        }
    }

}
