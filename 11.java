import java.util.*;
class Eleven {
  public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a bearing from 0 to 359");
  int num = sc.nextInt();
  if (num > 359 && num <= 360 || num >= 0 && num < 45) {
    System.out.println("The direction is N.");
  }
  else if (num == 45) {
    System.out.println("The direction is NE.");
  }
  else if (num > 45 && num < 135) {
    System.out.println("The direction is E.");
  }
  else if (num == 135) {
    System.out.println("The direction is SE.");
  }
  else if (num > 135 && num < 225) {
    System.out.println("The direction is S.");
  }
  else if (num == 225) {
    System.out.println("The direction is SW.");
  }
  else if (num > 225 && num < 315) {
    System.out.println("The direction is W.");
  }
  else if (num == 315) {
    System.out.println("The direction is NW.");
  }
  }
}