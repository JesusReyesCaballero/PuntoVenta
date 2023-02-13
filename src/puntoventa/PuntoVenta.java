package puntoventa;

import java.sql.*;
import javax.swing.JOptionPane;
import Funciones.Conexion;
import Funciones.Encriptar;
public class PuntoVenta {

    public void Conectar(){
        Conexion cc = new Conexion();
        Connection con = cc.getCon();
        if(con == null){
            JOptionPane.showMessageDialog(null, cc.getError(), "Error", JOptionPane.ERROR_MESSAGE);
            try{
                con.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "¡Error!, " +  ex.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            new Login().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new PuntoVenta().Conectar();
    }
    
}
