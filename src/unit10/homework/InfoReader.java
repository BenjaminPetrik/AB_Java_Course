package unit10.homework;

import unit10.Employee;
import unit10.POSITION;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InfoReader {
    public void read() {
        System.out.println("==========TASK 1==========");
        String info = "";
        byte[] data;
        try (FileInputStream fis = new FileInputStream("./src/unit10/homework/info.txt")) {
            data = new byte[fis.available()];
            fis.read(data);
            info = new String(data);
//            System.out.println( info );
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Map<String, String> employeeInfo = new HashMap<>();
        String[] employeeRows = info.split("\r\n");
        Employee employee;
        for (String employeeRow : employeeRows) {
            String[] dataStr = employeeRow.split(",");
            for (String s : dataStr) {
                employeeInfo.put(s.split(": ")[0].trim(), s.split(":")[1].trim());
            }

//            String name = employeeInfo.get("First name");
//            String surname = employeeInfo.get("Last name");
//            int age = Integer.parseInt(employeeInfo.get("Age"));
//            String team = employeeInfo.get("Team");
//            String position = employeeInfo.get("Position");

            employee = new Employee(employeeInfo.get("First name"), employeeInfo.get("Last name"),
                    Integer.parseInt(employeeInfo.get("Age")), employeeInfo.get("Team"),
                    POSITION.valueOf(employeeInfo.get("Position")));
            System.out.println(employee.firstName + " " + employee.lastName + " " + employee.age + " " + employee.team
                    + " " + employee.salary + " " + employee.position);
        }
    }
}
