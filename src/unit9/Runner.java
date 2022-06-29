package unit9;

import unit9.exceptions.InvalidArgumentsException;
import unit9.square.Circle;
import unit9.square.Rectangle;
import unit9.square.Shape;
import unit9.square.Square;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Runner {

    public static void main(String[] args) {
        try {
            System.out.println("Hello from TRY1");
            var rectangle = new Rectangle(11, 5);
            System.out.println("hello from TRY2");
        } catch(InvalidArgumentsException | ArithmeticException exception) { // exc 1 OR exc 2. Also, we can use any ancestor of both exc.
            System.out.println("GOT EXCEPTION! ");
            exception.printStackTrace(System.out); // system out - для того, чтобы выводить ошибку в стандартный поток вывода - консоль
            // (обычно ошибки идут в другой поток вывода и в консоли может результат меняться местаами)
        } finally {
            System.out.println("Hello from finally!");
        }


        System.out.println("Hello world");


        // Old way to read from file.
//        FileReader reader = null;
//        try{
//            reader = new FileReader("myfile.txt");
//        } catch (IOException e){
//            e.printStackTrace();
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        //TRY with resources - better way to read from file. FINALLY block is handled automatically. Can be used with AUTOCLOSABLE implementors only!
//        try (var reader1 = new FileReader("file.txt")){
//            reader1.read();
//        } catch (IOException e) {
//            e.printStackTrace(System.out);
//        }

    }


    private static void printPerimeter(Shape shape) {
        Class<? extends Shape> aClass = shape.getClass();
        var className = aClass.getSimpleName();

        var annotation = aClass.getAnnotation(Deprecated.class);
        if (annotation != null) {
            System.out.println(className + " has been deprecated.");
        } else {
            System.out.println("perimeter of " + className + " is: " + shape.getPerimeter());
        }

    }
}