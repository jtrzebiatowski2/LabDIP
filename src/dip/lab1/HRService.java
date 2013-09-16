package dip.lab1;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {
    private PaidEmployee paidEmployee;
     
    public HRService(PaidEmployee pe1) {
        paidEmployee = pe1;
    }
    
    public double getAnnualEmployeePay() {
        return paidEmployee.calculateAnnualEmployeePay();
    }
    
    public double getWeeklyEmployeePay() {
        return paidEmployee.calculateWeeklyEmployeePay();
            
    }
    
    public double getAnnualEmployeePay(PaidEmployee pe1) {
        return pe1.calculateAnnualEmployeePay();
    }
    
    public double getWeeklyEmployeePay(PaidEmployee pe1) {
        return pe1.calculateWeeklyEmployeePay();
    }
    
}
