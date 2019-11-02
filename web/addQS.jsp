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

    <center><h1>Add Question_Answer</h1>
        <form action="QuestAnsServlet" method="post">
            <table>
                <tr>
                    <td>
                        Question :
                    </td>
                    <td>
                        <input type="text" name="q"><br/><br/>
                    </td>
                    </tr>
                <tr>
                <td>
                   Answer :
                </td>
                <td>
                    <textarea name="a"></textarea><br/><br/>
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
