/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author witness
 */
public class Facilities {

    public int addFacility(String facName, String detail, int facHeadId) {
        Connection con;
        int status = 0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            /*
             if(con != null){
             return 1;
             }  */
            Statement st = con.createStatement();
            String query = "INSERT INTO facilities(facilityName, facilityInfo, facilityHeadId) VALUES ('" + facName + "','" + detail + "' ,"+facHeadId+")";
            status = st.executeUpdate(query);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Facilities.class.getName()).log(Level.SEVERE, null, ex);
        } 

        return status;
    }


    public ResultSet retreiveAllFacilities() {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT * FROM `facilities` f join users u on f.facilityHeadId = u.userId";
            rs = st.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Facilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
    
  
}
