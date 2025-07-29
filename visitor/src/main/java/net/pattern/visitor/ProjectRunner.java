package net.pattern.visitor;

public class ProjectRunner {
  public static void main(String[] args) {
    Project project = new Project();
    Developer jun = new JuniorDeveloper();
    Developer seniorPomodoro = new SeniorDeveloper();

    System.out.println("Jun in action...");
    project.beWritten(jun);

    System.out.println("\n===================================\n");

    System.out.println("Senior Pomodoro in action...");
    project.beWritten(seniorPomodoro);
  }
}
