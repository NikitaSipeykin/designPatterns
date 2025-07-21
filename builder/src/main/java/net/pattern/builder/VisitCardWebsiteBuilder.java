package net.pattern.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{
  @Override
  void buildCms() {
    website.setCms(Cms.WORDPRESS);
  }

  @Override
  void buildPrice() {
    website.setPrice(500);
  }

  @Override
  void buildName() {
    website.setName("Visit card");
  }
}
