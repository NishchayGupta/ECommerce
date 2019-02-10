/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

/**
 *
 * @author 1895269
 */
public class Payment {
    private float amount;
    Order ord = new Order(); 
    
    public void setAmount(float newAmount) {
        amount = newAmount;
    }

    public float getAmount() {
        return amount;
    }
}
