import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continueProg = true;
        while (continueProg) {
            System.out.print("**********MENU**********\n1.- Addition\n2.- Subtraction\n0.- Quit \nPlease select an option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> addition();
                case 2 -> subtraction();
                case 0 -> continueProg = quit();
                default -> System.out.println("Invalid option");
            }
        }
        scanner.close();
    }

    private static int[] takeInput(){
        System.out.print("Please enter a number:");
        int a = scanner.nextInt();
        System.out.print("Please enter another number:");
        int b = scanner.nextInt();
        return new int[]{a,b};
    }
    private static void addition(){
        int[] numbers = takeInput();
        System.out.println("Addition:" + (numbers[0] + numbers[1]) + "\n");
    }

    private static void subtraction(){
        int[] numbers = takeInput();
        System.out.println("Subtraction:" + (numbers[0] - numbers[1]) + "\n");
    }

    private static boolean quit(){
        System.out.println("Quit");
        return false;
    }
}