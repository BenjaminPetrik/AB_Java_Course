package unit5;

public abstract class AbstractEmployeeBuilder {
    protected String firstName; // имя
    protected String lastName; // фамилия
    protected int age; // возраст
    protected String team; // команда
    protected long salary; // зп
    protected POSITION position; // позиция сотрудника


    public AbstractEmployeeBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public AbstractEmployeeBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AbstractEmployeeBuilder age(int age) {
        this.age = age;
        return this;
    }

    public AbstractEmployeeBuilder team(String team) {
        this.team = team;
        return this;
    }

    public AbstractEmployeeBuilder salary(long salary) {
        this.salary = salary;
        return this;
    }

    public AbstractEmployeeBuilder position(POSITION position) {
        this.position = position;
        return this;
    }

    public abstract Employee build();
}
