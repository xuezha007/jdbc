import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcdemo1 {


    @Test
//    jdbc入门程序
    public void demo1()
    {
        try {
//        1加载驱动 两种方式
//            DriverManager.registerDriver(new Driver()); 注册两次
            Class.forName("com.mysql.jdbc.Driver");
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
            catch(Exception e1){
                e1.printStackTrace();
            }
    }
}
