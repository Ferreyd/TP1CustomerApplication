/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Customer;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import session.CustomerManager;
import javax.inject.Named;  

/**
 *
 * @author nicolas
 */
@ManagedBean
@ViewScoped
public class CustomerMBean implements Serializable{
 private List<Customer> customerList;  
  
    @EJB  
    private CustomerManager customerManager;  
  
    public CustomerMBean() {  
    }  
  
    /** 
     * Renvoie la liste des clients pour affichage dans une DataTable 
     * @return 
     */  
    public List<Customer>getCustomers() {  
        return customerManager.getAllCustomers();  
    }  
  
    /** 
     * Action handler - appelé lorsque l'utilisateur sélectionne une ligne dans 
     * la DataTable pour voir les détails 
     */  
    public String showDetails(int customerId) {  
        return "CustomerDetails?idCustomer=" + customerId;    }  
}  



