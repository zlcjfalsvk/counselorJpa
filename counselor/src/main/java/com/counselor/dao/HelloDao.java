package com.counselor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.counselor.domain.Hello;

public interface HelloDao  extends JpaRepository<Hello, Integer>{

}
