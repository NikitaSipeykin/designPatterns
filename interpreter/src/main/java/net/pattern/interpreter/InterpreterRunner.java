package net.pattern.interpreter;

public class InterpreterRunner {
  public static void main(String[] args) {
    Expression isJava = getJavaExpression();
    Expression isJavaEEDeveloper = getJavaEEExpression();

    System.out.println("Does JD knows Java core: " + isJava.interpret("Java core"));
    System.out.println("Does JD knows EE core: " + isJavaEEDeveloper.interpret("Java Spring"));
  }

  public static Expression getJavaExpression(){
    Expression java = new TerminalExpression("Java");
    Expression javaCore = new TerminalExpression("Java Core");

    return new OrExpression(java, javaCore);
  }

  public static Expression getJavaEEExpression(){
    Expression java = new TerminalExpression("Java");
    Expression spring = new TerminalExpression("Spring");

    return new AndExpression(java, spring);
  }
}
