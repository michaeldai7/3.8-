import java.util.*;

class Ten {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the mass number of the letter");
    int mass = sc.nextInt();
    if (mass <= 30) {
      System.out.println("The cost of mailing a letter is 40 sinas");
    } else if (mass <= 50) {
      System.out.println("The cost of mailing a letter is 55 sinas");
    } else if (mass <= 100) {
      System.out.println("The cost of mailing a letter is 70 sinas");
    } else if (mass > 100) {
      mass = mass - 100;
      if (mass < 50) {
        System.out.println("The cost of mailing a letter is 70 sinas");
      } else if (mass >= 50) {
        mass = mass / 50 * 25 + 70;
        System.out.println("The cost of mailing a letter is " + mass + " sinas.");
      }
    }
  }
}