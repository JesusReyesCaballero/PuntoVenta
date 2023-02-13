package Funciones;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
public class Encriptar {

    public String getEncrypt(String password){
        MessageDigest md = null;
        StringBuffer sb= new StringBuffer();
        try{
            md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            for(byte b : hash){
                sb.append(String.format("%02x", b));
            }
        }catch(NoSuchAlgorithmException ex){
            JOptionPane.showMessageDialog(null, "¡Error! " + ex.getMessage(), "Algorithm Exception", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return sb.toString();
    }
    
}
