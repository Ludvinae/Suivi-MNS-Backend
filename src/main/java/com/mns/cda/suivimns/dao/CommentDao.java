package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDao extends JpaRepository<Comment, Integer> {
}
