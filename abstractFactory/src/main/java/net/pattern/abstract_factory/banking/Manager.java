package net.pattern.abstract_factory.banking;

import net.pattern.abstract_factory.ProjectManager;

public class Manager implements ProjectManager {
  @Override
  public void manageProject() {
    System.out.println("Manager is manage the banking project...");
  }
}
