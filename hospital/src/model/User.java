package model;

public class User {
    private int id;
    private String name,tcNo,password,surname,gender;
    
    public User(){}
    
    public User(int id,String name,String surname,String tcNo,String password,String gender){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tcNo = tcNo;
        this.password = password;
        this.gender = gender;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getTcNo(){
        return tcNo;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setTcNo(String tcNo){
        this.tcNo = tcNo;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
}
