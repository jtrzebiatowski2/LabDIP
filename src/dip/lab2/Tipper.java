/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author J-Tron
 */
public class Tipper {
    private double tip;
    
    private CalculateServiceTip calculateServiceTip;
    
    public Tipper(CalculateServiceTip calculateServiceTip){
        this.calculateServiceTip = calculateServiceTip;
    }
    
    public double calculateTip(){
        tip = calculateServiceTip.calculateTip();
        return tip;
    }
    
}
