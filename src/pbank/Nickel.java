package pbank;

public class Nickel extends Money {
  private double value = 0.05;
  private int coinQuantity = 0;
  private double totalCost = 0;

  public Nickel() {
    coinQuantity = 1;
    totalCost = 0.05;
  }

  public Nickel(int coinsAdded) {
    coinQuantity = coinQuantity + coinsAdded;
    totalCost = coinsAdded * value;
  }

  @Override
  public String getCoinQuantity() {
    return (coinQuantity == 1) ? "1 Nickel" : coinQuantity + " Nickels";
  }

  @Override
  public double getTotalCost() {
    return totalCost;
  }

  @Override
  public void addCoin(int coinsAdded) {
    coinQuantity += coinsAdded;
    totalCost += coinsAdded * value;
  }

  @Override
  public void removeCoin(int coinsRemoved) {
    coinQuantity = coinQuantity - coinsRemoved;
    totalCost -= coinsRemoved * value;
  }
}