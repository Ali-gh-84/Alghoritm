package Project_One;

import java.util.Scanner;

public class Character_Scientist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number or character : ");
        String input = scanner.next();

        try {
            int number = Integer.parseInt(input);
            if (number % 2 == 0 ) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } catch (NumberFormatException e) {
            if (input.length() == 1) {
                switch (input) {
                    case "a":
                        System.out.println("vowel");
                        break;
                    case "e":
                        System.out.println("vowel");
                        break;
                    case "i":
                        System.out.println("vowel");
                        break;
                    case "o":
                        System.out.println("vowel");
                        break;
                    case "u":
                        System.out.println("vowel");
                        break;
                    default:
                        System.out.println("consonants");
                        break;
                }
            }
        }
    }
}
