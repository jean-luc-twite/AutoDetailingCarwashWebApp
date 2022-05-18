<%-- 
    Document   : packageFoundOutcome
    Created on : May 5, 2022, 7:38:23 AM
    Author     : Proline
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.AutoDetailPackage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Found packages  Page</title>
    </head>
    <body>
        <h1>Found packages outcome</h1>
        <%
          List<AutoDetailPackage> packages=(List<AutoDetailPackage>)session.getAttribute("packages");
          Long packagesId;
          String servicesNames;
          Double carsPrices,mid_small_suvPrices,large_suv_truckPrices;
        %>
        <table>
            <%
              for(int i=0;i < packages.size();i++){
                 AutoDetailPackage pakgs = packages.get(i);
                 packagesId=pakgs.getId();
                 servicesNames=pakgs.getServiceName();
                 carsPrices =pakgs.getNormal_cars_price();
                 mid_small_suvPrices=pakgs.getMid_small_suv_price();
                 large_suv_truckPrices =pakgs.getLarge_suv_or_truck_price();
                 %>
                 <tr>
                     <td>service ID</td>
                     <td><%=packagesId%></td>
                 </tr>
                 
                 <tr>
                     <td>service Name</td>
                     <td><%=servicesNames%></td>
                 </tr>
                 
                 <tr>
                     <td>normal cars price:</td>
                     <td><%=carsPrices%></td>
                 </tr>
                 
                 <tr>
                     <td>mid or small suv/van price:</td>
                     <td><%=mid_small_suvPrices%></td>
                 </tr>
                 
                 <tr>
                     <td>large suv/van:</td>
                     <td><%=large_suv_truckPrices%></td>
                 </tr>
                 <%
              }
            %>
        </table>
        <p>
            please  enter below the details of the package you want
        </p>
        <form action="ProcessServlet.do" method="POST">
            <table>
<!--                <tr>
                    <td>the package id:<td>
                    <td><input type="text" name="packId" placeholder="enter the id of the bpackage"/></td>
                </tr>-->
                <!--package name-->
                <tr>
                    <td>the package name:<td>
                       <td>
                           <select name="packsName">
                               <option value="wash">Wash and Vacs</option>
                               <option value="exterior">exterior details</option>
                               <option value="interior">interior details</option>
                               <option value="complete_ex_in">Complete ex and in</option>
                               <option value="complete_Acrylic">Acrylic Paint Sealant</option>
                              
                        </select>
                       </td>
                </tr>
                   <!--type of cars-->
                   <tr>
                       <td>cars type:</td>
                       <td>
                         <select name="carsTypes">
                               <option value="cars">normal cars</option>
                               <option value="mid_small_suv_van">small or mid suv/van</option>
                               <option value="large_suv_truc">Large TRUCK/SUV/VAN</option>
                        </select>
                       </td>
                   </tr>
                   
                   <tr>
                       <td>cars quantity</td>
                       <td><input type="text" name="quantity" placeholder="cars quantity"/></td>
                   </tr>

                  <tr>
                    <td><td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
