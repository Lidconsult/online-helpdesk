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

    <center><h1>Add Facility</h1>
        <form action="FacilityServlet" method="post">
            <table>
                <tr>
                    <td>
                        Facility Name :
                    </td>
                    <td>
                        <input type="text" name="facName"><br/><br/>
                    </td>
                    </tr>
                <tr>
                <td>
                   definition :
                </td>
                <td>
                    <textarea name="detail"></textarea><br/><br/>
                </td>
                </tr>
                <tr>
                    <td>
                        Facility Head:
                    </td>
                    <td>
                        <select name="facHeadId"> 
                            <%                          
                                Users u = new Users();
                                ResultSet rs = u.retreiveAllUsers();

                                while (rs.next()) {
                                    if(rs.getInt(8) == 3){
                                    %>
                            <option value="<%=rs.getInt(1) %>"><%=rs.getString(6) %></option>
                            <%}
                                }%>
                        </select><br/><br/> 
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Submit">
                    </td>
                </tr>
            </table>
        </form>
    </center>
   <%@include file="footer.jsp" %>     
    </body>
</html>
