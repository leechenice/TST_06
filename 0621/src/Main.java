import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 30; i++) {
            count += Math.pow(2,i);
        }
        System.out.println(30*10);
        System.out.println(count/1000000);
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String str = in.next();
//            int k = in.nextInt();
//            int maxNum = 0;
//            int index = 0;
//            for (int i = 0; i <= str.length() - k; i++) {
//                int count = 0;
//                for (int j = i; j < i + k ; j++) {
//                    if (str.charAt(j) == 'G' || str.charAt(j) == 'C') {
//                        count++;
//                    }
//                }
//                if (count > maxNum) {
//                    maxNum = count;
//                    index = i;
//                }
//            }
//            System.out.println(str.substring(index,index + k));
//        }
    }
}
