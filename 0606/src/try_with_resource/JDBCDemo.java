package try_with_resource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {
    public static void getConnectionUseDriverManger() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/bbq?useSSL=false&characterEncoding=utf8";
        String user = "root";
        String password = "92727";

        Class.forName("com.mysql.jdbc.Driver");

        // 不使用 try-with-resource 的写法
        {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(url, user, password);
                // 执行具体的操作
            } finally {
                if (connection != null) {
                    // 说明当时连接成功了
                    // 连接成功，就应该手动调用 close 关闭连接
                    connection.close();
                }
            }
        }

        // 使用 try-with-resource 的写法，1.8 之后支持，目的就是简化代码
        {
            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                // 执行具体的操作
            }   // 会自动调用 connection.close()，编译器会帮你加上相应的代码
        }
    }

    // 1. 这个是新版 JDBC 标准提供的写法
    // 2. 写法比 url 的方式更加明确，不容易出现拼写错误
    // 3. 支持连接池的方式，所以可能效率更高
    public static void getConnectionUseDataSource() throws SQLException {
        DataSource dataSource;

        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");
        mysqlDataSource.setDatabaseName("huojianban2_0601");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");

        dataSource = mysqlDataSource;

        try (Connection connection = dataSource.getConnection()) {
            // 我的目的就是要获取 Connection 对象
        }
    }
}

