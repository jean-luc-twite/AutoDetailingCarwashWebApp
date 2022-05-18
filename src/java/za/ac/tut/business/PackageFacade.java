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
import za.ac.tut.entities.AutoDetailPackage;

/**
 *
 * @author Proline
 */
@Stateless
public class PackageFacade extends AbstractFacade<AutoDetailPackage> implements PackageFacadeLocal {

    @PersistenceContext(unitName = "carwashWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PackageFacade() {
        super(AutoDetailPackage.class);
    }

    @Override
    public void AddPackage(AutoDetailPackage packag) {
        create(packag);
    }

    @Override
    public void editPackage(AutoDetailPackage packag) {
        edit(packag);
    }

    @Override
    public void removePackage(AutoDetailPackage packag) {
        remove(packag);
    }

    @Override
    public AutoDetailPackage findPackage(Object id) {
       return  find(id);
    }

    @Override
    public List<AutoDetailPackage> findAllPackage() {
        return findAll();
    }
    
}
