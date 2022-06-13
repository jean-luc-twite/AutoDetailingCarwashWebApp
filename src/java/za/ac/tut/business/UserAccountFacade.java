/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.UserAccount;

/**
 *
 * @author Proline
 */
@Stateless
public class UserAccountFacade extends AbstractFacade<UserAccount> implements UserAccountFacadeLocal {

    @PersistenceContext(unitName = "carwashWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserAccountFacade() {
        super(UserAccount.class);
    }

    @Override
    public void createAccount(UserAccount userAccount) {
        create(userAccount);
    }

    @Override
    public UserAccount findAccount(Object id) {
        return find(id);
    }

    @Override
    public void editAccount(UserAccount userAccount) {
        edit(userAccount);
    }
    
}
