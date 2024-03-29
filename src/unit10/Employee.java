package unit10;

public class Employee {

    public String firstName; // имя
    public String lastName; // фамилия
    public int age; // возраст
    public String team; // команда
    public long salary; // зп
    public POSITION position; // позиция сотрудника


    public Employee(String firstName, String lastName, int age, String team, POSITION position){
        this(firstName, lastName, age, team, 0, position);
    }

    public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position){

        if ( age < 18 ) {
            System.out.println("Incorrect age value");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;

        if (salary == 0){
            salary = position.minSalary;
        }

        this.salary = salary;
        this.position = position;
    }

    public String toString() {
        return "Employee info: " + this.firstName + " " + this.position.toString() + "\r\n";
    }

    public boolean equals(Object obj) {
//        if ( obj instanceof Employee ) {
//            if ( ((Employee) obj).firstName.equals( this.firstName ) && ((Employee) obj).lastName.equals( this.lastName ) ) {
//                return true;
//            }
//        }
//    return false;
        return obj instanceof Employee && (( Employee ) obj).firstName.equals( this.firstName ) &&
                (( Employee ) obj).lastName.equals( this.lastName );
    }

    public void work() { //делаем метод, который заставляет сотрудников работать
        for (int i = 0; i < 10; i++) {
            System.out.println(firstName + " " + lastName + " works: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int compute() { // какое-то вычисление
        int result = 1;
        for ( int i = 1; i < 20; i++) {
             result *= i;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}