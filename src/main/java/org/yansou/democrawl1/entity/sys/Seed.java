package org.yansou.democrawl1.entity.sys;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@ToString
@Data
@Entity
@Table
public class Seed {
    @Id
    @GeneratedValue
    private Long id;
    private String seedUrl;
    private String titleCss;
    private String contextCss;
    private Integer flag;
    private Date startTime;
    private Date endTime;
}
