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
public class RemovePackageServlet extends HttpServlet {

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
        Long pacId=Long.parseLong(request.getParameter("pacID"));
        //FIND PACKAGE 
        AutoDetailPackage packg=packageFacade.findPackage(pacId);
        //
        String location = "NotPackageFound.jsp";
        //
        if(packg !=null){
            //
            packageFacade.removePackage(packg);
            //
            location="foundPackage.jsp";
            //
            request.setAttribute("packg", packg);
        }
       RequestDispatcher disp = request.getRequestDispatcher(location);
       disp.forward(request, response);
       
    }

}
