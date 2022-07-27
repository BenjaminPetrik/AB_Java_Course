package unit10.homework;

import unit10.Employee;
import unit10.POSITION;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        // TASK 1
        InfoReader reader = new InfoReader();
        reader.read();

        //ADDITIONAL TASK 2
        FilesReader filesReader = new FilesReader();
        filesReader.read();
    }
}
