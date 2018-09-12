package com.nyl.postgredemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nyl.postgredemo.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

	List<Answer> findByQuestionId(Long questionId);
	
}
