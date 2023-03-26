package model;

import helper.DbHelper;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Administrator extends User {

    public Administrator(int id, String name, String surname, String tcNo, String password,String gender){
        super(id,name,surname,tcNo,password,gender);
        
    }
    
    public ArrayList<Doctor> getDoctorList(DbHelper db){
        ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
        Connection connection = null;
        Statement statement = null;
        try{
            connection = db.connect();
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select * from doctors;");
            while(result.next()){
                doctorList.add(new Doctor(result.getInt("id_"),result.getString("name_"),result.getString("surname_"),result.getString("tc_no_"),result.getString("password_"),result.getString("gender_"),result.getInt("clinic_id_")));
            }
            return doctorList;
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
    
    public ArrayList<Clinic> getClinicList(DbHelper db){
        ArrayList<Clinic> clinicList = new ArrayList<Clinic>();
        Connection connection = null;
        Statement statement = null;
        try{
            connection = db.connect();
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select * from clinics;");
            while(result.next()){
                clinicList.add(new Clinic(result.getInt("id_"),result.getString("name_")));
            }
            return clinicList;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return clinicList;
    }

}

