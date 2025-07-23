package net.pattern.bridge;

public class StockExchange extends Program{
  protected StockExchange(Developer developer) {
    super(developer);
  }

  @Override
  public void developProgram() {
    System.out.println("Stock exchange system in progress...");
    developer.writeCode();
  }
}
