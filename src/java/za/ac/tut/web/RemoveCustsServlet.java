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
import za.ac.tut.business.CustomerFacadeLocal;
import za.ac.tut.entities.Customer;


/**
 *
 * @author Proline
 */
public class RemoveCustsServlet extends HttpServlet {

    @EJB
    private CustomerFacadeLocal customerFacade;


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
          Long custId=Long.parseLong(request.getParameter("custId"));
        //FIND customer 
        Customer custs=customerFacade.findCustomers(custId);
        //
        String location = "NotCustsFound.jsp";
        //
        if(custs !=null){
            //
           customerFacade.removeCustomer(custs);
            //
            location="RemoveCusts.jsp";
            //
            request.setAttribute("custs", custs);
        }
       RequestDispatcher disp = request.getRequestDispatcher(location);
       disp.forward(request, response);
       
    }


}
