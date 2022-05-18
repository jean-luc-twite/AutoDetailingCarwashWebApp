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
public class paymentServlet extends HttpServlet {

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
       HttpSession session = request.getSession();
       //
       double payment =Double.parseDouble(request.getParameter("payment"));
       //get amounDue
       Double amdue=(Double)session.getAttribute("amountDue");
       //
       String location="outcome.jsp";
       //call and invoke determine payement
      customerProcess.determinePayment(session,amdue, payment,location);
      //the total amoun due
      Double totalAmountDue=customerProcess.determineTotalAmountMade(session, amdue);
      //
      RequestDispatcher disp=request.getRequestDispatcher(location);
      disp.forward(request, response);
      
    }

 

}
