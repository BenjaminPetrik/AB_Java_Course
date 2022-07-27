package unit10.homework;

import unit10.Employee;
import unit10.POSITION;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FilesReader {
    public void read() {
        System.out.println("\r\n" + "==========TASK 2==========");
        File[] files = new File("./src/unit10/homework/Employees").listFiles();
        String info = "";
        byte[] data;
        Employee employee;
        if (files != null) {
            for (File file : files) {
                try (FileInputStream fis = new FileInputStream(file)) {
                    data = new byte[ fis.available() ];
                    fis.read( data );
                    info = new String( data );
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                Map<String, String> employeeInfo = new HashMap<>();
                String[] employeeDatas = info.split(",");
                for (String s : employeeDatas) {
                    employeeInfo.put(s.split(": ")[0].trim(), s.split(":")[1].trim());
                    }
                String[] name = file.getName().substring(0, file.getName().length()-4).split(" ");
                employee = new Employee(name[0], name[1],Integer.parseInt(employeeInfo.get("Age")),
                        employeeInfo.get("Team"), POSITION.valueOf(employeeInfo.get("Position")));
                System.out.println(employee.firstName + " " + employee.lastName + " " + employee.age + " " + employee.team
                        + " " + employee.salary + " " + employee.position);
            }
        }
    }
}
