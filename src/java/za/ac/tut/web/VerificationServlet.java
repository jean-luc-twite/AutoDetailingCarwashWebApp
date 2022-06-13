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
import za.ac.tut.business.CustomerFacadeLocal;
import za.ac.tut.entities.Customer;

/**
 *
 * @author Proline
 */
public class VerificationServlet extends HttpServlet {

    @EJB
    private CustomerFacadeLocal customerFacade;


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        HttpSession session =request.getSession();
        //
        Long userId=(Long)session.getAttribute("id");
        String name =(String)session.getAttribute("name");
        String password=(String)session.getAttribute("pssword");
       
        //
       
        //
        Customer custs =customerFacade.findCustomers(userId);
       
        //
        
        String location ="errorMessage.jsp";
        //
        if(custs !=null){
              
                location ="booking.html";
              
            };
           RequestDispatcher disp= request.getRequestDispatcher(location);
           disp.forward(request, response);
    }

}
