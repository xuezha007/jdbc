import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcdemo1 {


    @Test
//    jdbc入门程序
    public void demo1()
    {
        try {
//        加载驱动
            DriverManager.registerDriver(new Driver());
//        2获得连接
            DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "mysql");
//        3创建执行语句
//        4释放资源}
        }
            catch(SQLException e){
                e.printStackTrace();
            }
    }
}
