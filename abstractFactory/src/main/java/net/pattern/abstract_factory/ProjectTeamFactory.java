package net.pattern.abstract_factory;

public interface ProjectTeamFactory {
  ProjectManager getProjectManager();
  Tester getTester();
  Developer getDeveloper();
}
