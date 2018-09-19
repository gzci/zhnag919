package org.yansou.democrawl1.spiders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.yansou.democrawl1.entity.News;
import org.yansou.democrawl1.entity.sys.Seed;
import org.yansou.democrawl1.repository.NewsRepository;
import org.yansou.democrawl1.repository.SeedRepository;

import java.util.Date;
import java.util.List;

@Component
public class NewsCrawler {
    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private SeedRepository seedRepository;

    public void start() throws InterruptedException {
        for(;;){
            List<Seed> seedList = seedRepository.findByFlag(0);
            Seed seed = seedList.stream().findAny().orElse(null);
            if(null==seed){
                Thread.sleep(10000);
                continue;
            }
            seed.setFlag(1);
            seed.setStartTime(new Date());
            seedRepository.save(seed);
            crawlerSeed(seed);
            seed.setFlag(2);
            seed.setEndTime(new Date());
            seedRepository.save(seed);
        }




    }

    private void crawlerSeed(Seed seed) {
        try {
            System.out.println("假装正在抓...");
            Thread.sleep(30*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(;;){
            News news = new News();
            news.setTitle("title");
            news.setContext("context");
            news.setUrl("url");
            if (null == newsRepository.findIdByUrl(news.getUrl())) {
                newsRepository.save(news);
            }
            break;
        }



    }
}
