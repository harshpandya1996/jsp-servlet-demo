<%-- 
    Document   : change
    Created on : May 5, 2017, 12:47:54 AM
    Author     : Harsh Pandya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <jsp:include page="header.jsp"></jsp:include>
         <section id="title" class="emerald">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <h1>Change Password</h1>
                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                </div>
                <div class="col-sm-6">
                    <ul class="breadcrumb pull-right">
                        <li><a href="index.jsp">Home</a></li>

                        <li class="active">Change Password</li>
                        
                    </ul>
                </div>
            </div>
        </div>
    </section><!--/#title-->     

    <section id="registration" class="container">
        <form class="center" role="form" action="changesubmit" method="get">
            <fieldset class="registration-form">
                <div class="form-group">
                    <input type="password" id="password" name="oldpassword" required="required" placeholder="Old Password" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" id="password" name="newpassword" required="required" placeholder="New Password" class="form-control">
                </div>
    

                <div class="form-group">
                    <input type="submit" value="Submit" button class="btn btn-success btn-md btn-block"></button>
                </div>
               
            </fieldset>
        </form>
    </section><!--/#registration-->
    <%
            String message=request.getParameter("msg");
            if(message!=null)
            {
                out.println("<center>"+"<font size=5 color=red>"+message+"</font>"+"</center>");
            }
        %>
        

        <jsp:include page="footer.html"></jsp:include>
    
    
    </body>
</html>
