package Project_Nine;

import java.util.*;

public class FindـOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reverse = "";

        System.out.print("enter pattern title : ");
        String title = scanner.nextLine().toLowerCase().trim();

        System.out.print("enter size of text : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter line " + (i + 1) + ": ");
            lines.add(scanner.nextLine().toLowerCase());
        }

        for (int i = 0; i < title.length(); i++) {
            reverse = title.charAt(i) + reverse;
        }

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).contains(title)) {
                System.out.println("Title found at line: " + i + " at index: " + lines.get(i).indexOf(title));
            }
            if (lines.get(i).contains(reverse)) {
                System.out
                        .println("Reversed title found at line: " + i + " at index: " + lines.get(i).indexOf(reverse));
            } else {
                System.out.println("Substring not found");
            }
        }
    }
}
