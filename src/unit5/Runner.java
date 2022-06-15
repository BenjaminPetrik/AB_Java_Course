package unit5;

public class Runner {

    public static void main(String[] args) {
        var employee1 = new Employee("Sasha", "Petrov", 30, "AQA", POSITION.JUNIOR);

        System.out.println(employee1.getFirstName());
//        employee1.setFirstName("new first name");
        System.out.println(employee1.getFirstName());
        System.out.println("==============\n");


//        var employee2 = new Employee();
//        employee2.setFirstName("Sasha");
//        employee2.setLastName("Petrov");
//        employee2.setAge(30);
//        employee2.setTeam("AQA");
//        employee2.setPosition(POSITION.JUNIOR);


//        System.out.println(employee2.getLastName());
//        System.out.println(employee2.getPosition());
//        System.out.println(employee2.getAge());
        System.out.println("==============\n");

        var employee3 = new Employee.Builder()
                .firstName("Sasha")
                .lastName("Melnik")
                .salary(1212)
                .age(120)
                .team("AQA")
                .position(POSITION.JUNIOR)
                .build();

        System.out.println(employee3.getLastName());
        System.out.println(employee3.getPosition());
        System.out.println(employee3.getAge());
        System.out.println("==============\n");


//        var singleton1 = Singleton.getInstance();
//        var singleton2 = Singleton.getInstance();
//        var singleton3 = Singleton.getInstance();
//
//        System.out.println(employee1 == employee3);
//        System.out.println(singleton1 == singleton2);
//        System.out.println(singleton3 == singleton2);
//        System.out.println("==============\n");



        var singleton1 = Singleton.INSTANCE;
        var singleton2 = Singleton.INSTANCE;
        var singleton3 = Singleton.INSTANCE;

        System.out.println(employee1 == employee3);
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton3 == singleton2);
        System.out.println("==============\n");


        var employee4 = EmployeeBuilderFactory.INSTANCE.buildEmployeeBuilder()
                .firstName("Sasha")
                .lastName("Melnik")
                .salary(1212)
                .age(120)
                .team("AQA")
                .position(POSITION.JUNIOR)
                .build();

        var employee5 = EmployeeBuilderFactory.INSTANCE.buildEmployeeBuilder()
                .firstName("Sasha")
                .lastName("Melnik")
                .salary(1212)
                .age(120)
                .team("AQA")
                .position(POSITION.JUNIOR)
                .build();

        System.out.println(employee4.isIntern());
        System.out.println(employee5.isIntern());
        System.out.println("==============\n");



    }
}