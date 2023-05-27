import java.util.Scanner;

public class Ex5_1_Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your first name: ");
        String firstName = input.next();
        System.out.println("Please insert your surname: ");
        String surname = input.next();
        System.out.println(firstName.charAt(0) + surname.charAt(0));
    }
}
