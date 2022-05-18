<%-- 
    Document   : FindCustomer
    Created on : May 18, 2022, 2:49:29 PM
    Author     : Proline
--%>

<%@page import="za.ac.tut.entities.Address"%>
<%@page import="za.ac.tut.entities.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Customer Page</title>
    </head>
    <body>
        <h1>Find Customer</h1>
       <%
          Customer custs=(Customer)request.getAttribute("custs");
          Long id=custs.getId();
          String name=custs.getName();
          String cellNum=custs.getCellPhone();
          Address adds=custs.getAddrs();
          String streetNum=adds.getStreetNum();
          String streetName=adds.getStreetName();
          String area=adds.getArea();
          String code=adds.getCode(); 
        %>
        <p>
            the details of the customers that you are looking for are below:
        </p>
          <table>
                    <tr>
                        <td>ID:</td>
                        <td><%=id%></td>
                    </tr>
                    
                     <tr>
                        <td>name:</td>
                        <td><%=name%></td>
                    </tr>
                    
                     <tr>
                        <td>cell number:</td>
                        <td><%=cellNum%></td>
                    </tr>
                    
                     <tr>
                        <td>street Number:</td>
                        <td><%=streetNum%></td>
                    </tr>
                    
                     <tr>
                        <td>street name :</td>
                        <td><%=streetName%></td>
                    </tr>
                    
                     <tr>
                        <td>Area:</td>
                        <td><%=area%></td>
                    </tr>
                    
                     <tr>
                        <td>code:</td>
                        <td><%=code%></td>
                    </tr>
                 
                </table>
                    <p>
                        please click <a href="WelcomAdmin.jsp">here</a>to go back to the main page
                    </p>
    </body>
</html>
