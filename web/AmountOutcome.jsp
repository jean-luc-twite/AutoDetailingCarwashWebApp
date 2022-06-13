<%-- 
    Document   : AmountOutcome
    Created on : May 5, 2022, 2:28:28 PM
    Author     : Proline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Amount Due Page</title>
    </head>
    <body>
         <link rel="stylesheet"  href="AmountStyle.css"/>
    </head>
<body>
<!--    <div class="main">
         
        <div class="navbar">
           
            <div class="navbar"> 
                
                <nav>
                    <label class="logo">Code of Duty</label>
               <ul>
                   <li><a href="#">Home</a></li>
                   <li><a href="#">Video</a></li>
                   <li><a href="booking.html">Services</a></li>
                    <li><a href="">Work</a></li>
               </ul>
                </nav>
            </div>
                
        </div>-->
<div class="container">
           <%
               Integer cnt=(Integer)session.getAttribute("cnt");
               Double amountDue=(Double)session.getAttribute("amountDue");
           %>
           <p> 
           </p>
    <form  action="paymentServlet.do"  method="GET">
         <h1>Service<%=cnt%></h1>
        <table>
            <tr>
                <td>Amount Due is :</td>
                <td><%="R"+amountDue%></td>
            </tr>
            <tr>
                <td></td>
                <td><input class ="button"type="submit" value="MAKE PAYMENT"/></td>
            </tr>
        </table>
    </form>
                   
            
        </div>
 
    </body>
</html>
