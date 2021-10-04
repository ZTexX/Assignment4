import java.util.Scanner;
import java.lang.Math;

public class Assignment4A {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    boolean finalChoice = true, display = true;
    int round = 1, dice1, dice2, dice3, dice4, playerScore, botScore;

    do {
      if (display) {
        if (round > 1) {
          System.out.println();
          round = 1;
        }
        System.out.println("Let's play Bunco!");
      }

      dice1 = (int)(Math.random() * 6) + 1;
      dice2 = (int)(Math.random() * 6) + 1;
      dice3 = (int)(Math.random() * 6) + 1;
      dice4 = (int)(Math.random() * 6) + 1;
      
      System.out.println("Round " + round + ": You rolled " + dice1 + " and " + dice2 + ".");

      playerScore = dice1 == round && dice2 == round ? 21 + (dice1 + dice2) : dice1 == dice2 && dice1 != round && dice2 != round ? 5 + (dice1 + dice2) : (dice1 == round && dice2 != round) || (dice1 != round && dice2 == round) ? 1 + (dice1 + dice2) : (dice1 + dice2);

      botScore = dice3 == round && dice4 == round ? 21 + (dice3 + dice4) : dice3 == dice4 && dice3 != round && dice4 != round ? 5 + (dice3 + dice4) : (dice3 == round && dice4 != round) || (dice3 != round && dice4 == round) ? 1 + (dice3 + dice4) : (dice3 + dice4);

      System.out.print("Your score is " + playerScore + ". Do you want to stop?: ");
      boolean choice1 = sc.next().equalsIgnoreCase("Y");

      if (choice1) {
        System.out.println("\nOkay, the computer's score is... " + botScore);

        if (playerScore > botScore) {
          System.out.println("You win!");
        } else if (playerScore < botScore) {
          System.out.println("Sorry, you lose.");
        } else if (playerScore == botScore) {
          System.out.println("Oops, it's a tie.");
        }

        if (round != 6) {
          display = true;
          System.out.print("\nDo you want to play again?: ");
          finalChoice = sc.next().equalsIgnoreCase("Y");

          if (!finalChoice) {
            System.out.println("Game Over...");
          }
        } else {
          System.out.println("Game Over...");
        }
      } else {
        display = false;
      }

      round++;
    } while (finalChoice && round != 6);

    if (round == 6) {
      System.out.println("\nGame Over...");
    }
  }
}