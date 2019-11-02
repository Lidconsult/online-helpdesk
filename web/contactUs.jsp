<%-- 
    Document   : Welcome
    Created on : Dec 5, 2014, 3:45:25 PM
    Author     : Bukola
--%>

<%@page import="model.QuestAns"%>
<%@page import="model.Facilities"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <%@include file="header.jsp" %> 

    <center> 
        <h1> FAQs </h1> <br/> 

    </center>

    
        <fieldset>
            <legend>Contact US</legend>
        
            FIND US!!<br/>
            We're here to help! Reach us by phone or send us message!<br/>
            Help Desk
            205, Victoria Island 
            Lagos, Nigeria.

            <ul>
    <li><b>Student :</b> <p>08036837125</p> </li>
    <li><b>Staff  :</b> <p>08036837125</p> 
    </li>
    <li><b> Info@helpdesk.com</b> 
    </li></ul>

       </fieldset>
 
        <%@include file="footer.jsp" %> 
      
   
</body>
</html>
