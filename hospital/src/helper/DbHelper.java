package helper;

import java.sql.*;

public class DbHelper {
    private String dbUsername = "root";
    private String dbPassword = "1234";
    private String dbUrl = "jdbc:mysql://localhost:3306/hospital";
            
    public Connection connect(){
        try{
            Connection connection = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
            return connection;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
