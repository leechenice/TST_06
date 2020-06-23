import java.util.*;

public class Main {
    public static void adjustDown(int[] array, int root, int len) {
        int child = root*2 + 1;
        while (child < len) {
            if (child+1 < len && array[child+1] < array[child]) {
                child++;
            }
            if (array[child] < array[root]) {
                int tmp = array[child];
                array[child] = array[root];
                array[root] = tmp;
                root = child;
                child = root*2 +1;
            }else {
                break;
            }
        }
    }
    public static void createHeap(int[] array) {
        for (int i = (array.length-1-1) >>> 1; i >= 0; i--) {
            adjustDown(array,i,array.length);
        }
    }
    public static void heapSort(int[] array) {
        createHeap(array);
        System.out.println(Arrays.toString(array));
        int end = array.length-1;
        while (end > 0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end--);
        }
    }
    static class Student{
        private final String name;
        private final int score;
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,7,3};
        heapSort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey());
            }
        }

//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            int n = in.nextInt();
//            int k = in.nextInt();
//            List<Student> stuList = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                stuList.add(new Student(in.next(), in.nextInt()));
//            }
//            if (k == 1) {
//                stuList.sort(new Comparator<Student>() {
//                    @Override
//                    public int compare(Student o1, Student o2) {
//                        return o1.score - o2.score;
//                    }
//                });
//            }
//            if (k == 0) {
//                stuList.sort(new Comparator<Student>() {
//                    @Override
//                    public int compare(Student o1, Student o2) {
//                        return o2.score - o1.score;
//                    }
//                });
//            }
//            for (int i = 0; i < n; i++) {
//                System.out.println(stuList.get(i).name + " " + stuList.get(i).score);
//            }
//        }

    }
}
