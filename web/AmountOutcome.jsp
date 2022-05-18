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
        <h1>Amount Due</h1>
           <%
               Integer cnt=(Integer)session.getAttribute("cnt");
               Double amountDue=(Double)session.getAttribute("amountDue");
           %>
           <p>
               hi  please make payment below
           </p>
    <form  action="paymentServlet.do"  method="POST">
         <h1>Service<%=cnt%></h1>
        <table>
            <tr>
                <td>Amount Due is :</td>
                <td><%=amountDue +"$"%></td>
            </tr>
            
             <tr>
                <td>payment :</td>
                <td><input type="text" name="payment" placeholder="make payment here"></td>
            </tr>
            
            <tr>
                <td></td>
                <td><input type="submit" value="PAY"/></td>
            </tr>
        </table>
    </form>
    </body>
</html>
