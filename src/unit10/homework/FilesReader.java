package unit10.homework;

import unit10.Employee;
import unit10.POSITION;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FilesReader {
    public void read() throws FileNotFoundException {
        System.out.println("\r\n" + "==========TASK 2==========");
        File[] files = new File("./src/unit10/homework/Employees").listFiles();
        String info = "";
        byte[] data;
        Employee employee;
        if (files == null){
            throw new NullPointerException("Wrong path!");
        }
        if ( files.length == 0 ){
            throw new FileNotFoundException("There is an empty folder!");
        }

        for (File file : files) {
                String fileName = file.getName();
                try (FileInputStream fis = new FileInputStream(file)) {
                    data = new byte[ fis.available() ];
                    fis.read( data );
                    info = new String( data );
                } catch (IOException ex) {
                    System.out.println("Cannot read from file: " + fileName);
                    ex.printStackTrace();
                }
                if (info.equals("")){
                    throw new FileNotFoundException("The file is empty!");
                }

                Map<String, String> employeeInfo = new HashMap<>();
                String[] employeeDatas = info.split(",");
                for (String s : employeeDatas) {
                    String[] metaData = s.split(": ");
                    employeeInfo.put(metaData[0].trim(), metaData[1].trim());
                    }
                int extIndex = fileName.lastIndexOf(".");
                String[] name = fileName.substring(0, extIndex).split(" ");
                employee = new Employee(name[0], name[1],Integer.parseInt(employeeInfo.get("Age")),
                        employeeInfo.get("Team"), POSITION.valueOf(employeeInfo.get("Position")));
                System.out.println(employee.firstName + " " + employee.lastName + " " + employee.age + " " + employee.team
                        + " " + employee.salary + " " + employee.position);
            }
    }
}
