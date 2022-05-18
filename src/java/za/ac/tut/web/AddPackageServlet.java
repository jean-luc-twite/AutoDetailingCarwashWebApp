/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.business.PackageFacadeLocal;
import za.ac.tut.entities.AutoDetailPackage;

/**
 *
 * @author Proline
 */
public class AddPackageServlet extends HttpServlet {

    @EJB
    private PackageFacadeLocal packageFacade;


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //
       Long packageId=Long.parseLong(request.getParameter("packageId"));
       String serviceName=request.getParameter("serviceName");
       Double carsPrice=Double.parseDouble(request.getParameter("priceCars"));
       Double mid_small_suvPrice=Double.parseDouble(request.getParameter("suvPrice"));
       Double largeCarsPrice=Double.parseDouble(request.getParameter("largePrice"));
       //
       AutoDetailPackage packagess=generatePackage(packageId,serviceName,carsPrice,mid_small_suvPrice,largeCarsPrice);
       //
       packageFacade.AddPackage(packagess);
       //
        RequestDispatcher disp = request.getRequestDispatcher("AddPackagesOutcome.jsp");
       disp.forward(request, response);
    }

    private AutoDetailPackage generatePackage(Long packageId, String serviceName, Double carsPrice, Double mid_small_suvPrice, Double largeCarsPrice) {
        //
      AutoDetailPackage pac =new AutoDetailPackage(); 
      //
      pac.setId(packageId);
      pac.setServiceName(serviceName);
      pac.setNormal_cars_price(carsPrice);
      pac.setMid_small_suv_price(mid_small_suvPrice);
      pac.setLarge_suv_or_truck_price(largeCarsPrice);
      //
      return pac;
    
    }


}
