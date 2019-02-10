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
public class OrderDetail 
{
    private int quantity;
    private String taxStatus;
    Order ord = new Order();
    Item itm = new Item();
    
    public int getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(int newQuantity) 
    {
        quantity = newQuantity;
    }

    public String getTaxStatus() 
    {
        return taxStatus;
    }

    public void setTaxStatus(String newTaxStatus) 
    {
        taxStatus = newTaxStatus;
    }
    
    public void calcSubTota()
    {
        System.out.println("This is CalcSubTotal method of OrderDetail class");
    }
    
    public void calcWeight()
    {
        System.out.println("This is CalcWeight method");
    }
    
    public void calcTax()
    {
        System.out.println("This is CalcTax method of OrderDetail class");
    }
}