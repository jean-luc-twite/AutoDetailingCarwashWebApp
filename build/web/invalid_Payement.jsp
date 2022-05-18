<%-- 
    Document   : invalid_Payement
    Created on : May 16, 2022, 4:13:47 PM
    Author     : Proline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid Payment Page</title>
    </head>
    
    <body>
        <h1>Invalid Payment</h1>
        <%
          String errMessage=(String)session.getAttribute("invalid");
        %>
        <table>
            <tr>
                <td>error message:</td>
                <%=errMessage%>
            </tr>
        </table>
        <p> please click <a href="amount_outcome.jsp">here</a> to enter a valid payment</p>
    </body>
</html>
