<%-- 
    Document   : edit-profile
    Created on : May 8, 2017, 8:22:59 PM
    Author     : Harsh Pandya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Storage.Data"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String un="",cont="",mail="";
            
            try{
                    Data dt=new Data();
                    dt.st=dt.cn.createStatement();
                    String Select="select username,email,contact from website where REGID="+Long.parseLong(session.getAttribute("XYZ").toString())+" ";
                    dt.rs=dt.st.executeQuery(Select);
                    
                    while(dt.rs.next())
                    {
                        un=dt.rs.getString("username");
                        mail=dt.rs.getString("email");
                        cont=dt.rs.getString("contact");
                    }
            }
            catch(Exception e)
            {
                out.println(e);
            }
        %>
        <jsp:include page="header.jsp"></jsp:include>
         <section id="title" class="emerald">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <h1>Edit Profile</h1>
                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                </div>
                <div class="col-sm-6">
                    <ul class="breadcrumb pull-right">
                        <li><a href="index.jsp">Home</a></li>

                        <li class="active">Edit Profile</li>
                        
                    </ul>
                </div>
            </div>
        </div>
    </section><!--/#title-->     

    <section id="registration" class="container">
        <form class="center" role="form" action="editeprofilesubmit" method="get">
            <fieldset class="registration-form">
                <div class="form-group">
                    <input type="text" id="username" name="username" required="required" value="<%=un%>" class="form-control">
                </div>
                <div class="form-group">
                    <input type="text" id="email" name="email" required="required" value="<%=mail%>" class="form-control">
                </div>
                <div class="form-group">
                    <input type="text" id="number" name="contact"  required="required" value="<%=cont%>" class="form-control">
                </div>
   

                <div class="form-group">
                    <input type="submit" value="Submit" button class="btn btn-success btn-md btn-block"></button>
                </div>
               
            </fieldset>
        </form>
        <%
            String message=request.getParameter("msg");
            if(message!=null)
            {
                out.println("<center>"+"<font size=5 color=red>"+message+"</font>"+"</center>");
            }
        %>
    </section><!--/#registration-->

        <jsp:include page="footer.html"></jsp:include>
    </body>
</html>
