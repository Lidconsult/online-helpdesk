<%-- 
    Document   : index
    Created on : Dec 16, 2014, 4:54:30 PM
    Author     : Bukola
--%>
 <%   
 String msg1 = (String) request.getAttribute("msg");
    if (msg1 == null) {
        msg1 = "";
    }
%>
 


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>online Help Desk</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
                <center> <h1>Help Desk</h1>
        
    
            <table >
  <tr>
      <td  bgcolor="#99CC33">
            <form id="form1" name="form1" method="get" action="Login">
              First Name&nbsp:&nbsp;<input type="text" name="user"><br/> <br/>
      password&nbsp:&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="pass"><br/>  <font color ="red" style="font-size:12px"><%= msg1%></font>
                                                   
       <div ALIGN="RIGHT">  <input type="submit" value="LOGIN" ></div> 
       Login Problems? <a href="viewQS.jsp">Click here</a>
            </form></td>
          
  </tr>
</table></center> 
           <table align="center" width="750">
  <tr>
      <td  bgcolor="#99CC33"><center><fieldset>
              <legend><b>ONLINE HELP DESK</b></legend>
                      This online help desk is a tool for requesting assistance 
                      with your computing questions and problems. Login to your 
                      account to submit a support incident or review the status of 
                      an existing incident.<BR>
      </fieldset></center>
      <fieldset>
          <legend>HELP</legend>
          <b>User Name =</b> Your Registered First name<br/>
          <b>Password =</b> Your Registered Password <br/><br/>
          <br/>
          ITS System Status: Alerts, Outage and news
          
      </fieldset></td>
  </tr>
</table>
</div>
          </body>
</html>
