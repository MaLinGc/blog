package com.ml.blog.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ArticleTagId implements Serializable {

    @Column(name = "article_id")
    private Integer articleId;
    @Column(name = "tag_id")
    private Integer tagId;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleTagId that = (ArticleTagId) o;

        if (!getArticleId().equals(that.getArticleId())) return false;
        return getTagId().equals(that.getTagId());
    }

    @Override
    public int hashCode() {
        int result = getArticleId().hashCode();
        result = 31 * result + getTagId().hashCode();
        return result;
    }
}
