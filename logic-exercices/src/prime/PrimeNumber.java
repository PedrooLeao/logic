package prime;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++){
            if (number % i == 0 ){
                isPrime = false;
                break;
            }
        }
        if (isPrime && number > 1){
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime");
        }
        scanner.close();
    }
}
