package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{

}
