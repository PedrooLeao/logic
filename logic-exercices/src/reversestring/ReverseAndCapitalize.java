package reversestring;

import java.util.Scanner;

public class ReverseAndCapitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder capitalizedReversedString = new StringBuilder();

        String[] words = input.split(" ");
        for (int i = words.length -1; i >= 0; i--){
            String word = words[i];
            String capitalizedWord = word.substring(0,1).toUpperCase() + word.substring(1);
            capitalizedReversedString.append(new StringBuilder(capitalizedWord).reverse()).append(" ");
        }
        System.out.println("Capitalized and reversed string: " + capitalizedReversedString.toString().trim());
    }
}