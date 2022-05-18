<%-- 
    Document   : foundPackage
    Created on : May 18, 2022, 7:34:23 AM
    Author     : Proline
--%>

<%@page import="za.ac.tut.entities.Customer"%>
<%@page import="za.ac.tut.entities.AutoDetailPackage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>found package Page</title>
    </head>
    <body>
        <h1>Found package</h1>
        <%
          Customer custs=(Customer)request.getAttribute("custs");
          Long custId=custs.getId();
        %>
        <p>
            the customer with the id <%=custId%> was remove successfully please click <a href="WelcomAdmin.jsp">here</a> to go back to welcome page
        </p>
    </body>
</html>
