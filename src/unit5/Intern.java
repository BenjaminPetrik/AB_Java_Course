package unit5;

public class Intern extends Employee{
    public Intern(String firstName, String lastName, int age, String team, POSITION position) {
        super(firstName, lastName, age, team, position);
    }

    public Intern(String firstName, String lastName, int age, String team, long salary, POSITION position) {
        super(firstName, lastName, age, team, salary, position);
    }

    @Override
    public boolean isIntern() {
        return true;
    }

    public static class Builder extends AbstractEmployeeBuilder {
        @Override
        public Intern build() {
            return new Intern(firstName, lastName, age, team, salary, position);
        }
    }
}
