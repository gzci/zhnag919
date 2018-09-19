package org.yansou.democrawl1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.yansou.democrawl1.entity.News;

@Repository
public interface NewsRepository extends JpaRepository<News,Long> {
    @Query("select b.id from News b where b.url=?1")
    Long findIdByUrl(String url);
}
