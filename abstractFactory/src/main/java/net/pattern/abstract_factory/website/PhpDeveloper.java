package net.pattern.abstract_factory.website;

import net.pattern.abstract_factory.Developer;

public class PhpDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("PHP developer writes the code...");
  }
}
