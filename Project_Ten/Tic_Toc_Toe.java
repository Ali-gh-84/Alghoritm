package Project_Ten;

import java.util.Scanner;

public class Tic_Toc_Toe {

    Scanner scanner = new Scanner(System.in);

    char[] number_home = { '1', '2', '3', '4', '5', '6', '7', '8', '9' }; // int [] number_home = {1,2,3,4,5,6,7,8,9}
    int turn = 0;

    public void show_playground() {

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(number_home[i * 3 + j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public char turn_player() {

        if (turn % 2 == 0) {
            return 'X';
        } else {
            return 'O';
        }
    }

    public void get_input() {

        System.out.print("enter a number between 1-9 : ");
        char input = scanner.next().charAt(0);  // int input = scanner.nextInt();
        int index = input - '1';   // int index = input - 1;
        if (index >= 0 && index < 9 && number_home[index] != 'X' && number_home[index] != 'O') {
            number_home[index] = turn_player();
            turn++;
        } else {
            System.out.print("index is full !");
        }
    }

    public boolean is_win() {

        return (number_home[0] == number_home[1] && number_home[1] == number_home[2]) ||
                (number_home[3] == number_home[4] && number_home[4] == number_home[5]) ||
                (number_home[6] == number_home[7] && number_home[7] == number_home[8]) ||
                (number_home[0] == number_home[3] && number_home[3] == number_home[6]) ||
                (number_home[1] == number_home[4] && number_home[4] == number_home[7]) ||
                (number_home[2] == number_home[5] && number_home[5] == number_home[8]) ||
                (number_home[0] == number_home[4] && number_home[4] == number_home[8]) ||
                (number_home[2] == number_home[4] && number_home[4] == number_home[6]);
    }

    public boolean is_full() {

        for (char c : number_home) {
            if (c != 'X' && c != 'O') {
                return false;
            }
        }
        return true;
    }

    public boolean is_not_finished() {
        return !is_win() && !is_full();
    }

    public void who_win() {

        if (turn % 2 == 1) {
            System.out.print("winner game is : X");
        } else {
            System.out.print("winner game is : O");
        }
    }

    public void equal() {
        if (is_full()) {
            System.out.print("two player equal !");
        }
    }

    public static void main(String[] args) {

        Tic_Toc_Toe game = new Tic_Toc_Toe();

        while (game.is_not_finished()) {
            game.show_playground();
            game.get_input();
        }
        if (game.is_win()) {
            game.who_win();
        } else {
            game.equal();
        }
    }
}
