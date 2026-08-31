package week1.practice;
import java.util.*;

public class RockPaperScissors {
    static String playRound(String playerMove, String computerMove) {
        if(playerMove.equals(computerMove)) return "Draw";
        if((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
           (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
           (playerMove.equals("Scissors") && computerMove.equals("Paper"))) return "Player Wins";
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        int wins=0, losses=0, draws=0;

        System.out.println("Round | Player | Computer | Result");
        for(int i=1;i<=5;i++){
            String player = sc.next();
            String computer = moves[rand.nextInt(3)];
            String result = playRound(player, computer);

            // Print the round outcome
            System.out.println(i + " | " + player + " | " + computer + " | " + result);

            // Track scores
            if(result.equals("Player Wins")) wins++;
            else if(result.equals("Computer Wins")) losses++;
            else draws++;
        }

        // Final tally
        System.out.println("Final Score: Wins=" + wins + ", Losses=" + losses + ", Draws=" + draws);
    }
}
