package com.example.demo.repository;

import com.example.demo.entity.Project;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findAllByUserOrderByCreatedDataDesc(User user);

    List<Project> findAllByOrderByCreatedDataDesc();

    Optional<Project> findProjectByIdAndUser(Long id, User user);
}
