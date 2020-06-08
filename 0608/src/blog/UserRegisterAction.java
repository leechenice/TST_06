
package blog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// 完整实现用户注册的功能
public class UserRegisterAction implements Action {
    @Override
    public void run() {
        // 1. 提示用户输入需要的信息，并且使用 jdbc 执行 sql
        System.out.println("开始用户注册...");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名称> ");
        String username = scanner.nextLine();
        System.out.print("请输入用户昵称> ");
        String nickname = scanner.nextLine();
        System.out.print("请输入密码> ");
        String password = scanner.nextLine();

        try (Connection connection = DBUtil.getConnection()) {
            String sql = "insert into users (username, nickname, password) values (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, nickname);
                statement.setString(3, password);

                statement.executeUpdate();

                System.out.println("注册成功，欢迎您的加入，" + nickname);
            }
        } catch (SQLException e) {
            System.out.println("错误: " + e.getMessage());
        }
    }
}
