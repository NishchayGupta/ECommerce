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
public class Check extends Payment{
    private String name;
    private String bankiD;
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getBankiD() {
        return bankiD;
    }

    public void setBankiD(String newBankiD) {
        bankiD = newBankiD;
    }
    public void authorized()
    {
            System.out.println("this is Authorized from cash:");
    }
}