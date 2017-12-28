package websiteservlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Storage.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Harsh Pandya
 */
public class forgetsubmit extends HttpServlet {

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
            out.println("<title>Servlet forgetsubmit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet forgetsubmit at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
               String userna,emailId,phone,pd="",msg="";
        Data dt=new Data();
        userna=request.getParameter("username");
        emailId=request.getParameter("email");
        phone=request.getParameter("contact");
        boolean flag=false;

    try
    {
        dt.st=dt.cn.createStatement();
        String Select="select regid,email,contact,password,username from website";
        dt.rs=dt.st.executeQuery(Select);
        
        String from="vrajalmodi007@gmail.com";
        final String user="vrajalmodi007@gmail.com";//change accordingly
        final String pwd="vrajal@123";//change accordingly
  
 

        while(dt.rs.next())
        {
            String us=dt.rs.getString("username");
            String em=dt.rs.getString("email");
            String phn=dt.rs.getString("contact");
            int regID=dt.rs.getInt("regid");
            pd=dt.rs.getString("password");

            if(emailId.equals(em) && phone.equals(phn) && userna.equals(us))
                    {
                        flag=true;
                        
                       // System.out.println("Your Password:"+pwd);
                       
                       // out.println(pd);
                       String host="smtp.gmail.com";
                        Properties props = new Properties();
                         props.put("mail.smtp.host",host);
                         props.put("mail.smtp.auth", "true");
                         props.put("mail.smtp.starttls.enable","true");
                         props.put("mail.smtp.port","587");
                         
                         Session session = Session.getInstance(props,
	      new javax.mail.Authenticator() {
	         protected PasswordAuthentication getPasswordAuthentication() {
                     String username;
	            return new PasswordAuthentication(user, pwd);
	         }
	      });

 

                   
	      try {
	         // Create a default MimeMessage object.
                
                  Message message = new MimeMessage(session);
                // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));
	         // Set To: header field of the header.
	         message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(emailId));
	         // Set Subject: header field
	         message.setSubject("Your New Password..");
                            

	         // Now set the actual message
	         message.setText(pd);
                // System.out.println("3");
	         // Send message

                 Transport.send(message);
	          msg="Check Your Mail..";
                 response.sendRedirect("forget.jsp?msg="+msg);

	      } catch (MessagingException e) {
	            throw new RuntimeException(e);
	      } 
                response.sendRedirect("forget.jsp");  
                //out.println("Your PassWord :" +password);
            }
          }
             if(flag == false){
           String error="Wrong mobile username or number or email id..!!";
           response.sendRedirect("forget.jsp?error="+error);  
          }  
             
    }
    catch(Exception e){
        out.println(e);
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
