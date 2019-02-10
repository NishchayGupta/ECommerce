/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.util.Date;

/**
 *
 * @author 1895269
 */
public class Credit extends Payment {
    private String name; 
    private String type;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date newDate) {
        date = newDate;
    }
     public void authorized()
    {
            System.out.println("This is Authorized method from credit class:");
    }
}
