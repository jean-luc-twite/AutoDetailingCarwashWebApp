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
import za.ac.tut.entities.AutoDetailPackage;
import za.ac.tut.entities.Customer;

/**
 *
 * @author Proline
 */
public class EditCustsServlet extends HttpServlet {

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
         //the 
          Long custId=Long.parseLong(request.getParameter("custId"));
          String cellPhone=request.getParameter("cellPhone");
          //
          Customer customer=customerFacade.findCustomers(custId);
          //
            String location = "NotCustsFound.jsp";
          //
          if(customer != null){
            customer.setCellPhone(cellPhone);
            customerFacade.editCustomers(customer);
            location ="EditCustomer.jsp";
                  
          }
       RequestDispatcher disp = request.getRequestDispatcher(location);
       disp.forward(request, response);
    }

}
