package com.ll.article;

import java.util.List;


public class ArticleService {
    private int id;
    private String subject;
    private String content;

    public ArticleService() {
        articleRepository = new ArticleRepository();
    }

    public int create(String subject, String content) {
        return articleRepository.create(subject, content);
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    public Article findById(int id) {
        return articleRpository.findById(id);
    }

    public void remove(Article article) {
        articleRepository.remove(article);
    }

    public void modify(Artilce article, String modifySubject, String modify, String modifyContent) {
        articleRepository.modify(article, modifySubject, modifyContent);
    }
}