/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author naveen1651_
 */
public class DBConnection {

      static Connection con =  null;
    
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/foreign_ts","root","");
        } catch (Exception e){
            e.printStackTrace();
        }

        return con;
    }
    
}
