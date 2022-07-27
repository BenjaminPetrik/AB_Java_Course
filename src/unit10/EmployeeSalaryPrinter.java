package unit10;

public class EmployeeSalaryPrinter implements Printer {

    @Override
    public void print(Employee employee) {
        if ( employee.salary < 0 ){
            System.out.println("Incorrect salary value");
            System.out.println("=================================");
        } else if ( employee.salary >= 5000 ){
            System.out.println("Salary: " + employee.salary);
            System.out.println("=================================");
        }
    }

}
