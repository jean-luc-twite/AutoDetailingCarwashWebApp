<%-- 
    Document   : summary
    Created on : May 16, 2022, 4:23:02 PM
    Author     : Proline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Page</title>
    </head>
    <body>
        <h1>Summary!</h1>
         <%
           String name=(String)session.getAttribute("name");
          Double amountDue=(Double)session.getAttribute("amountDue");
          Double payment=(Double)session.getAttribute("payment");
          Double change =(Double)session.getAttribute("change");
          Integer numberService=(Integer)session.getAttribute("cnt");
          Double totalAmountDue=(Double)session.getAttribute("totalAmountDue");
          String packageName=(String)session.getAttribute("packsName");
         String carsType=(String)session.getAttribute("carsTypes");
         Integer qty=(Integer)session.getAttribute("quantity");  
         %>
        <p></p>
        <table>
             <tr>
                <td>service:</td>
                <td><%=numberService%></td>
            </tr>
            
            <tr>
                <td>name:</td>
                <td><%=name%></td>
            </tr>
            <tr>
                <td>amount Due:</td>
                <td><%=amountDue%></td>
            </tr>
            <tr>
                <td>payment:</td>
                <td><%=payment%></td>
            </tr>
            
             <tr>
                <td>change:</td>
                <td><%=change%></td>
            </tr>
            
             <tr>
                <td>package Name:</td>
                <td><%=packageName%></td>
            </tr>
              <tr>
                <td>cars Type</td>
                <td><%=carsType%></td>
            </tr>
               <tr>
                <td>cars quantity</td>
                <td><%=qty%></td>
            </tr>
            <tr>
                <td>total amount due made:</td>
                <td><%=totalAmountDue%></td>
            </tr>
        </table>
            <p>please click <a href="StopSessionServlet.do">here</a> to end the session</p>
    </body>
</html>
