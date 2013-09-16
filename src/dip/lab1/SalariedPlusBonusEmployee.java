/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1;

/**
 *
 * @author J-Tron
 */
public class SalariedPlusBonusEmployee extends SalariedEmployee implements PaidEmployee{
    private double annualSalary;
    private double annualBonus;
    private double annualPay;
    private double weeklyPay;
    private final int numberWeeksInYear = 52;

    public SalariedPlusBonusEmployee(String name, String employeeId, String address, String birthdate, double annualSalary, double annualBonus) {
        super(name, employeeId, address, birthdate, annualSalary);
        this.annualBonus = annualBonus;
    }
    
    @Override
    public double calculateAnnualEmployeePay() {
       annualPay = annualSalary + annualBonus;
               return annualPay;
    }

    @Override
    public double getAnnualPay() {
        return annualPay;
    }

    @Override
    public double calculateWeeklyEmployeePay() {
        weeklyPay = annualPay / numberWeeksInYear;
        return weeklyPay;
    }

    @Override
    public double getWeeklyPay() {
        return weeklyPay;
    }
    
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }
    
}
