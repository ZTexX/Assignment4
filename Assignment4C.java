import java.util.Scanner;
import java.lang.Math;

public class Assignment4C {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int heads = 0, tails = 0, rng;

    System.out.print("How many times do you want to flip the coin?: ");
    int howMany = sc.nextInt();

    System.out.println("After flipping the coin 100 time(s), we found that it lands on:");

    for (int i = 0; i < howMany; i++) {
      rng = (int)(Math.random() * 2);

      if (rng == 0) {
        heads++;
      } else {
        tails++;
      }
    }

    System.out.println("Heads - " + heads + " times (" + (double)heads / howMany + "%)");
    System.out.println("Tails - " + tails + " times (" + (double)tails / howMany + "%)");

    if (heads > tails) {
      System.out.println("The coin lands on heads more often than tails!");
    } else if (heads < tails) {
      System.out.println("The coin lands on tails more often than heads!");
    } else {
      System.out.println("The coin is perfectly fair!");
    }
  }
}