/*
Contains all PayrollEmployee fields and methods
        No bonus
        No insurance
        Additional fields:
        int hoursWorked (with an accompanying method to set the amount)
        double hourlyRate of 20.00
*/

public class PayrollHourlyExample extends PayrollEmployee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private double paycheckTotal;
    private int hoursWorked;
    private double hourlyRate;

    public PayrollHourlyExample(int employeeId, String firstName, String lastName, double paycheckTotal, int hoursWorked, double hourlyRate) {
        super(employeeId, firstName, lastName, paycheckTotal);

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.paycheckTotal = paycheckTotal;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = 20.00;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double getPaycheckTotal() {
      //  double newPaycheckTotal = getHoursWorked() * getHourlyRate();
        return paycheckTotal;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }
}
