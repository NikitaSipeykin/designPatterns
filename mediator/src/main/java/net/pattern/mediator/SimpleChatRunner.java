package net.pattern.mediator;

public class SimpleChatRunner {
  public static void main(String[] args) {
    SimpleTextChat chat = new SimpleTextChat();
    User admin = new Admin(chat, "John");
    User user = new SimpleUser(chat, "Jessica");
    User user1 = new SimpleUser(chat, "Patric");

    chat.setAdmin(admin);
    chat.addUser(user);
    chat.addUser(user1);

    user1.sendMessage("Hello, i am user 1!");
    admin.sendMessage("Roger that");
  }
}
