/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Users;

/**
 *
 * @author Bukola
 */
public class ChangePassword extends HttpServlet {

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
            
            
             String uName = (String) request.getSession(true).getAttribute("Uname");
             
           String OldPassword = request.getParameter("OldPassword");
         String Newpass = request.getParameter("newpassword");
          String conpass = request.getParameter("conpassword");
         Users PWD = new Users();
         Users NewPW = new Users();
         if(PWD.confirmpassword(uName, OldPassword)){
             /*
             out.println(Newpass);
             out.println("<br />");
             out.println(string);
             */
             
             if(NewPW.changepassword(Newpass, uName)){
                 out.println("PASSWORD CHANGED SUCCESSFULLY!!!!");
                 if(Newpass != conpass){
                     out.println("Your new password does not match ");
                     out.println("<a href='changePassword.jsp'>click here</a> to try again");
                 }
             }else{
                 out.println("try again!!!!!!");
                out.println("<a href='changePassword.jsp'>click here</a> to try again");
             
             }
                
         }else{
             out.println("ERROR !! <br/>  Your old password is not corrrect!!");
             out.println("<a href='changePassword.jsp'>click here</a> to try again");
             
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
