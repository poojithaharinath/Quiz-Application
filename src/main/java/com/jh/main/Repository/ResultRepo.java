package com.jh.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jh.main.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {

}