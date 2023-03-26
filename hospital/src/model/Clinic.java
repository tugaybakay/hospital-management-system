package model;

import java.sql.*;
import helper.DbHelper;
import helper.Helper;
import java.util.ArrayList;

public class Clinic {
    private int id;
    private String name;
    private Helper helper;
    private DbHelper db;
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    
    public Clinic(int id,String name){
        this.id = id;
        this.name = name;
    }
  
    @Override
    public String toString(){
        return this.name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public ArrayList<Clinic> getClinics(DbHelper db){
        
        ArrayList<Clinic> clinicList = new ArrayList<Clinic>();
        String sqlQuery = "select * from clinics;";
        try{
            connection = db.connect();
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlQuery);
            while(result.next()){
                clinicList.add(new Clinic(result.getInt("id_"),result.getString("name_")));
            }
            return clinicList;
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                statement.close();
                connection.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            
            return null;
        }
    }
    
    public static boolean deleteClinic(DbHelper db,Helper helper,String deleteClinicId){
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        
        String sqlQuery = "select * from clinics where id_=\""+deleteClinicId+"\";";
            try{
                connection = db.connect();
                statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sqlQuery);
                if(!result.next()){
                    helper.error("nope");
                    return false;
                }else{
                   
                    sqlQuery = "delete from clinics where id_=\""+deleteClinicId.replace('"','ü')+"\";";
                    preparedStatement = connection.prepareStatement(sqlQuery);
                    preparedStatement.executeUpdate();
                    helper.error("deleteSucces"); 
                    return true;
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            finally{
                try {
                    connection.close();
                    statement.close();
                    if(preparedStatement!=null)preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                
            }
            return false;
    }
}

