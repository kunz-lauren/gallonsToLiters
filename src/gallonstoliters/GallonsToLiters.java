/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallonstoliters;

/**
 *
 * @author laurenkunz
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons;//holds number of gallons
        double liters;//holds number of liters
        
        gallons = 10;//start with 10 gallons
        
        liters = gallons * 3.7854;//convert to liters
        
        System.out.println(gallons + " gallons is " + liters + " liters. ");
        // TODO code application logic here
    }
    
}
