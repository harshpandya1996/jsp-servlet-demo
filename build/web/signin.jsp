<%-- 
    Document   : login
    Created on : May 5, 2017, 12:16:32 AM
    Author     : Harsh Pandya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    
        
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | Flat Theme</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->
<body>
    <header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse    ">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp"><img src="images/logo.png" alt="logo"></a>
            </div>
           
        </div>
    </header><!--/header-->
         <section id="title" class="emerald">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <h1>Login</h1>
                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                </div>
                
            </div>
        </div>
    </section><!--/#title-->     

    <section id="registration" class="container">
        <form class="center" role="form" action="loginsubmit" method="get">
            <fieldset class="registration-form">
                <div class="form-group">
                    <input type="text" id="username" required="required" name="username" placeholder="Username" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" id="password" name="password" required="required" placeholder="Password" class="form-control">
                </div>
    

                <div class="form-group">
                    <input type="submit" value="Submit" button class="btn btn-success btn-md btn-block"></button>
                </div>
                <div>
                    <a href="registration.jsp"><h3><b>Sign Up</b></a></br>
                    <a href="forget.jsp"><b>    Forget Password</b></h3></a>
                </div>
            </fieldset>
            
        <%
            String message=request.getParameter("msg");
            if(message!=null)
            {
                out.println("<center>"+"<font size=5 color=red>"+message+"</font>"+"</center>");
            } 
        %>
    
        </form>
    </section><!--/#registration-->
        <jsp:include page="footer.html"></jsp:include>
    
    
    </body>
</html>
