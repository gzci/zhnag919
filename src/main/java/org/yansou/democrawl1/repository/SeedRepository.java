package org.yansou.democrawl1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yansou.democrawl1.entity.sys.Seed;

import java.util.List;

@Repository
public interface SeedRepository extends JpaRepository<Seed,Long> {
 List< Seed> findByFlag(Integer flag);
}
