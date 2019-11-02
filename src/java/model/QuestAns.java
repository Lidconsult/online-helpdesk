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
public class QuestAns {

    public int addQA(String quest, String ans) {
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
            String query = "INSERT INTO quesans(question, answer) VALUES ('" + quest + "','" + ans + "')";
            status = st.executeUpdate(query);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(QuestAns.class.getName()).log(Level.SEVERE, null, ex);
        } 
        

        return status;
    }

    public ResultSet retreiveAllQAs() {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT * FROM `quesans`";
            rs = st.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuestAns.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
}
