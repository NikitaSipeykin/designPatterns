package net.pattern.abstract_factory.banking;

import net.pattern.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Java Developer writes the code");
  }
}
