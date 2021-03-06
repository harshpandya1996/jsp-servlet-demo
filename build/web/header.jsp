<%-- 
    Document   : header
    Created on : May 10, 2017, 7:13:58 PM
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
    <
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
<style>
    #xxx
    {
        width: 50px;
        height: 50px;
        border-radius: 100px;
        background: blue;
    }
    #yyy
    {
        width: 100%;
        text-align: center;
        color: white;
        font-size: 36px;
        line-height: 45px;
    }
</style>
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
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="index.jsp">Home</a></li>
                        
                    <li><a href="about-us.jsp">About Us</a></li>
                    <li><a href="services.jsp">Services</a></li>
                    
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages <i class="icon-angle-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href="career.jsp">Career</a></li>
                            <li><a href="blog-item.jsp">Blog Single</a></li>
                            <li><a href="pricing.jsp">Pricing</a></li>
                            <li><a href="blog.jsp">Blog</a></li>
                            <li><a href="portfolio.jsp">Portfolio</a></li>
                            <li class="divider"></li>
                            <li><a href="privacy.jsp">Privacy Policy</a></li>
                            <li><a href="terms.jsp">Terms of Use</a></li>
                        </ul>
                    </li>
                     
                    <li><a href="contact-us.jsp">Contact</a></li>
                    
                    
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                             <div id="xxx">
                             <div id="yyy">
                        <%
                            String name=session.getAttribute("Vr").toString();
                            char inti=name.charAt(0);
                            out.println(inti);
                        %>
                            </div>
                        </div>
                            <i class="icon-angle-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href="change.jsp">Change Password</a></li>
                            <li><a href="edit-profile.jsp">Edit Profile</a></li>
                            <li><a href="logout.jsp">LogOut</a></li>
                        
                       
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </header><!--/header-->
</body>
</html>