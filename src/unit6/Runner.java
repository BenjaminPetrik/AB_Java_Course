package unit6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) {

        List<Employee> employeeLinkedList = new LinkedList<>();
        addToList(new Employee("Alesha", "1", 32, "AQA", POSITION.MIDDLE), employeeLinkedList);
        addToList(new Employee("Alesha", "2", 30, "AQA", POSITION.JUNIOR), employeeLinkedList);
        addToList(new Employee("Alesha", "3", 30, "AQA", POSITION.SENIOR), employeeLinkedList);
        addToList(new Employee("Alesha", "4", 30, "AQA", POSITION.JUNIOR), employeeLinkedList);
        addToList(new Employee("Alesha", "5", 30, "AQA", POSITION.SENIOR), employeeLinkedList);
        addToList(new Employee("Alesha", "6", 31, "AQA", POSITION.JUNIOR), employeeLinkedList);

        // Создание потоков без вывода результата, то есть воид
/*        List<EmployeeThread> threads = new ArrayList<>();
        for (Employee employee : employeeLinkedList) { // складываем сотрудников в новый список, чтобы создать поток для каждого сотрудника
            threads.add(new EmployeeThread( employee ));
        }

        for ( EmployeeThread thread : threads) { // для каждого сотрудника запускаем поток
            thread.start(); // чтобы стартануть поток - нужно использовать старт, а не ран, т.к. там вызывается много дополнительных функций, кроме рана
            try {
                if (thread.getEmployee().firstName.equals("Gleb") && thread.getEmployee().lastName.equals("Asalov")) {
                    thread.join(); // джоин нужен, если мы хотим заставить некоторые потоки работать последовательно
                    // например мы хотим заставить все сотрудников ждать, пока Глеб Асалов закончит свою работу, а потом они все могут начать параллельно
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/


        // создание потоков с выводом каких-то данных, то есть возвратом результата
      /*  List<EmployeeCallable> callables = new ArrayList<>();
        for (Employee employee : employeeLinkedList) { // складываем сотрудников в новый список, чтобы создать поток для каждого сотрудника
            callables.add(new EmployeeCallable( employee ));
        }

        List< FutureTask< Integer > > futureTasks = new ArrayList<>();
        for ( EmployeeCallable callable : callables ) {
            FutureTask<Integer> futureTask = new FutureTask<>( callable );
            futureTasks.add(futureTask);
            Thread thread = new Thread( futureTask );
            thread.start();
        }

        for ( FutureTask< Integer > futureTask : futureTasks) {
            try {
                System.out.println( futureTask.get() );
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        /*ExecutorService service = Executors.newFixedThreadPool( 4 );
        for ( Employee employee : employeeLinkedList ) {
            service.execute(employee::work); // создание анонимного класса с лямбдой (сокращенная запись создания и переопределения метода)
        }
        service.shutdown();*/

        ExecutorService callableService = Executors.newFixedThreadPool(3);
        List< Future< Integer > > futureList = new ArrayList<>();
        for ( Employee employee : employeeLinkedList ) {
            Future< Integer > future = callableService.submit( employee::compute );
            futureList.add( future );
        }
        for (Future<Integer> future : futureList ) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        callableService.shutdown();
    }

    public static void addToList ( Employee employee, List<Employee> employeeList ) {
        if (!employeeList.contains(employee) )
            employeeList.add( employee );
        else {
            System.out.println("Duplicate employee " + employee.firstName + " " + employee.lastName);
        }
    }
}
