/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Customer;

/**
 *
 * @author Proline
 */
@Stateless
public class CustomerFacade extends AbstractFacade<Customer> implements CustomerFacadeLocal {

    @PersistenceContext(unitName = "carwashWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerFacade() {
        super(Customer.class);
    }

    @Override
    public void createCustomers(Customer customer) {
          create(customer);
    }

    @Override
    public void editCustomers(Customer customer) {
        edit(customer);
    }

    @Override
    public void removeCustomer(Customer customer) {
        remove(customer);
    }

    @Override
    public Customer findCustomers(Object id) {
        return find(id);
    }

    @Override
    public List<Customer> findAllCustomes() {
        return  findAll();
    }
    
}
