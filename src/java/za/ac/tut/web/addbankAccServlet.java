/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.UserAccountFacadeLocal;
import za.ac.tut.entities.Address;
import za.ac.tut.entities.Customer;
import za.ac.tut.entities.UserAccount;

/**
 *
 * @author Proline
 */
public class addbankAccServlet extends HttpServlet {

    @EJB
    private UserAccountFacadeLocal userAccountFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session=request.getSession();
       //get user info from the session
      
       String accNum=request.getParameter("acctNumber");
       String accName=request.getParameter("accName");
       Double balance=Double.parseDouble(request.getParameter("balance"));
       //
       initiliseSession(session,accNum,accName,balance);
      //
      UserAccount userAcct=generate(accNum,accName,balance);
      //
      userAccountFacade.createAccount(userAcct);
      
       RequestDispatcher disp= request.getRequestDispatcher("CreateAccountOutcome.jsp");
       disp.forward(request, response);
    }

    private UserAccount generate(String accNum,String accName,Double balance) {
          UserAccount acct=new UserAccount();
        //
         acct.setId(accNum);
         acct.setAccName(accName);
         acct.setBalance(balance);
        //
     
       return acct;
        
    }
   private void initiliseSession(HttpSession session,String accNum,String accName,Double balance){
     session.setAttribute("acctNumber", accNum);
     session.setAttribute("accName", accName);
     session.setAttribute("balance", balance);
     
   }
    }



