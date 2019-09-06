package pbank;

public class Quarter extends Money {
  private double value = 0.25;
  private int coinQuantity = 0;
  private double totalCost = 0;

  public Quarter() {
    coinQuantity = 1;
    totalCost = 0.25;
  }

  public Quarter(int coinsAdded) {
    coinQuantity = coinQuantity + coinsAdded;
    totalCost = coinsAdded * value;
  }

  @Override
  public String getCoinQuantity() {
    return (coinQuantity == 1) ? "1 Quarter" : coinQuantity + " Quarters";
  }

  @Override
  public double getTotalCost() {
    return totalCost;
  }
}