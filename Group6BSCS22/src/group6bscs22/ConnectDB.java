package group6bscs22;
import java.sql.*;

public class ConnectDB {

    public static Connection connect(String db, String user, String pass) {
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db, user, pass);
        }catch(Exception e){
            System.out.println(e);
        }
        return conn;
    }
    
}
