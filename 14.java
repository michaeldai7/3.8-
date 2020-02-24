import java.util.*;

import javax.lang.model.util.ElementScanner6;
class Forteen {
  public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
  int quarters, dimes, nickels, cents;
  int afterquarter, afterdimes, afternickels, aftercents;

  System.out.println("Enter the number of cents you have.");
  cents = sc.nextInt();
  quarters = cents/25;
  afterquarter = cents%25;
  dimes = afterquarter/10;
  afterdimes = afterquarter%10;
  nickels = afterdimes/5;
  afternickels = afterdimes%5;
  aftercents = afternickels;
  int[] coins = {quarters,dimes,nickels,aftercents};
  int length = 0;
  String answer = ("");
  while(length < coins.length){
	  if (length == 0 && quarters == 0){
		  ;
	  }else{
		answer = answer + "quarter is " + quarters + ",";
		if (length == 1 && dimes == 0){
		  ;
		}else{
		  answer = answer + "dime is " + dimes + ",";
		  if (length == 2 && nickels == 0){
		  ;
		}else{
	  		answer = answer + "nickel is " + nickels + ",";
			 if (length == 3 && aftercents == 0){
		 ;
	}else{
	  answer = answer + "cents is " + aftercents + ".";
	} 
		}
	
	}
	
	}
	  
	length += 1;
	
  }
  System.out.println(answer);
/*
  if(quarters == 0 && dimes != 0 && nickels != 0 &&cents != 0)
    System.out.println(cents +" cents: " + dimes + " dimes," + nickels + " nickels, " + aftercents + " cnets.");
  else if (quarters != 0 && dimes == 0 && nickels != 0 &&cents != 0)
    System.out.println(cents +" cents: " + quarters + " quarters," + nickels + " nickels, " + aftercents + " cnets.");
  else if (quarters != 0 && dimes != 0 && nickels == 0 &&cents != 0)
    System.out.println(cents +" cents: " + quarters + " quarters," + dimes + " dimes," + aftercents + " cnets.");
  else if (quarters != 0 && dimes != 0 && nickels != 0 &&cents == 0)
    System.out.println(cents +" cents: " + quarters + " quarters," + dimes + " dimes," + nickels + " nickels.");
  else if (quarters == 0 && dimes == 0 && nickels != 0 &&cents != 0)
    System.out.println(cents +" cents: " + nickels + " nickels, " + aftercents + " cents.");
  else if (quarters != 0 && dimes == 0 && nickels == 0 &&cents != 0)
    System.out.println(cents +" cents: " + quarters + " quarters, " + aftercents + " cents.");
  else if (quarters != 0 && dimes != 0 && nickels == 0 &&cents == 0)
    System.out.println(cents +" cents: " + quarters + " quarters, " + dimes + " dimes.");
  else if (quarters == 0 && dimes != 0 && nickels != 0 &&cents == 0)
    System.out.println(cents +" cents: " + dimes + " dimes, " + nickels + " nickels.");
  else if (quarters == 0 && dimes == 0 && nickels == 0 &&cents != 0)
    System.out.println(cents +" cents: " + aftercents + " cents.");
  else if (quarters != 0 && dimes == 0 && nickels == 0 &&cents == 0)
    System.out.println(cents +" cents: " + quarters + " quarters.");
  else if (quarters == 0 && dimes != 0 && nickels == 0 &&cents == 0)
    System.out.println(cents +" cents: " + dimes + " dimes.");
  else if (quarters == 0 && dimes == 0 && nickels != 0 &&cents == 0)
    System.out.println(cents +" cents: " + nickels + " nickels.");
  else if (quarters == 0 && dimes == 0 && nickels == 0 &&cents == 0)
    System.out.println(cents +" cents: " + " None.");
  else 
    System.out.println(cents +" cents: " + quarters + " quarters," + dimes + " dimes," + nickels + " nickels, " + aftercents + " cnets.");*/
   }
}