import java.util.Arrays;
import java.util.Scanner;

class Warsea {
    public static final SIZE =3;
    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = '0';

    public static void main(String[] args) {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
        }
    }
    printField(field);

    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Ходят крестики!");
        String input = scanner.split(" ");
        int x = Integer.parseInt(pars[0]) -1;
        int y = Integer.parseInt(pars[1]) -1;

        if (field[x][y] != EMPTY) {
            System.out.println("ячейка занята!");
            continue;
        }
        field[x][y] = CROSS;
        printField(field);

        if (isVictory(field)) {
            System.out.println("Крестики победили!");
            break;
        }
    }

}

    public static boolean isVictory(char[][] field, char player) {
        for (int row = 0; row < SIZE; row++) {
            int cnt = 0;
            for (int col = 0; col < SIZE; col++) {
                if (field[row][col] == player) cnt++;
            }
            if (cnt == SIZE) return true;
        }
        for (int col = 0; col < SIZE; col++) {
            int cnt = 0;
            for (int row = 0; row < SIZE; row++) {
                if (field[row][col] == player) cnt++;
            }
            if (cnt == SIZE) return true;
        }
        int d1 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (field[i][i] == player) d1++;
        }
        if (d1 == SIZE) return true;

        int d2 = 0;
        for (int i = 0; i <SIZE; i++) {
            if (field[SIZE - i-1][i] == player) d2++;
        }
        if (d2 == SIZE) return true;

        return false;
    }

    public static void printField(char[][] field) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.println(field[i][j]);
            }
            System.out.println();
        }
    }


}