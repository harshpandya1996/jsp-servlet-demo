package websiteservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Storage.Data;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Harsh Pandya
 */
public class registrationsubmit extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registrationsubmit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registrationsubmit at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            String uname,email,con,pass;
            
            uname=request.getParameter("username");
            email=request.getParameter("email");
            con=request.getParameter("contact");
            pass=request.getParameter("password");
            
            try
            {
                out.print("hi1");
                Data dt=new Data();
                out.print("hi2");
                dt.st = dt.cn.createStatement();
                out.print("hi3");
                String insert="insert into website(regid,username,email,contact,password) values(websiteseq.nextval,'"+uname+"','"+email+"',"+Long.parseLong(con)+",'"+pass+"')";
                out.print("hi4");
                dt.st.executeUpdate(insert);
                out.print("hi5");
                response.sendRedirect("login.jsp");
                out.print("hi6");
                
            }
            catch(SQLException | NumberFormatException | IOException ex)
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(registrationsubmit.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(registrationsubmit.class.getName()).log(Level.SEVERE, null, ex);
        }
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
