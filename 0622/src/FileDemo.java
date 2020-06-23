import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        String path = "a//b//c//d//e//随机.txt";
        File file = new File(path);
//        System.out.println(file.exists());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());
//        System.out.println(file.getPath());
//        System.out.println(file.isFile());
//        System.out.println(file.isAbsolute());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isHidden());
        System.out.println(file.getAbsolutePath());
//        try {
//            boolean newFile = file.createNewFile();
//            System.out.println(newFile);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);

    }
}
