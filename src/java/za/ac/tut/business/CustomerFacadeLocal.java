/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Customer;

/**
 *
 * @author Proline
 */
@Local
public interface CustomerFacadeLocal {

    void createCustomers(Customer customer);

    void editCustomers(Customer customer);

    void removeCustomer(Customer customer);

    Customer findCustomers(Object id);

    List<Customer> findAllCustomes();

    List<Customer> findRange(int[] range);

    int count();
    
}
