<%-- 
    Document   : Welcome
    Created on : Dec 5, 2014, 3:45:25 PM
    Author     : Bukola
--%>

<%@page import="model.AcctType"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <%@include file="header.jsp" %> 

    <center><h1>Add User</h1>

        <form action="UserServlet" method="post">
            <table>
                <tr>
                    <td>
                        First Name
                    </td>
                    <td>
                        <input type="text" name="FName"><br/><br/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Last Name :
                    </td>
                    <td>
                        <input type="text" name="LName"><br/><br/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Address :
                    </td>
                    <td>
                        <input type="text" name ="Address"><br/><br/> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Phone No :
                    </td>
                    <td>
                        <input type="text" name ="PhoneNo"><br/><br/> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Email  :
                    </td>
                    <td>
                        <input type="email" name="Email" ><br/><br/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Password :
                    </td>
                    <td>
                        <input type="password" name="PWord" ><br/><br/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Account Type:
                    </td>
                    <td>
                        <select name="AccType"> 
                            <%                          
                                AcctType accttype = new AcctType();
                                ResultSet rs = accttype.retreiveAccType();

                                while (rs.next()) {
                                    %>
                            <option value="<%=rs.getInt(1) %>"><%=rs.getString(2) %></option>
                            <%
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