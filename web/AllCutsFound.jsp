<%-- 
    Document   : AllCutsFound
    Created on : May 18, 2022, 2:07:46 PM
    Author     : Proline
--%>

<%@page import="za.ac.tut.entities.Address"%>
<%@page import="za.ac.tut.entities.Customer"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All customers Page</title>
    </head>
    <body>
        <h1>All customers</h1>
        <%
           List<Customer> customers =(List<Customer>)request.getAttribute("custs");
           Customer custs;
               Long id;
               String name;
               String lastName;
               String email;
               String password;
               String cellPhone;
               Address addrs;
        %>
        <table>
            <%
              for(int i=0;i<customers.size();i++){
                  
                  custs=customers.get(i);
                  id=custs.getId();
                  name=custs.getName();
                  lastName=custs.getLastName();
                  email=custs.getEmail();
                  password=custs.getPassword();
                  cellPhone=custs.getCellPhone();
                  addrs =custs.getAddrs();
                  String streetNum=addrs.getStreetNum();
                  String streetName=addrs.getStreetName();
                  String area=addrs.getArea();
                  String code=addrs.getCode();
               %>
               <tr>
                   <td>customer id:</td>
                   <td><%=id%></td>
               </tr>
               
               <tr>
                   <td>customer name:</td>
                   <td><%=name%></td>
               </tr>
               
               <tr>
                   <td>customer last Name:</td>
                   <td><%=lastName%>:</td>
               </tr>
               
               <tr>
                   <td>customer email:</td>
                   <td><%=email%>:</td>
               </tr>
               
               <tr>
                   <td>customer password</td>
                   <td><%=password%>:</td>
               </tr>
               
               <tr>
                   <td>customer cellPhone:</td>
                   <td><%=cellPhone%></td>
               </tr>
               
               <tr>
                   <td>street number:</td>
                   <td><%=streetNum%></td>
               </tr>
               
                <tr>
                   <td>street name:</td>
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
               <%
              }
            
            %>
        </table>
               <p>
                   please click <a href="WelcomAdmin.jsp">here</p> to go back to the main page
               </p>
    </body>
</html>
