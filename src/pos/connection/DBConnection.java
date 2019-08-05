/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gerardo
 */
public class DBConnection {
    public static Connection con;
    public void setConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/pos","root","");
            System.out.println("POS Database has been Connected");
        }catch(ClassNotFoundException | SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getConnection(){
        return con;
    }
}
