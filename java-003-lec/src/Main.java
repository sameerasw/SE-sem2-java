
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <6 ; i++) {
                System.out.print("*".repeat(i));
            System.out.println();
        }
        for (int i = 0; i <6 ; i++) {
                System.out.print(" ".repeat(5-i)+"*".repeat(i));
            System.out.println();
        }
        for (int i = 0; i <6 ; i++) {
                System.out.print(" ".repeat(5-i)+" * ".repeat(i)+" ".repeat(5-i));
            System.out.println();
        }
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 6; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}