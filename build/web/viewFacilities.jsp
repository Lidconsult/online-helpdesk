<%-- 
    Document   : Welcome
    Created on : Dec 5, 2014, 3:45:25 PM
    Author     : Bukola
--%>

<%@page import="model.Facilities"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <%@include file="header.jsp" %> 

    <center> 
        <h1> Facilities </h1> <br/> 

    </center>

    <table width="90%" align="center" border="0">

        <tr bgcolor="lightgrey">
            <th width="3%"> SrNo</th>
            <th width="30%"> Facility Name</th>
            <th width="30%"> Description</th>
            <th width="30%"> Facility Head</th>
        </tr>
        <tr>
            <%
                Facilities facilities = new Facilities();
                ResultSet rs = facilities.retreiveAllFacilities();
                int cnt = 1;

                while (rs.next()) {
            %>
            <td><%= cnt++%> </td>
            <td><%= rs.getString(2)%> </td>
            <td><%= rs.getString(3)%> </td>
            <td><% int pos = rs.getString(10).indexOf('@');%>
                <%= rs.getString(10).substring(0, pos)%> </td><%--
            <% if(acctId == 2) {%>
            <td><a href="editFacility.jsp?facilityId=<%= rs.getInt(1)%>" style="text-decoration: none">  edit </a></td>
            <td><a href="DeleteFacilityServlet?facilityId=<%= rs.getInt(1)%>" style="text-decoration: none"> delete </a></td>
        <%}%>--%>
        </tr>
        <%
            }%>
    </table>
   <%@include file="footer.jsp" %>     
   
</body>
</html>
