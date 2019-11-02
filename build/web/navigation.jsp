<%@page import="model.Users"%>
<div align="right" >


    <%   
        String msg1 = (String) request.getAttribute("msg");
        if (msg1 == null) {
            msg1 = "";
        }
    %>

    <%!
        String userName, pass;
        int profileid;
        Cookie cookUser;
        Cookie cookProfileID;
        Cookie[] aCook;
        String userTemp;
        int acctId = 0;
        int userId = 0;
    %>
    <%
        userName = null;
        cookUser = null;
        cookProfileID = null;
        aCook = request.getCookies();

        if (aCook != null) {
            for (int x = 0; x < aCook.length; x++) {
                if (aCook[x].getName().equals("UserName")) {
                    cookUser = aCook[x];
                }

                if (aCook[x].getName().equals("profileID")) {
                    cookProfileID = aCook[x];
                }
            }
        }

        if (cookUser == null && cookProfileID == null) {
            userName = request.getParameter("Uname");
            pass = request.getParameter("pass");
        } else {
            userName = cookUser.getValue();
            acctId = Integer.parseInt(cookProfileID.getValue());
        }
        if (cookUser == null) {
            acctId = 0;
        }
    %>  

    <%
        if (acctId < 1) {
            response.sendRedirect("index.jsp");
        } else {

            int pos = userName.indexOf('@');
            Users u = new Users();
            userId = u.retreiveUserByUname(userName);
            out.println("Login as  " + userName);

        }

        if (acctId == 2) {
    %>

    <div align="right" id='cssmenu'>
        <ul  >
            <li ><a href='welcome.jsp'><span>Home</span></a></li>
            <li ><a><span>Users</span></a>
                <ul>
                    <li ><a href='addUser.jsp'><span>Add</span></a></li>
                    <li ><a href='viewUsers.jsp'><span>View</span></a></li>
                </ul>
            </li>
            <li ><a><span>Facilities</span></a>
                <ul>
                    <li ><a href='addFacility.jsp'><span>Add</span></a></li>
                    <li ><a href='viewFacilities.jsp'><span>View</span></a></li>
                </ul>
            </li>
            <li><a><span>Request</span></a>
                <ul>
                    <li ><a href='viewRequest.jsp'><span>View</span></a></li>
                </ul>
            </li>
            <li><a><span>Q&A</span></a>
                <ul>
                    <li ><a href='addQS.jsp'><span>Add</span></a></li>
                    <li ><a href='viewQS.jsp'><span>View</span></a></li>
                </ul>
            </li>
            <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>
            <li><a href='contactUs.jsp'>Contact Us</a></li>
            <li><a href='LogOut'>Logout</a></li>

        </ul>
    </div>
    <%
    } else if ((acctId == 3) || (acctId == 6)) {
    %>

    <div align="right" id='cssmenu'>
        <ul  >
            <li ><a href='welcome.jsp'><span>Home</span></a></li>
            <li ><a href='viewFacilities.jsp'><span>Facilities</span></a></li>
            <li ><a href='#'><span>Request</span></a>
                <ul>
                    <li ><a href='sendRequest.jsp'><span>Send Request</span></a></li>
                    <li ><a href='viewRequest.jsp'><span>View Requests</span></a></li>
                </ul>
            </li>
            <li><a href='viewQS.jsp'><span>Q&A</span></a></li>
            <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>
            <li><a href='contactUs.jsp'>Contact Us</a></li>
            <li><a href='LogOut'>Logout</a></li>
        </ul>
    </div>

    <%
    } else if (acctId == 4) {
    %>

    <div align="right" id='cssmenu'>
        <ul  >
            <li ><a href='welcome.jsp'><span>Home</span></a></li>
            <li ><a href='viewRequest.jsp'><span>Requests</span></a>
                <%-- <ul>
                    <li ><a href='fIrequest.jsp'><span>Incoming</span></a></li>
                    <li ><a href='fArequest.jsp'><span>Assigned</span></a></li>
                    <li ><a href='fWrequest.jsp'><span>Work in Progress</span></a></li>   
                    <li ><a href='fCrequest.jsp'><span>Closed</span></a></li>
                    <li ><a href='fRrequest.jsp'><span>rejected</span></a></li>
                </ul> --%>
            </li>
            <li><a href='viewQS.jsp'><span>Q&A</span></a></li>
            <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>
            <li><a href='contactUs.jsp'>Contact Us</a></li>
            <li><a href='LogOut'>Logout</a></li>
        </ul>

    </div>

    <%
    } else if (acctId == 5) {
    %>

    <div align="right" id='cssmenu'>
        <ul  >
            <li ><a href='welcome.jsp'><span>Home</span></a></li>
            <li ><a href='viewRequest.jsp'><span>Requests</span></a></li>
            <li><a href='viewQS.jsp'><span>Q&A</span></a></li>
            <li ><a href='changePassword.jsp'><span>Change Password</span></a></li>
            <li><a href='contactUs.jsp'>Contact Us</a></li>
            <li><a href='LogOut'>Logout</a></li>
        </ul>

    </div>
    <%
    } else if (acctId == 1) {
    %>

    <div align="right" id='cssmenu'>
        <ul  >
            <li ><a href='welcome.jsp'><span>Home</span></a></li>
            <li><a href='contactUs.jsp'>Contact Us</a></li>
            <li><a href='LogOut'>Logout</a></li>
        </ul>      
    </div>

    <%
        }

    %>               

</div>