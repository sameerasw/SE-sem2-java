import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String givenName =scanner.nextLine();

        //check if name entered by user is the same as the name in the code
        if(givenName.equals(getName())){
            System.out.println("Names are equal");
        }else{
            System.out.println("Names are not equal");
        }
    }
    static String getName(){
        return "Sameera";
    }
}