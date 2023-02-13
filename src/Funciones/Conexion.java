package Funciones;

import java.sql.*;
public class Conexion {
    
    String error;
    public Connection getCon(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/puntoVenta", "JesusR", "caballero98");
            
        }catch(SQLException | ClassNotFoundException ex){
            error = "Connection Exception: " + ex.getMessage();
        }
        return con;
    }
    
    public String getError(){
        return error;
    }
}
