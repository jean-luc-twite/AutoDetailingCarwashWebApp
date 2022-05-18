/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.ejb.Local;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Proline
 */
@Local
public interface CustomerProcessLocal {
     Double determineAmountDue(HttpSession session,String serviceName,String carType,Integer qty);
     void determinePayment(HttpSession session,Double amountDue,Double payement,String location);
     Double determineTotalAmountMade(HttpSession session,Double amountDue);
     Integer numberOfservices(HttpSession session); 
     //WASH AND VACS
     public Double NORMAL_CARS_WASH_SWVPRICE=35.0;
     public Double MID_SMALL_SUV_VAN_TRUCK_SWVPRICES=45.0;
     public Double LARGE_TRUCK_SUV_SWVPRICE=60.0;
     //EXTERIOR DETAILS
     public Double NORMAL_CARS_SEDPRICES=150.0;
     public Double MID_SMALL_SUV_VAN_SEDPRICES=175.0;
     public Double LARGE_TRUCK_SMALL_SEDPRICE=200.0;
     //INTERIOR DETAILS
     public Double NORMAL_CARS_SIDPRICES=150.0;
     public Double MID_SMALL_SUV_VAN_SIDPRICES=175.0;
     public Double LARGE_TRUCK_SMALL_SIDPRICE=200.0;
     //COMPLETE EXTERIOR AND INTERIOR
     public Double NORMAL_CARS_CEIPRICE=275.0;
     public Double MID_OR_SMALL_SUV_VAN_TRUCK_CEIPRICE=325.0;
     public Double LARGE_TRUCK_SUV_CEIPRICE=375.0;
     //COMPLETE ACRYLIC PAINT SEALANT
     public Double NORMAL_CARS_CAPSPRICE=350.0;
     public Double MID_OR_SMALL_SUV_VAN_TRUCK_CAPSPRICE=425.0;
     public Double LARGE_TRUCK_SUV_CAPSPRICE=400.0;
}
