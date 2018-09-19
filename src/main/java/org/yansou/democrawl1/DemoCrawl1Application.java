package org.yansou.democrawl1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.yansou.democrawl1.spiders.NewsCrawler;

@SpringBootApplication
public class DemoCrawl1Application {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext centext = SpringApplication.run(DemoCrawl1Application.class, args);
        NewsCrawler newsCrawler = centext.getBean(NewsCrawler.class);
        newsCrawler.start();
    }
}
