/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websiteservlet;

import Storage.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Harsh Pandya
 */
public class editeprofilesubmit extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet editeprofilesubmit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet editeprofilesubmit at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
              String unm,em,con,msg=" ";
    
    
            unm=request.getParameter("username");
            em=request.getParameter("email");
            con=request.getParameter("contact");
      
            HttpSession session=request.getSession();
    
    
    
    try
    {
         Data dt=new Data();
         dt.st=dt.cn.createStatement();
         String update="update website set username='"+unm+"',email='"+em+"',contact="+Long.parseLong(con)+" where REGID="+Integer.parseInt(session.getAttribute("XYZ").toString())+" ";
         dt.st.executeUpdate(update);
         
         
        msg="Profile Updated";
        response.sendRedirect("edit-profile.jsp?msg="+msg);
    
    
    
    }
    catch(Exception ex)
    {
        out.println(ex);
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
