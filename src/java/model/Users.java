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
 * @author LAMINA IBRAHIM.O
 */
public class Users {
    
    public int insertRecord(String fname, String lname, String address, String phoneNo, String email, String pword, int acctype) {
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
            String query = "INSERT INTO users(fName, lName, address, phoneNo, email, password, acctTypeID) VALUES ('"+fname+"','"+lname+"','"+address+"','"+phoneNo+"','"+email+"',sha1('"+pword+"'),"+acctype+")";
            status = st.executeUpdate(query);
         
          } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public int login(String userName, String password){
       
       Connection con;
       String query;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
           Statement st = con.createStatement();
            query = "select * from users where email = '"+userName+"' and password = SHA1('"+password+"')";
            ResultSet rs = st.executeQuery(query);
      
            while (rs.next()){
                    return rs.getInt(8);
            }
       } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
       }
    
    
    public boolean confirmpassword(String userName, String password){
       Connection con;
       String query;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
           Statement st = con.createStatement();
            query = "select * from users where email = '"+userName+"' and password = SHA1('"+password+"')";
            ResultSet rs = st.executeQuery(query);
      
            while (rs.next()){
                    return true;
            }
       } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    public boolean changepassword(String pword, String Uname){
        Connection con;
        ResultSet rs;
            
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
          
            Statement st = con.createStatement();
            String query = "update onlinehelpdesk.users set password = SHA1('"+pword+"') where email = '"+Uname+"' ";
            int status = st.executeUpdate(query);
            
            if(status > 0){
              return true;
            }
          } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
  
    public ResultSet retreiveAllUsers() {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT * FROM users u join accounttypes a on u.acctTypeID = a.acctTypeID where u.acctTypeID > 1";
            rs = st.executeQuery(query);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return rs;

    }
    
    
    
    public int retreiveUserByUname(String user) {

        Connection con = null;
        ResultSet rs = null;
        int id = 0;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT * FROM users where email = '" + user + "'";
            rs = st.executeQuery(query);
            while (rs.next()){
                    id = rs.getInt("userID");
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return id;

    }
    
    public ResultSet retreiveAssigneeUsers() {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT u.userId, u.email FROM users u join accounttypes a on u.acctTypeID = a.acctTypeID where a.acctTypeName = 'Assignee'";
            rs = st.executeQuery(query);
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return rs;

    }
}
