import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int numRabbits(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return numRabbits(month-1) + numRabbits(month-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'A' && ch <= 'E'){
                    sb.append((char)(ch+21));
                }else if (ch >= 'F' && ch <= 'Z') {
                    sb.append((char)(ch-5));
                }else {
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
