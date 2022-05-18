<%-- 
    Document   : FindPackage
    Created on : May 18, 2022, 8:38:55 AM
    Author     : Proline
--%>

<%@page import="za.ac.tut.entities.AutoDetailPackage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The find package Page</title>
    </head>
    <body>
        <h1>Find package</h1>
         <%
           AutoDetailPackage packag=(AutoDetailPackage)request.getAttribute("pakgs");
           Long pacId=packag.getId();
           String packServices=packag.getServiceName();
           Double normal_cars=packag.getNormal_cars_price();
           Double small_mid_SUV_VAN=packag.getMid_small_suv_price();
           Double large_VAN_TRUCK_SUV=packag.getLarge_suv_or_truck_price();         
         
         %>
         <p>
            the target  information are below
         </p>
         <table>
             <tr>
                 <td>package Id:</td>
                 <td><%=pacId%></td>
             </tr>
             
              <tr>
                 <td>package service:</td>
                 <td><%=packServices %></td>
             </tr>
             
              <tr>
                 <td>normal cars price:</td>
                 <td><%=normal_cars  + "$" %></td>
             </tr>
             
              <tr>
                 <td>small/mid SUV OR VAN PRICE:</td>
                 <td><%=small_mid_SUV_VAN + "$" %></td>
             </tr>
             
             <tr>
                 <td>large SUV OR VAN PRICE:</td>
                 <td><%=large_VAN_TRUCK_SUV + "$" %></td>
             </tr>
         </table>
             <p>
                 please click <a href="WelcomAdmin.jsp">here</a>to go back to the welcome.
             </p>
    </body>
</html>
