package websiteservlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class changesubmit extends HttpServlet {

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
            out.println("<title>Servlet changesubmit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet changesubmit at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            String oldpwd,newpwd,msg="";
    Data dt=new Data();
    oldpwd=request.getParameter("oldpassword");
    newpwd=request.getParameter("newpassword");
    
    HttpSession session=request.getSession();
    
   // out.println(oldpwd);
    
    
try
{
    String p1=session.getAttribute("Modi").toString();
    
    if(oldpwd.equals(p1))
    {
         dt.st=dt.cn.createStatement();
         String update="update website set password='"+newpwd+"' where REGID="+Integer.parseInt(session.getAttribute("XYZ").toString())+" ";
         dt.st.executeUpdate(update);
         msg="Password Changed";
        response.sendRedirect("change.jsp?msg="+msg);
    }
    else
    {
        msg="Incorrect Password";
        response.sendRedirect("change.jsp?msg="+msg);
    }
}
catch(      SQLException | NumberFormatException | IOException ex)
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
