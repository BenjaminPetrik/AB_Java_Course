package unit2;

public class EmployeePrinter implements Printer{


    @Override
    public void print(Employee employee) {
        System.out.println("Name: " + employee.firstName + "\nПрізвище: " + employee.lastName + "\nAge: " + employee.age
                + "\nSalary: " + employee.salary + "\nTeam: " + employee.team + "\nPosition: " + employee.position + "\n");
    }
}