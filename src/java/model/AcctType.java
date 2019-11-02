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
 * @author Bukola
 */
public class AcctType {
    /*

     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    public ResultSet retreiveAccType() {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "select * from accounttypes where acctTypeId > 1";
            rs = st.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AcctType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

}
