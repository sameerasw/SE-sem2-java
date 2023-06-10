import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks :");
        int Marks = input.nextInt();
        String grade;
        if (Marks > 80){
            grade = "A";
        }
        else if (Marks > 60) {
            grade = "B";
        } else if (Marks > 50) {
            grade = "C";
        } else if (Marks > 45) {
            grade = "D";
        } else if (Marks > 25) {
            grade = "E";
        }
        else {
            grade = "F";
        }
        System.out.println(grade);
    }
}
