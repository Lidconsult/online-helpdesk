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

    <center><h1>Change Password</h1>
        <form action="ChangePassword" method="get" name=""  >

<table border="0" align="center">
<tr>
<td>OLD PASSWORD</td>
<TD><input name="OldPassword" type="password" id="OLDpwd" size="20" required="" ></td>
</tr>
<tr>
<td>New Password</td>
<td><input name="newpassword" type="password" id="newpassword" required="" >
</td>
</tr>
<tr>
<td>Confirm Password</td>
<td><input name="conpassword" type="password" id="conpassword" required="" >
</td>
</tr>
<tr>
<td> </td>
<td><input type="submit" name="Submit" value="Chang Password"></td>
</tr>

</table>
</form>
    </center>
   <%@include file="footer.jsp" %>     
    </body>
</html>
