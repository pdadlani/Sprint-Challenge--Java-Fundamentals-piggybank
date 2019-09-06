package pbank;

public class Dollar extends Money {
  private double value = 1.00;
  private int coinQuantity = 0;
  private double totalCost = 0;

  public Dollar() {
    coinQuantity = 1;
    totalCost = 1.00;
  }

  public Dollar(int coinsAdded) {
    coinQuantity = coinQuantity + coinsAdded;
    totalCost = coinsAdded * value;
  }

  @Override
  public String getCoinQuantity() {
    return "$" + coinQuantity;
  }

  @Override
  public double getTotalCost() {
    return totalCost;
  }

  @Override
  public void removeCoin(int coinsRemoved) {
    coinQuantity = coinQuantity - coinsRemoved;
  }
}