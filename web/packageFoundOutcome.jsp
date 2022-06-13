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
         <link rel="stylesheet"  href="packStyle.css">
        <title>Found packages  Page</title>
    </head>
    <body>
        
        <%
          List<AutoDetailPackage> packages=(List<AutoDetailPackage>)session.getAttribute("packages");
          Long packagesId;
          String servicesNames;
          Double carsPrices,mid_small_suvPrices,large_suv_truckPrices;
           int count=0;
        %>
        <div class="container">
            
                 <table class="content-table">
                     <thead>
                    <tr>
                        <td>Number</td>
                     <td>service Name</td>
                     <td>normal cars price</td>
                     <td>mid or small suv/van price</td>
                      <td>large suv/van</td>
                     
                    </tr>
                     </thead>
                 <%
              for(int i=0;i < packages.size();i++){
                 AutoDetailPackage pakgs = packages.get(i);
                 packagesId=pakgs.getId();
                 servicesNames=pakgs.getServiceName();
                 carsPrices =pakgs.getNormal_cars_price();
                 mid_small_suvPrices=pakgs.getMid_small_suv_price();
                 large_suv_truckPrices =pakgs.getLarge_suv_or_truck_price();
                 count++;
                 %>
                     <tbody>
                         <tr>
                    <td><%=count%></td>
                      <td><%=servicesNames%></td>
                      <td><b>R<%=carsPrices%></b></td>
                       <td><b>R<%=mid_small_suvPrices%></b></td>
                        <td><b>R<%=large_suv_truckPrices%></b></td>
                         </tr>
                     </tbody>
                 
                 <%
              }
            %>
        </table>
        
        <p>
            Please  enter below the details of the package you want
        </p>
        <form action="ProcessServlet.do" method="POST">
                     <div>
                           <select name="packsName" class="form-input" required>
                               <option value="wash">Wash and Vacs</option>
                               <option value="exterior">exterior details</option>
                               <option value="interior">interior details</option>
                               <option value="complete_ex_in">Complete ex and in</option>
                               <option value="complete_Acrylic">Acrylic Paint Sealant</option>
                              
                        </select>
                   </div>
                
                   <!--type of cars-->
                       <div>
                           <select name="carsTypes" class="form-input" required>
                               <option value="cars">normal cars</option>
                               <option value="mid_small_suv_van">small or mid suv/van</option>
                               <option value="large_suv_truc">Large TRUCK/SUV/VAN</option>
                        </select>
                     </div>
                   
                   <tr>
                       <td></td>
                       <td><input class="form-input" type="number" name="quantity" placeholder="cars quantity"/></td>
                   </tr>

                  <div>
                    
                  <input class="button" type="submit" value="submit">
                </div>
        
        </form>
        
        </div>
    </body>
</html>
