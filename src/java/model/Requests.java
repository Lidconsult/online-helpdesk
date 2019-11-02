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
public class Requests {
    
    public ResultSet retreiveAllRequests() {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "select f.facilityName, ur.email, ua.email, r.severityLevel, r.status, r.statusClosedReason, r.requestDate, r.remarks, r.requestId from requests r "
                    + "join facilities f on r.requestedFacility = f.facilityId "
                    + "join users u on f.facilityHeadId = u.userId "
                    + "join users ur on r.requestFrom = ur.userId "
                    + "join users ua on r.assignedTo = ua.userId";
            rs = st.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
    
    
    public ResultSet retreiveAllRequestsByFacilityHead(int userId) {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "select f.facilityName, ur.email, ua.email, r.severityLevel, r.status, r.statusClosedReason, r.requestDate, r.remarks, r.requestId from requests r join facilities f on r.requestedFacility = f.facilityId join users u on f.facilityHeadId = u.userId join users ur on r.requestFrom = ur.userId join users ua on r.assignedTo = ua.userId where f.facilityHeadId = " + userId;
            rs = st.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
    
    public ResultSet retreiveAllRequestsByFacilityHeadByRequestId(int userId, int reqId) {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "select f.facilityName, f.facilityId, ur.userId, ur.email, ua.email, r.severityLevel, r.status, r.statusClosedReason, r.requestDate, r.remarks, r.requestId from requests r join facilities f on r.requestedFacility = f.facilityId join users u on f.facilityHeadId = u.userId join users ur on r.requestFrom = ur.userId join users ua on r.assignedTo = ua.userId where f.facilityHeadId = " + userId + " and r.requestId = " + reqId;
            rs = st.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
    
    
    public ResultSet retreiveAllRequestsByAssignedUserByRequestedId(int userId, int reqId) {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "select f.facilityName, f.facilityId, ur.userId, ur.email, ua.email, r.severityLevel, r.status, r.statusClosedReason, r.requestDate, r.remarks, r.requestId from requests r "
                    + "join facilities f on r.requestedFacility = f.facilityId "
                    + "join users u on f.facilityHeadId = u.userId "
                    + "join users ur on r.requestFrom = ur.userId "
                    + "join users ua on r.assignedTo = ua.userId where ua.userId = " + userId + " and r.requestId = " + reqId;;
            rs = st.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
    
    
  public ResultSet retreiveAllRequestsByRequestorByRequestedId(int userId, int reqId) {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "select f.facilityName, f.facilityId, ur.userId, ur.email, ua.email, r.severityLevel, r.status, r.statusClosedReason, r.requestDate, r.remarks, r.requestId from requests r "
                    + "join facilities f on r.requestedFacility = f.facilityId "
                    + "join users u on f.facilityHeadId = u.userId "
                    + "join users ur on r.requestFrom = ur.userId "
                    + "join users ua on r.assignedTo = ua.userId where ur.userId = " + userId + " and r.requestId = " + reqId;;
            rs = st.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }  
    
    public ResultSet retreiveAllRequestsByRequestedUser(int userId) {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "select f.facilityName, ur.email, ua.email, r.severityLevel, r.status, r.statusClosedReason, r.requestDate, r.remarks, r.requestId from requests r "
                    + "join facilities f on r.requestedFacility = f.facilityId "
                    + "join users u on f.facilityHeadId = u.userId "
                    + "join users ur on r.requestFrom = ur.userId "
                    + "join users ua on r.assignedTo = ua.userId where ur.userId = " + userId;
            rs = st.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
    
      
      public ResultSet retreiveAllRequestsByAssignedUser(int userId) {

        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
            Statement st = con.createStatement();
            String query = "select f.facilityName, ur.email, ua.email, r.severityLevel, r.status, r.statusClosedReason, r.requestDate, r.remarks, r.requestId from requests r "
                    + "join facilities f on r.requestedFacility = f.facilityId "
                    + "join users u on f.facilityHeadId = u.userId "
                    + "join users ur on r.requestFrom = ur.userId "
                    + "join users ua on r.assignedTo = ua.userId where ua.userId = " + userId;
            rs = st.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

    public int addRequest(int facilityId, int userId, String slevel, String remark) {
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
            String query = "INSERT INTO requests(requestedFacility, requestFrom, assignedTo, severityLevel, remarks, status, statusClosedReason) VALUES (" + facilityId + "," + userId + ",1,'"+ slevel +"' ,'" + remark + "','unassigned','')";
            status = st.executeUpdate(query);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }
    
       public int updateRequests(int reqId, String reason, String s) {
       Connection con;
        int status = 0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
           
            Statement st = con.createStatement();
            String query = "update requests set statusClosedReason ='" + reason + "', status = '" + s + "' where requestId = " + reqId;
            status = st.executeUpdate(query);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        } 

        return status;
    }

    public int prepareRequests(int reqId, int assigneeId, String s) {
        Connection con;
        int status = 0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinehelpdesk", "root", "");
           
            Statement st = con.createStatement();
            String query = "update requests set assignedTo =" + assigneeId + ", status = '" + s + "' where requestId = " + reqId;
            status = st.executeUpdate(query);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        } 

        return status;
    }
    
}
