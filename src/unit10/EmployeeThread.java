package unit10;

public class EmployeeThread extends Thread{ // создаем класс наследник потоков

    private Employee employee;

    public EmployeeThread (Employee employee) {
        this.employee = employee;
    }

    @Override
    public void run() { // перезаписываем метод ран - бизнес логику работы потоков, важно - метод ничего не возвращает
        employee.work();
    }

    public Employee getEmployee() {
        return employee;
    }
}
