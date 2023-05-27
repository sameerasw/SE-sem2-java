public class TotalCalc {
    public static void main(String[] args) {
        int runningTotal = 0;
        System.out.println("Variable value is "+ runningTotal);
        int[] numbers = {5,8,2,3};
        for (int number : numbers) {
            runningTotal += number;
            System.out.println("Variable value is "+ runningTotal);
        }
    }
}
