/**
 * TicTacToe
 * UC9 checks whether a player has won the game
 * by verifying rows, columns, and diagonals.
 */
public class TicTacToe {

    static char[][] board = {
        {'X', 'X', 'X'},
        {'O', '-', 'O'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        char player = 'X';

        if (checkWin(player)) {

            System.out.println("Player " + player + " Wins!");
        } else {

            System.out.println("No Winner Yet");
        }
    }

    /**
     * Checks whether the given player has won.
     * Returns true if any row, column,
     * or diagonal contains the same symbol.
     */
    static boolean checkWin(char player) {

        // Check rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {

                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {

            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) {

                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {

            return true;
        }

        // Check opposite diagonal
        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {

            return true;
        }

        return false;
    }
}