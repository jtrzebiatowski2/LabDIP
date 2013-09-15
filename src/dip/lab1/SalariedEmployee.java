package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee extends Employee implements PaidEmployee {
    private double annualSalary;
    private double weeklyPay;
    private double annualPay;
    private final int numberWeeksInYear = 52;

    public SalariedEmployee(String name, String employeeId, String address, String birthdate, double annualSalary) {
        super(name, employeeId, address, birthdate);
        this.annualSalary = annualSalary;
    }
    

    @Override
    public void calculateAnnualEmployeePay() {
        annualPay = annualSalary;
    }

    public double getAnnualPay() {
        return annualPay;
    }

    @Override
    public void calculateWeeklyEmployeePay() {
       weeklyPay = annualPay / numberWeeksInYear;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }
     
}
