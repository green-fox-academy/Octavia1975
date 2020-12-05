package com.company;

public class Main {

    public static void main(String[] args) {
        new Main().main();
    }

    void main() {
        char[][] board = new char[3][3];
        printBoard(board);
    }

    void printBoard(char[][] board) {
        System.out.println(".___.");
        for (int i = 0; i < board.length; i++) {
            String line = "| ";
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == 0) {
                    String line = "| ";
                } else {
                    line += board[i][j] + " ";
                }
            }

            line += "|";
            System.out.println(".____.");
        }
    }

}

