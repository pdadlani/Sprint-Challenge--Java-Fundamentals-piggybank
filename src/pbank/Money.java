package pbank;

public abstract class Money {
  public abstract String getCoinQuantity();
  public abstract double getTotalCost();

  public abstract void addCoin(int coinsAdded);
  public abstract void removeCoin(int coinsRemoved);
}