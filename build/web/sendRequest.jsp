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

    <center><h1>Send Request</h1>
        <form action="SendRequestServlet" method="post">
            <table>
                <tr>
                    <td valign="top">
                        Facility Name:
                    </td>
                    <td>
                        <select name="facilityId"> 
                            <%                                
                                Facilities facility = new Facilities();
                                ResultSet rs = facility.retreiveAllFacilities();

                                while (rs.next()) {
                            %>
                            <option value="<%=rs.getInt(1)%>"><%=rs.getString(2)%></option>
                            <%
                                }%>
                        </select><br/><br/> 
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Severity Level:
                    </td>
                    <td>
                        <select name="slevel"> 
                            
                            <option value="emergency">emergency</option>
                            <option value="critical">critical</option>
                            <option value="significant">significant</option>
                            <option value="normal">normal</option>
                            <option value="insignificant">insignificant</option>
                         
                        </select><br/><br/> 
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Remarks :
                    </td>
                    <td>
                        <textarea name="remark"></textarea><br/><br/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <input type="submit" value="Submit">
                    </td>
                </tr>
                <tr>
                    <td>
                      
                    </td>
                    <td>
                        <input name="userId" type="hidden" value="<%= userId %>"><br/><br/>
                    </td>
                </tr>
            </table>
        </form>
    </center>
    <%@include file="footer.jsp" %>     
</body>
</html>
