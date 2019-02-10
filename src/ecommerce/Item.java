/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

/**
 *
 * @author 1894832
 */
public class Item {

    private double shippingWeight;
    private String description;

    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double newShippingWeight) {
        shippingWeight = newShippingWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public void getpriceForQuantity() {
        System.out.println("This method is for getpriceForQuantity");
    }

    public void getTax() {
        System.out.println("This method is for getTax");
    }

    public void inStock() {
        System.out.println("This method is for inStock");
    }
}
