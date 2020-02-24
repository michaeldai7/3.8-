import java.util.*;

import javax.lang.model.util.ElementScanner6;

class Forteen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int quarters, dimes, nickels, cents;
    int afterquarter, afterdimes, afternickels, aftercents;

    System.out.println("Enter the number of cents you have.");
    cents = sc.nextInt();
    quarters = cents / 25;
    afterquarter = cents % 25;
    dimes = afterquarter / 10;
    afterdimes = afterquarter % 10;
    nickels = afterdimes / 5;
    afternickels = afterdimes % 5;
    aftercents = afternickels;
    int[] coins = { quarters, dimes, nickels, aftercents };
    int length = 0;
    String answer = ("");
    if (length == 0 && quarters == 0) {
      ;
      length += 1;
    } else {
      answer = answer + "quarter is " + quarters + ",";
      length += 1;
    }
    if (length == 1 && dimes == 0) {
      ;
      length += 1;
    } else {
      answer = answer + "dime is " + dimes + ",";
      length += 1;
    }
    if (length == 2 && nickels == 0) {
      ;
      length += 1;
    } else {
      answer = answer + "nickel is " + nickels + ",";
      length += 1;
    }
    if (length == 3 && aftercents == 0) {
      ;
      length += 1;
    } else {
      answer = answer + "cents is " + aftercents + ".";
      length += 1;
    }
    System.out.println(answer);
  }
}