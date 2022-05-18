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
import za.ac.tut.business.CustomerFacadeLocal;
import za.ac.tut.entities.Address;
import za.ac.tut.entities.Customer;

/**
 *
 * @author Proline
 */
public class CreateUserAccountServlet extends HttpServlet {

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
        HttpSession session=request.getSession();
       //get user info from the session
       Long customerId =(Long)session.getAttribute("id");
       String name=(String)session.getAttribute("name");
       String lastName=(String)session.getAttribute("lastName");
       String email=(String)session.getAttribute("email");
       String password=(String)session.getAttribute("passwd");
       String  cellNum=(String)session.getAttribute("cellNum");
       String streetNumber=(String)session.getAttribute("streetNum");
       String streetName=(String)session.getAttribute("steetName");
       String area=(String)session.getAttribute("area");
       String code=(String)session.getAttribute("code");
      //
      Customer customers=generate(customerId,name,lastName,email,password,cellNum,streetNumber,streetName,area,code);
      //
      customerFacade.createCustomers(customers);
      
       RequestDispatcher disp= request.getRequestDispatcher("CreateCustomerOutcome.jsp");
       disp.forward(request, response);
    }

    private Customer generate(Long customerId, String name, String lastName, String email, String password, String cellNum, String streetNumber, String streetName, String area, String code) {
          Address addrs=new Address();
        //
        addrs.setStreetNum(streetNumber);
        addrs.setStreetName(streetName);
        addrs.setArea(area);
        addrs.setCode(code);
        //
        Customer custs = new Customer();
        Date creationDate=new Date();
        custs.setId(customerId);
        custs.setName(name);
        custs.setLastName(lastName);
        custs.setEmail(email);
        custs.setPassword(password);
        custs.setCellPhone(cellNum);
        custs.setCreationDate(creationDate);
        custs.setAddrs(addrs);
        //
       return custs;
        
    }


}
