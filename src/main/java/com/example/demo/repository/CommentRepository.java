package com.example.demo.repository;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByProject(Project project);

    Comment findByIdAndUserId(Long commentId, Long userId);

}
