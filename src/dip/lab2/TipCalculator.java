/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author J-Tron
 */
public interface TipCalculator {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    }
    public abstract double calculateTip();
    public abstract void setServiceRating(ServiceQuality q);
    public abstract ServiceQuality getServiceRating();
}
