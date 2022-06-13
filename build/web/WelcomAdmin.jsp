<%-- 
    Document   : WelcomAdmin
    Created on : May 2, 2022, 7:36:59 PM
    Author     : Proline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Admin Page</title>
        <link rel="stylesheet"  href="welcomStyle.css">
    </head>
    <body>
        <div class ="main">
        <h1>Welcome Admin</h1>
        <%
          String name=(String)request.getAttribute("name");
        
        %>
        <p>
            welcome back mr <%=name%> please what do you wand to do
        </p>
        <div class="navbar">
        <ul>
            <li id="btn1"><a href="AddPackage.html">Add auto Detail Package</a></li>
            <li id="btn2"><a href="RemovePackage.html">Remove auto Detail Package</a></li>
            <li id="btn3"><a href="FindSpecifiquePackage.html">Find auto Detail Package</a></li>
            <li id="btn4"><a href="EditPacks.html">Edit auto Detail Package</a></li>
            <li id="btn5"><a href="FindAllCustomers.html">Find All Customers</a></li>
            <li id="btn6"><a href="FindSpecifiqueCustomer.html">Find customer</a></li>
            <li id="btn7"><a href="EditCustomer.html">Edit Customer</a></li>
            <li id="btn8"><a href="RemoveCustomer.html">Remove Customer</a></li>
            <li id="btn9"><a href="AddAccount.html">Add account</a></li>
        </ul>
        </div>
        </div>
    </body>
</html>
