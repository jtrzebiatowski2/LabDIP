/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author J-Tron
 */
public class TipService {
    
    private TipCalculator calculator;
    
    public double getCalculatedTip(){
        return calculator.calculateTip();
    }

    public TipService(TipCalculator c) {
        setCalculator(c);
    }
    
    public TipCalculator getCalculator() {
        return calculator;
    }

    public void setCalculator(TipCalculator calculator) {
        //validate parameter
        this.calculator = calculator;
    }
    
   
    
}
