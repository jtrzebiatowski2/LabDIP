package dip.lab1;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author your name goes here
 */
public class Employee {
    private String name;
    private String employeeId;
    private String address;
    private String birthdate;

    public Employee(String name, String employeeId, String address, String birthdate) {
        this.name = name;
        this.employeeId = employeeId;
        this.address = address;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name == null || name.length() < 1){
            throw new IllegalArgumentException();
        }
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        if(address == null || address.length() < 1){
            throw new IllegalArgumentException();

        }
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
        if(birthdate == null || birthdate.length() < 1){
            throw new IllegalArgumentException();
        }
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        if(employeeId == null || employeeId.length() < 1){
            throw new IllegalArgumentException();
        }
    }
    

}
    
