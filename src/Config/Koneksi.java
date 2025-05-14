package Config;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection(){
        if(conn==null){
            try{
                String url = "jdbc:mysql://localhost:3306/javacrud";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = DriverManager.getConnection(url,user,pass);
            }catch(SQLException e){
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null, e);
            }
        }
        return conn;
    }
}
