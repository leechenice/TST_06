import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class FileDemo {
    public static void main(String[] args) {
//       File file = new File("bbq");
//       File[] files = file.listFiles();
//        for (File f:files) {
//            System.out.println(f.getAbsolutePath());
//        }
//        String[] list = file.list();
//        for (String s:list) {
//            System.out.println(s);
//        }
        File file = new File("文档");
        scanDir(file);

    }
    private static void scanDirBroad(File root) {

        Queue<File> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            File node = queue.poll();
            if (node.isDirectory()) {
                System.out.println(node.getAbsolutePath() + "\\");
            } else if (node.isFile()) {
                System.out.println(node.getAbsolutePath());
            }
            // 找到 node 的所有孩子
            if (node.isDirectory()) {
                File[] children = node.listFiles();
                if (children != null) {
                    for (File child : children) {
                        queue.offer(child);
                    }
                }
            }
        }
    }
    private static void scanDir(File node) {
        // 1. 先打印结点的绝对路径
        System.out.println(node.getAbsolutePath() + "\\");
        // 2. 获取结点的孩子结点
        File[] children = node.listFiles();
        if (children == null) {
            // 防御式编程：理论上不应该出现该情况的
            return;
        }

        // 3. 孩子中的普通文件，直接打印
        //    孩子中的目录，递归，进行深度遍历
        // 隐含的递归停止条件：children 的长度 == 0 的时候，下面的循环没有任何效果
        for (File child : children) {
            if (child.isDirectory()) {
                scanDir(child);
            } else if (child.isFile()) {
                System.out.println(child.getAbsolutePath());
            }
        }
    }
}
