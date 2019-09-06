package pbank;

import java.util.*;
import java.text.DecimalFormat;

public class Main {

  public static void printMoney(ArrayList<Money> money, CheckMoney tester) {
    for (Money m : money) {
      if (tester.test(m)) {
        System.out.println(m);
      }
    }
  }

  public static void main(String[] args) {

    // initializing the format of piggy bank
    DecimalFormat fp = new DecimalFormat("$###,###.00");

    // creating all instances of money here and adding to piggyBank
    ArrayList<Money> piggyBank = new ArrayList<>();
    piggyBank.add(new Quarter());
    piggyBank.add(new Dime());
    piggyBank.add(new Dollar(5));
    piggyBank.add(new Nickel(3));
    piggyBank.add(new Dime(7));
    piggyBank.add(new Dollar());
    piggyBank.add(new Penny(10));

    System.out.println();
    System.out.println(" *** Contents of Piggy Bank *** ");
    piggyBank.forEach(m -> System.out.println(m.getCoinQuantity()));
    System.out.println();

    System.out.println(" *** Value of the Piggy Bank *** ");
    double total = 0;

    for (Money m : piggyBank) {
      total = total + m.getTotalCost();
    }

    System.out.println("The piggy bank holds " + fp.format(total));
  }
}