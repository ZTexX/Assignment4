import java.util.Scanner;

public class Assignment4B {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int width, count = 1;

    System.out.print("Enter the diamond's width: ");
    width = sc.nextInt();

    while (width < 3) {
      System.out.println("Please enter a width of at least 3");

      System.out.print("Enter the diamond's width: ");
      width = sc.nextInt();
    }

    if (width % 2 == 0) {
      width++;

      System.out.println("To make a diamond, we'll use " + width + " as the width instead");
    }

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < (width - count) / 2 + 1; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < count; j++) {
        System.out.print("*");
      }

      System.out.print(count);
      if (i > (width / 2) - 1) {
        count -= 2;
      } else {
        count += 2;
      }

      System.out.println();
    }
  }
}