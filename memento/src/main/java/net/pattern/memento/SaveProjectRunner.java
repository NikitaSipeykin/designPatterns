package net.pattern.memento;

public class SaveProjectRunner {
  public static void main(String[] args) throws InterruptedException {
    Project project = new Project();
    GitHubRepo gitHub = new GitHubRepo();

    System.out.println("Creating new project...\n version 1.0\n");
    project.setVersionAndDate("1.0");

    System.out.println(project);

    System.out.println();

    System.out.println("Saving current version to GitHub...\n");
    gitHub.setSave(project.save());

    System.out.println("Updating project...\n version 2.0\n");
    Thread.sleep(5000);

    project.setVersionAndDate("2.0");
    System.out.println(project);

    System.out.println();
    System.out.println("Rolling back to version 1.0...\n");
    project.load(gitHub.getSave());

    System.out.println("Project after rollback.\n");
    System.out.println(project);
  }
}
