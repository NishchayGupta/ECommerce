/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.util.Date;

/**
 *
 * @author 1895314
 */
public class Order 
{
    private Date date;
    private String status;
    Customer cust = new Customer();
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date newDate) {
        date = newDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }
    
    public void calcSubTotal()
    {
        System.out.println("This is Calulator SubTotal method");
    }
    
    public void calcTax()
    {
        System.out.println("This is CalcTax method");
    }
    
    public void calcTotal()
    {
        System.out.println("This is CalcTotal method");
    }
    
    public void calcTotalWeight()
    {
        System.out.println("This is CalcTotalWeight method");
    }
}