package jdbcutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    private static Connection conn;
    
    public static Connection getConnection(){
          if (DBContext.conn == null) {
              try {
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url="jdbc:sqlserver://localhost:1433;databaseName=db_pm_bandienthoai;encrypt=false";
                String use="sa";
                String pass="123456";
                conn=DriverManager.getConnection(url, use, pass);
                System.out.println("Ket noi thanh cong!");
              } catch (Exception e) {
                  e.printStackTrace();
              }
        }
          return DBContext.conn;
    }
    public static void main(String[] args) {
        getConnection();
    }
}
