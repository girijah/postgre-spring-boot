package com.nyl.postgredemo.repository;

import com.nyl.postgredemo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
