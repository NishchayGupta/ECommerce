/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

/**
 *
 * @author 1895314
 */
public class Ecommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Order ord = new Order();
        ord.calcSubTotal();
        
        OrderDetail ordDet = new OrderDetail();
        ordDet.calcWeight();
        
        Customer cust = new Customer();
        cust.setAddress("Montreal");
        System.out.println(cust.getAddress());
        
        Payment pay = new Payment();
        pay.setAmount(99);
        System.out.println(pay.getAmount());
    }
    
}
