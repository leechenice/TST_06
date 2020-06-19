import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
    private static volatile DataSource dataSource;

    private void getDataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setDatabaseName("root");
        mysqlDataSource.setPassword("92727");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");
        dataSource = mysqlDataSource;
    }
    public Connection getConnection() throws SQLException {
        if (dataSource == null) {
            synchronized (DBUtil.class) {
                if (dataSource == null) {
                    getDataSource();
                }
            }
        }
        return dataSource.getConnection();
    }


}
