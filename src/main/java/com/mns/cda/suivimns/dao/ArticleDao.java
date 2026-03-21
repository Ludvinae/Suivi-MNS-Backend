package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDao extends JpaRepository<Article, Integer> {
}
