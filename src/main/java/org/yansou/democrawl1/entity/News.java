package org.yansou.democrawl1.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
@ToString
@Data
@Entity
@Table
public class News {
    @Id
    @GeneratedValue
    private Long id;
    private String url;
    private String title;
    @Column(length = Integer.MAX_VALUE)
    private String context;
}
