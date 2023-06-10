import java.util.Scanner;

public class dayCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month:");
        String month = input.next();
        int days = switch (month) {
            case "January", "March", "May", "July", "August", "October", "December" -> 31;
            case "April", "June", "September", "November" -> 30;
            case "February" -> 28;
            default -> 0;
        };
        if (days == 0){
            System.out.println("Wrong input");
        }
        else {
            System.out.println("Days : "+days);
        }
    }
}
