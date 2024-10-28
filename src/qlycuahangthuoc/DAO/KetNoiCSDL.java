package qlycuahangthuoc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KetNoiCSDL {

    //---------------------------------------
    public static Connection getConnection()
      {
          Connection con = null;
          try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=QLCUAHANGTHUOC;encrypt=false;trustServerCertificate=true;";
            String user = "sa";
            String password = "123456";
            con = DriverManager.getConnection(url, user, password);
          } catch (Exception e) {
              e.printStackTrace();
          }
        return con;
      }
    
     public static void Closeconnection(Connection con)
     {
         try {
             if(con!=null)
             {
                 con.close();
             }
         } catch (Exception e) {
         }
     }
     
     public static void main(String[] args) {
        Connection con = null;
        try {
            con = KetNoiCSDL.getConnection();
            if (con != null) {
                System.out.println("Connection established successfully.");
            } else {
                System.out.println("Failed to establish connection.");
            }
        } finally {
           KetNoiCSDL.Closeconnection(con);
        }
    }
}



