/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;
import za.ac.tut.entities.AutoDetailPackage;
import za.ac.tut.entities.Customer;

/**
 *
 * @author Proline
 */
@Stateless
public class CustomerProcess implements CustomerProcessLocal {

    @EJB
    private CustomerFacadeLocal customerFacade;

    @Override
    public Double determineAmountDue(HttpSession session,String packsName,String carsType,Integer qty) {
        AutoDetailPackage pakcgs=new  AutoDetailPackage();
       Double amountDue=(Double)session.getAttribute("amountDue");
          packsName=(String)session.getAttribute("packsName");
           carsType=(String)session.getAttribute("carsTypes");
            qty=(Integer)session.getAttribute("quantity");
       if(packsName.equals("wash")){
         
           if(carsType.equals("cars")){
           //determine amountDue
           amountDue =NORMAL_CARS_WASH_SWVPRICE * qty;
           }else if(carsType.equals("mid_small_suv_van")){
               amountDue=MID_SMALL_SUV_VAN_TRUCK_SWVPRICES * qty;
           }else if(carsType.equals("large_suv_truc")){
                amountDue=LARGE_TRUCK_SUV_SWVPRICE * qty;
           }else{
               amountDue =0.00;
           }
       }else if(packsName.equals("exterior")){
                    
            if(carsType.equals("cars")){
           //determine amountDue
           amountDue =NORMAL_CARS_SEDPRICES * qty;
           }else if(carsType.equals("mid_small_suv_van")){
               amountDue=MID_SMALL_SUV_VAN_SEDPRICES * qty;
           }else if(carsType.equals("large_suv_truc")){
                amountDue=LARGE_TRUCK_SMALL_SEDPRICE * qty;
           }else{
               amountDue =0.00;
           }
       }else if(packsName.equals("interior")){
                    
            if(carsType.equals("cars")){
           //determine amountDue
           amountDue =NORMAL_CARS_SIDPRICES * qty;
           }else if(carsType.equals("mid_small_suv_van")){
               amountDue=MID_SMALL_SUV_VAN_SIDPRICES * qty;
           }else if(carsType.equals("large_suv_truc")){
                amountDue=LARGE_TRUCK_SMALL_SIDPRICE * qty;
           }else{
               amountDue =0.00;
           }
       }else if(packsName.equals("complete_ex_in")){
              if(carsType.equals("cars")){
           //determine amountDue
           amountDue =NORMAL_CARS_CEIPRICE * qty;
           }else if(carsType.equals("mid_small_suv_van")){
               amountDue=MID_OR_SMALL_SUV_VAN_TRUCK_CEIPRICE * qty;
           }else if(carsType.equals("large_suv_truc")){
                amountDue=LARGE_TRUCK_SUV_CEIPRICE * qty;
           }else{
               amountDue =0.00;
           }
       }else if(packsName.equals("complete_Acrylic")){
               if(carsType.equals("cars")){
           //determine amountDue
           amountDue =NORMAL_CARS_CAPSPRICE * qty;
           }else if(carsType.equals("mid_small_suv_van")){
               amountDue=MID_OR_SMALL_SUV_VAN_TRUCK_CAPSPRICE * qty;
           }else if(carsType.equals("large_suv_truc")){
                amountDue=LARGE_TRUCK_SUV_CAPSPRICE * qty;
           }else{
               amountDue =0.00;
           }
       }
      session.setAttribute("amountDue", amountDue);
       return amountDue;
    }

    @Override
    public void determinePayment(HttpSession session,Double amountDue,Double custBalance,String location) {
  
       if(custBalance > amountDue){
           //determine the change
            Double change = custBalance-amountDue;
           //edid balance
           session.setAttribute("change", change);
           location="outcome.jsp";
       }else{
           location="invalid_Payement.jsp";
           String invalidMessage="payment is invalid";
           session.setAttribute("invalid", invalidMessage);
           
       }
     
    }

    @Override
    public Double determineTotalAmountMade(HttpSession session,Double amountDue) {
       Double totalAmountDue=(Double)session.getAttribute("totalAmountDue");
       //determine the total amounDue
       totalAmountDue =+amountDue;
       //
       session.setAttribute("totalAmountDue", totalAmountDue);
       //return the total AMOUNT DUE
       
       return totalAmountDue;
    }


    @Override
    public Integer numberOfservices(HttpSession session) {
          Integer numbServices=0;
         //
          numbServices++;
        //
         session.setAttribute("cnt", numbServices);
////        //
       return numbServices;
    }
}
