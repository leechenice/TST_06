import java.math.BigInteger;
import java.util.Scanner;

public class Print{
    static boolean out(char c){
        System.out.println(c);
        return true;
    }
    public static void complicatedexpression_r(){
        int x=20, y=30;
        boolean b;
        b = x > 50 && y > 60 || x > 50 && y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
        System.out.println(b);
    }
    static void dianping(){
        System.out.print("dianping");
    }
    public static void main(String[] argv){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.nextLine();
            String b = in.nextLine();
            BigInteger q = new BigInteger(a);
            String s = q.toString();

        }
    }
}