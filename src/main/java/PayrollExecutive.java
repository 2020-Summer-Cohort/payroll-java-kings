/*
Contains all PayrollEmployee fields and methods
        Receives bonus at triple the bonus amount given to the rest of the company (receiveBonus method)
        Has insurance fee of 10.00 (payInsurance method)
        Additional Fields:
        double payPeriodEarnings of 20,000
*/

public class PayrollExecutive extends PayrollEmployee implements Insurable{
    private double insuranceCost;
    double payPeriodEarnings;
    private String lastName;
    private double paycheckTotal;

    public PayrollExecutive(int employeeId, String firstName, String lastName, double paycheckTotal, double payPeriodEarnings, double insuranceCost) {
        super(employeeId, firstName, lastName, paycheckTotal);

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.paycheckTotal = paycheckTotal;
        this.payPeriodEarnings = 20000;
        this.insuranceCost = 10.00;
    }

    @Override
    public double getPaycheckTotal() {
        return paycheckTotal;
    }

    @Override
    public double setPaycheckTotal(double paycheckTotal) {
        this.paycheckTotal = paycheckTotal;
        return paycheckTotal;
    }

    @Override
    public void payInsurance() {
        setPaycheckTotal(payPeriodEarnings - insuranceCost);
    }
}