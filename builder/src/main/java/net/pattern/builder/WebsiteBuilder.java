package net.pattern.builder;

public  abstract class WebsiteBuilder {
  Website website;

  void createWebsite(){
    website = new Website();
  }

  abstract void buildCms();
  abstract void buildPrice();
  abstract void buildName();

  Website getWebsite(){
    return website;
  }
}
