package unit10;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        EmployeeNamePrinter namePrinter = new EmployeeNamePrinter();
        EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Sasha", "Petrov", 30, "AQA", POSITION.JUNIOR);
        employees[1] = new Employee("Igor", "Astakhov", 45, "QML/JS Develop", POSITION.SENIOR);

        for ( Employee employee : employees ) {
            namePrinter.print( employee );
            salaryPrinter.print( employee );
            System.out.println("==============");
        }

        List<Employee> employeeList = new ArrayList<>();
/*        employeeList.add(new Employee("Alesha", "Susanin", 30, "AQA", POSITION.JUNIOR));
        employeeList.add(new Employee("Igor", "Astakhov", 13, "QML/JS DEV", POSITION.SENIOR));
        employeeList.add(new Employee("Gleb", "Popov", 25, "QA", POSITION.MIDDLE));
        employeeList.add(new Employee("Ivan", "Surname", 13, "QML/JS DEV", POSITION.JUNIOR));
        employeeList.add(new Employee("Vlad", "Sergeev", 25, "AQA", POSITION.MIDDLE));*/
        addToList(new Employee("Gleb", "Asalov", 32, "AQA", POSITION.MIDDLE), employeeList);
        addToList(new Employee("Alesha", "Susanin", 30, "AQA", POSITION.JUNIOR), employeeList);
        addToList(new Employee("Alesha", "Susanin", 30, "AQA", POSITION.SENIOR), employeeList);


        for ( Employee employee : employeeList ) {
            namePrinter.print(employee);
            salaryPrinter.print(employee);
        }

        List<Employee> employeeLinkedList = new LinkedList<>();
        addToList(new Employee("Gleb", "Asalov", 32, "AQA", POSITION.MIDDLE), employeeLinkedList);
        addToList(new Employee("Alesha", "Susanin", 30, "AQA", POSITION.JUNIOR), employeeLinkedList);
        addToList(new Employee("Alesha", "Susani", 30, "AQA", POSITION.SENIOR), employeeLinkedList);
        addToList(new Employee("Alesha", "Susan", 30, "AQA", POSITION.JUNIOR), employeeLinkedList);
        addToList(new Employee("Alesha", "Susa", 30, "AQA", POSITION.SENIOR), employeeLinkedList);
        addToList(new Employee("Gleb", "Popov", 31, "Dev", POSITION.JUNIOR), employeeLinkedList);

        int juniorCount = 0;
        int middleCount = 0;
        int seniorCount = 0;

        Map<POSITION, Integer> counter = new HashMap<>();

        for ( Employee employee : employeeLinkedList ) {
            if ( !counter.containsKey(employee.position )) {
                counter.put( employee.position, 1);
            } else {
                counter.put ( employee.position, counter.get( employee.position ) + 1 );
            }
        }

        for ( Map.Entry<POSITION, Integer> entry : counter.entrySet() ) {
            System.out.println("Position: " + entry.getKey() + " counter: " + entry.getValue());
            System.out.println("=================================");
        }

        System.out.println("Position counter: " + counter);
        System.out.println("=================================");

        for (Employee employee : employeeLinkedList ) {
            if (employee.position == POSITION.JUNIOR ) {
                juniorCount++;
            } else if (employee.position == POSITION.MIDDLE) {
                middleCount++;
            } else {
                seniorCount++;
            }
        }

        System.out.println("Junior count " + juniorCount);
        System.out.println("Middle count " + middleCount);
        System.out.println("Senior count " + seniorCount);
        System.out.println("=================================");

        for (int index = 0; index < employeeList.size()-1; index++) {
            if ( employeeList.get ( index ).position.ordinal() > employeeList.get ( index + 1 ).position.ordinal() ) {
                Collections.swap(employeeList, index, index+1);
            }
        }

      /*  for (Employee employee : employeeLinkedList ) {
            if (employee.firstName.equals("Alesha") && employee.lastName.equals("Susanin")) {
                employeeLinkedList.remove( employee );
            }
        }*/

        System.out.println( employeeList );
        System.out.println("=================================");
        System.out.println( employeeLinkedList );
        System.out.println("=================================");

        /*for ( Employee employee : employeeLinkedList) {
            employee.work();
        }*/

        Map<String, Integer> team = new HashMap<>();
        for (Employee employee : employeeLinkedList) {
            if ( !team.containsKey(employee.team)) {
                team.put(employee.team, 1);
            } else {
                team.put(employee.team, team.get(employee.team)+1);
            }
        }
        for ( Map.Entry<String, Integer> entry : team.entrySet() ) {
            System.out.println("There are " + entry.getValue() + " people in the " + entry.getKey() + " team.");
            System.out.println("=================================");
        }

        Map<String, Integer> name = new HashMap<>();
        for (Employee employee : employeeLinkedList) {
            if ( !name.containsKey(employee.firstName)) {
                name.put(employee.firstName, 1);
            } else {
                name.put(employee.firstName, name.get(employee.firstName)+1);
            }
        }
        for ( Map.Entry<String, Integer> entry : name.entrySet() ) {
            System.out.println("There are " + entry.getValue() + " people with name " + entry.getKey() );
            System.out.println("=================================");
        }

    }
    public static void addToList (Employee employee, List<Employee> employeeList ) {
        if (!employeeList.contains(employee) )
            employeeList.add( employee );
        else {
            System.out.println("Duplicate employee " + employee.firstName + " " + employee.lastName);
        }
    }
}
