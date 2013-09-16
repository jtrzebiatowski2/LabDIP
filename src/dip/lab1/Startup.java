package dip.lab1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {

        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        PaidEmployee pe1 = new HourlyEmployee("Steve", "1432 North Ave.", "55487", "08/27/1974", 14.75);
        PaidEmployee pe2 = new SalariedEmployee("Joe", "544 Western Cir.", "44857", "05/14/1968", 56750.00);
        PaidEmployee pe3 = new SalariedPlusBonusEmployee("Nick", "2635 Sherman Dr.", "44875", "07/31/1950", 106750.00, 12000.00);
    
        
    
    
    
    
    }

}
