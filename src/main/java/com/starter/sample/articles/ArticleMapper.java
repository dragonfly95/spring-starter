package com.starter.sample.articles;

import java.util.List;

public interface ArticleMapper {
    public List<Article> selectAll();
    public Article selectArticle(int id);
    public int insertArticle(Article article);
    public int updateArticle(Article article);
    public int deleteArticle(int id);
}
