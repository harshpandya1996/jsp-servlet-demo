<%-- 
    Document   : contact-us
    Created on : May 4, 2017, 8:27:30 PM
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
                    <h1>Contact Us</h1>
                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                </div>
                <div class="col-sm-6">
                    <ul class="breadcrumb pull-right">
                        <li><a href="index.html">Home</a></li>
                        <li class="active">Contact Us</li>
                    </ul>
                </div>
            </div>
        </div>
    </section><!--/#title-->    

    <section id="contact-page" class="container">
        <div class="row">
            <div class="col-sm-8">
                <h4>Contact Form</h4>
                <div class="status alert alert-success" style="display: none"></div>
                <form   class="center" method="post" action="contactsubmit" role="form">
                    <div class="row">
                        <div class="col-sm-5">
                            <div class="form-group">
                                <input type="text" class="form-control" name="firstname" required="required" placeholder="First Name">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="lastname" required="required" placeholder="Last Name">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="email" required="required" placeholder="Email address">
                            </div>
                            <div class="form-group">
                            <textarea name="message" id="message" required="required" class="form-control" rows="8" placeholder="Message"></textarea>
                            </div>
                            <div class="form-group">
                                <input type="submit" value="Send Message"/>
                            </div>
                        </div>
                        
                    </div>
                </form>
            </div><!--/.col-sm-8-->
            <div class="col-sm-4">
                <h4>Our Location</h4>
                <iframe src="https://www.google.co.in/maps/place/LDRP+Institute+of+Technology+and+Research/@23.2392267,72.6363875,17z/data=!4m12!1m6!3m5!1s0x395c2b933477ba9f:0xe440409e66bea08a!2sLDRP+Institute+of+Technology+and+Research!8m2!3d23.2392218!4d72.6385762!3m4!1s0x395c2b933477ba9f:0xe440409e66bea08a!8m2!3d23.2392218!4d72.6385762" width="100%" height="215" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" style="border:0" allowfullscreen></iframe>
           </div><!--/.col-sm-4-->
        </div>
    </section><!--/#contact-page-->
        <jsp:include page="footer.html"></jsp:include>

    </body>
</html>
