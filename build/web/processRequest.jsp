<%-- 
    Document   : Welcome
    Created on : Dec 5, 2014, 3:45:25 PM
    Author     : Bukola
--%>

<%@page import="model.Requests"%>
<%@page import="model.Facilities"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <%@include file="header.jsp" %> 

    <script lang="javascript">
        function processStatus(){
            //alert(frm.status.value);
            var s = frm.status.value;
            
            if(s == "unassigned"){
                frm.assignee.disabled = true;
            }else
            if(s == "rejected"){
                frm.assignee.disabled = true;
            }else
            if(s == "assigned"){
                frm.assignee.disabled = false;
            }else
            if(s == "work in progress"){
                frm.assignee.disabled = true;
            }else
            if(s == "closed"){
                frm.assignee.disabled = false;
            }
        }
        
        function validate(){
            
            if(frm.assignee.disabled == false ){
            var s = frm.assignee.value;
            
            if(s == ""){
                alert("Please enter reason");
                return false;
            }
            return true;
        }
    }
        
        
    </script>
    <center><h1>Process Request</h1>
        <form name="frm"  action="ProcessRequestServlet" method="post">
            <table>
                <%!
                ResultSet rs;
                %>
                <%    
                    int reqId = Integer.parseInt(request.getParameter("requestId").trim());
                    
                    Requests req = new Requests();
                    
                    if(acctId == 4){
                    rs = req.retreiveAllRequestsByFacilityHeadByRequestId(userId, reqId);
                    }else
                    if(acctId == 5){
                    rs = req.retreiveAllRequestsByAssignedUserByRequestedId(userId, reqId);
                    }else
                    if((acctId == 3) || (acctId == 6)){
                    rs = req.retreiveAllRequestsByRequestorByRequestedId(userId, reqId);
                    }
                    
                    while (rs.next()) {
                %>

                <tr>
                    <td valign="top">
                        Request Id:
                    </td>
                    <td>
                        <input name="requestId" type="text" value="<%= reqId%>" disabled="disabled"><br/><br/>
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Facility Name:
                    </td>
                    <td><input name="facilityName" type="text" value="<%= rs.getString(1) %>" disabled="disabled"><br/><br/> 
                    </td>
                </tr><tr>
                    <td valign="top">
                        Requested By:
                    </td>
                    <td>
                        <% int pos = rs.getString(4).indexOf('@');%>
                        <input name="requestor" type="text" value="<%= rs.getString(4).substring(0, pos)%>" disabled="disabled"><br/><br/> 
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Severity Level:
                    </td>
                    <td><input name="sLevel" type="text" value="<%= rs.getString(6) %>" disabled="disabled"><br/><br/> 
                     </td>
                </tr>
                
<%
if(acctId == 4){
%>
<tr>
                    <td valign="top">
                        Status :
                    </td>
                    <td>
                        <select name="status" onchange="processStatus()"> 
                         <option value="unassigned">unassign</option>
                         <option value="rejected">reject</option>
                         <option value="assigned">assign</option>
                        </select>  <br/><br/> 
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Assign To :
                    </td>
                    <td>
                        <select name="assignee" disabled="disabled"> 
                            
                            <%-- <option value="1">unassign</option> --%>
                    <%    
                    Users u = new Users();
                    ResultSet r = u.retreiveAssigneeUsers();
                    
                    while (r.next()) {
                    %> 
                         <% 
                           int p = r.getString(2).indexOf('@');%>
                         <option value="<%=r.getInt(1)%>"><%= r.getString(2).substring(0, p)%></option>
                            <%
                                }%>
                        </select>  <br/><br/> 
                    </td>
                </tr>
<%
}else if(acctId == 5){
%>
<tr>
                    <td valign="top">
                        Status :
                    </td>
                    <td>
                        <select name="status" onchange="processStatus()"> 
                         <option value="work in progress">work in progress</option>
                         <option value="closed">close</option>
                        </select>  <br/><br/> 
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Reason :
                    </td>
                    <td>
                        <textarea name="assignee" disabled="disabled"></textarea>
                        <br/><br/> 
                    </td>
                </tr>
<%
}
else if((acctId == 3) || (acctId == 6)){
%>
<tr>
                    <td valign="top">
                        Status :
                    </td>
                    <td>
                        <select name="status"> 
                         <option value="closed">close</option>
                        </select>  <br/><br/> 
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Reason :
                    </td>
                    <td>
                        <textarea name="assignee"></textarea>
                        <br/><br/> 
                    </td>
                </tr>
<%
}
%>
                <tr>
                    <td>
                        <input type="submit" value="Submit" onclick="return validate()">
                    </td>
                </tr>
                <tr>
                    <td>

                    </td>
                    <td>
                        <input name="requestId" type="hidden" value="<%= reqId%>"><br/><br/>
                    </td>
                </tr>
                <tr>
                    <td>

                    </td>
                    <td>
                        <input name="acctId" type="hidden" value="<%= acctId %>"><br/><br/>
                    </td>
                </tr>  
                <tr>
                    <td>

                    </td>
                    <td>
                        <input name="requestor" type="hidden" value="<%= rs.getString(4) %>"><br/><br/>
                    </td>
                </tr>
                <%
                     }
                %>
                
            </table>
        </form>
    </center>
    <%@include file="footer.jsp" %>     
</body>
</html>
