<%-- 
    Document   : summary
    Created on : May 16, 2022, 3:47:51 PM
    Author     : Proline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>outcome  Page</title>
    </head>
    <body>
        <h1>outcome</h1>
        <%
          String name=(String)session.getAttribute("name");
          Double amountDue=(Double)session.getAttribute("amountDue");
          Double payment=(Double)session.getAttribute("payment");
          Double change =(Double)session.getAttribute("change");
        %>
        <p> Hi <%=name%> thank for choosing our service please see below your outcome</p>
        <table>
            <tr>
                <td>amount due:</td>
                <td><%=amountDue%></td>
            </tr>
            <tr>
                <td>your payment is :</td>
                <td><%=payment%></td>
            </tr>
            
            <tr>
                <td>your change is:</td>
                <td><%=change%></td>
            </tr>
            
        </table>
            <p>please click <a href="StartBoookingServlet.do">here</a> if you want to continue booking services<br> or click <a href="summary.jsp">here</a></p> if you want stop booking</p>
    </body>
</html>
