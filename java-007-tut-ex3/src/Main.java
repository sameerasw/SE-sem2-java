public class Main {
    static int i = 0;
    public static void main(String[] args) {
        countTo100();
    }

    public static void countTo100() {
        i++;
        System.out.println(i);
        if (i == 100) {
            return;
        } else {
            countTo100();
        }
    }
}