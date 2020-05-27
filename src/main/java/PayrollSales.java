public class PayrollSales extends PayrollEmployee implements Bonus{
    private double payPeriodEarnings;
    public double salesCommission;




    public PayrollSales(int employeeId, String firstName, String lastName, double paycheckTotal) {
        super(employeeId, firstName, lastName, paycheckTotal);
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.payPeriodEarnings = 3000.00;
        this.paycheckTotal = paycheckTotal;
    }
    @Override
    public double getPaycheckTotal(){
        return paycheckTotal;
    }
    @Override
    public double setPaycheckTotal(double paycheckTotal){
        this.paycheckTotal = paycheckTotal;
        return paycheckTotal;
    }


    public double setSalesCommission(double salesCommission) {

        this.salesCommission = salesCommission;
        return salesCommission;
    }


    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    public double getSalesCommission() {
        return salesCommission;
    }

    @Override
    public void receivesABonus() {


    }
}







//
//




