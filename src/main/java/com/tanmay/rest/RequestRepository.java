package com.tanmay.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Integer> {
	List<Request> findByCustomerId(int id);
}
