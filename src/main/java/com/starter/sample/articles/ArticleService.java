package com.starter.sample.articles;

import com.starter.sample.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    public List<Article> selectAll() {
        return articleMapper.selectAll();
    }
    public Article selectArticle(int id) {
        return articleMapper.selectArticle(id);
    }

    public int insertArticle(Article article) {
        return articleMapper.insertArticle(article);
    }

    public int updateArticle(Article article) {
        return articleMapper.updateArticle(article);
    }

    public int deleteArticle(int id) {
        return articleMapper.deleteArticle(id);
    }
}
