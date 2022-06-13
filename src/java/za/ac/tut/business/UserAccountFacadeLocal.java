/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.UserAccount;

/**
 *
 * @author Proline
 */
@Local
public interface UserAccountFacadeLocal {

    void createAccount(UserAccount userAccount);

    void editAccount(UserAccount userAccount);

    void remove(UserAccount userAccount);

    UserAccount findAccount(Object id);

    List<UserAccount> findAll();

    List<UserAccount> findRange(int[] range);

    int count();
    
}
