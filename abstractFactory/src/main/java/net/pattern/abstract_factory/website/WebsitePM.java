package net.pattern.abstract_factory.website;

import net.pattern.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
  @Override
  public void manageProject() {
    System.out.println("Project manager manages website");
  }
}
