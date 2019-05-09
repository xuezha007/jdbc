import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.sql.*;

public class jdbcdemo1 {


    @Test
//    jdbc入门程序
    public void demo1()
    {
        try {
//        加载驱动
            DriverManager.registerDriver(new Driver());
//        2获得连接
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "mysql");
//        3创建执行语句
//            3.1创建执行sql的对象
            String sql="select * from user ";
            Statement stmt=connection.createStatement();
//            3.2执行sql
            ResultSet resultSet=stmt.executeQuery(sql);
            while(resultSet.next()){
                int uid =resultSet.getInt("uid");
                System.out.println(uid);

            }

//        4释放资源
            resultSet.close();
            stmt.close();
            connection.close();
        }
            catch(SQLException e){
                e.printStackTrace();
            }
    }
}
