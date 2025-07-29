package net.pattern.observer;

public class JobSearch {
  public static void main(String[] args) {
    JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

    jobSite.addVacancy("First Java position");
    jobSite.addVacancy("Second Java position");

    Observer firstSubscriber = new Subscriber("John");
    Observer secondSubscriber = new Subscriber("Jessica");

    jobSite.addObserver(firstSubscriber);
    jobSite.addObserver(secondSubscriber);

    jobSite.addVacancy("Third Java position");

    jobSite.removeVacancy("First Java position");

  }
}
