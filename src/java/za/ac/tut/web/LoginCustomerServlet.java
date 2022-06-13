/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.entities.Customer;

/**
 *
 * @author Proline
 */
public class LoginCustomerServlet extends HttpServlet {


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
          //
            Long userId=Long.parseLong(request.getParameter("id"));
            String name=request.getParameter("name");
            String password=request.getParameter("pssword");
          
           
            initialiseSession(session,name,password,userId);
            //
          
           response.sendRedirect("VerificationServlet.do");
       
    }

    private void initialiseSession(HttpSession session,String name,String password,Long userId) {
         session.setAttribute("name", name);
         session.setAttribute("pssword", password);
         session.setAttribute("id", userId);
     
        
    }
    
}
