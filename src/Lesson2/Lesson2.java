package Lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        /*Employee employee = new Employee();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть своє імʼя: ");
        employee.firstName = scan.nextLine();
        System.out.println("Введіть своє прізвище: ");
        employee.lastName = scan.nextLine();
        System.out.println("Введіть свій вік: ");
        employee.age = scan.nextInt();
        employee.lastName = "Doe";
        employee.firstName = "John";
        employee.age = 25;
        EmployeePrinter employeePrinter = new EmployeePrinter();
        employeePrinter.print(employee);*/
        Employee employee1 = new Employee("Ivan", "Ivanov", 22, "TestTeam",20000, POSITION.JUNIOR);
        Employee employee3 = new Employee("Gleb", "Popov", 25, "QA", POSITION.SENIOR);
        EmployeePrinter printer = new EmployeePrinter();
        printer.print(employee3);

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Alesha", "Susanin", 30, "AQA", POSITION.JUNIOR);
        employees[1] = new Employee("Igor", "Astakhov", 13, "QML/JS DEV", POSITION.SENIOR);
        for (Employee employee : employees) {
            printer.print(employee);
        }
    }
}