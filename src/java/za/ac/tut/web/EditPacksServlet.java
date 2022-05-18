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
public class EditPacksServlet extends HttpServlet {

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
          //the 
          Long pacId=Long.parseLong(request.getParameter("pacID"));
          String packService=request.getParameter("packsName");
          //
          AutoDetailPackage packages=packageFacade.findPackage(pacId);
          //
          String location="foundPackage.jsp";
          //
          if(packages != null){
            packages.setServiceName(packService);
            packageFacade.editPackage(packages);
            location ="EditPackage.jsp";
                  
          }
       RequestDispatcher disp = request.getRequestDispatcher(location);
       disp.forward(request, response);
       
    }

}
