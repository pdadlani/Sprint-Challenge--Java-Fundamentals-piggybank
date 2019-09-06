package pbank;

import java.util.*;
import java.text.DecimalFormat;

public class Main {

  // public static void printMoney(ArrayList<Money> money, CheckMoney tester) {
  //   for (Money m : money) {
  //     if (tester.test(m)) {
  //       System.out.println(m);
  //     }
  //   }
  // }

  public static void main(String[] args) {

    // initializing the format of piggy bank
    DecimalFormat fp = new DecimalFormat("$###,###.00");

    // creating all instances of money here and adding to piggyBank
    // ArrayList<Money> piggyBank = new ArrayList<>();
    HashMap<String, Money> newPiggyBank = new HashMap<>();
    newPiggyBank.put("Dollar", new Dollar(0));
    newPiggyBank.put("Quarter", new Quarter(0));
    newPiggyBank.put("Dime", new Dime(0));
    newPiggyBank.put("Nickel", new Nickel(0));
    newPiggyBank.put("Penny", new Penny(0));

    System.out.println();
    System.out.println(" *** Contents of Piggy Bank HashMap *** ");

    newPiggyBank.get("Quarter").addCoin(1);
    newPiggyBank.get("Dime").addCoin(1);
    newPiggyBank.get("Dollar").addCoin(5);
    newPiggyBank.get("Nickel").addCoin(3);
    newPiggyBank.get("Dime").addCoin(7);
    newPiggyBank.get("Dollar").addCoin(1);
    newPiggyBank.get("Penny").addCoin(10);

    for (String name: newPiggyBank.keySet()){
      String key = name.toString();
      String value = newPiggyBank.get(name).getCoinQuantity();  
      System.out.println(key + " = " + value);  
    } 
    System.out.println();
    System.out.println(" *** Total in the Piggy Bank *** ");

    double totalCost = 0;
    
    for (String m : newPiggyBank.keySet()) {
      totalCost += newPiggyBank.get(m).getTotalCost();
    }
    System.out.println("The piggy bank holds " + fp.format(totalCost));  

    System.out.println(" *** Removed a quarter *** ");
    newPiggyBank.get("Quarter").removeCoin(1);
    totalCost = 0;
    for (String m : newPiggyBank.keySet()) {
      totalCost += newPiggyBank.get(m).getTotalCost();
    }
    System.out.println("The piggy bank now holds " + fp.format(totalCost)); 

    // piggyBank.add(new Quarter());
    // piggyBank.add(new Dime());
    // piggyBank.add(new Dollar(5));
    // piggyBank.add(new Nickel(3));
    // piggyBank.add(new Dime(7));
    // piggyBank.add(new Dollar());
    // piggyBank.add(new Penny(10));

    // System.out.println();
    // System.out.println(" *** Contents of Piggy Bank *** ");
    // piggyBank.forEach(m -> System.out.println(m.getCoinQuantity()));
    // System.out.println();

    // System.out.println(" *** Value of the Piggy Bank *** ");
    // double total = 0;

    // for (Money m : piggyBank) {
    //   total = total + m.getTotalCost();
    // }

    // System.out.println("The piggy bank holds " + fp.format(total));
    // System.out.println();

    // System.out.println(" *** Removing a Coin *** ");
    // piggyBank.remove(0);
    // System.out.println();
    // piggyBank.forEach(m -> System.out.println(m.getCoinQuantity()));
    // System.out.println(" Total amount in Piggy Bank from removing a coin *** ");
    // total = 0;
    // for (Money m : piggyBank) {
    //   total = total + m.getTotalCost();
    // }
    // System.out.println("The piggy bank holds " + fp.format(total));
    // System.out.println();
  }
}