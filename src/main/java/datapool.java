import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class datapool {
    @Test
    public void demo1() {
//        创建连接池

        //        设置连接池参数
//        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs =null;
//        获得连接
        try {
            ComboPooledDataSource dataSource=new ComboPooledDataSource();

            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql:///jdbctest");
            dataSource.setUser("root");
            dataSource.setPassword("mysql");
            dataSource.setMaxPoolSize(20);
            dataSource.setInitialPoolSize(3);
            Connection conn=dataSource.getConnection();
// 编写Sql:
            String sql = "select * from user";
            // 预编译SQL:
            pstmt = conn.prepareStatement(sql);
            // 设置参数
            // 执行SQL:
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
