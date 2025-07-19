package net.pattern.abstract_factory.website;

import net.pattern.abstract_factory.Developer;
import net.pattern.abstract_factory.ProjectManager;
import net.pattern.abstract_factory.ProjectTeamFactory;
import net.pattern.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
  @Override
  public ProjectManager getProjectManager() {
    return new WebsitePM();
  }

  @Override
  public Tester getTester() {
    return new ManualTester();
  }

  @Override
  public Developer getDeveloper() {
    return new PhpDeveloper();
  }
}
