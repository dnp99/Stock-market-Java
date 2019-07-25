/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import POJO.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deep Patel
 */
public class DB_USER {

    /************************            Get user info from database       ****************************/
    public static User getUser() {
         User user = null;
        try {
            Connection con = Database_connection.getConn();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from info where id='N01239042'");                       
            while (rs.next()) {
                user= new User(
                rs.getString("NAME"),
                rs.getString("ID"),
                rs.getString("EMAIL"),
                rs.getString("GITHUB"),
                rs.getString("LINKDIN"), 
                rs.getLong("PHONE"));
            }
            
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_USER.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DB_USER.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  user ;
    }
    
    
    
  
}
