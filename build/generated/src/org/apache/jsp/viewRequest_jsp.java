package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Requests;
import model.Users;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import model.Users;

public final class viewRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        int acctId, userId;
    
                    
                    ResultSet r;
                    ArrayList <String> list;
                
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/navigation.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"menu.css\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
    
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Expires", "0");
    response.setDateHeader("Expires", -1);

      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"menu.css\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <table  width=\"90%\" align=\"center\" >\n");
      out.write("        <tr>\n");
      out.write("            <td bgcolor =\"#99CC33\" >\n");
      out.write("                <div align=\"left\">\n");
      out.write("                    <img src=\"logo.jpg\" width=\"100\" height=\"100\" alt=\"logo\" />\n");
      out.write("                    <div align=\"right\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        String userName = (String) request.getSession(true).getAttribute("Uname");
                        if ("" == userName) {
                            response.sendRedirect("index.jsp");
                        }
                    
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("<div align=\"right\" >\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        acctId = Integer.parseInt((request.getSession().getAttribute("AccTypeID")).toString());

        //String text = request.getParameter("hide");
        if (request.getSession(true).getMaxInactiveInterval() < 1) {
            response.sendRedirect("index.jsp");
        } else {

            String user = (String) request.getSession().getAttribute("Uname");
            int pos = user.indexOf('@');
            //out.println("welcome  " + user.substring(0, pos));
            Users u = new Users();
            userId = u.retreiveUserByUname(user);
            out.println("Login as  " + user);

        }

        if (acctId == 2) {
    
      out.write("\n");
      out.write("\n");
      out.write("    <div align=\"right\" id='cssmenu'>\n");
      out.write("        <ul  >\n");
      out.write("            <li ><a href='welcome.jsp'><span>Home</span></a></li>\n");
      out.write("            <li ><a><span>Users</span></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li ><a href='addUser.jsp'><span>Add</span></a></li>\n");
      out.write("                    <li ><a href='viewUsers.jsp'><span>View</span></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li ><a><span>Facilities</span></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li ><a href='addFacility.jsp'><span>Add</span></a></li>\n");
      out.write("                    <li ><a href='viewFacilities.jsp'><span>View</span></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a><span>Request</span></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li ><a href='viewRequest.jsp'><span>View</span></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a><span>Q&A</span></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li ><a href='addQS.jsp'><span>Add</span></a></li>\n");
      out.write("                    <li ><a href='viewQS.jsp'><span>View</span></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>   \n");
      out.write("            <li><a href='LogOut'>Logout</a></li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    ");

    } else if (acctId == 3) {
    
      out.write("\n");
      out.write("\n");
      out.write("    <div align=\"right\" id='cssmenu'>\n");
      out.write("        <ul  >\n");
      out.write("            <li ><a href='welcome.jsp'><span>Home</span></a></li>\n");
      out.write("            <li ><a href='viewFacilities.jsp'><span>Facilities</span></a></li>\n");
      out.write("            <li ><a href='#'><span>Request</span></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li ><a href='sendRequest.jsp'><span>Send Request</span></a></li>\n");
      out.write("                    <li ><a href='viewRequest.jsp'><span>View Requests</span></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href='viewQS.jsp'><span>Q&A</span></a></li>\n");
      out.write("            <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>\n");
      out.write("            <li><a href='LogOut'>Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

    } else if (acctId == 4) {
    
      out.write("\n");
      out.write("\n");
      out.write("    <div align=\"right\" id='cssmenu'>\n");
      out.write("        <ul  >\n");
      out.write("            <li ><a href='welcome.jsp'><span>Home</span></a></li>\n");
      out.write("            <li ><a href='viewRequest.jsp'><span>Requests</span></a>\n");
      out.write("                ");
      out.write("\n");
      out.write("            </li>\n");
      out.write("            <li><a href='viewQS.jsp'><span>Q&A</span></a></li>\n");
      out.write("            <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>\n");
      out.write("            <li><a href='LogOut'>Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

    } else if (acctId == 5) {
    
      out.write("\n");
      out.write("\n");
      out.write("    <div align=\"right\" id='cssmenu'>\n");
      out.write("        <ul  >\n");
      out.write("            <li ><a href='welcome.jsp'><span>Home</span></a></li>\n");
      out.write("            <li ><a href='viewRequest.jsp'><span>Requests</span></a></li>\n");
      out.write("            <li><a href='viewQS.jsp'><span>Q&A</span></a></li>\n");
      out.write("            <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>\n");
      out.write("            <li><a href='LogOut'>Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    ");

    } else if (acctId == 6) {
    
      out.write("\n");
      out.write("\n");
      out.write("    <div align=\"right\" id='cssmenu'>\n");
      out.write("        <ul  >\n");
      out.write("            <li ><a href='welcome.jsp'><span>Home</span></a></li>\n");
      out.write("            <li ><a href='viewFacilities.jsp'><span>Facilities</span></a></li>\n");
      out.write("            <li ><a href='viewRequest.jsp'><span>Requests</span></a></li>\n");
      out.write("            <li><a href='viewQS.jsp'><span>Q&A</span></a></li>\n");
      out.write("            <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>\n");
      out.write("            <li><a href='LogOut'>Logout</a></li>\n");
      out.write("        </ul>      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

        }


    
      out.write("               \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("    <center> <h1>Student Requests </h1>\n");
      out.write("\n");
      out.write("        <table width=\"95%\" align=\"center\" border=\"0\">\n");
      out.write("\n");
      out.write("            <tr bgcolor=\"lightgrey\">\n");
      out.write("                <th width=\"3%\"> SrNo</th>\n");
      out.write("                <th width=\"8%\"> Facility Name</th>\n");
      out.write("                <th width=\"6%\"> Requestor</th>\n");
      out.write("                <th width=\"6%\"> Assignee </th>\n");
      out.write("                <th width=\"6%\"> Severity Level </th>\n");
      out.write("                <th width=\"7%\"> Status</th>\n");
      out.write("                <th width=\"6%\"> Status Closed Reason </th>\n");
      out.write("                <th width=\"15%\"> Request Date / Time</th>\n");
      out.write("                <th width=\"20%\"> Remarks</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
                    Requests req = new Requests();

                    if (acctId == 2) {
                        r = req.retreiveAllRequests();
                    } else if (acctId == 3) {
                        r = req.retreiveAllRequestsByRequestedUser(userId);
                        list = new ArrayList();
                    } else if (acctId == 4) {
                        r = req.retreiveAllRequestsByFacilityHead(userId);
                    } else if (acctId == 5) {
                        r = req.retreiveAllRequestsByAssignedUser(userId);
                    }else if (acctId == 6) {
                        r = req.retreiveAllRequestsByRequestedUser(userId);
                    }

                    int cnt = 1;

                    while (r.next()) {
                
      out.write("\n");
      out.write("                <td>");
      out.print( cnt++);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print( r.getString(1));
      out.write(" </td>\n");
      out.write("                <td>");
 int pos = r.getString(2).indexOf('@');
      out.write("\n");
      out.write("                    ");
      out.print( r.getString(2).substring(0, pos));
      out.write(" </td>\n");
      out.write("                <td>");
 int pos2 = r.getString(3).indexOf('@');
      out.write("\n");
      out.write("                    ");
      out.print( r.getString(3).substring(0, pos2));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print( r.getString(4));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print( r.getString(5));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print( r.getString(6));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print( r.getString(7));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print( r.getString(8));
      out.write(" </td>\n");
      out.write("                ");
 if((r.getString(5).equalsIgnoreCase("unassigned") && (acctId == 4 )) || (r.getString(5).equalsIgnoreCase("assigned") && (acctId == 5 ))) {
      out.write("\n");
      out.write("                <td><a href=\"processRequest.jsp?userId=");
      out.print( r.getInt(9));
      out.write("\" style=\"text-decoration: none\">  process request </a></td>\n");
      out.write("             ");
}
                else if (r.getString(5).equalsIgnoreCase("work in progress") && (acctId == 5 )){
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("    ");
      out.write("\n");
      out.write("         <table  width=\"90%\" align=\"center\" >\n");
      out.write("             <tr> <td>\n");
      out.write("                <div>\n");
      out.write("                  \n");
      out.write("                  <br />\n");
      out.write("                  <br />\n");
      out.write("                  \n");
      out.write("                 <br />\n");
      out.write("                  <br /><br />\n");
      out.write("                  <br /><br />\n");
      out.write("                  <br /><br />\n");
      out.write("                  <br />\n");
      out.write("              </div>\n");
      out.write("        </td>\n");
      out.write("            </tr>\n");
      out.write("             \n");
      out.write("            <tr><div>\n");
      out.write("                <td bgcolor =\"#99CC33\">\n");
      out.write("                        \n");
      out.write("              </div>\n");
      out.write("        </td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                \n");
      out.write("                 <td> \n");
      out.write("                     <div style=\"text-align: center\">Copyright &copy; 2014 Help Desk. All Rights Reserved </div>\n");
      out.write("             \n");
      out.write("        </td>\n");
      out.write("             \n");
      out.write("        </table>");
      out.write("     \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
