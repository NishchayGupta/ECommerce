/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

/**
 *
 * @author temp
 */
public class Customer {
    private String name;
    
    
    public void setName(String newName) {
        name=newName;
    }
    
    public String getName() {
       return name;
}
    private String address;
    public void setAddress(String newAddress) {
        address=newAddress;
    }
    
    public String getAddress() {
        return address;
}
    
}