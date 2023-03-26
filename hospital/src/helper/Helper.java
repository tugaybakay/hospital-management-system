package helper;

import javax.swing.JOptionPane;


public class Helper {
    
  
    public void error(String msg){
        
        switch(msg){
            
            case "nope":
                JOptionPane.showMessageDialog(null,"Kayıt bulunamadı!","No register!",JOptionPane.ERROR_MESSAGE);
                break;
            
            case "deleteSucces":
                JOptionPane.showMessageDialog(null,"Kayıt veritabanından silindi.","Succecs!",JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case "empty":
                JOptionPane.showMessageDialog(null,"Zorunlu alanlar boş bırakılamaz!!","Warning!",JOptionPane.ERROR_MESSAGE);
                break;
            
            case "noAccount":
                JOptionPane.showMessageDialog(null,"Girdiğiniz bilgilerle eşleşen bir hesap bulunamadı!","No Account!",JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case "succes":
                JOptionPane.showMessageDialog(null,"Kayıt veritabanına eklendi.","Succecs!",JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case "db":
                JOptionPane.showMessageDialog(null,"Veritabanı bağlantısında beklenmeyen bir sorun oluştu!!","Database Connection Error!",JOptionPane.ERROR_MESSAGE);
                break;
                
            case "already":
                JOptionPane.showMessageDialog(null,"the registry is already exists!!","could not be added",JOptionPane.ERROR_MESSAGE);
                
        }
    }
}
