<%-- 
    Document   : Welcome
    Created on : Dec 5, 2014, 3:45:25 PM
    Author     : Bukola
--%>

<%@page import="model.Users"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <%@include file="header.jsp" %> 
    <center> 
        <h1> Registered Members </h1> 

    </center>

    <table width="90%" align="center" border="0">

        <tr bgcolor="lightgrey">
            <th width="3%"> SrNo</th>
            <th width="12%"> Firstname</th>
            <th width="12%"> Lastname</th>
            <th width="25%"> Address</th>
            <th width="18%"> Email</th>
            <th width="10%"> PhoneNo</th>
            <th width="10%"> Designation</th>
        </tr>
        <tr>
            <%
                Users users = new Users();
                ResultSet rs = users.retreiveAllUsers();
                int cnt = 1;

                while (rs.next()) {
            %>
            <td><%= cnt++ %> </td>
            <td><%= rs.getString(2)%> </td>
            <td><%= rs.getString(3)%> </td>
            <td><%= rs.getString(4)%> </td>
            <td><%= rs.getString(6)%> </td>
            <td><%= rs.getString(5)%> </td>
            <td><%= rs.getString(10)%> </td>
            <%--
            <td><a href="editUser.jsp?userId=<%= rs.getInt(1)%>" style="text-decoration: none">  edit </a></td>
            <td><a href="DeleteUserServlet?userId=<%= rs.getInt(1)%>" style="text-decoration: none"> delete </a></td> --%>
        </tr>
        <%
        }%>
     </table>
   <%@include file="footer.jsp" %>     
   
</body>
</html>
