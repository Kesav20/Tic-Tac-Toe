/**
 * TicTacToe
 * UC10 detects whether the game ends in a draw.
 */
public class TicTacToe {

    static char[][] board = {
        {'X', 'O', 'X'},
        {'X', 'O', 'O'},
        {'O', 'X', 'X'}
    };

    public static void main(String[] args) {

        if (isDraw()) {

            System.out.println("Game Draw!");
        } else {

            System.out.println("Moves Still Available");
        }
    }

    /**
     * Checks whether the board is full
     * and no empty cells remain.
     */
    static boolean isDraw() {

        // Traverse all board cells
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                // If empty cell exists, game is not draw
                if (board[i][j] == '-') {

                    return false;
                }
            }
        }

        // No empty cells found
        return true;
    }
}