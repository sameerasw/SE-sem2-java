import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.close();
        if (age >= 18){
            System.out.println("Over 18");
        } else if (age > 0) {
            System.out.println("Below 18");
        }
        else {
            System.out.println("The age entered is incorrect.");
        }
    }
}