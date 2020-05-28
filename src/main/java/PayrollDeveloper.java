/*PayrollDeveloper
Contains all PayrollEmployee fields and methods
Receives Bonus (receiveBonus method)
Has insurance with fee of 80.00 (payInsurance method)
Additional fields:
double payPeriodEarnings of 9,000.00
*/

public class PayrollDeveloper extends PayrollEmployee implements Insurable, Bonus{
    private final double payPeriodEarnings;
    private double insuranceCost;

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public PayrollDeveloper(int employeeId, String firstName, String lastName, double paycheckTotal) {
        super(employeeId, firstName, lastName, paycheckTotal);
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.paycheckTotal = paycheckTotal;
        this.insuranceCost = 80.00;
        this.payPeriodEarnings = 9000.00;

    }


    @Override
    public void payInsurance() {
        setPaycheckTotal(paycheckTotal-insuranceCost);
    }

    @Override
    public void receivesABonus(double companyBonus) {
    setPaycheckTotal(paycheckTotal+companyBonus);
    }

    @Override
    public void calculateOwnPay(double companyBonus) {
        setPaycheckTotal(payPeriodEarnings);
        receivesABonus(companyBonus);
        payInsurance();
    }
}

