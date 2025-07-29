package net.pattern.visitor;

public class SeniorDeveloper implements Developer{
  @Override
  public void create(ProjectClass projectClass) {
    System.out.println("Writing perfect class...");
  }

  @Override
  public void create(Database database) {
    System.out.println( " Create perfect database...");
  }

  @Override
  public void create(Test test) {
    System.out.println("Creating reliable test...");
  }
}
