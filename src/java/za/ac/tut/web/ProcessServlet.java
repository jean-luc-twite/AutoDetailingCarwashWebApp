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
import javax.servlet.http.HttpSession;
import za.ac.tut.business.CustomerProcessLocal;

/**
 *
 * @author Proline
 */
public class ProcessServlet extends HttpServlet {

    @EJB
    private CustomerProcessLocal customerProcess;


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
        HttpSession session=request.getSession();
       
      // Long packsID=Long.parseLong(request.getParameter("packId"));
       String serviceName=request.getParameter("packsName");
       String carsType=request.getParameter("carsTypes");
       Integer carsQty=Integer.parseInt(request.getParameter("quantity"));
       //
         updateSession(session,serviceName,carsType,carsQty);//,carsPrices,suvPrices,Large_truckPrice);
       ///determine amountdue
        Double amtDue= customerProcess.determineAmountDue(session,serviceName,carsType,carsQty);
       //determine number of service
       Integer numbeServices=customerProcess.numberOfservices(session);
       //send foward
       RequestDispatcher disp=request.getRequestDispatcher("AmountOutcome.jsp");
       disp.forward(request, response);
      
    }

    private void updateSession(HttpSession session,  String serviceName,String carsType,Integer qty) /*Double carsPrices, Double suvPrices, Double Large_truckPrice*/ {

         session.setAttribute("packsName", serviceName);
         session.setAttribute("carsTypes", carsType);
         session.setAttribute("quantity", qty);
       
        
    }

}
