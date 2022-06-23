package unit6;

import java.util.concurrent.Callable;

public class EmployeeCallable implements Callable<Integer> { // создаем класс колабл на случай, если нам нужно, чтобы потоки что-то возвращали

    private Employee employee;

    public EmployeeCallable ( Employee employee ) {
        this.employee = employee;
    }

    @Override
    public Integer call() {
        return employee.compute();
    }
}
