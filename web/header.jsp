<%    
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Expires", "0");
    response.setDateHeader("Expires", -1);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Help Desk</title>
             
<link rel="stylesheet" type="text/css" href="menu.css" />

</head>
<body>
    <table  width="90%" align="center" bgcolor ="#99CC33">
    
        <tr>
    <td width="16%"><img src="logo.jpg" width="100" height="100" alt="logo" /></td>
    <td width="64%"><div align="center" style="font-size:56px">Online Help Desk</div></td>
    <td width="20%"></td>
  </tr>
  <tr>
    <td colspan="3"><%@include file="navigation.jsp" %></td>
  </tr>
    </table>
                



