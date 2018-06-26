package com.starter.sample;


import com.starter.sample.articles.Article;
import com.starter.sample.articles.ArticleService;
import com.starter.sample.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping(value = "articles")
public class ArticleController {

    private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String selectAll(Locale locale, Model model) {

        List<Article> articles = articleService.selectAll();

        model.addAttribute("articles", articles);
        return "article";
    }


    @RequestMapping(value = "/addArticle.do", method = RequestMethod.GET)
    public void addArticle(@RequestBody Article article) {

        Article article1 = new Article();
        article1.setAuthor("author");
        article1.setTitle("title");
        article1.setContent("content");

      articleService.insertArticle(article1);
    }


}
