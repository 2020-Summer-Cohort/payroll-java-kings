
import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        CompanyRoster theRoster = populateRoster();
        Scanner input = new Scanner(System.in);
        for (PayrollEmployee theEmployee : theRoster.myCompanyRoster.values())
            System.out.println("EMPLOYEE ID# "+ theEmployee.employeeId + " EMPLOYEE NAME: " + theEmployee.firstName + " " + theEmployee.lastName);
        for (PayrollEmployee theEmployee : theRoster.myCompanyRoster.values())
            if (theEmployee instanceof PayrollHourlyExample){
                System.out.println("PLEASE ENTER THE # OF HOURS WORKED BY EMPLOYEE #" + theEmployee.employeeId + " " + theEmployee.firstName + " " + theEmployee.lastName);
                ((PayrollHourlyExample) theEmployee).setHoursWorked(input.nextInt());
            }else if (theEmployee instanceof PayrollSales){
                System.out.println("PLEASE ENTER THE SALES COMMISSION PAY FOR EMPLOYEE #" + theEmployee.employeeId + " " + theEmployee.firstName + " " + theEmployee.lastName);
                ((PayrollSales) theEmployee).setSalesCommission(input.nextDouble());
            }
        System.out.println("PLEASE ENTER THE COMPANY BONUS FOR THIS PAY PERIOD: ");
            theRoster.calculatePay(input.nextDouble());

    }

    public static CompanyRoster populateRoster(){
        CompanyRoster myCompanyRoster = new CompanyRoster();

        myCompanyRoster.addEmployee(new PayrollExecutive(01,"jeff","jezos",0));
        myCompanyRoster.addEmployee(new PayrollDeveloper(02,"Sonic","hedgehog",0));
        myCompanyRoster.addEmployee(new PayrollDeveloper(03,"Miles","prower",0));
        myCompanyRoster.addEmployee(new PayrollDeveloper(04,"Miles","prower",0));
        myCompanyRoster.addEmployee(new PayrollSales(05,"H","eck",0));
        myCompanyRoster.addEmployee(new PayrollHourlyExample(06,"exploited","pal",0));
        myCompanyRoster.addEmployee(new PayrollHourlyExample(07,"exploited","otherpal",0));




        return myCompanyRoster;
    }
}
