/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.AutoDetailPackage;

/**
 *
 * @author Proline
 */
@Local
public interface PackageFacadeLocal {

    void AddPackage(AutoDetailPackage packag);

    void editPackage(AutoDetailPackage packag);

    void removePackage(AutoDetailPackage packag);

    AutoDetailPackage findPackage(Object id);

    List<AutoDetailPackage> findAllPackage();

    List<AutoDetailPackage> findRange(int[] range);

    int count();
    
}
