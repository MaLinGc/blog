package com.ml.blog.entity;

import com.ml.common.enums.Status;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Article {

    @Id
    private Integer id;
    private String title;
    private String source;
    private String content;

    @Column(name = "create_time", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "classify_id")
    private Classify classify;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
    private Set<ArticleTag> articleTags = new HashSet<>(0);


}
