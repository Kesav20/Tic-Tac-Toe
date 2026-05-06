import java.util.Random;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move
 * by reusing slot conversion and validation logic.
 */
public class TicTacToe {

    static char computerSymbol = 'O';

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program.
     * Triggers the computer move.
     */
    public static void main(String[] args) {

        computerMove();

        // Print updated board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {

        Random random = new Random();

        while (true) {

            // Generate random slot from 1 to 9
            int slot = random.nextInt(9) + 1;

            // Convert slot to row and column
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // Check if move is valid
            if (board[row][col] == '-') {

                // Place computer symbol
                board[row][col] = computerSymbol;

                System.out.println("Computer placed at slot: " + slot);

                break;
            }
        }
    }
}