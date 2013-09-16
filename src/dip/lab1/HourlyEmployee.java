package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee extends Employee implements PaidEmployee {
    private double annualPay;
    private double weeklyPay;
    private double hourlyRate;
    private double totalHrsForYear;
    private double totalHoursWorkedInWeek;

    public HourlyEmployee(String name, String employeeId, String address, String birthdate, double hourlyRate) {
        super(name, employeeId, address, birthdate);
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public double calculateAnnualEmployeePay() {
        return annualPay = hourlyRate * totalHrsForYear;
        }
    
    public double getAnnualPay(){
        return annualPay;
    }

    @Override
    public double calculateWeeklyEmployeePay() {
        return weeklyPay = hourlyRate * totalHoursWorkedInWeek;
    }
    
    public double getWeeklyPay() {
        return weeklyPay;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }
    
     public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
 
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }
     
    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

    public double getTotalHoursWorkedInWeek() {
        return totalHoursWorkedInWeek;
    }

    public void setTotalHoursWorkedInWeek(double totalHoursWorkedInWeek) {
        this.totalHoursWorkedInWeek = totalHoursWorkedInWeek;
    }
    
}
