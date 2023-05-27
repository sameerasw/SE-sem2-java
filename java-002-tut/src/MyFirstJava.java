import java.util.Scanner;

public class MyFirstJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your name: ");
        String name = input .next();
        System.out.println("Hello " + name);
        System.out.println("Please insert your age: ");
        int age = input.nextInt();
        System.out.println("Hello "+name + ".You are "+ age + " years old.");
    }
}