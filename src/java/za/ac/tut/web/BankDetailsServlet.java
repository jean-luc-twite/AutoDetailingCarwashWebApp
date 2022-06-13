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
import za.ac.tut.business.UserAccountFacadeLocal;
import za.ac.tut.entities.UserAccount;

/**
 *
 * @author Proline
 */
public class BankDetailsServlet extends HttpServlet {

    @EJB
    private CustomerProcessLocal customerProcess;

    @EJB
    private UserAccountFacadeLocal userAccountFacade;


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
        String CardNumber=request.getParameter("cardNum");
//        String dd=request.getParameter("dd");
//        Long cvv=Long.parseLong(request.getParameter("cvv"));
//        String holder=request.getParameter("holder");
        Double custBalance =(Double)session.getAttribute("balance");
       //
//        UpdateSesssion( session,dd,cvv,holder);
        UserAccount acct =userAccountFacade.findAccount(CardNumber);
       //get amounDue
       Double amdue=(Double)session.getAttribute("amountDue");
     
       //
       String location="outcome.jsp";
       //call and invoke determine payement
      customerProcess.determinePayment(session,amdue,custBalance,location);
        Double change=(Double)session.getAttribute("change");
    
      if(acct !=null){
       
      acct.setBalance(change);
      userAccountFacade.editAccount(acct);
        location="outcome.jsp";
      }
     // the total amoun due
      Double totalAmountDue=customerProcess.determineTotalAmountMade(session, amdue);
      
      RequestDispatcher disp=request.getRequestDispatcher(location);
      disp.forward(request, response);
       //
    }
//public void UpdateSesssion(HttpSession session,String dd,Long cvv,String holder){
//    session.setAttribute("dd", dd);
//    session.setAttribute("cvv", cvv);
//    session.setAttribute("holder", holder);
//}

}
