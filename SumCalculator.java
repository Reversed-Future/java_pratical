import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the start value: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end value: ");
        int end = scanner.nextInt();
        
        if (end >= start) {
            int sum = 0;
        
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        
            System.out.println("The sum of integers from " + start + " to " + end + " is: " + sum);
        } else {
            System.out.println("Error: The start value should be less than or equal to the end value.");
        }

        
        scanner.close();
    }
}
