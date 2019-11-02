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

    <table width="90%" align="center" border="1">

        <tr>
            <td><ul>
                    <%                  
                        QuestAns qa = new QuestAns();
                        ResultSet rs = qa.retreiveAllQAs();

                        while (rs.next()) {
                    %>
                    <li> Q:<%= rs.getString(2)%> 
                    </li>
                    <li> A:<%= rs.getString(3)%> 
                    </li>
                    <%
                        }%>
                </ul>
        </tr>


     </table>
   <%@include file="footer.jsp" %>     
   
</body>
</html>
