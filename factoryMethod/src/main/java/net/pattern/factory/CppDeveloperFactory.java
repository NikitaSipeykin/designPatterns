package net.pattern.factory;

public class CppDeveloperFactory implements DeveloperFactory{
  @Override
  public Developer createDeveloper() {
    return new CppDeveloper();
  }
}
