package net.pattern.bridge;

public class JavaDeveloper implements Developer{
  @Override
  public void writeCode() {
    System.out.println("Java Developer writes java code!");
  }
}
