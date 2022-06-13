/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Proline
 */
public class StartSessionServlet extends HttpServlet {
//
//    @EJB
//    private CustomerFacadeLocal customerFacade;
//

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
        //get session
       HttpSession session=request.getSession(true);
       //get the details from the request object
       Long customerId =Long.parseLong(request.getParameter("id"));
       String name=request.getParameter("name");
       String lastName=request.getParameter("lastName");
       String email=request.getParameter("email");
       String password=request.getParameter("passwd");
       String  cellNum=request.getParameter("cellNum");
       String streetNumber=request.getParameter("streetNum");
       String streetName=request.getParameter("streetName");
       String area=request.getParameter("area");
       String code=request.getParameter("code");
       
       //initialise session
        initialiseSession(session,customerId,name,lastName,email,password,cellNum,streetNumber,streetName,area,code);

        response.sendRedirect("CreateUserAccountServlet.do");

    }



   private void initialiseSession(HttpSession session, Long customerId, String name, String lastName, String email, String password, String cellNum, String streetNumber, String streetName, String area, String code) {
    
       double amountDue=0;
       double totalAmountDue=0;
      //
     session.setAttribute("id", customerId);
     session.setAttribute("name", name);
     session.setAttribute("lastName", lastName);
     session.setAttribute("email", email);
     session.setAttribute("passwd", password);
     session.setAttribute("cellNum", cellNum);
     session.setAttribute("streetNum", streetNumber);
     session.setAttribute("streetName", streetName);
     session.setAttribute("area", area);
     session.setAttribute("code", code);
     session.setAttribute("amountDue", amountDue);
     session.setAttribute("totalAmountDue", totalAmountDue);
   
  }

}
