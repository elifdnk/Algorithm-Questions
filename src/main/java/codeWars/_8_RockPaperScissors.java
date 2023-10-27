package codeWars;

public class _8_RockPaperScissors {
    public static String rps(String p1, String p2) {

        if(p1.equals("scissors") && p2.equals("paper")) return "Player 1 won!";
        if(p1.equals("rock") && p2.equals("scissors")) return "Player 1 won!";
        if(p1.equals("paper") && p2.equals("rock")) return "Player 1 won!";
        if(p1.equals(p2)) return "Draw!";

        return "Player 2 won!";
    }
}
/*
Rock Paper Scissors
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"
 */