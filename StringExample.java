import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("My name is: ");
        String name = sc.next();
        String message = myGreet(name);
        System.out.println(message);
        System.out.println(greet());
    }
    static String myGreet(String name){
        String greeting = "Hello "+name;
        return greeting;
    }

    static String greet(){
        String greeting = "How are you";
        return greeting;
    }
}
