package websiteservlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import Storage.Data;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Harsh Pandya
 */
public class loginsubmit extends HttpServlet {

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
            out.println("<title>Servlet loginsubmit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginsubmit at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            
            String usern,pwd,msg="";
            
            usern=request.getParameter("username");
            pwd=request.getParameter("password");
            
            boolean flag=false;
            HttpSession session=request.getSession();
            
           // out.println(usern);
            
            try
            {
                Data dt=new Data();
                dt.st=dt.cn.createStatement();
                String Select="select regid,username,password from website";
                dt.rs=dt.st.executeQuery(Select);
                
                while(dt.rs.next())
                {
                    String us=dt.rs.getString("username");
                    String ps=dt.rs.getString("password");
                    int regID=dt.rs.getInt("regid");
                    
                    if(usern.equals(us) && pwd.equals(ps))
                    {
                       flag=true;
                       session.setAttribute("Vr",us);
                       session.setAttribute("Modi",ps);
                       session.setAttribute("XYZ",regID);
                       response.sendRedirect("index.jsp");
                       
                    }
                }
                if(flag!=true)
                {
                    msg="Invalid username or password";
                    response.sendRedirect("login.jsp?msg="+msg);
                    
                }
            }
            catch(SQLException | IOException e)
            {
                
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
