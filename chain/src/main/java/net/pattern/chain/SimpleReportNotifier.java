package net.pattern.chain;

public class SimpleReportNotifier extends Notifier{
  public SimpleReportNotifier(int priority) {
    super(priority);
  }

  @Override
  public void write(String message) {
    System.out.println("Notifying (simple report): " + message);
  }
}
