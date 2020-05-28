import java.util.Map;
import java.util.Map.Entry;

/*
PayrollApp class
When the user starts the program, the console will print the list of employees in the CompanyRoster,
then prompt the user to enter information about the pay period. The user will enter the hours worked
for each PayrollHourly employee, set the sales commission amounts in the PayrollSales employees, and
specify the bonus for the pay period. Your program will then execute your calculatePay() method, which
will iterate through the company roster and set the paycheckTotal field in each employee based on their
information. For example, for a PayrollExecutive you would set their paycheckTotal to their payPeriodAmount
and then call the payInsurance() and receiveBonus() methods on that object. Use OOP and the “instanceof” operator
to know which employees in your company roster it is appropriate to call those methods on.

1- iterate through the roster, print it all out
2- enter hours worked for Payroll Hourly
3- enter bonus for pay period
4- call calculatePay()
*/
public class Application {

    public static void main(String[] args) {
        CompanyRoster theRoster = populateRoster();
   // for (PayrollEmployee employee : employees)

   //     for(Entry<int, PayrollEmployee> entry : theRoster.entrySet())
      //      VirtualPet needyPet = getPet(entry.getKey());

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
