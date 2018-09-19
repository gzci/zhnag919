package org.yansou.democrawl1.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yansou.democrawl1.DemoCrawl1Application;
import org.yansou.democrawl1.entity.sys.Seed;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoCrawl1Application.class)
public class SeedRepositoryTest {
    @Autowired
    private SeedRepository seedRepository;

    @Test
    public void findByFlag() {
        List<Seed> list = seedRepository.findByFlag(2);
        assertNotNull(list);
        assertEquals(null,list.get(0).getSeedUrl());
    }
}