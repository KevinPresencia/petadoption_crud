package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AnimalModel;

public interface AnimalRepo extends JpaRepository<AnimalModel, Integer>{

}
