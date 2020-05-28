public abstract  class PayrollEmployee implements CalculatablePay {

    int employeeId;
    String firstName;
    String lastName;
    double paycheckTotal;

    public PayrollEmployee(int employeeId, String firstName, String lastName, double paycheckTotal) {

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.paycheckTotal = paycheckTotal;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPaycheckTotal() {
        return paycheckTotal;
    }

    public double setPaycheckTotal(double newPaycheckTotal) {
        this.paycheckTotal =newPaycheckTotal;
        return newPaycheckTotal;
    }
}