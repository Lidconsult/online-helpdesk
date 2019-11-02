package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div align=\"right\" >\n");
      out.write("   \n");
      out.write("        ");

            int acctId = Integer.parseInt((request.getSession().getAttribute("AccTypeID")).toString());

            //String text = request.getParameter("hide");
            if (request.getSession(true).getMaxInactiveInterval() < 1) {
                response.sendRedirect("index.jsp");
            } else {
                String user = (String) request.getSession().getAttribute("Uname");
                int pos = user.indexOf('@');
                //out.println("welcome  " + user.substring(0, pos));
                out.println("Login as  " + user + "<div class='cover'>    <a href='LogOut' style='color: black; text-decoration: none'>logout</a>");
            }

            if (acctId == 1) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <div align=\"right\" id='cssmenu'>\n");
      out.write("            <ul  >\n");
      out.write("                <li ><a href='welcome.jsp'><span>Home</span></a></li>\n");
      out.write("                <li ><a><span>Users</span></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li ><a href='addUser.jsp'><span>Add</span></a></li>\n");
      out.write("                        <li ><a href='viewUsers.jsp'><span>View</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li ><a><span>Facilities</span></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li ><a href='addFacility.jsp'><span>Add</span></a></li>\n");
      out.write("                        <li ><a href='viewFacilities.jsp'><span>View</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a><span>Request</span></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li ><a href='viewRequest.jsp'><span>View</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a><span>Q&A</span></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li ><a href='addQS.jsp'><span>Add</span></a></li>\n");
      out.write("                        <li ><a href='viewQS.jsp'><span>View</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");

        } else if (acctId == 2) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <div align=\"right\" id='cssmenu'>\n");
      out.write("            <ul  >\n");
      out.write("                <li ><a href='welcome.jsp'><span>Home</span></a></li>\n");
      out.write("                <li ><a href='facilities.jsp'><span>Facilities</span></a></li>\n");
      out.write("                <li ><a href='#'><span>Request</span></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li ><a href='sendRequest.jsp'><span>Send Request</span></a></li>\n");
      out.write("                        <li ><a href='viewRequest.jsp'><span>View Requests</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href='questionAndAnswer.jsp'><span>Q&A</span></a></li>\n");
      out.write("                <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

        } else if (acctId == 3) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <div align=\"right\" id='cssmenu'>\n");
      out.write("            <ul  >\n");
      out.write("                <li ><a href='welcome.jsp'><span>Home</span></a></li>\n");
      out.write("                <li ><a href='#'><span>Requests</span></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li ><a href='fIrequest.jsp'><span>Incoming</span></a></li>\n");
      out.write("                        <li ><a href='fArequest.jsp'><span>Assigned</span></a></li>\n");
      out.write("                        <li ><a href='fWrequest.jsp'><span>Work in Progress</span></a></li>   \n");
      out.write("                        <li ><a href='fCrequest.jsp'><span>Closed</span></a></li>\n");
      out.write("                        <li ><a href='fRrequest.jsp'><span>rejected</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href='questionAndAnswer.jsp'><span>Q&A</span></a></li>\n");
      out.write("                <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

        } else if (acctId == 4) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <div align=\"right\" id='cssmenu'>\n");
      out.write("            <ul  >\n");
      out.write("                <li ><a href='welcome.jsp'><span>Home</span></a></li>\n");
      out.write("                <li ><a href='request.jsp'><span>Requests</span></a></li>\n");
      out.write("                <li><a href='questionAndAnswer.jsp'><span>Q&A</span></a></li>\n");
      out.write("                <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");

        } else if (acctId == 5) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <div align=\"right\" id='cssmenu'>\n");
      out.write("            <ul  >\n");
      out.write("                <li ><a href='welcome.jsp'><span>Home</span></a></li>\n");
      out.write("                <li ><a href='facilities.jsp'><span>Facilities</span></a></li>\n");
      out.write("                <li ><a href='request.jsp'><span>Requests</span></a></li>\n");
      out.write("                <li><a href='questionAndAnswer.jsp'><span>Q&A</span></a></li>\n");
      out.write("                <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>\n");
      out.write("            </ul>      \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

            }


        
      out.write("               \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>");
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
