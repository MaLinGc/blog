package com.ml.blog.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "article_tag")
public class ArticleTag implements Serializable {

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "articleId", column = @Column(name = "article_id")),
            @AttributeOverride(name = "tagId", column = @Column(name = "tag_id"))
    })
    private ArticleTagId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id", insertable = false, updatable = false)
    private Article article;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id", insertable = false, updatable = false)
    private Tag tag;

    public ArticleTagId getId() {
        return id;
    }

    public void setId(ArticleTagId id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
