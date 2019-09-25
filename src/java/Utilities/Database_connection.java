/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Deep Patel
 */
public class Database_connection {
    public static java.sql.Connection getConn() throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            //create the connection
            
        java.sql.Connection con=DriverManager.getConnection
        ("jdbc:oracle:thin:@calvin.humber.ca:1521:grok","N0123456","ORACLE123");
          return con;
    }
    
}
