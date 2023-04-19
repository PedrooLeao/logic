package reversestring;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer a string: ");
        String inputString = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--){
            reversedString.append(inputString.charAt(i));
        }
        System.out.println("Reversed string: " + reversedString);
    }
}
