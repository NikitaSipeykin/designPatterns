package net.pattern.abstract_factory.website;

import net.pattern.abstract_factory.Tester;

public class ManualTester implements Tester {
  @Override
  public void testCode() {
    System.out.println("Manual tester testing the the code...");
  }
}
