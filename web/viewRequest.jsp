<%-- 
    Document   : Welcome
    Created on : Dec 5, 2014, 3:45:25 PM
    Author     : Bukola
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Requests"%>
<%@page import="model.Users"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <%@include file="header.jsp" %> 
    <center> <h1>Student Requests </h1>

        <table width="90%" align="center" border="0">

            <tr bgcolor="lightgrey">
                <th width="3%"> SrNo</th>
                <th width="8%"> Facility Name</th>
                <th width="6%"> Requestor</th>
                <th width="6%"> Assignee </th>
                <th width="6%"> Severity Level </th>
                <th width="7%"> Status</th>
                <th width="16%"> Status Closed Reason </th>
                <th width="15%"> Request Date / Time</th>
                <th width="20%"> Remarks</th>
            </tr>
            <tr>
                <%!                    
                    ResultSet r;
                %>
                <%                
                    Requests req = new Requests();

                    if (acctId == 2) {
                        r = req.retreiveAllRequests();
                    } else if ((acctId == 3) || (acctId == 6)) {
                        r = req.retreiveAllRequestsByRequestedUser(userId);
                    } else if (acctId == 4) {
                        r = req.retreiveAllRequestsByFacilityHead(userId);
                    } else if (acctId == 5) {
                        r = req.retreiveAllRequestsByAssignedUser(userId);
                    }/* else if (acctId == 6) {
                        r = req.retreiveAllRequestsByRequestedUser(userId);
                    } */

                    int cnt = 1;

                    while (r.next()) {
                %>
                <td><%= cnt++%> </td>
                <td><%= r.getString(1)%> </td>
                <td><% int pos = r.getString(2).indexOf('@');%>
                    <%= r.getString(2).substring(0, pos)%> </td>
                <td><% int pos2 = r.getString(3).indexOf('@');%>
                    <%= r.getString(3).substring(0, pos2)%> </td>
                <td><%= r.getString(4)%> </td>
                <td><%= r.getString(5)%> </td>
                <td><%= r.getString(6)%> </td>
                <td><%= r.getString(7)%> </td>
                <td><%= r.getString(8)%> </td>
                <% if ((r.getString(5).equalsIgnoreCase("unassigned") && (acctId == 4)) || (r.getString(5).equalsIgnoreCase("assigned") && (acctId == 5))) {%>
                <td><a href="processRequest.jsp?requestId=<%= r.getInt(9)%>" style="text-decoration: none">  process </a></td>
                <%} else if ((r.getString(5).equalsIgnoreCase("work in progress") && (acctId == 5)) || (r.getString(5).equalsIgnoreCase("work in progress") && (acctId == 4))) {%>
                <td><a href="processRequest.jsp?requestId=<%= r.getInt(9)%>" style="text-decoration: none">  update </a></td>
                <%} else if ((acctId != 2) && ((acctId != 4 && !r.getString(5).equalsIgnoreCase("rejected")) || (acctId == 4 && !r.getString(5).equalsIgnoreCase("rejected"))) && ((acctId == 6 && !r.getString(5).equalsIgnoreCase("closed")) || (acctId == 3 && !r.getString(5).equalsIgnoreCase("closed")))) {%>
                <td><a href="processRequest.jsp?requestId=<%= r.getInt(9)%>" style="text-decoration: none">  close </a></td>
                <%
                }%>  
            </tr>
            <%
                }%>
        </table>


    </center>
    <%@include file="footer.jsp" %>     
</body>
</html>