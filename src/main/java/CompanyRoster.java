/*CompanyRoster class
Contains a Collection of PayrollEmployees. When the program starts, populate the collection
with 1 PayrollExecutive objects, 3 PayrollDeveloper,  1 PayrollSales, and 2 PayrollHourly objects.
calculatePay() method that will set the paycheckTotal field in each employee based on their salary,
 commission, bonuses, insurance fees, and hours worked if applicable.
*/

import java.util.HashMap;
import java.util.Map;

public class CompanyRoster {
Map<Integer, PayrollEmployee> myCompanyRoster = new HashMap<>();



public void calculatePay(double companyBonus){
    for (PayrollEmployee employee : myCompanyRoster.values())
        employee.calculateOwnPay(companyBonus);

    }

}