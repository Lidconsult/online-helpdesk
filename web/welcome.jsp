<%-- 
    Document   : Welcome
    Created on : Dec 5, 2014, 3:45:25 PM
    Author     : Bukola
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
               
<%@include file="header.jsp" %>  
     
        <h1>
        </h1>
<center>
        <fieldset >
            <legend align='left'>
                About us
            </legend>
            We aim at helping students and staffs communicate in the campus.
           We came up with an Intranet based application that can be accessed throughout the campus.<br/>
            This system can be used to automate the workflow of service requests for the various facilities in
            the campus. This is one integrated system that covers different kinds <br/>
            of facilities like class-rooms, labs, hostels, mess, canteen, gymnasium,
            computer centre, faculty club etc. Registered users (students, faculty,<br/>
            lab-assistants and others) will be able to log in a request for service
            for any of the supported facilities. These requests will be sent to the<br/>
            concerned people, who are also valid users of the system, to get them
            resolved. There are features like email notifications/reminders, addition<br/>
            of a new facility to the system, report generators etc in this system. 
        </fieldset>
    </center>
   <%@include file="footer.jsp" %>     
    </body>
</html>
