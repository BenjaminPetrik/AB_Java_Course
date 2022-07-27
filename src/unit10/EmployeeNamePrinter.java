package unit10;

public class EmployeeNamePrinter implements Printer {

    @Override
    public void print(Employee employee) {

        if ( employee.firstName.isEmpty() || employee.lastName.isEmpty() ) {
            System.out.println("First name or last name cannot be empty");
            System.out.println("=================================");

        } else {
            System.out.println("First name: " + employee.firstName);
            System.out.println("Last name: " + employee.lastName);
            System.out.println("Position: " + employee.position );
            System.out.println("=================================");
        }
    }
}