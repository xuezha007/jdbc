import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdemo2 {
    @Test
    public void demo2() {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql:///jdbctest?characterEncoding=UTF-8","root","mysql");
            String sql="insert into user values(null,'qqq','124','海兽')";
            statement=connection.createStatement();
            int a=statement.executeUpdate(sql);
            if(a!=0){
                System.out.println("成功");
            }
            else {
                System.out.println("失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(statement!=null)
            {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                statement=null;
            }
            if(connection!=null)
            {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                connection=null;

            }
        }
    }

}
