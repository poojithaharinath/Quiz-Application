package com.jh.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jh.main.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}