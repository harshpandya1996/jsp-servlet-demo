<%-- 
    Document   : registration
    Created on : May 4, 2017, 8:14:13 PM
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
    <script>
        function validate()
        {
            var x=document.form1.password.value;
            var y=document.form1.password_confirm.value;
            
            if(x!==y)
            {
                alert("ReEnter the password");
                return false;
            }
        }
        
    </script>


         <section id="title" class="emerald">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <h1>Registration</h1>
                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                </div>
                
            </div>
        </div>
    </section><!--/#title-->     

    <section id="registration" class="container">
        <form class="center" role="form" name="form1" action="registrationsubmit" method="get" onsubmit="return validate();">
            <fieldset class="registration-form">
                <div class="form-group">
                    <input type="text" id="username" name="username" required="required" placeholder="Username" class="form-control">
                </div>
                <div class="form-group">
                    <input type="email" id="email" name="email" required="required" placeholder="E-mail" class="form-control">
                </div>
                <div class="form-group">
                    <input type="text" id="number" name="contact" maxlength="12" required="required" placeholder="Contact Number" class="form-control">
                </div>

                <div class="form-group">
                    <input type="password" id="password" name="password" required="required" placeholder="Password" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" id="password_confirm" name="password_confirm" required="required" placeholder="Password (Confirm)" class="form-control">
                </div>
                <div class="form-group">
                    <input type="submit" value="Register" button class="btn btn-success btn-md btn-block"></button>
                </div>
                
            </fieldset>
        </form>
    </section><!--/#registration-->
        <jsp:include page="footer.html"></jsp:include>
      </body>
</html>
