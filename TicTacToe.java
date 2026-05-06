import java.util.Scanner;

/**
 * TicTacToe
 * UC8 continues gameplay until a win or draw occurs.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean gameOver = false;

        while (!gameOver) {

            printBoard();

            System.out.println("Player " + currentPlayer + " Turn");
            System.out.print("Enter row and column (0-2): ");

            int row = sc.nextInt();
            int col = sc.nextInt();

            // Check valid move
            if (board[row][col] == '-') {

                // Place symbol
                board[row][col] = currentPlayer;

                // Check win
                if (checkWin(currentPlayer)) {

                    printBoard();
                    System.out.println("Player " + currentPlayer + " Wins!");
                    gameOver = true;
                }

                // Check draw
                else if (isDraw()) {

                    printBoard();
                    System.out.println("Game Draw!");
                    gameOver = true;
                }

                // Switch turn
                else {

                    if (currentPlayer == 'X') {
                        currentPlayer = 'O';
                    } else {
                        currentPlayer = 'X';
                    }
                }

            } else {

                System.out.println("Invalid Move! Try Again.");
            }
        }

        sc.close();
    }

    /**
     * Prints the TicTacToe board.
     */
    static void printBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    /**
     * Checks whether the given player has won.
     */
    static boolean checkWin(char player) {

        // Rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {

                return true;
            }
        }

        // Columns
        for (int i = 0; i < 3; i++) {

            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) {

                return true;
            }
        }

        // Diagonals
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {

            return true;
        }

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {

            return true;
        }

        return false;
    }

    /**
     * Checks whether the game is a draw.
     */
    static boolean isDraw() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] == '-') {

                    return false;
                }
            }
        }

        return true;
    }
}