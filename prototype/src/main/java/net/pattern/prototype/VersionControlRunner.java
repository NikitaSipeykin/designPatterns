package net.pattern.prototype;

public class VersionControlRunner {
  public static void main(String[] args) {
    Project master = new Project(1, "Project", "SourceCode sourceCode = new SourceCode();");
    System.out.println(master);

    ProjectFactory projectFactory = new ProjectFactory(master);
    Project copy = projectFactory.cloneProject();
    System.out.println("\n===================================\n");
    System.out.println(copy);
  }
}
