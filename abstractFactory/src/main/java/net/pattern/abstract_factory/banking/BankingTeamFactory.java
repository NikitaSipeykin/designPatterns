package net.pattern.abstract_factory.banking;

import net.pattern.abstract_factory.Developer;
import net.pattern.abstract_factory.ProjectManager;
import net.pattern.abstract_factory.ProjectTeamFactory;
import net.pattern.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
  @Override
  public ProjectManager getProjectManager() {
    return new Manager();
  }

  @Override
  public Tester getTester() {
    return new QATester();
  }

  @Override
  public Developer getDeveloper() {
    return new JavaDeveloper();
  }
}
