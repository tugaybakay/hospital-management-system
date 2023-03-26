package model;

import helper.DbHelper;
import java.sql.*;
import helper.Helper;

public class Doctor extends User {
    
    private int clinicId;
    
    public Doctor(){}
    
    public Doctor(int id, String name, String surname, String tcNo, String password, String gender,int clinicId){
        super(id,name,surname,tcNo,password,gender);
        this.clinicId = clinicId;
    }
    
    public void setClinicId(int clinicId){
        this.clinicId = clinicId;
    }
    
    public int getClinicId(){
        return clinicId;
    }
    
    public static boolean addDoctor(DbHelper db,String name, String surname, String tcNo, String password, String gender,int clinicId){
        
        boolean key = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        
        String sqlSelectQuery="select * from doctors where tc_no_=\""+tcNo+"\";";
        //Is it an existing record?
        try{
            connection = db.connect();
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlSelectQuery);
            if(result.next()){
                return key;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        String sqlQuery = "insert into doctors(name_,surname_,tc_no_,password_,gender_,clinic_id_) values(?,?,?,?,?,?);";
        
        try{
            
            
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, tcNo);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5,gender);
            preparedStatement.setInt(6,clinicId);
            preparedStatement.executeUpdate();
            key = true;
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                connection.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return key;
    }
    
    public static boolean deleteDoctor(DbHelper db,String tcNo){
        
        boolean key = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        
        String sqlSelectQuery="select * from doctors where tc_no_=\""+tcNo.replace('"','ü')+"\";";
        //Is there such a record?
        try{
            connection = db.connect();
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlSelectQuery);
            if(!result.next()){
                
                return key;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        String sqlQuery = "delete from doctors where tc_no_=\""+tcNo.replace('"','ü')+"\";";
        
        
        try{
            preparedStatement = connection.prepareStatement(sqlQuery);
           
            /* preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, tcNo);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, gender);*/
            
            
            preparedStatement.executeUpdate();
            key = true;
        }
        catch(SQLException e){
            e.printStackTrace();
            
        }finally{
            try{
                statement.close();
                connection.close();
                preparedStatement.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
            return key;
        }
    }
    
    public static boolean updateDoctor(DbHelper db,String name,String surname,String tcNo,String password,String gender){
        
        boolean key = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        
        String sqlSelectQuery="select * from doctors where tc_no_=\""+tcNo.replace('"', 'ü')+"\";";
        //Is it an existing record?
        try{
            connection = db.connect();
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlSelectQuery);
            if(!result.next()){
                return key;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        String sqlQuery = "update doctors set name_=\""+name+"\", surname_=\""+surname+"\", password_=\""+password+"\", gender_=\""+gender+"\" where tc_no_=\""+tcNo+"\";";
        System.out.println(sqlQuery);
        try{
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.executeUpdate();
            key = true;
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        finally{
            try{
                statement.close();
                connection.close();
                preparedStatement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
            return key;
        }
    }
}
