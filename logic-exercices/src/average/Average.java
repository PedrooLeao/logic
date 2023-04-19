package average;


import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of value: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        for (int i = 0; i < n; i++
             ) {
            System.out.println("Enter value " + (i + 1) + ": ");
            double value = scanner.nextDouble();
            sum += value;
        }

        double average = sum / n;
        System.out.println("Average: " + average);

        scanner.close();
    }
}
