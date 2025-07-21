package net.pattern.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
  @Override
  void buildCms() {
    website.setCms(Cms.ALIFRESCO);
  }

  @Override
  void buildPrice() {
    website.setPrice(10000);
  }

  @Override
  void buildName() {
    website.setName("Enterprise website");
  }
}
