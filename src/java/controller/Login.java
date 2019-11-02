/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Users;

/**
 *
 * @author Bukola
 */
public class Login extends HttpServlet {

    Cookie cookuser = null;
    Cookie cookAcctTypeID = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String UName = request.getParameter("user");
            String PWord = request.getParameter("pass");
            Users df = new Users();

            int acctTypeId = df.login(UName, PWord);
            if (acctTypeId > 0) {
                HttpSession session = request.getSession(true);
                //session.setMaxInactiveInterval(-1);
                cookuser = new Cookie("UserName", UName);
                cookAcctTypeID = new Cookie("profileID", Integer.toString(acctTypeId));
                response.addCookie(cookuser);
                response.addCookie(cookAcctTypeID);
                session.setAttribute("Uname", UName);
                session.setAttribute("AccTypeID", acctTypeId);
                response.sendRedirect(request.getContextPath() + "/welcome.jsp");

                //out.println("success");
            } else {
                out.print("<script language = 'javascript'> alert('Invalid Username or Password') </script>");
                request.setAttribute("msg", "Invalid Login Details. <br />See Admin");
                getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
