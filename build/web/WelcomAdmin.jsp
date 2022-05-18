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
    </head>
    <body>
        <h1>Welcome Admin</h1>
        <%
          String name=(String)request.getAttribute("name");
        
        %>
        <p>
            welcome back mr <%=name%> please what do you wand to do
        </p>
        <ul>
            <li><a href="AddPackage.html">Add auto Detail Package</a></li>
            <li><a href="RemovePackage.html">Remove auto Detail Package</a></li>
            <li><a href="FindSpecifiquePackage.html">Find auto Detail Package</a></li>
            <li><a href="EditPacks.html">Edit auto Detail Package</a></li>
            <li><a href="FindAllCustomers.html">Find All Customers</a></li>
            <li><a href="FindSpecifiqueCustomer.html">Find customer</a></li>
            <li><a href="EditCustomer.html">Edit Customer</a></li>
            <li><a href="RemoveCustomer.html">Remove Customer</a></li>
        </ul>
    </body>
</html>
