/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Proline
 */
@Entity
public class AutoDetailPackage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String serviceName;
    @Column(name="cars")
    private Double normal_cars_price;
    @Column(name="suv")
    private Double mid_small_suv_price;
    @Column(name="truck")
    private Double large_suv_or_truck_price;

    public AutoDetailPackage() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getNormal_cars_price() {
        return normal_cars_price;
    }

    public void setNormal_cars_price(Double normal_cars_price) {
        this.normal_cars_price = normal_cars_price;
    }

    public Double getMid_small_suv_price() {
        return mid_small_suv_price;
    }

    public void setMid_small_suv_price(Double mid_small_suv_price) {
        this.mid_small_suv_price = mid_small_suv_price;
    }

    public Double getLarge_suv_or_truck_price() {
        return large_suv_or_truck_price;
    }

    public void setLarge_suv_or_truck_price(Double large_suv_or_truck_price) {
        this.large_suv_or_truck_price = large_suv_or_truck_price;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AutoDetailPackage)) {
            return false;
        }
        AutoDetailPackage other = (AutoDetailPackage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Package[ id=" + id + " ]";
    }
    
}
