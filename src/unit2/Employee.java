package unit2;

public class Employee {
    public String firstName;
    public String lastName;
    public int age;
    public String team;
    public long salary;
    public POSITION position;

    public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position){
        if (age < 18){
            System.out.println("------------------\n" + "Incorrect age for " + firstName + "\n------------------");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;
        //if (salary == 0){
           // salary = position.minSalary;
        /*    switch (position) {
                case JUNIOR -> salary = 5000;
                case MIDDLE -> salary = 10000;
                case SENIOR -> salary = 20000;
                default -> salary = -10000;
            }
            if (position == POSITION.JUNIOR){
                salary = 5000;
            }
            if (position == POSITION.MIDDLE) {
                salary = 10000;
            }
            if (position == POSITION.SENIOR){
                salary = 20000;
            }*/
     //   }
        this.salary = salary;
        this.position = position;
    }
    public Employee(String firstName, String lastName, int age, String team, POSITION position){
        this(firstName, lastName, age, team, 0, position);

    }
}
