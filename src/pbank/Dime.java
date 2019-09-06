package pbank;

public class Dime extends Money {
  private double value = 0.10;
  private int coinQuantity = 0;
  private double totalCost = 0;

  public Dime() {
    coinQuantity = 1;
    totalCost = 0.10;
  }

  public Dime(int coinsAdded) {
    coinQuantity = coinQuantity + coinsAdded;
    totalCost = coinsAdded * value;
  }

  @Override
  public String getCoinQuantity() {
    return (coinQuantity == 1) ? "1 Dime" : coinQuantity + " Dimes";
  }

  @Override
  public double getTotalCost() {
    return totalCost;
  }
}