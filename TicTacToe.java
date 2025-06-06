import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};

        printBoard(board);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            playerTurn(board, scanner);
           if ( isGameFinished(board)){
               break;
           }
            computerTurn(board);
            if ( isGameFinished(board)){
                break;
            }
            printBoard(board);
        }
        scanner.close();
    }

    private static boolean isGameFinished(char[][] board){
        if (hasContestantWon(board, 'X')){
            printBoard(board);
            System.out.println("Player wins!");
            return true;
        }
        if (hasContestantWon(board, 'O')){
            printBoard(board);
            System.out.println("Computer wins!");
            return true;
        }

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == ' '){
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("The game is draw!");
        return true;
    }

    private static boolean hasContestantWon(char[][] board, char symbol) {
        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

        (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

        (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)){
            return true;
        }
        return false;
    }

    private static void computerTurn(char[][] board) {
        System.out.println("Computer's turn:");

        for (int i = 1; i <= 9; i++) {
            if (isValidMove(board, Integer.toString(i))){
                char[][] tempBoard = copyBoard(board);
                placeMove(tempBoard, Integer.toString(i), 'O');
                if (hasContestantWon(tempBoard, 'O')){
                    placeMove(board, Integer.toString(i), 'O');
                    System.out.println("Computer chose " + i);
                    return;
                }
            }
        }

        for (int i = 1; i <= 9; i++){
            if (isValidMove(board, Integer.toString(i))){
                char[][] tempBoard = copyBoard(board);
                placeMove(tempBoard, Integer.toString(i), 'X');
                if (hasContestantWon(tempBoard, 'X')){
                    placeMove(board, Integer.toString(i), 'O');
                return;
                }
            }
        }

        if (isValidMove(board, "5")){
            placeMove(board, "5", 'O');
            return;
        }

        for (String move : new String[]{"1", "3", "7", "9"}){
            if (isValidMove(board, move)){
                placeMove(board, move, 'O');
                return;
            }
        }

        for (String move : new String[]{"2","4","6","8"}){
            if (isValidMove(board,move)){
                placeMove(board,move, 'O');
                System.out.println("Computer chose side " + move);
                return;
            }
        }
    }

    private static char[][] copyBoard(char[][] board){
        char[][] newBoard = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                newBoard[i][j] = board[i][j];
            }
        }
        return newBoard;
    }


    private static boolean isValidMove(char[][]board, String position) {
        switch (position) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }

    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1":
                board[0][0] = symbol;
            break;
            case "2":
                board[0][1] = symbol;
            break;
            case "3":
                board[0][2] = symbol;
            break;
            case "4":
                board[1][0] = symbol;
            break;
            case "5":
                board[1][1] = symbol;
            break;
            case "6":
                board[1][2] = symbol;
            break;
            case "7":
                board[2][0] = symbol;
            break;
            case "8":
                board[2][1] = symbol;
            break;
            case "9":
                board[2][2] = symbol;
            break;
            default:
                System.out.println(":(");
        }
    }

    private static void playerTurn(char[][] board, Scanner scanner) {
        String userInput;
        while (true) {
            System.out.println("Where would you want to play? (1-9)");
            userInput = scanner.nextLine();
            if (isValidMove(board, userInput)){
                placeMove(board, userInput, 'X');
                break;
            } else {
                System.out.println(userInput + " is not a valid move.");
            }
        }
    }


    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}

