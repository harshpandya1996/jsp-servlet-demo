<%-- 
    Document   : logout
    Created on : Dec 28, 2017, 11:24:42 AM
    Author     : Harsh Pandya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
      session.invalidate();
      response.sendRedirect("signin.jsp");
%>
